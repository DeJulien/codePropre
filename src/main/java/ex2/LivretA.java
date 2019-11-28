package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de remuneration dans le cas d'un livret A */
	private double tauxRemuneration;
	
	/**
	 * @param solde de type Double
	 * @param tauxrenumeration de type double
	 */
	public LivretA(double solde,double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration=tauxRemuneration;
	}
	/** Debite un montant au solde
	 * @param montant
	 * @param compte
	 */
	public void debiterMontant(double montant, CompteBancaire compte)
	{
		CompteBancaire compteTemp= new LivretA(compte.getSolde(),this.tauxRemuneration);
		double solde=compte.getSolde();
		if (compte.getSolde() - montant > this.tauxRemuneration){
			solde-= montant;
		}	
	}
	/** Debite un montant au solde
	 * @param compte
	 */
	public void appliquerRemuAnnuelle(CompteBancaire compte){
		double solde=compte.getSolde();
		if(compte.getType().equals("LA")){
			solde = solde + solde*(this.tauxRemuneration)/100;
		}
	}
	/** Getter for type
	 * @return the LA livret A
	 */
	public String getType() {
		return TYPE_LIVRET_A;
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	
	
}
