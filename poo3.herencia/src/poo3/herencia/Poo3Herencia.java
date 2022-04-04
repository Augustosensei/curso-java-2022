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
public class Poo3Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Medico medico = new Medico();
        medico.setApellido("Irusta");
        medico.setNombre("Gustavo");
        medico.setEspecialidad("Oftalmologo");

        System.out.println("El nombre es: " + medico.getNombre());
        System.out.println("El apellido es: " + medico.getApellido());
        System.out.println("El especialidad es: " + medico.getEspecialidad());

        Paciente paciente = new Paciente("alergia", "Naruto", "Uzumaki");

        System.out.println("///////////////////////////////////////////");
        
        System.out.println("El nombre es: " + paciente.getNombre());
        System.out.println("El apellido es: " + paciente.getApellido());
        System.out.println("El especialidad es: " + paciente.getEnfermedad());

    }

}
