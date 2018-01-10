package ex2;

/** Repr�sente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
abstract class CompteBancaire {

	/** @param solde : solde du compte */
	protected double solde;
	

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	abstract void debiterMontant(int montant);	

	
	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param type = LA
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	
	/** Getter pour solde
	 * @return le solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param modifie le solde
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
}
