/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ayd2fase1Observer;

import java.util.ArrayList;

/**
 *
 * @author jenni
 */
public class DatosMulta implements Subject {
    	private ArrayList observers;
	private float cantidad;
	private String placa;


	public DatosMulta(){
		observers = new ArrayList();
	}

	public void CambioInformacion()
	{
		notifyObresrvers();
	}

	public void establecerMedidas(String placa, float cantidad){
		this.placa = placa;
		this.cantidad = cantidad;
		
		CambioInformacion();
	}

    @Override
    public void registerObserver(Observer o) {
        	observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i>=0){
			observers.remove(i);
		} }

    @Override
    public void notifyObresrvers() {
                for (int i=0; i<observers.size(); i++){
			Observer observer = (Observer)observers.get(i);
			observer.update(placa, cantidad);
		}
    }
}
