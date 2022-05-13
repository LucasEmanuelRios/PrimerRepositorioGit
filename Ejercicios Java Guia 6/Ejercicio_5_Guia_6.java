


package javaapplication2;
import java.util.Scanner;


/**
 *
 * @author Lucas
 */
public class Ejercicio_5_Guia_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner leer= new Scanner (System.in);
        
        System.out.println("ingrese un numero");
        
        int numero= leer.nextInt();
        
        System.out.println("doble,triple y reiz cuadrada   " + numero*2 + " , " + numero*3 + "," + Math.sqrt(numero)) ;
        
        
        
    }
    
}
