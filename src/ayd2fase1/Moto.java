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
public class Moto extends Vehiculo{
    
    public Moto(String placa, int wheels,String conductor){
        super(placa, wheels, conductor);
    }

    @Override
    String descripcion() {
        return "Moto manejada por " + this.conductor;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
