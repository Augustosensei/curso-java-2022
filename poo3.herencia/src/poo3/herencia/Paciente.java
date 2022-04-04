/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3.herencia;

/**
 *
 * @author augus
 */
public class Paciente extends Persona{
    
  private String enfermedad;

    public Paciente(String enfermedad, String nombre, String apellido) {
        super(nombre, apellido);
        this.enfermedad = enfermedad;
    }

    public Paciente(String nombre, String apellido) {
        super(nombre, apellido);
    }

    public Paciente() {
    }

  
  
    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
  
  
}
