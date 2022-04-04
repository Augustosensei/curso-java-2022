/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4.herencia2;

/**
 *
 * @author augus
 */
public class Cuadrado extends Figura{

    @Override
    public float area(float base, float altura) {
        return (base * base);
    }

    @Override
    public float perimetro(float lado1) {
        return lado1 * 4;
    }


    
}
