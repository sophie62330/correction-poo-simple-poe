package fr;

public class Vehicule {
	public String couleur;
	public String marque;
	public double prix;
	
	@Override
	public String toString() {
		return "Vehicule [couleur=" + couleur + ", marque=" + marque + ", prix=" + prix + "]";
	}
	
	public Vehicule(String couleur, String marque, double prix) {
		this(marque,prix);
		this.couleur=couleur;
	}

	public Vehicule(String marque, double prix) {
		this.marque = marque;
		this.prix = prix;
	}
	
	public Vehicule() {
		System.out.println(this);
	}
	
	public void repeindre(String couleur) {
		this.couleur=couleur;
	}
}
