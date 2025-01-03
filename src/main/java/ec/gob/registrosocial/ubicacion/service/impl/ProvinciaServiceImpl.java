/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ProvinciaServiceImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service.impl;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ec.gob.registrosocial.ubicacion.domain.exception.ArchivoUbicacionException;
import ec.gob.registrosocial.ubicacion.domain.exception.CantonNoFoundException;
import ec.gob.registrosocial.ubicacion.domain.exception.ParroquiaNoFoundException;
import ec.gob.registrosocial.ubicacion.domain.exception.ProvinciaException;
import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ProvinciaRecord;
import ec.gob.registrosocial.ubicacion.service.ArchivoUbicacionService;
import ec.gob.registrosocial.ubicacion.service.ProvinciaService;
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
public class ProvinciaServiceImpl implements ProvinciaService {

  private final ArchivoUbicacionService archivoUbicacionService;

  public ProvinciaServiceImpl(ArchivoUbicacionService archivoUbicacionService) {
    this.archivoUbicacionService = archivoUbicacionService;
  }

  @Override
  public List<ProvinciaRecord> getProvincias() {
    // Devuelve solo el código y el nombre de las provincias
    return this.archivoUbicacionService.loadUbicacion().stream()
        .map(provincia -> new ProvinciaRecord(provincia.codigo(), provincia.provincia(), null))
        .collect(Collectors.toList());
  }
}