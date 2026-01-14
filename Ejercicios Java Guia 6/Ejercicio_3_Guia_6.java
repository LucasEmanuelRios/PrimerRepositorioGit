/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;



/**
 *
 * @author Lucas
 */
public class Ejercicio_3_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner (System.in);
        
        String frase=leer.nextLine();
           
        System.out.println("frase ingresada   " + frase);
        
      
       String frase2 = frase.toUpperCase();
       
       
        System.out.println("Mayucula   " + frase2 );
               
       
         String frase3 = frase.toLowerCase();
         
          System.out.println("MinusculaHOLA"
                  + "   " + frase3 );
        
        
        
        
    }
    
}
