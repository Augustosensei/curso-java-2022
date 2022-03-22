/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;


import paquete2.Persona;
import java.util.Scanner;

/**
 *
 * @author augus
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner tecla = new Scanner(System.in);
        
        Persona per = new Persona();
        
        int valor = 12;
        
      //  int resultado = valor + per.getCalculo();
        
      //  System.out.println("el resultado es: "+resultado);
      
        

        System.out.println("Ingrese nombre: ");
        per.setNombre(  tecla.next()   ); 
          
          
        System.out.println("Ingrese apellido: ");
        per.setApellido(  tecla.next()   ); 
        
        System.out.println("Ingrese dni: ");
        per.setDni(tecla.next()   ); 
        
        
       
        System.out.println("El nombre es: "+per.getNombre());
        System.out.println("El apellido es: "+per.obtenerApellido());
        System.out.println("El dni es: "+per.getDni());
 
        
        
        
     
        
        
        
    }
    
}
