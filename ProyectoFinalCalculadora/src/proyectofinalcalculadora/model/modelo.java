/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalcalculadora.model;

import static java.lang.Character.*;
import java.util.Scanner;

/**
 *
 * @author hector
 */
public class modelo {
    private boolean flag = false;
    public modelo(){
    }
    String suma(String a, String b){
        String resultado = "0";
        float valuea = Float.parseFloat(a);
        float valueb = Float.parseFloat(b);
        float res = Float.parseFloat(resultado);
        res = valuea + valueb;
        resultado = Float.toString(res);
        return resultado;
    }
    String resta(String a, String b){
        String resultado = "0";
        float valuea = Float.parseFloat(a);
        float valueb = Float.parseFloat(b);
        float res = Float.parseFloat(resultado);
        res = valuea - valueb;
        resultado = Float.toString(res);
        return resultado;
    }
    String multiplicacion(String a, String b){
        String resultado = "0";
        float valuea = Float.parseFloat(a);
        float valueb = Float.parseFloat(b);
        float res = Float.parseFloat(resultado);
        res = valuea * valueb;
        resultado = Float.toString(res);
        return resultado;
    }
    String division(String a, String b){
        String resultado = "0";
        float valuea = Float.parseFloat(a);
        float valueb = Float.parseFloat(b);
        float res = Float.parseFloat(resultado);
        System.out.println(valuea);
        System.out.println(valueb);
        if((int) valueb != 0){
            try{
                res = valuea / valueb;
                resultado = Float.toString(res);
            }catch(ArithmeticException e){
                resultado = "0";
            }
        }else{
            resultado = "0";
        }
        System.out.println(resultado);
        return resultado;
    }
    public String fromControl(String operation){
        String a = "", b = "", c = "", d = "", dot = ".";
        char chr;
        boolean flag = true, flag2 = true;
        int initA, initB, initC;
        initA = 0;
        initC = operation.indexOf(" ");
        initB = operation.indexOf(" ", initC + 1);
        a = operation.substring(initA, initC);
        c = operation.substring(initC, initB + 1);
        b = operation.substring(initB + 1);
        switch(c){
            case " + ":
                d = suma(a, b);
            break;
            case " - ":
                d = resta(a, b);
            break;
            case " * ":
                d = multiplicacion(a, b);
            break;
            case " / ":
                d = division(a, b);
            break;
        }
        System.out.println("a: " + a + " b: " + b + " c:" + c + "d: " + d);
        if((Float.parseFloat(d.substring(d.indexOf(".")))) == 0){
            return d.substring(0, d.indexOf('.'));
        }else{
            return d;
        }
    }
}
