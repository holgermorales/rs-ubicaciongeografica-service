/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ArchivoUbicacionServiceImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ec.gob.registrosocial.ubicacion.domain.exception.ArchivoUbicacionException;
import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ProvinciaRecord;
import ec.gob.registrosocial.ubicacion.service.ArchivoUbicacionService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA CLASE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - holgermorales - 3/1/25
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author holgermorales
 * @version 1.0.0 $
 * @since 3/1/25
 */
@Service
public class ArchivoUbicacionServiceImpl implements ArchivoUbicacionService {

  @Override
  public List<ProvinciaRecord> loadUbicacion() {
    ClassPathResource resource = new ClassPathResource("provincias.json");
    ObjectMapper objectMapper = new ObjectMapper();

    // Leer el JSON y convertirlo
    Map<String, Map<String, Object>> rawProvincias = null;
    try {
      rawProvincias = objectMapper.readValue(
          resource.getInputStream(),
          new TypeReference<Map<String, Map<String, Object>>>() {
          });
    } catch (IOException e) {
      throw new ArchivoUbicacionException("Error al leer el archivo de provincias", e);
    }

    return rawProvincias.entrySet().stream()
        .map(entry -> {
          Map<String, Object> provinciaData = entry.getValue();
          List<CantonRecord> cantones = ((Map<String, Map<String, Object>>) provinciaData.get(
              "cantones"))
              .entrySet().stream()
              .map(cantonEntry -> {
                Map<String, Object> cantonData = cantonEntry.getValue();
                // Manejar parroquias null
                List<ParroquiaRecord> parroquias = cantonData.get("parroquias") != null
                    ? ((Map<String, String>) cantonData.get("parroquias")).entrySet().stream()
                    .map(parroquiaEntry -> new ParroquiaRecord(
                        parroquiaEntry.getKey(),
                        parroquiaEntry.getValue()))
                    .collect(Collectors.toList())
                    : Collections.emptyList();

                return new CantonRecord(cantonEntry.getKey(),
                    (String) cantonData.get("canton"), parroquias);
              })
              .collect(Collectors.toList());
          return new ProvinciaRecord(entry.getKey(),
              (String) provinciaData.get("provincia"), cantones);
        })
        .collect(Collectors.toList());
  }
}
