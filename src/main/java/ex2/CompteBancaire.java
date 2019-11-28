package ex2;

/** Represente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public abstract class CompteBancaire {

	/** solde : solde du compte */
	private double solde;
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	public static final String TYPE_COMPTE_COURANT = "CC";
	/** Le type vaut soit CC=Compte courant, ou soit LA=Livret A */
	public static final String TYPE_LIVRET_A= "LA";
	
	/**
	 * @param type de type String
	 * @param solde de type Double
	 * @param decouvert de type Double
	 */
	public CompteBancaire(double solde) {
		// TODO Auto-generated constructor stub
		this.solde = solde;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	/** Debite un montant au solde
	 * @param montant
	 * @param compte
	 */
	public void debiterMontant(double montant, CompteBancaire compte) {
	}	
	/** Debite un montant au solde
	 * @param compte
	 */
	public void appliquerRemuAnnuelle(CompteBancaire compte){
	}
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for type
	 * @return the type
	 */
	public abstract String getType();


}
