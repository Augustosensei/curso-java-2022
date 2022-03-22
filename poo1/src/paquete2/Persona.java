package paquete2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author augus
 */
public class Persona {
    //encapsulacion 
   private  String nombre;
   private String apellido;
   private String dni;

    public Persona(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona() {
    }
   

   
   
   public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        
        if (dni.length() == 8) {
             this.dni = dni;
        }else{

            System.out.println("El numero ingresado no es correcto");
        }
        
       
    }

    

   
   
}
