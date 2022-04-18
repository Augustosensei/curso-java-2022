/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.collecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author augus
 */
public class FrameworkCollecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        
        
        List<Integer> listar = new ArrayList();
        
        

        listar.add(1);
        listar.add(2);
        listar.add(45);
        
        
        for (int i = 0; i < listar.size(); i++) {
            System.out.println(listar.get(i));
        }
        
    }
    
}
