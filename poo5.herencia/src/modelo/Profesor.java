/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author augus
 */
public class Profesor extends Persona{
    
    
    private String materia;

    public Profesor() {
    }

    public Profesor(String materia, String nombre, String apellido) {
        super(nombre, apellido);
        this.materia = materia;
    }

    
    
    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    
    
}
