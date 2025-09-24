///*
/// © 2025 Samuel David Dau Fernández.
package controlador;

import modelo.*;
import vista.CalculadoraVista;

public class CalculadoraControlador {
    private final CalculadoraVista vista;

    public CalculadoraControlador(CalculadoraVista vista) {
        this.vista = vista;
    }

    public void realizarOperacion(String operador, double a, double b) {
        Operacion operacion;
        switch (operador) {
            case "+": operacion = new Suma();
            break;
            case "-": operacion = new Resta();
            break;
            case "*": operacion = new Multiplicacion();
            break;
            case "/": operacion = new Division();
            break;
            default:
                vista.mostrarMensaje("Operador invalido: " + operador);
                return;
        }

        try {
            double resultado = operacion.calcular(a, b);
            vista.mostrarMensaje("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            vista.mostrarMensaje("ERROR: " + e.getMessage());
        }
    }

}
