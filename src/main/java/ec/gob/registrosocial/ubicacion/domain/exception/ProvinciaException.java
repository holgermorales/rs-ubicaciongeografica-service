/**
 * <p> Proyecto ApiGateway.
 * <p> Clase ProvinciaException 3/1/25.
 * <p> Copyright 2025 Consejo de la Judicatura.
 * <p> Todos los derechos reservados.
 */
package ec.gob.registrosocial.ubicacion.domain.exception;

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
public class ProvinciaException extends GlobalException {

  public ProvinciaException(String message) {
    super(message);
  }

  public ProvinciaException(String message, Throwable cause) {
    super(message, cause);
  }

}
