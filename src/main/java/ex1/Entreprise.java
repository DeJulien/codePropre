package ex1;

import java.util.Date;

/**
 * Classe qui realise la creation des entreprises
 * @author DIGINAMIC
 */

public class Entreprise {

	/**  Variable entier du siret */
	private long Siret;
	/**Chaine de caractere du nom **/
	private String Nom;
	/** chaine de caractere de l'adresse **/
	private String adresse;
	/**Variable Date de la creation **/
	private Date date_Creation;
	
	/** Nombre maximum de capital */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Constructor de entreprise
	 * 
	 * @param siret de type long
	 * @param nom de type string
	 * @param adresse de type string
	 * @param date_creation de type date
	 */
	public Entreprise(long siret, String nom, String adresse, Date date_Creation) {
		this.Siret = siret;
		this.Nom = nom;
		this.adresse = adresse;
		this.date_Creation = date_Creation;
	}

	/** Methode pour afficher le statut
	 * 
	 * 
	 * @return
	 */
	public void AfficherStatut(){
		
	}
	
}
