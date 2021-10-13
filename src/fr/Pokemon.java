package fr;

public class Pokemon {
	String nom;
	int hp;
	int atk;
	
	public Pokemon(String nom,int hp,int atk) {
		this.nom=nom;
		this.hp=hp;
		this.atk=atk;
	}
	
	public boolean isDead() {
		return hp==0;
	}
	
	public void attaquer(Pokemon p) {
		p.hp-=this.atk;
	}
	
	public String toString() {
		String result=nom+" a encore "+this.hp+" points de vie.";
		return result;
	}
}
