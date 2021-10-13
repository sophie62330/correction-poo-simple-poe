package fr;

public class Door {
	private String couleur;
	
	public void display() {
		System.out.println("Je suis une porte. Ma couleur est "+this.couleur);
	}
	
	public Door(String couleur) {
		this.couleur=couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
