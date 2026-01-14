/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.

 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejercicio_7_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Scanner leer= new Scanner (System.in);
      
        System.out.println(" ingrese palabra");
        
        String palabra= leer.nextLine();
        
        boolean comparacion = palabra.equals("eureka");
        
        System.out.println(" la palabra eureka fue escrita de manera: " + comparacion );
        
        
    }
    
}
