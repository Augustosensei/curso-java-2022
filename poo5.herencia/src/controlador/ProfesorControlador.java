/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Profesor;

/**
 *
 * @author augus
 */
public class ProfesorControlador extends PersonaControlador{

    Profesor profesor;

    @Override
    public void mostrar(String nombre, String apellido, String opcion) {
      
        profesor = new Profesor(opcion, nombre, apellido);
        
        
        JOptionPane.showMessageDialog(null, "El nombre es "+profesor.getNombre());
        JOptionPane.showMessageDialog(null, "El apellido es "+profesor.getApellido());
        JOptionPane.showMessageDialog(null, "La especialidad es "+profesor.getMateria());
        
    }
    

    
}
