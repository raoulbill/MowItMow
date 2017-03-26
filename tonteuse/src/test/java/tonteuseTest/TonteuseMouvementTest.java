package tonteuseTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import fr.MowItMow.tonteuseMouvement.Orientations;
import fr.MowItMow.tonteuseMouvement.Position;
import fr.MowItMow.tonteuseMouvement.Tonteuse;

public class TonteuseMouvementTest {

	@Test
	public void testTonteuse1() {
		ArrayList<String> listInstruction = new ArrayList();
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("A");
		Position limites = new Position(5, 5);
		Position positionTonteuse = new  Position(1, 2);
		Tonteuse tonteuse = new Tonteuse(positionTonteuse, Orientations.NORD);
		
		tonteuse.deplacementAutomatique(listInstruction, limites);
		assertEquals(1 , tonteuse.getPosition().getX());
		assertEquals(3 , tonteuse.getPosition().getY());
		assertEquals(Orientations.NORD.name() , tonteuse.getOrientations().name());
	
	}
	@Test
	public void testTonteuse2() {
		ArrayList<String> listInstruction = new ArrayList();
		listInstruction.add("A");
		listInstruction.add("A");
		listInstruction.add("D");
		listInstruction.add("A");
		listInstruction.add("A");
		listInstruction.add("D");
		listInstruction.add("A");
		listInstruction.add("D");
		listInstruction.add("D");
		listInstruction.add("A");
		Position limites = new Position(5, 5);
		Position positionTonteuse = new  Position(3, 3);
		Tonteuse tonteuse = new Tonteuse(positionTonteuse, Orientations.EST);
		
		tonteuse.deplacementAutomatique(listInstruction, limites);
		assertEquals(1 , tonteuse.getPosition().getX());
		assertEquals(5 , tonteuse.getPosition().getY());
		assertEquals(Orientations.EST.name() , tonteuse.getOrientations().name());
	
	}
	@Test
	public void testTonteuseGobal() {

		Position limites = new Position(5, 5);
		ArrayList<String> listInstruction = new ArrayList();
		Position positionTonteuse = new  Position(1, 2);
		Tonteuse tonteuse = new Tonteuse(positionTonteuse, Orientations.NORD);
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("G");
		listInstruction.add("A");
		listInstruction.add("A");
		
		tonteuse.deplacementAutomatique(listInstruction, limites);
		assertEquals(1 , tonteuse.getPosition().getX());
		assertEquals(3 , tonteuse.getPosition().getY());
		assertEquals(Orientations.NORD.name() , tonteuse.getOrientations().name());
		

		Position positionTonteuse2 = new  Position(3, 3);
		Tonteuse tonteuse2 = new Tonteuse(positionTonteuse2, Orientations.EST);
		
		ArrayList<String> listInstruction2 = new ArrayList();
		listInstruction2.add("A");
		listInstruction2.add("A");
		listInstruction2.add("D");
		listInstruction2.add("A");
		listInstruction2.add("A");
		listInstruction2.add("D");
		listInstruction2.add("A");
		listInstruction2.add("D");
		listInstruction2.add("D");
		listInstruction2.add("A");
		
		tonteuse2.deplacementAutomatique(listInstruction2, limites);
		assertEquals(1 , tonteuse2.getPosition().getX());
		assertEquals(5 , tonteuse2.getPosition().getY());
		assertEquals(Orientations.EST.name() , tonteuse2.getOrientations().name());
	
	}

}
