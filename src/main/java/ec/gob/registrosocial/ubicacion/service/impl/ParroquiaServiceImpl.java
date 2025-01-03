/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ParroquiaServiceImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service.impl;

import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import ec.gob.registrosocial.ubicacion.service.ArchivoUbicacionService;
import ec.gob.registrosocial.ubicacion.service.CantonService;
import ec.gob.registrosocial.ubicacion.service.ParroquiaService;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
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
public class ParroquiaServiceImpl implements ParroquiaService {

  private final CantonService cantonService;

  public ParroquiaServiceImpl(
      CantonService cantonService) {
    this.cantonService = cantonService;
  }


  @Override
  public List<ParroquiaRecord> getParroquiasByCodigoProvinciaAndCanton(String codigoProvincia,
      String codigoCanton) {
    return this.cantonService.getCantonesByCodigoProvincia(codigoProvincia).stream()
        .filter(canton -> canton.codigo().equals(codigoCanton)) // Filtrar el cantón por su código
        .findFirst()
        .map(CantonRecord::parroquias)
        .orElse(Collections.emptyList());
  }

}
