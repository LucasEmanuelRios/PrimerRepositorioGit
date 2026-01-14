/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.


Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejercicio_14_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner leer=new Scanner(System.in);
        Scanner leer2=new Scanner(System.in);
        
        System.out.println("ingrese cantidad de euros");
        
        int euros=leer.nextInt();
        
        System.out.println("ingrese moneda de conversion yenes , dolar o libra");
                        
        String conversion=leer2.nextLine();
        
         convertidor(euros,conversion);
         
         System.out.println("termino el programa");
   
    }
    
    
   public static void convertidor(int euros,String conversion){
       
       
       switch (conversion) {
       
           case "dolar":
               
               System.out.println("la conversion  euro a dolar es " + 1.2*(euros)  );
       
       break;
       
           case "yenes":
               
               System.out.println("la conversion  euro a yenes es" + 129.8*(euros)  );
               
               break;
       
       }
   
   
   }
    
}
