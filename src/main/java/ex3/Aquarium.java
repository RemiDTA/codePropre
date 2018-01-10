package ex3;

import java.util.List;

public class Aquarium extends Lieu{

	
	public Aquarium(double trucdeboufe) {
		super(trucdeboufe);
	}

	public void testAjout(Animal ani) {
		if(ani.getType().equals("POISSON")){
			addAnimal(ani);
			//mettre un try catch histoire de faire zoli
		}
	}
}
