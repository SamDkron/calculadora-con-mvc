/**
 * @author Samuel David Dau Fernández
 */

package modelo;

/**
 * Clase que implementa la operación de multiplicación.
 * <p>
 * Realiza el producto de dos números decimales.
 * </p>
 */
public class Multiplicacion implements Operacion {

    /**
     * realiza la multiplicacion de dos numeros.
     *
     * @param a primer factor
     * @param b segundo factor
     * @return producto
     */
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}
