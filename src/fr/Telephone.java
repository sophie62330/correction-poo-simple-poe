package fr;

public class Telephone {
	String marque;
	String couleur;
	String modele;
	double prix;
	
	public Telephone() {}
	
	public Telephone(String marque, String couleur, String modele,double prix) {
		this.marque = marque;
		this.couleur = couleur;
		this.modele = modele;
		this.prix = prix;
	}
	
	public void envoyerMessage(String message) {
		System.out.println(message);
	}
	
	public void appeler(String destinataire) {
		System.out.println("Je suis en train d'appeler "+destinataire);
	}
	
	@Override
	public String toString() {
		return "Telephone [marque=" + marque + ", couleur=" + couleur + ", modele=" + modele + ", prix=" + prix + "]";
	}
}
