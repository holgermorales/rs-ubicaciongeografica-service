/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ParroquiaQueryRestControllerImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.controller.query.impl;

import ec.gob.registrosocial.ubicacion.controller.query.ParroquiaQueryRestController;
import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import ec.gob.registrosocial.ubicacion.service.ParroquiaService;
import java.io.IOException;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class ParroquiaQueryRestControllerImpl implements ParroquiaQueryRestController {

  private final ParroquiaService parroquiaService;

  public ParroquiaQueryRestControllerImpl(ParroquiaService parroquiaService) {
    this.parroquiaService = parroquiaService;
  }


  public List<ParroquiaRecord> getParroquiasByCodigoProvinciaAndCanton(
      @PathVariable String codigoProvincia,
      @PathVariable String codigoCanton) {
    return this.parroquiaService.getParroquiasByCodigoProvinciaAndCanton(codigoProvincia,
        codigoCanton);
  }

}
