package ex2;

public class CompteCourant extends CompteBancaire{
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	public CompteCourant(double decouvert) {
		this.decouvert=decouvert;
	}
	
	/**
	 * @param debite le compte en fonction du montant pass� en param�tre
	 */
	public void debiterMontant(int montant){
	if (this.solde - montant > decouvert){
		this.solde = solde - montant;
	}
	}
	/** Getter pour decouvert
	 * @return le decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param modifie le decouvert
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
}
