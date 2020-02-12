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
public class Camion extends Vehiculo{
    int capacidad;
    
    public Camion(String placa, int wheels,String conductor){
        super(placa, wheels, conductor);
    }
    
    @Override
    String descripcion() {
        return "Camion manejado por " + this.conductor;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }
    
    public int getCapacidad(){
        return this.capacidad;
    }
    
}
