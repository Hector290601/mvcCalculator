//Paquetes
package proyectofinalcalculadora.view;
//Librerias

import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import proyectofinalcalculadora.control.control;

public class vista extends JFrame{
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
        salida.setHorizontalAlignment(JTextField.CENTER);
        salida.setEditable(false);
        salida.setBackground(new Color(115, 198, 182));
        salida.setForeground(Color.WHITE);
        
        //Paneles y configuracion
        panel1.setLayout(new GridLayout(4, 4));
        //Teclado
        panel1.add(b1);
        b1.setBackground(Color.yellow);
        panel1.add(b2);
        b2.setBackground(Color.yellow);
        panel1.add(b3);
        b3.setBackground(Color.yellow);
        panel1.add(b4);
        b4.setBackground(Color.yellow);
        panel1.add(b5);
        b5.setBackground(Color.yellow);
        panel1.add(b6);
        b6.setBackground(Color.yellow);
        panel1.add(b7);
        b7.setBackground(Color.yellow);
        panel1.add(b8);
        b8.setBackground(Color.yellow);
        panel1.add(b9);
        b9.setBackground(Color.yellow);
        panel1.add(b0);
        b0.setBackground(Color.yellow);
        panel1.add(bDot);
        bDot.setBackground(new Color(249, 237, 87));
        panel1.add(bSum);
        bSum.setBackground(new Color(88, 214, 141));
        panel1.add(bRest);
        bRest.setBackground(new Color(88, 214, 141));
        panel1.add(bMul);
        bMul.setBackground(new Color(88, 214, 141));
        panel1.add(bDiv);
        bDiv.setBackground(new Color(88, 214, 141));
        panel1.add(bEqual);
        bEqual.setBackground(new Color(88, 214, 141));
        //Ventana Principal
        frame.setSize(350, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Dimensiones y agregadpods
        salida.setPreferredSize(new Dimension(330,40));
       
        frame.add(salida,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.CENTER);
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
