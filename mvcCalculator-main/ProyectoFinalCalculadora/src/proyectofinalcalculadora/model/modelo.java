/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalcalculadora.model;
import proyectofinalcalculadora.control.*;
import proyectofinalcalculadora.view.*;
import java.util.Scanner;

/**
 *
 * @author hector
 */
public class modelo {
public float resultado;
public String op;
public float a;
public float b;

    public float suma (float a, float b){
       resultado = a+b;
        return resultado;
    }
    public float resta(float a, float b){
        resultado = a-b;
        return resultado;
    }
    public float multiplicacion(float a, float b){
        resultado = a*b;
        return resultado;
    }
    public float division (float a,Float b){
        resultado= a/b;
        return resultado;
    }
    
    
    
    
    
    
    
}
