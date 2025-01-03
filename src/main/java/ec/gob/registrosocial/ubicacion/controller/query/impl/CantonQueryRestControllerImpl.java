/**
 * <p> Proyecto ApiGateway.
 * <p> Clase CantonRestControllerImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.controller.query.impl;

import ec.gob.registrosocial.ubicacion.controller.query.CantonQueryRestController;
import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.service.CantonService;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

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
@RestController
public class CantonQueryRestControllerImpl implements CantonQueryRestController {

  private final CantonService cantonService;

  public CantonQueryRestControllerImpl(CantonService cantonService) {
    this.cantonService = cantonService;
  }

  @Override
  public List<CantonRecord> getCantonesByCodigoProvincia(String codigoProvincia) {
    return this.cantonService.getCantonesByCodigoProvincia(codigoProvincia);
  }
}
