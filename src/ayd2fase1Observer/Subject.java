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
public interface Subject {
       public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObresrvers();
}
