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
public class Alumno extends Persona{
    
    private String nota;

    public Alumno() {
    }

    public Alumno(String nota, String nombre, String apellido) {
        super(nombre, apellido);
        this.nota = nota;
    }

    
    
    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }
    
    
    
}
