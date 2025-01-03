/**
 * <p> Proyecto ApiGateway.
 * <p> Clase CantonQueryRestController 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.controller.query;

import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
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
@RequestMapping("/cantones")
public interface CantonQueryRestController {

  @GetMapping("/{codigoProvincia}/cantones")
  List<CantonRecord> getCantonesByCodigoProvincia(@PathVariable String codigoProvincia);

}
