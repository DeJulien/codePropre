package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore= new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();
	
	private List<Zone> zone= new ArrayList<>();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(String nomAnimal, String typeAnimal, String comportement){
		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")){
			zoneCarnivore.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")){
			savaneAfricaine.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("REPTILE")){
			fermeReptile.addAnimal(typeAnimal, nomAnimal, comportement);
		}
		else if (typeAnimal.equals("POISSON")){
			aquarium.addAnimal(typeAnimal, nomAnimal, comportement);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
