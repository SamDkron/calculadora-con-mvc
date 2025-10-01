/**
 * @author Samuel David Dau Fernández
 */

package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

/**
 *
 * Constructor que inicializa y configura todos los componentes de la interfaz.
 * <p>
 * Configura la ventana principal, crea la pantalla de resultados,
 * inicializa todos los botones con sus respectivos colores y los
 * organiza en un diseño de cuadrícula.
 * </p>
 */

public class CalculadoraView extends JFrame {
    private JTextField screen;
    private JButton[] botonesNumero;
    private JButton[] botonesOperaciones;
    private JButton botonIgual, botonC;

    public CalculadoraView() {
        setTitle("Calculadora");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        Color fondo = new Color(30, 30, 30);
        Color colorNumero = new Color(51, 51, 51);
        Color colorOperacion = new Color(255, 149, 0);
        Color colorScreen = new Color(25, 25, 25);
        Color colorTexto = Color.WHITE;

        setLayout(new BorderLayout());
        getContentPane().setBackground(colorTexto);

        screen = new JTextField("0");
        screen.setBackground(colorScreen);
        screen.setForeground(colorTexto);
        screen.setFont(new Font("Arial", Font.BOLD, 36));
        screen.setHorizontalAlignment(JTextField.CENTER);
        screen.setEditable(false);
        screen.setBorder(BorderFactory.createEmptyBorder(10, 10,10, 10));
        add(BorderLayout.NORTH, screen);

        JPanel panel = new JPanel(new GridLayout(5, 4, 8, 8));
        panel.setBackground(fondo);
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        botonesNumero = new JButton[10];
        for (int i = 0; i < 10; i++) {
            botonesNumero[i] = crearBoton(String.valueOf(i), colorNumero, colorTexto);
        }

        String[] operaciones = {"/", "*", "-", "+"};
        botonesOperaciones = new JButton[operaciones.length];
        for (int i = 0; i < operaciones.length; i++) {
            botonesOperaciones[i] = crearBoton(operaciones[i], colorOperacion, colorTexto);
        }

        botonIgual = crearBoton("=", colorNumero, colorTexto);
        botonC = crearBoton("C", new Color(165,165,165), Color.BLACK);

        panel.add(botonesNumero[7]);
        panel.add(botonesNumero[8]);
        panel.add(botonesNumero[9]);
        panel.add(botonesOperaciones[0]);

        panel.add(botonesNumero[4]);
        panel.add(botonesNumero[5]);
        panel.add(botonesNumero[6]);
        panel.add(botonesOperaciones[1]);

        panel.add(botonesNumero[1]);
        panel.add(botonesNumero[2]);
        panel.add(botonesNumero[3]);
        panel.add(botonesOperaciones[2]);

        panel.add(botonC);
        panel.add(botonesNumero[0]);
        panel.add(botonIgual);
        panel.add(botonesOperaciones[3]);

        add(panel, BorderLayout.CENTER);
    }

    /**
     * Crea y configura visualmente un botón.
     *
     * @param texto el texto que va mostrar en el botón
     * @param fondo el color de fondo del botón
     * @param textoColor el color del texto del botón
     * @return un JButton configurado con los parámetros especificados
     */

    private JButton crearBoton(String texto, Color fondo, Color textoColor) {
        JButton boton = new JButton(texto);
        boton.setFont(new Font("Arial", Font.BOLD, 28));
        boton.setBackground(fondo);
        boton.setForeground(textoColor);
        boton.setFocusable(false);
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        //boton.setBorder(BorderFactory.createLineBorder(new Color(40,40,40), 2));
        return boton;
    }

    /**
     * Agrega un ActionListener a todos los botones numéricos, operadores, boton igual y C.
     *
     * @param numero el ActionListener a agregar a los botones numéricos
     */
    public void addNumeroListener(ActionListener numero) {
        for(JButton boton : botonesNumero) boton.addActionListener(numero);
    }

    /**
     * @param operacion el ActionListener a agregar a los botones de operaciones
     */
    public void addOperacionListener(ActionListener operacion) {
        for(JButton boton : botonesOperaciones) boton.addActionListener(operacion);
    }

    /**
    * @param igual el ActionListener a agregar al botón igual
    */
    public void addIgualListener(ActionListener igual) {
        botonIgual.addActionListener(igual);
    }

    /**
     * @param C el ActionListener a agregar al botón C
     */
    public void addCListener(ActionListener C) {
        botonC.addActionListener(C);
    }

    /**
     * Establece el texto que se muestra en la pantalla de la calculadora.
     *
     * @param texto el texto a mostrar en la pantalla
     */
    public void setScreen(String texto) {
        screen.setText(texto);
    }

    /**
     * Obtiene el texto actual que se muestra en la pantalla de la calculadora.
     *
     * @return el texto actual de la pantalla
     */

    public String getScreen() {
        return screen.getText();
    }
}