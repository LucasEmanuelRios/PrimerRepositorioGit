/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma
 */
package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author Lucas
 */
public class Ejercicio_1_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in); // Creamos el Scanner
            
        System.out.println("Ingrese 2 numeros a sumar");
            
       int num1,num2,suma ;
        
       num1=leer.nextInt();
        num2=leer.nextInt();
         
        suma=num1+num2;
        System.out.println("suma"+suma ) ;
        System.out.println("");
        
    }
    
}
