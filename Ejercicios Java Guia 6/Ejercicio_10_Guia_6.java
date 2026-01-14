/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 

 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejercicio_10_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        
        int numero=leer.nextInt();
        
        System.out.println("numero ingresado: " + numero);
        
        
        System.out.println("vaya ingresando numeros que se sumaran hasta superar el numero inicial");
        
        
         int numerosSumar=leer.nextInt();
         
         int numero2=0;
         
         while(numerosSumar<numero){
         
         
             
         numerosSumar+=numero2;
         
             System.out.println("ingrese otro numero que aun no ha sumerado el valor " + numero + " recien va  por: " + numerosSumar);
               
             numero2=leer.nextInt();
         }
         
         System.out.println("ha superado el valor de :" + numero + "con el valor total :" + numerosSumar);
         
         
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
