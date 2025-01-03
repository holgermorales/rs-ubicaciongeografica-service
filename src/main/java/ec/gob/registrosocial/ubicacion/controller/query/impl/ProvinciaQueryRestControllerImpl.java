/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ProvinciaQueryRestControllerImpl 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.controller.query.impl;

import ec.gob.registrosocial.ubicacion.controller.query.ProvinciaQueryRestController;
import ec.gob.registrosocial.ubicacion.domain.record.ProvinciaRecord;
import ec.gob.registrosocial.ubicacion.service.ProvinciaService;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
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
public class ProvinciaQueryRestControllerImpl implements ProvinciaQueryRestController {

  private final ProvinciaService provinciaService;

  public ProvinciaQueryRestControllerImpl(ProvinciaService provinciaService) {
    this.provinciaService = provinciaService;
  }

  @GetMapping
  public List<ProvinciaRecord> getProvincias() {
    return provinciaService.getProvincias();
  }
}
