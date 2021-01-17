/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalcalculadora.model;

import java.util.Scanner;

/**
 *
 * @author hector
 */
public class modelo {
    private String resultado = "0";
    private boolean flag = false;
    public modelo(){
    }
    void suma(String a){
        float value = Float.parseFloat(a);
        flag = true;
        float res = Float.parseFloat(resultado);
        res += value;
        resultado = Float.toString(res);
    }
    void resta(String a){
        float value = Float.parseFloat(a);
        flag = true;
        float res = Float.parseFloat(resultado);
        res -= value;
        resultado = Float.toString(res);
    }
    void multiplicacion(String a){
        float value = Float.parseFloat(a);
        flag = true;
        float res = Float.parseFloat(resultado);
        res *= value;
        resultado = Float.toString(res);
    }
    void division(String a){
        float value = Float.parseFloat(a);
        flag = true;
        float res = Float.parseFloat(resultado);
        try{
            res /= value;
            resultado = Float.toString(res);
        }catch(ArithmeticException e){
            resultado = e.getMessage();
        }
    }
    void reset(){
        resultado = "0";
    }
    void menuTest(){
        String opc = "0", operator = "0";
        Scanner reader = new Scanner(System.in);
        boolean fg = true;
        do{
            System.out.println("Seleccione una opción\t\t\tresultado:" + resultado + "\n\t1)Suma\n\t2)Resta\n\t3)multiplicación\n\t4)Division\n\t5)Salir\n\t6)Reset");
            opc = reader.nextLine();
            switch(opc){
                case "1":
                    System.out.println("La suma en este momento es:" + resultado + ", Ingrese el valor a sumar:");
                    operator = reader.nextLine();
                    suma(operator);
                break;
                case "2":
                    System.out.println("La resta en este momento es:" + resultado + ", Ingrese el valor a sumar:");
                    operator = reader.nextLine();
                    resta(operator);
                break;
                case "3":
                    System.out.println("La multiplicacion en este momento es:" + resultado + ", Ingrese el valor a sumar:");
                    operator = reader.nextLine();
                    multiplicacion(operator);
                break;
                case "4":
                    System.out.println("La division en este momento es:" + resultado + ", Ingrese el valor a sumar:");
                    operator = reader.nextLine();
                    division(operator);
                    reset();
                break;
                case "5":
                    System.out.println("Gracias por su tiempo");
                    fg = false;
                break;
                case "6":
                    reset();
                    System.out.println("Reseteando");
                default:
                    System.out.println("Parece que esa no es una opción válida");
                break;
            }
        }while(fg);
    }
    public static void main(String[] args) {
        modelo md;
        md = new modelo();
        md.menuTest();
    }
}
