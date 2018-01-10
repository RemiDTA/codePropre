package ex2;

public class LivretA extends CompteBancaire {
	/** tauxRemuneration : taux de rÃ©munÃ©ration */
	private double tauxRemuneration;



	public LivretA(double solde) {
		this.solde = solde;
	}

	/**
	 * @param debite le compte en fonction du montant passé en paramètre
	 */
	public void debiterMontant(int montant){
	if (this.solde - montant > 0){
		this.solde = solde - montant;
	}
	}

	public void appliquerRemuAnnuelle() {
		this.solde = solde + solde * tauxRemuneration / 100;
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
