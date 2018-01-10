package ex3;

import static org.junit.Assert.*;

import org.junit.Test;

public class ZooTest {

	Zoo zoo = new Zoo("testunitaire");
	
	/*
	public void testZoo() {
		fail("Not yet implemented");
	}*/

	@Test
	public void testAddAnimal() {
		zoo.addAnimal("le caribou","POISSON","CARNIVORE");

		assertEquals(zoo.aqua.compterAnimaux(),1);
		assertEquals(zoo.savAfr.compterAnimaux(),0);
		assertEquals(zoo.zoneCarn.compterAnimaux(),0);
		assertEquals(zoo.fermeRep.compterAnimaux(),0);
		
		assertEquals(zoo.aqua.compterAnimaux(),1);
		assertEquals(zoo.savAfr.compterAnimaux(),0);
		assertEquals(zoo.zoneCarn.compterAnimaux(),0);
		assertEquals(zoo.fermeRep.compterAnimaux(),0);
		
		assertEquals(zoo.aqua.compterAnimaux(),1);
		assertEquals(zoo.savAfr.compterAnimaux(),0);
		assertEquals(zoo.zoneCarn.compterAnimaux(),0);
		assertEquals(zoo.fermeRep.compterAnimaux(),0);
		
		assertEquals(zoo.aqua.compterAnimaux(),1);
		assertEquals(zoo.savAfr.compterAnimaux(),0);
		assertEquals(zoo.zoneCarn.compterAnimaux(),0);
		assertEquals(zoo.fermeRep.compterAnimaux(),0);
	}

}