/**
 * <p> Proyecto ApiGateway.
 * <p> Clase CantonServiceImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service.impl;

import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.service.ArchivoUbicacionService;
import ec.gob.registrosocial.ubicacion.service.CantonService;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
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
public class CantonServiceImpl implements CantonService {

  private final ArchivoUbicacionService archivoUbicacionService;

  public CantonServiceImpl(ArchivoUbicacionService archivoUbicacionService) {
    this.archivoUbicacionService = archivoUbicacionService;
  }


  @Override
  public List<CantonRecord> getCantonesByCodigoProvincia(String codigoProvincia) {
    return this.archivoUbicacionService.loadUbicacion().stream()
        .filter(provincia -> provincia.codigo()
            .equals(codigoProvincia)) // Filtrar por código de provincia
        .findFirst()
        .map(provincia -> provincia.cantones().stream()
            .map(canton -> new CantonRecord(
                canton.codigo(),
                canton.canton(),
                null
            ))
            .collect(Collectors.toList()))
        .orElse(Collections.emptyList());
  }
}