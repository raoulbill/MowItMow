package fr.MowItMow.tonteuseMouvement;

import java.util.ArrayList;

public class Tonteuse {


	private Position position ;
	private Orientations orientations ;

	public Tonteuse(Position position , Orientations orientations) {
		super();
		this.position = position;
		this.orientations = orientations;
	}

	public Orientations getOrientations() {
		return orientations;
	}

	public void setOrientations(Orientations orientations) {
		this.orientations = orientations;
	}


	/**
	 * fait avancer la tonteuse dans le sens de l'orientation 
	 */
	public void avancer(Position limites){
		orientations.avancer(this.position , limites);
	}


	/**
	 * fait pivoter la tonteuse par la gauche 
	 */
	public void tournerGauche(){
		String  orientationNom=orientations.name() ;
		switch (orientationNom) {
		case  "NORD": this.orientations = Orientations.EST ; 
		break ;
		case "SUD": this.orientations = Orientations.OUEST ; 
		break;
		case "EST": this.orientations = Orientations.SUD ; 
		break;
		case "OUEST": this.orientations = Orientations.NORD ; 
		break;
		default:
			break;
		}
	}

	/**
	 * fait pivoter la tonteuse de 90 degrees par la droite
	 */
	public void tournerDroite(){
		String  orientationNom=orientations.name() ;
		switch (orientationNom) {
		case  "NORD": this.orientations = Orientations.OUEST ; 
		break ;
		case "SUD": this.orientations = Orientations.EST ; 
		break;
		case "EST": this.orientations = Orientations.NORD ; 
		break;
		case "OUEST": this.orientations = Orientations.SUD ; 
		break;
		default:
			break;
		}
	}

	public Position getPosition() {
		return position;
	}
	/**
	 * joue une serie d'instruction organisant son deplacement 
	 * @param listInstruction la liste des deplacements a faire 
	 * @param limites les limites de la pelouse 
	 */
	public void deplacementAutomatique(ArrayList<String> listInstruction, Position limites){
		for(String instruction : listInstruction){
			switch (instruction) {
			case  "D": this.tournerDroite(); ; 
			break ;
			case "G": this.tournerGauche(); ; 
			break;
			case "A": this.avancer(limites); ; 
			break;
			default:
				break;
			}
		}
		System.out.println("La tonteuse est a la position x:"+this.position.getX()+" y:"+this.position.getY() + " et dans la direction "+this.orientations.name());
	}


}
