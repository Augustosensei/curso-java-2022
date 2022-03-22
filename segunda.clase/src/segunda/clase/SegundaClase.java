/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segunda.clase;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author augus
 */
public class SegundaClase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  Scanner tecla = new Scanner(System.in);

        int valorUno, valorDos;
        String salir;
        int exit;
        
        do {
            String valor1 = JOptionPane.showInputDialog("ingrese valor uno");
            valorUno = Integer.parseInt(valor1);
            String valor2 = JOptionPane.showInputDialog("ingrese valor dos");
            valorDos = Integer.parseInt(valor2);

            int resultado = valorUno + valorDos;

            JOptionPane.showMessageDialog(null, "El resultado es: " + resultado);

            salir = JOptionPane.showInputDialog("Pulse 0 para salir");
            exit = Integer.parseInt(salir);
        } while (exit != 0);

    }

}
