/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author augus
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String dni;

    public Persona(String nombre, String apellido, String dni) {

        if (dni.length() == 8) {
            this.dni = dni;
        } else {

            JOptionPane.showMessageDialog(null, "El numero ingresado no es correcto");
        }

        this.nombre = nombre;
        this.apellido = apellido;
       
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
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
        } else {

            JOptionPane.showMessageDialog(null, "El numero ingresado no es correcto");
        }

    }

}
