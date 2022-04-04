/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Alumno;

/**
 *
 * @author augus
 */
public class AlumnoControlador extends PersonaControlador{
    
    Alumno  alumno;

    @Override
    public void mostrar(String nombre, String apellido, String opcion) {

        alumno = new Alumno(opcion, nombre, apellido);
        JOptionPane.showMessageDialog(null, "El nombre es "+alumno.getNombre());
        JOptionPane.showMessageDialog(null, "El apellido es "+alumno.getApellido());
        JOptionPane.showMessageDialog(null, "La especialidad es "+alumno.getNota());
        
    }

  
 
    
   
    
}
