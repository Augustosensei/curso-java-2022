/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Persona;

/**
 *
 * @author augus
 */
public class PersonaControlador {
    
    
    Persona persona;
    
    
    public void mostrar(String nombre, String ape, String dni){
    
        persona = new Persona(nombre, ape, dni);
    
        JOptionPane.showMessageDialog(null, "El nombre es: "+persona.getNombre() );
        JOptionPane.showMessageDialog(null, "El apellido es: "+persona.getApellido());
        JOptionPane.showMessageDialog(null, "El dni es: "+persona.getDni());
        
    
    }
    
    
}
