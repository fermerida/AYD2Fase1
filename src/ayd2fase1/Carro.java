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
public class Carro extends Vehiculo{
        public Carro(String placa, int wheels,String conductor){
        super(placa, wheels, conductor);
    }

    @Override
    String descripcion() {
        return "Carro manejado por " + this.conductor;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
