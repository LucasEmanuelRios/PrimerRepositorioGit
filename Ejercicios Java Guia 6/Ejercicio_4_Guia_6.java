/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio_4_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese temperatura en centrigrados");
        
        int centigrados = leer.nextInt();
        
        int F=32+(9*centigrados/5);
        
        
        System.out.println("grados fahrenheit    "+F);
        
        
        
        
        
        
        
        
    }
    
}
