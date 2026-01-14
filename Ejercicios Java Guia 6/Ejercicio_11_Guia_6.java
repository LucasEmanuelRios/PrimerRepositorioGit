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
public class Ejercicio_11_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer= new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);
        
        
        System.out.println("ingrese 2 numeros a operar");
        
        int num=leer.nextInt(); int num2=leer.nextInt();
        
        System.out.println("numero 1 y numero 2: " +num +"     " +num2);
        
            menu(num,num2);//iniciamos un subproceso y lo invocamos, pikachu yo te elijo!
            
            System.out.println("programa finalizado");
    }
    //Generamos un subproceso
       public static void menu(int num, int num2){
       Scanner leer= new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);
        
        
           System.out.println(" MENU : ingrese una opcion " );
           System.out.println(" 1-Sumar " );
           System.out.println(" 2-Restar " );
           System.out.println(" 3-Salir " );
           
           String opcion=leer.nextLine();
       
           System.out.println("la opcion elegida fue " + opcion);
           
           
           switch (opcion) {
           
               case "1": 
                   
                   int suma=num+num2;
                   System.out.println("la suma es " +suma);
                   menu(num,num2);
                   break;
                   
                   
               case "2":
                   
                   int resta=num-num2;
                   System.out.println("la resta es " +resta);
                   
                   menu(num,num2);
                   
                   break;
                   
               case "3":
                   
                   System.out.println("esta seguro que quiere salir ingrese S para si y N para no?");
                   
                   String opcion2=leer2.nextLine();
                           
                           if(opcion2.equals("S")){
                               
                               break;

                           }else{
                             menu(num,num2);
                             
                           }
                           
                   
                   
                   
           
           
           }
           
       }
    
    
}
