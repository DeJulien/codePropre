package ex2;

public class CompteCourant extends CompteBancaire{

	/** decouvert : un decouvert est autorise seulement pour les comptes courants */
	private double decouvert;
	
	/**
	 * @param solde de type Double
	 * @param decouvert de type double
	 */
	public CompteCourant(double solde, double decouvert) {
		super(solde);
		this.decouvert=decouvert;
	}
	/** Debite un montant au solde
	 * @param montant
	 * @param compte
	 */
	public void debiterMontant(double montant, CompteBancaire compte)
	{
		double solde=compte.getSolde();
		if(compte.getType().equals(TYPE_LIVRET_A)){
			if (compte.getSolde() - montant > 0)
				solde  -= montant;
		}
				
	}
	/** Getter for type
	 * @return the CC compte courant
	 */
	public String getType() {
		return TYPE_COMPTE_COURANT;
	}

	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


}
