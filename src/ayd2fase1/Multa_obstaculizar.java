/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2fase1;

/**
 *
 * @author Fer
 */
public class Multa_obstaculizar extends Multa{
    public Multa_obstaculizar(String name, int cantidad){
        super(name, cantidad);
    }
    @Override
    int calcular() {
        return cantidad;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void total_multa() {
                System.out.println("El total es de la multa es de Q300.00");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    String descripcion() {
                return "Multa por obstaculizar el trafico";
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
