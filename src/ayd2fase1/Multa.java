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
public class Multa {
    String nombre;
    Boolean pagado; 
    int valor;
    
    public Multa(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
        this.pagado = false;
    }
    
    
    public void pagar(){
        this.pagado = true;
    }
    
    public int getValor(){
        return this.valor;
    }
    
    
}
