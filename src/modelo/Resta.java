/**
 * @author Samuel David Dau Fernández
 */

package modelo;

/**
 * Clase que implementa la operación de resta.
 * <p>
 * Realiza la sustracción entre dos números decimales.
 * </p>
 */
public class Resta implements Operacion {
    /**
     * Calcula la resta de dos números.
     *
     * @param a minuendo
     * @param b sustraendo
     * @return resultado || diferencia
     */
    @Override
    public double calcular(double a, double b) {
        return a - b;
    }
}
