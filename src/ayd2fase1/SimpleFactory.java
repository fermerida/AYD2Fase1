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
    public Multa createMulta(String nombre){
        switch(nombre){
            case "combustible":
                return new Multa_combustible(nombre, 200);
            case "ebriedad":
                return new Multa_ebriedad(nombre,500);
            case "licencia":
                return new Multa_licencia(nombre,400);
            case "velocidad":
                return new Multa_velocidad(nombre,300);
             case "obstaculizar":
                return new Multa_obstaculizar(nombre,500);
            default:
                return null;
        }
    }
}
