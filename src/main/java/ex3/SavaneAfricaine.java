package ex3;

public class SavaneAfricaine extends Lieu {

	
	
	public SavaneAfricaine(double trucdeboufe) {
		super(trucdeboufe);
	}

	public void testAjout(Animal ani) {
		System.out.println("test ajout savane");
		if(ani.getType().equals("MAMMIFERE") && ani.getComportement().equals("HERBIVORE")){
			addAnimal(ani);
			System.out.println("ajout savane");
		}
	}
	
}
