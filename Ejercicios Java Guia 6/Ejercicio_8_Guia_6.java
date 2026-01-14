/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package javaapplication2;

import java.util.Scanner;
/**
 *
 * @author Lucas
 */
public class Ejercicio_8_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("ingrese palabra de no mas de 8 letras");
        
        String palabra= leer.nextLine();
        
        
        
        if(palabra.length()==8){
        
        
            System.out.println("Correcto");
        
        
        }else{
        
            System.out.println("Incorreecto, tiene mas o menos  de 8 letras");
        
        }
        
        
        
        
        
    }
    
}
