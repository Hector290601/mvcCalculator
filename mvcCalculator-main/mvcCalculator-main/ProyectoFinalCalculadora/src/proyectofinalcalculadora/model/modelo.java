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
        res = valuea / valueb;
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
        try{
            res = valuea / valueb;
            resultado = Float.toString(res);
        }catch(ArithmeticException e){
            resultado = e.getMessage();
        }
        return resultado;
    }
    public void fromControl(String operation){
        String a = "", b = "", c = "", d = "";
        char chr;
        boolean flag = true, flag2 = true;
        for(int i = 0; i < operation.length(); i++){
            chr = operation.charAt(i);
            if(isDigit(chr) || (".".equals(chr))){
                if(flag){
                    a += chr;
                    flag = false;
                }else{
                    b += chr;
                }
            }else{
                c += chr;
            }
        }
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
        System.out.println("a: " + a + " b: " + b + " c: " + c + " d: " + d);
    }
}