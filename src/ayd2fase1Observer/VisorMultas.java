/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2fase1Observer;

/**
 *
 * @author jenni
 */
public class VisorMultas implements Observer, ElementoVisor {
	private String placa;
	private float cantidad;
	private DatosMulta datosMulta;

	public void MostrarCondicionActual(DatosMulta datosMulta){
		this.datosMulta = datosMulta;
		datosMulta.removeObserver(this);
	}



    @Override
    public void update(String placa, float cantidad) {
            this.placa = placa;
		this.cantidad = cantidad;
		display();
    }

    @Override
    public void display() {
        System.out.println("Multas recientesde vehiculo placa "+ placa + " cantidad: "+ cantidad );
    }
}