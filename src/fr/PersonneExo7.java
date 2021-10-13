package fr;

public class PersonneExo7 {
	String nom;
	
	House maison;
	
	public PersonneExo7(String nom,House maison) {
		this.nom=nom;
		this.maison=maison;
	}
	
	public void display() {
		System.out.println("Bonjour je m'appelle "+nom+". J'ai une maison de "+
				maison.getSurface()+"m² avec une porte "+maison.getDoor().getCouleur());
	}
	
}
