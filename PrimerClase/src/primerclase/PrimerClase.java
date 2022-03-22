/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerclase;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class PrimerClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner tecla = new Scanner(System.in);
        int valorUno, valorDos;
    
        System.out.println("Ingrese valor: ");
        valorUno = tecla.nextInt();
        System.out.println("Ingrese valor: ");
        valorDos = tecla.nextInt();
        
        System.out.println("el resultado es: "+ (valorUno + valorDos));
        

    }
    
}
