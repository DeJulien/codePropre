package ex1;

import java.util.Date;

/**
 * Classe qui realise la creation des entreprises
 * @author DIGINAMIC
 */

public class Entreprise {

	/** 
	 * Variable entier du siret
	 * Chaine de caractere du nom
	 * chaine de caractere de l'adresse
	 * Variable Date de la creation 
	 * */
	public int Siret;
	public String Nom;
	public String adresse;
	public Date date_Creation;
	
	/** Nombre maximum de capital */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Methode pour afficher le statut
	 * 
	 * 
	 * @return
	 */
	public void AfficherStatut(){
		
	}
	
}
