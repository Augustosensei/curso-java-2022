/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modular;

import java.util.Scanner;


/**
 *
 * @author augus
 */


public  class Acciones {
       
  static  Scanner teclado = new Scanner(System.in); 
  static  float valorUno, valorDos, resultado;
   
    public static void cargarValores(){
        System.out.print("Ingrese valor uno ");
        valorUno = teclado.nextInt();
        System.out.print("Ingrese valor dos ");
        valorDos = teclado.nextInt();
    
    }
    
    
    public static void mostrar(){
     System.out.println("El resultado es: "+resultado); 
    }
    
    
    public static void accion(int selec){
        switch(selec){
            case 1:
                sumar();
                break;
            case 2:
                restar();
                break;
        }
          
    }
    
    
    public static void sumar(){
                cargarValores();
                resultado = valorUno + valorDos;
    }
    public static  void restar(){
                cargarValores();
                resultado = valorUno - valorDos;
    }
    
    
    
}
