/**
 * @author Samuel David Dau Fernández
 */

package main;

import controlador.CalculadoraControlador;
import view.CalculadoraView;

/**
 * Clase principal de la aplicación calculadora.
 * <p>
 * Esta clase contiene el método main,
 * creando la vista y el controlador según el patrón MVC.
 * </p>
 */

public class Main {

    /**
     * Método principal.
     * <p>
     * Crea una instancia de la vista (CalculadoraView) y del controlador
     * (CalculadoraControlador), estableciendo la conexión entre ambos
     * componentes del patrón MVC.
     * </p>
     */
    public static void main(String[] args) {
        CalculadoraView calculadoraView = new CalculadoraView();
        new CalculadoraControlador(calculadoraView);
    }
}