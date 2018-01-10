package ex3;

public class Zoo {

	private String nom;
	public SavaneAfricaine savAfr = new SavaneAfricaine(0.2);
	public ZoneCarnivore zoneCarn = new ZoneCarnivore(0.8);
	public FermeReptile fermeRep = new FermeReptile(0.5);
	public Aquarium aqua = new Aquarium(0.1);

	public Zoo(String nom) {
		this.nom = nom;
	}

	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {
		Animal ani = new Animal(typeAnimal, nomAnimal, comportement);
		savAfr.testAjout(ani);
		zoneCarn.testAjout(ani);
		fermeRep.testAjout(ani);
		aqua.testAjout(ani);
	}

	

	public void afficherListeAnimaux() {
		savAfr.afficherListeAnimaux();
		zoneCarn.afficherListeAnimaux();
		fermeRep.afficherListeAnimaux();
		aqua.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
