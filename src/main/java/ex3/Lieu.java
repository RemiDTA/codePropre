package ex3;

import java.util.ArrayList;

abstract class Lieu {
	protected ArrayList<Animal> listAni;
	protected double trucdeboufe;

	public Lieu(double trucdeboufe) {
		this.trucdeboufe = trucdeboufe;
		this.listAni = new ArrayList<Animal>();
	}

	abstract void testAjout(Animal ani);
	
	protected void addAnimal(Animal ani){
		this.listAni.add(ani);
	}

	public void afficherListeAnimaux() {
		for (int i = 0; i < this.listAni.size(); i++) {
			System.out.println(this.listAni.get(i).getNom());
		}
	}

	public int compterAnimaux() {
		return this.listAni.size();
	}

	public int calculerKgsNourritureParJour() {
		return (int) (this.listAni.size() * trucdeboufe);
	}

}
