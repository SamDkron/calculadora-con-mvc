package main;

import java.util.Scanner;
import controlador.CalculadoraControlador;
import modelo.*;
import vista.CalculadoraVista;

public class Main {
    public static void main(String[] args) {
        CalculadoraVista vista = new CalculadoraVista();
        CalculadoraControlador controlador = new CalculadoraControlador(vista);

        boolean salir = false;
        while (!salir) {
            double a = vista.leerNumero("Ingresa el valor del numero: ");
            String operador = vista.leerOperacion();
            if (operador.equalsIgnoreCase("salir")) {
                salir = true;
                continue;
            }
            double b = vista.leerNumero("Ingresa el valor del numero: ");
            controlador.realizarOperacion(operador, a, b);
            vista.mostrarMensaje("");
        }
        vista.mostrarMensaje("Programa terminado");
    }
}