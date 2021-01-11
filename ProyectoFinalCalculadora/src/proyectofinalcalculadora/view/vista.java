//Paquetes
package proyectofinalcalculadora.view;
//Librerias
import java.io.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class vista {
//Menu de vista
    //Principal
private JFrame frame;
private JTextArea salida;
private JPanel panel1;
private JPanel panel2;
    //Botones
 private JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bSum, bEqual,bDiv,bMul,bRest,bDot;
 public vista(){
        panel1  = new JPanel();
        panel2= new JPanel();
        frame = new JFrame(" Calculadora ");
        salida= new JTextArea();
        bMul=new JButton("*");
        bRest= new JButton("-");
        bSum=new JButton("+");
        bDiv= new JButton("/");
        bDot = new JButton(".");
        bEqual = new JButton("=");
        b1  = new JButton("1");
        b2  = new JButton("2");
        b3  = new JButton("3");
        b4  = new JButton("4");
        b5  = new JButton("5");
        b6  = new JButton("6");
        b7  = new JButton("7");
        b8  = new JButton("8");
        b9  = new JButton("9");
        b0 = new JButton("0");
     
            }
  public void launchFrame(){
      //Ventana de visualizacion del texto
      panel2.add(salida);
       //Paneles y configuracion
       panel1.setLayout(new GridLayout(4,4));
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
        frame.setSize(800, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel2,BorderLayout.NORTH);
        frame.add(panel1,BorderLayout.CENTER);
        frame.setVisible(true);
      
    }   
  
  }

