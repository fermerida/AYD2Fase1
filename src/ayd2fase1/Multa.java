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
public abstract class Multa {
    String name;
    Boolean pagado; 
    int cantidad;
    
    public Multa(String name, int cantidad){
        this.name = name;
        this.cantidad = cantidad;
        this.pagado = false;
    }
    
    
    public void pagar(){
        this.pagado = true;
    }
    

    
    abstract int calcular();
    abstract void total_multa();
    abstract String descripcion();
    
    
}
