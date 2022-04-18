/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparar.objetos;

/**
 *
 * @author augus
 */
public class CompararObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        Medico medico1 = new Medico("Gregory", "House");
        Medico medico2 = new Medico("Chapatin", "No");
       
        Medico medico3 = new Medico("Chapatin", "No");
     
        
        System.out.println("el valor de medico1 es: "+medico1);
        System.out.println("el valor de medico2 es: "+medico2);
        System.out.println("el valor de medico3 es: "+medico3);
        
      
        if (medico2.equals(medico3)) {
            System.out.println("son iguales");
        }else{
            System.out.println("son distintos");
        }
        
        
        
        
       
        
    }
    
}
