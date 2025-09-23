package vista;
import java.util.Scanner;

public class CalculadoraVista {
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarResultado(double resultado) {
        System.out.println("Resultado: " + resultado);
    }

    public String leerOperacion() {
        System.out.print("Ingrese la operación (+, -, *, /): ");
        return scanner.nextLine();
    }

    public double leerNumero(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(scanner.nextLine());
    }
}

