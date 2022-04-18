/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner tecla = new Scanner(System.in);
        int tamanio;
        
        System.out.println("Ingrese el tamaño de la matriz ");
        tamanio = tecla.nextInt();
        
        int matriz [][] = new int[tamanio][tamanio];
        
       
        //cargamos la matriz////////////////////////////////////
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.println("ingrese un valor en fila "+fila+ " columna "+col+" : ");
                matriz[fila][col] = tecla.nextInt();
            }   
        }
        //Mostramos matriz///////////////////////////////
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(matriz[fila][col]);
            }  
            System.out.println("");
        }
        
        
        //////////////////////////////////////
        
        float acumulador = 0;
        
        
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int col = 0; col < matriz.length; col++) {
                
                if ( fila + col == (matriz.length - 1) ) {
                    
                    acumulador += matriz[fila][col]; /// acumulador = acumulador + matriz[fila][col]
                    
                }
                
                
            }  
            System.out.println("");
        }
        
        System.out.println("El acumulador es: "+ acumulador);
        System.out.println("El promedio es: "+ (acumulador / matriz.length ));
        
        
    }
    
}
