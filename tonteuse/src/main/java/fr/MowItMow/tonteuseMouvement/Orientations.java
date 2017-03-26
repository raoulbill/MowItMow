package fr.MowItMow.tonteuseMouvement;

public enum Orientations {

	NORD(0,1),
	SUD(0,-1),
	EST(-1,0),
	OUEST(1,0);

	private int x ;
	private int y ; 

	private Orientations(int x , int y ){
		this.x = x ;
		this.y = y ; 
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void avancer(Position position, Position limites){
		if (position.getX() + this.x >= 0 && position.getX() + this.x<= limites.getX() 
				&&position.getY() + this.y >= 0 && position.getY() + this.y<= limites.getY() ){
			position.setX(position.getX() + this.x);
			position.setY(position.getY() + this.y);
		}
	}	
}
