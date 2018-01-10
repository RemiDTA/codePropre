package ex3;

import java.util.List;

public class ZoneCarnivore extends Lieu{


	
	public ZoneCarnivore(double trucdeboufe) {
		super(trucdeboufe);
	}

	public void testAjout(Animal ani) {
		if(ani.getType().equals("MAMMIFERE") && ani.getComportement().equals("CARNIVORE")){
			addAnimal(ani);
			//mettre un try catch histoire de faire zoli
		}
	}
	
}
