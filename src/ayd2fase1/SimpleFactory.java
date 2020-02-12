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
public class SimpleFactory {
    public SimpleFactory(){
    }
    public Vehiculo createVehiculo(String nombre,String placa,String driver){
        switch(nombre){
            case "Carro":
                return new Carro(placa,4,driver);
            case "Camion":
                return new Camion(placa,4,driver);
            default:
                return null;
        }
    }
}
