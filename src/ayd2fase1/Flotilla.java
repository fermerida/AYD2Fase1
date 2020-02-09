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
    LinkedList<Multa> lista_multas = new LinkedList<>();
    
    public Flotilla(SimpleFactory factory, String nombre){
        this.factory = factory;
        this.nombre = nombre;
    }
    public void crear_multa(String name){
        Multa multa = factory.createMulta(name);
        //multa.accion;
        agregar_multa(multa);
    }
    public void agregar_multa(Multa nueva_multa){
        lista_multas.add(nueva_multa);
    }
}
