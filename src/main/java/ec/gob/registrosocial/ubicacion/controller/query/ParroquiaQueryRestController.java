/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ParroquiaQueryRestController 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.controller.query;

import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * -- AQUI AÑADIR LA DESCRIPCION DE LA INTERFACE --.
 *
 * <p>Historial de cambios:
 *
 * <ul>
 *   <li>1.0.0 - Descripción del cambio inicial - holgermorales - 3/1/25
 *       <!-- Añadir nuevas entradas de cambios aquí -->
 * </ul>
 *
 * @author holgermorales
 * @version 1.0.0
 * @since 3/1/25
 */
@RequestMapping("/parroquias")
public interface ParroquiaQueryRestController {

  @GetMapping("/{codigoProvincia}/cantones/{codigoCanton}/parroquias")
  public List<ParroquiaRecord> getParroquiasByCodigoProvinciaAndCanton(
      @PathVariable String codigoProvincia,
      @PathVariable String codigoCanton);

}
