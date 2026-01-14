/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *


 */
package javaapplication2;

import java.util.Scanner;
        
/**
 *
 * @author Lucas
 */
public class Ejercicio_13_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        
        System.out.println("ingrese el largo de cada lado");
        
        int largoLado=leer.nextInt();

        int n=largoLado;

        int i,j;
        
        
        //primera parte de arriba
        for (i=0; i<=n-1;i++){
        
            System.out.print("1");
        
        }
         System.out.println("");
         
         
          //Parte de la izquierda
        for (i=0; i<=n-3;i++){
        
            System.out.print("2");
            //parte del medio, por cada "2" debe hacerse esto para rellenar. por eso se hace dentro de este for
             for (j=0; j<=n-3;j++){
        
            System.out.print("0");
        
        }
                                
          System.out.print("3");
             
             
         System.out.println("");
             
        }
         
        
        
          //ultima parte de abajo
        for (i=0; i<=n-1;i++){
        
            System.out.print("4");
        
        }
         System.out.println("");
        
        
        
        
        
    }
    
}
