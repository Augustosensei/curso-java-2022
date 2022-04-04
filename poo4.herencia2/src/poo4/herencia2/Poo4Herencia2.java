/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4.herencia2;

import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Poo4Herencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner tecla = new Scanner(System.in);
        float altura, base;
        
        Figura figura = new Cuadrado();
        
        System.out.println("CUADRADO");
        System.out.println("Ingrese la altura: ");
        altura = tecla.nextFloat();
       
        
        
        System.out.println("El area es: "+( figura.area(altura, altura)) );
        System.out.println("El perimetro es: "+(figura.perimetro(altura)));
        
    }
    
}
