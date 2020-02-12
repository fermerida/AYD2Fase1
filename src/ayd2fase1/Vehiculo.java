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
public abstract class Vehiculo {
    String placa;
    int wheels;
    Boolean active;
    String conductor;
    float valor;
    SimpleFactory factory;
    LinkedList<Multa> lista_multas = new LinkedList<>();

    
    public Vehiculo(String placa, int wheels,String conductor){
        this.placa = placa;
        this.wheels = wheels;
        active= true;
        this.conductor = conductor;
        this.factory = new SimpleFactory();
    }
    
    public void setNumberWheels(int number){
        this.wheels = number;
    }
    public int getNumberWheels(){
        return this.wheels;
    }
    
    public void setActive(Boolean active){
        this.active = active;
    }
    public Boolean isActive(){
        return this.active;
    }
    
     public void crear_multa(String name,int cantidad){
        Multa multa = new Multa(name,cantidad);
        agregar_multa(multa);
    }
    public void agregar_multa(Multa nueva_multa){
        lista_multas.add(nueva_multa);
    }
    
    abstract String descripcion();
    
    public Boolean hasTickets(){
        if (this.lista_multas.isEmpty())
            return false;
        else
            return true;
    }
    
    public int getTotal(){
        int total = 0;
        for(Multa m:this.lista_multas){
            if (m.pagado == false)
                total += m.valor;
        }
        return total;
    }
    
}
