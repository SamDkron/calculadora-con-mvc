/**
 * @author Samuel David Dau Fernández
 */
package modelo;

/**
 * aca se encuentra la interfaz que define el "contrato" para las operaciones aritméticas.
 * <p>
 * Todas las operaciones aritméticas de la calculadora deben implementar
 * esta interfaz, proporcionando la lógica específica del cálculo en el
 * método calcular().
 * </p>
 */
public interface Operacion {
    /**
     * @param a el primer operando
     * @param b el segundo operando
     * @return resultado
     */
    double calcular(double a, double b);
}
