/**
 * <p> Proyecto ApiGateway.
 * <p> Clase CantonService 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service;

import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import java.util.List;

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
public interface CantonService {

  List<CantonRecord> getCantonesByCodigoProvincia(String codigoProvincia);
}
