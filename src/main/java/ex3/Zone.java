package ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public abstract class Zone {

	private List<Animal> animaux= new ArrayList<>();
	private String zone;
	
	public void addAnimal(String typeAnimal, String nomAnimal, String comportement) {
		Animal temps= new Animal(typeAnimal,nomAnimal,comportement);
		animaux.add(temps);
		
	}
	
	public void afficherListeAnimaux(){
		for (int i=0;i<animaux.size();i++){
			System.out.println(animaux.get(i).getNoms()+" "+animaux.get(i).getTypes()+" "+animaux.get(i).getComportements());
		}
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public abstract double getPoids();
	
	public double calculerKgsNourritureParJour(){
		return animaux.size() * getPoids();
	}
}
