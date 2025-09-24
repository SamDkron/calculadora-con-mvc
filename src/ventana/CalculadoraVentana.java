package ventana;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import controlador.CalculadoraControlador;

public class CalculadoraVentana extends JFrame implements KeyListener{
    private JTextField txtNumero1;
    private JTextField txtNumero2;
    private JTextField txtResultado;
    private JButton btnSumar, btnRestar, btnMultiplicar, btnDividir;
    private JButton btnLimpiar, btnSalir, btnIntercambiar;
    private JLabel lblNumero1, lblNumero2, lblResultado;

    public CalculadoraVentana() {
        starterComponentes();
        configVentana();
        configLayout();
        configEventos();
        configBotones();
    }

    private void starterComponentes() {
        txtNumero1 = new JTextField(12);
        txtNumero2 = new JTextField(12);
        txtResultado = new JTextField(20);

        lblNumero1 = new JLabel("primer numero: ", JLabel.CENTER);
        lblNumero2 = new JLabel("segundo numero: ", JLabel.CENTER);
        lblResultado = new JLabel("Resultado: ", JLabel.CENTER);

        Font font = new Font("Arial", Font.BOLD, 14);
        lblNumero1.setFont(font);
        lblNumero2.setFont(font);
        lblResultado.setFont(font);

        txtNumero1 = new JTextField(12);
        txtNumero2 = new JTextField(12);
        txtResultado = new JTextField(15);
        txtResultado.setEditable(false);
        txtResultado.setBackground(new Color(240, 248, 255));
        txtResultado.setFont(new Font("Arial", Font.BOLD, 14));

        // Configurar campos de entrada
        txtNumero1.setFont(new Font("Arial", Font.PLAIN, 12));
        txtNumero2.setFont(new Font("Arial", Font.PLAIN, 12));
        txtNumero1.addKeyListener(this);
        txtNumero2.addKeyListener(this);

        //botones
        btnSumar = new JButton("+");
        btnRestar = new JButton("-");
        btnMultiplicar = new JButton("×");
        btnDividir = new JButton("÷");
    }

    private void configBotones() {
        JButton[] botonesOperaciones = {btnSumar, btnRestar, btnMultiplicar, btnDividir};
        Color[] coloresBotonesOperaciones = {
                new Color(180, 180, 180),
                new Color(180, 180, 180),
                new Color(180, 180, 180),
                new Color(180, 180, 180),
        };

        Font fuenteBotones = new Font("Arial", Font.BOLD, 14);

        for (JButton botonOperacion : botonesOperaciones) {
            botonOperacion.addKeyListener(this);
            botonOperacion.setBackground(coloresBotonesOperaciones[0]);
            botonOperacion.setForeground(Color.WHITE);
            botonOperacion.setFont(fuenteBotones);
            botonOperacion.setPreferredSize(new Dimension(120, 35));
            botonOperacion.setFocusPainted(false);
            botonOperacion.setBorderPainted(false);
            botonOperacion.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }
}
