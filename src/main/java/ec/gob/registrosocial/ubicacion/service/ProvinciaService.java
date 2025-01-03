/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ProvinciaService 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.service;

import ec.gob.registrosocial.ubicacion.domain.record.CantonRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ParroquiaRecord;
import ec.gob.registrosocial.ubicacion.domain.record.ProvinciaRecord;
import java.util.List;
import java.util.Map;

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
public interface ProvinciaService {

  List<ProvinciaRecord> getProvincias();
}
