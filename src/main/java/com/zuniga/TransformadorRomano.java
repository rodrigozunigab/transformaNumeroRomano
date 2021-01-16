/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zuniga;

import static java.lang.Math.abs;

/**
 *
 * @author rodrigozuniga
 */
class TransformadorRomano {

    static Object calcular(int i) {
        String resultado = "";

        int miles       = i / 1000;
        int centenas    = i / 100 % 10;
        int decenas     = i / 10 % 10;
        int unidades    = i % 10;
        
        System.out.println("numero      = " + i);
        System.out.println("miles       = " + miles);
        System.out.println("centenas    = " + centenas);
        System.out.println("decenas     = " + decenas);
        System.out.println("unidades    = " + unidades);
        
        
        resultado = calcularNumero(miles,       "M", "", "").toString() +
                    calcularNumero(centenas,    "C", "D", "M").toString() + 
                    calcularNumero(decenas,     "X", "L", "C").toString() + 
                    calcularNumero(unidades,    "I", "V", "X").toString();
        System.out.println("resultado: "+i+" ==>" + resultado);
        return resultado;
    }
    
    
    static Object calcularNumero(int i, String simbolo1, String simbolo2, String simbolo3) {
        String resultado = "";
        
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                resultado =componeNumero(i,simbolo1,"");
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:    
                resultado =componeNumero(i,simbolo1,simbolo2);
                break;  
            case 9:      
                resultado =componeNumero(i,simbolo1,simbolo3);
                break;                 
            default:
                break;
        }
        return resultado;
    }
    
    
    
    static String componeNumero(int numero, String simbolo, String simboloCentral){
        int unidades = calculaCantidadVeces(numero, simboloCentral) % 10;
        int i;
        String resultado="";
        String tipoIzquierdaDerecha="I";
        
        if (unidades<0) {
            tipoIzquierdaDerecha="D";
            unidades = abs(unidades);
        }
        
        resultado =simboloCentral;
        for (i = 1; i <= unidades; i++) {
            
            if (tipoIzquierdaDerecha.equals("D"))
                resultado = resultado + simbolo;
            else
                resultado =  simbolo + resultado;
        }
       
        return resultado;
    }
    
    static int calculaCantidadVeces(int numero, String simbolo){
        
        int resultado = 0;
        
        switch (simbolo) {
            case "":    
                resultado = numero; 
                break;
            case "V": 
            case "L":   
            case "D":     
                resultado = 5 - numero; 
                break;
            case "X":   
            case "C":  
            case "M":    
                resultado = 10 - numero; 
                break;

            default:
                break;
        }
        return resultado;
    
    
    }
    
}


/*

Iteración 1:
    static Object calcular(int i) {
        String resultado = "";
        
        if (i == 0)
            resultado = "";
        else if (i == 1)
            resultado = "I";
           
        return resultado;
    }




iteracion 2

    static Object calcular(int i) {
        String resultado = "";
        
        switch (i) {
            case 0:
                resultado = "";
                break;
            case 1:
                resultado = "I";
                break;
            case 2:
                resultado = "II";            
                break;
            case 3:
                resultado = "III";
                break;
            default:
                break;
        }
        return resultado;
    }


*/
