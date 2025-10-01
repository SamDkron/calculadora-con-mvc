/**
 * @author Samuel David Dau Fernández
 */

package modelo;

/**
 * Clase que implementa la operación de suma.
 * <p>
 * Realiza la adición de dos números decimales.
 * </p>
 */

public class Suma implements Operacion {
    /**
     * Calcula la suma de dos números.
     *
     * @param a primer sumando
     * @param b segundo sumando
     * @return suma de a + b
     */
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}
