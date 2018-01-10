package ex3;


public class FermeReptile extends Lieu{

	
	public FermeReptile(double trucdeboufe) {
		super(trucdeboufe);
	}

	public void testAjout(Animal ani) {
		if(ani.getType().equals("REPTILE")){
			addAnimal(ani);
			//mettre un try catch histoire de faire zoli
		}
	}
	

}
