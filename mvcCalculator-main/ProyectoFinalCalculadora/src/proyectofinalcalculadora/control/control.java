/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalcalculadora.control;
import proyectofinalcalculadora.view.*;
import java.awt.event.*;
import proyectofinalcalculadora.model.*;

/**
 *
 * @author hector
 */
public class control implements ActionListener {
    public String op;
    public String operation;
    private String exit;
    public float a = (float) 0.0;
    public float b = (float) 0.0;
    private final vista calculadora;
    modelo c;
    modelo model = new modelo();
    public control(vista calculadora) {
        this.c = new modelo();
        this.calculadora = calculadora;
    }
    public float geta(){
        return a;
    }
    public float getb(){
        return b;
    }
    public String getop(){
        return op;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (this.calculadora.b1 == e.getSource()) {
            this.calculadora.salida.setText(this.calculadora.salida.getText() + "1");
            
        }
        else if (this.calculadora.b0 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "0");
            
        }
        else if (this.calculadora.b2 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "2");
            
        }
        else if (this.calculadora.b3 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "3");
            
        }
        else if (this.calculadora.b4 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "4");
            
        }
        else if (this.calculadora.b5 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "5");
            
        }
        else if (this.calculadora.b6 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "6");
            
        }
        else if (this.calculadora.b7 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "7");
            
        }
        else if (this.calculadora.b8 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "8");
            
        }
        else if (this.calculadora.b9 == e.getSource()) {
            calculadora.salida.setText(calculadora.salida.getText() + "9");
            

        }
        else if (this.calculadora.bDot == e.getSource()) {
            String a = "", b = "";
            int pos1;
            a = calculadora.salida.getText();
            pos1 = a.indexOf(" ");
            if(pos1 != -1){
                b = a.substring(pos1 + 3);
            }else{
                b = a;
            }
            if(!b.contains(".")){
                if(b.length() < 1){
                    a+= "0";
                }
                a+= ".";
            }
            calculadora.salida.setText(a);
        }
        //Operaciones
         else if (this.calculadora.bSum == e.getSource()) {
            op="+";
            this.calculadora.salida.setText(calculadora.salida.getText() + " + ");
        }
         else if (this.calculadora.bRest == e.getSource()) {
            String b = this.calculadora.salida.getText();
            op="-";
            if(b.contains(" ") || b.isEmpty()){
                this.calculadora.salida.setText(b + "-");
            }else{
                this.calculadora.salida.setText(b + " - ");
            }
        }
         else if (this.calculadora.bMul == e.getSource()) {
            op="*";
            this.calculadora.salida.setText(calculadora.salida.getText() + " * ");
        }
         else if (this.calculadora.bDiv == e.getSource()) {
            op="/";
            this.calculadora.salida.setText(calculadora.salida.getText() + " / ");
        }
        else if ((this.calculadora.bEqual == e.getSource())) {
            operation = calculadora.salida.getText();
            if(operation.contains(" ")){
                exit = model.fromControl(operation);
                this.calculadora.salida.setText(exit);
            }else{
                this.calculadora.salida.setText(operation);
            }
        }
        
    }   
        }
    

