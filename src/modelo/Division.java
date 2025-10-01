/**
 * @author Samuel David Dau Fernández
 */

package modelo;

/**
 * Clase que implementa la operación de división.
 * <p>
 * Realiza el cociente de dos números decimales, con protección
 * contra división por cero.
 * </p>
 */
public class Division implements Operacion {
    /**
     * Calcula la división de dos números.
     * <p>
     * Valida que el divisor no sea cero antes de realizar la operación.
     * Si el divisor es cero, lanza una excepción ArithmeticException.
     * </p>
     *
     * @param a dividendo
     * @param b divisor
     * @return cociente de la division
     * @throws ArithmeticException dado caso que el divisor sea igual a cero
     */
    @Override
    public double calcular(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("operacion invalida");
        }
        return a / b;
    }
}
