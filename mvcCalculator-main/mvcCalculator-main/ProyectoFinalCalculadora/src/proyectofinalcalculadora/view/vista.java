//Paquetes
package proyectofinalcalculadora.view;
//Librerias

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proyectofinalcalculadora.control.control;

public class vista {
//Menu de vista
    //Principal

    public JFrame frame;
    public JTextField salida;
    public JPanel panel1;
    public JPanel panel2;
    //Botones
    public JButton b1;
    public JButton b2;
    public JButton b3;
    public JButton b4;
    public JButton b5;
    public JButton b6, b7, b8, b9, b0, bSum, bEqual, bDiv, bMul, bRest, bDot;

    public vista() {
        panel1 = new JPanel();
        panel2 = new JPanel();
        frame = new JFrame(" Calculadora ");
        salida = new JTextField();
        bMul = new JButton("*");
        bRest = new JButton("-");
        bSum = new JButton("+");
        bDiv = new JButton("/");
        bDot = new JButton(".");
        bEqual = new JButton("=");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b0 = new JButton("0");

    }

    public void launchFrame() {
        //Ventana de visualizacion del texto
        salida.setSize(50, 10);
        salida.setBackground(Color.YELLOW);
        //Paneles y configuracion
        panel1.setLayout(new GridLayout(4, 4));
        //Teclado
        panel1.add(b1);
        panel1.add(b2);
        panel1.add(b3);
        panel1.add(b4);
        panel1.add(b5);
        panel1.add(b6);
        panel1.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        panel1.add(b0);
        panel1.add(bDot);
        panel1.add(bSum);
        panel1.add(bRest);
        panel1.add(bMul);
        panel1.add(bDiv);
        panel1.add(bEqual);
        //Ventana Principal
        frame.setSize(400, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(salida, BorderLayout.NORTH);
        frame.add(panel1, BorderLayout.CENTER);
        frame.setVisible(true);
        //Ejecuciones
        this.b0.addActionListener(new control(this));
        this.b1.addActionListener(new control(this));
        this.b2.addActionListener(new control(this));
        this.b3.addActionListener(new control(this));
        this.b4.addActionListener(new control(this));
        this.b5.addActionListener(new control(this));
        this.b6.addActionListener(new control(this));
        this.b7.addActionListener(new control(this));
        this.b8.addActionListener(new control(this));
        this.b9.addActionListener(new control(this));
        this.bDot.addActionListener(new control(this));
        this.bSum.addActionListener(new control(this));
        this.bRest.addActionListener(new control(this));
        this.bDiv.addActionListener(new control(this));
        this.bMul.addActionListener(new control(this));
        this.bEqual.addActionListener(new control(this));
    }

}
