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
    private int resultadoInt = 0;
    public modelo(){
    }
    void sumaInt(int a){
        resultadoInt += a;
    }
    void restaInt(int a){
        resultadoInt -= a;
    }
    void multiplicacionInt(int a){
        resultadoInt *= a;
    }
    void divisionInt(int a){
        resultadoInt /= a;
    }
    void menuTest(){
        int opc = 0, operator = 0;
        Scanner reader = new Scanner(System.in);
        do{
            System.out.println("Seleccione una opción\t\t\tresultado:" + resultadoInt + "\n\t1)Suma\n\t2)Resta\n\t3)multiplicación\n\t4)Division\n\t5)Salir");
            opc = reader.nextInt();
            switch(opc){
                case 1:
                    System.out.println("La suma en este momento es:" + resultadoInt + ", Ingrese el valor a sumar:");
                    operator = reader.nextInt();
                    sumaInt(operator);
                break;
                case 2:
                    System.out.println("La resta en este momento es:" + resultadoInt + ", Ingrese el valor a sumar:");
                    operator = reader.nextInt();
                    restaInt(operator);
                break;
                case 3:
                    System.out.println("La multiplicacion en este momento es:" + resultadoInt + ", Ingrese el valor a sumar:");
                    operator = reader.nextInt();
                    multiplicacionInt(operator);
                break;
                case 4:
                    System.out.println("La division en este momento es:" + resultadoInt + ", Ingrese el valor a sumar:");
                    operator = reader.nextInt();
                    divisionInt(operator);
                break;
                case 5:
                    System.out.println("Gracias por su tiempo");
                break;
                default:
                    System.out.println("Parece que esa no es una opción válida");
                break;
            }
        }while(opc != 5);
    }
    public static void main(String[] args) {
        modelo md;
        md = new modelo();
        md.menuTest();
    }
}
