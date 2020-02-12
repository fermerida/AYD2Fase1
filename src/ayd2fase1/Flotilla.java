/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2fase1;

import java.util.LinkedList;

/**
 *
 * @author Fer
 */
public class Flotilla {
    SimpleFactory factory;
    String nombre;
    LinkedList<Vehiculo> lista_multas = new LinkedList<>();
    
    public Flotilla(SimpleFactory factory, String nombre){
        this.factory = factory;
        this.nombre = nombre;
    }
    public void crear_vehiculo(String name,String placa, String driver){
        Vehiculo vehiculo = factory.createVehiculo(name,placa, driver);
        //multa.accion;
        agregar_vehiculo(vehiculo);
    }
    public void agregar_vehiculo(Vehiculo nuevo_vehiculo){
        lista_multas.add(nuevo_vehiculo);
    }
}
