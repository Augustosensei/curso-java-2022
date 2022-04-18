/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        
        int [] valor = new int[3];
        
    
        for (int i = 0; i < valor.length; i++) {
              System.out.println("Ingrese valor "+(i+1)+" : ");
              valor[i] = tecla.nextInt();
        }
        
      
        for (int i = 0; i < valor.length; i++) {
              System.out.println("El valor "+(i+1)+" en pantalla es: "+valor[i]);
        }
       
      
      //  System.out.println("el valor "+valor);

        
        
    }
    
}
