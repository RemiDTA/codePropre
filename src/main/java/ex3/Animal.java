package ex3;



public class Animal {
	public Animal(String type, String nom, String comportement) {
		this.type = type;
		this.nom = nom;
		this.comportement = comportement;
	}

	private String type;
	private String nom;
	private String comportement;

	public String getType() {
		return type;
	}

	public void setType(String types) {
		this.type = types;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String noms) {
		this.nom = noms;
	}

	public String getComportement() {
		return comportement;
	}

	public void setComportement(String comportements) {
		this.comportement = comportements;
	}

}
