/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 Crear un programa que dado un numero determine si es par o impar
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejercicio_6_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        
        System.out.println("escribir un numero para determinar si es par o no");
        
        int numero= leer.nextInt();
        
        System.out.println(" el numero elegido es " + numero );
        
        if (numero%2==0){
            
            
            System.out.println("el numero " + numero +  "  es par");
            
        } else{
                    
                    System.out.println("el numero " + numero +  " NO  es par");
                    
                    
            
       
        }
        
        
        
        
        
    }
    
}
