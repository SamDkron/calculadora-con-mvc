/**
 * @author Samuel David Dau Fernández
 */

package controlador;

import view.CalculadoraView;
import modelo.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controlador de la calculadora que gestiona la lógica de la aplicación.
 * <p>
 * Esta clase actúa como intermediario entre la vista y el modelo,
 * procesando las acciones del usuario y actualizando la vista según
 * corresponda. Implementa el patrón MVC como componente Controlador.
 * </p>
 *
 * @author Samuel David Dau Fernández
 */

public class CalculadoraControlador {
    private CalculadoraView calculadora;
    private Operacion operacionActual = null;
    private double numero1 = 0;
    private boolean numeroNext = true;

    /**
     * Constructor que inicializa el controlador y registra los listeners.
     * <p>
     * Conecta la vista con el controlador mediante la asignación de
     * listeners a todos los botones de la interfaz.
     * </p>
     *
     * @param calculadora la vista de la calculadora a controlar
     */
    public CalculadoraControlador(CalculadoraView calculadora) {
        this.calculadora = calculadora;
        calculadora.addNumeroListener(new NumeroListener());
        calculadora.addOperacionListener(new OperacionListener());
        calculadora.addIgualListener(new IgualListener());
        calculadora.addCListener(new CListener());
        calculadora.setVisible(true);
    }

    /**
     * Listener interno para manejar los eventos de los botones numéricos.
     * <p>
     * Captura los clics en los botones del 0 al 9 y actualiza la pantalla
     * agregando el dígito seleccionado al número actual.
     * </p>
     */
    class NumeroListener implements ActionListener {
        /**
         * Procesa el evento de clic en un botón numérico.
         *
         * @param e el evento de acción generado por el botón
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            String digito = ((JButton)e.getSource()).getText();
            if (numeroNext || calculadora.getScreen().equals("0")) {
                calculadora.setScreen(digito);
                numeroNext = false;
            } else {
                calculadora.setScreen(calculadora.getScreen() + digito);
            }
        }
    }

    /**
     * Listener interno para manejar los eventos de los botones de operaciones.
     * <p>
     * Captura los clics en los botones de operaciones (+, -, *, /) y
     * almacena el primer número y la operación seleccionada.
     * </p>
     */
    class OperacionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String simbolo = ((JButton) e.getSource()).getText();
            numero1 = Double.parseDouble(calculadora.getScreen());
            switch (simbolo) {
                case "+":
                    operacionActual = new Suma();
                    break;
                case "-":
                    operacionActual = new Resta();
                    break;
                case "*":
                    operacionActual = new Multiplicacion();
                    break;
                case "/":
                    operacionActual = new Division();
                    break;
                default:
                    operacionActual = null;
                    break;
            }
            numeroNext = true;
        }
    }

    /**
     * Listener interno para manejar el evento del botón igual (=).
     * <p>
     * Realiza el cálculo de la operación seleccionada previamente
     * usando el primer número almacenado y el segundo número de la pantalla,
     * mostrando el resultado en la pantalla.
     * </p>
     */
    class IgualListener implements ActionListener {
        /**
         * Procesa el evento de clic en el botón igual.
         * <p>
         * Calcula el resultado de la operación y lo muestra en pantalla.
         * Si ocurre un error (como división por cero), muestra "ERROR!!!".
         * </p>
         *
         * @param e el evento de acción generado por el botón
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            double numero2 = Double.parseDouble(calculadora.getScreen());
            double resultado = 0;
            if (operacionActual != null){
                try{
                    resultado = operacionActual.calcular(numero1, numero2);
                    calculadora.setScreen(String.valueOf(resultado));
                } catch(Exception ex){
                    calculadora.setScreen("ERROR!!!");
                }
                numeroNext = true;
            }
        }
    }

    /**
     * Listener interno para manejar el evento del botón limpiar (C).
     * <p>
     * Reinicia la calculadora a su estado inicial, limpiando la pantalla
     * y reseteando todos los valores almacenados.
     * </p>
     */
    class CListener implements ActionListener {
        /**
         * Procesa el evento de clic en el botón C.
         * <p>
         * Resetea la pantalla a "0" y limpia todos los valores almacenados,
         * dejando la calculadora lista para una nueva operación.
         * </p>
         *
         * @param e el evento de acción generado por el botón
         */
        @Override
        public void actionPerformed(ActionEvent e) {
            calculadora.setScreen("0");
            operacionActual = null;
            numero1 = 0;
            numeroNext = true;
        }
    }
}