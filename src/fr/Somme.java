package fr;

public class Somme {
	int n1;
	int n2;
	
	public Somme() {}
	
	public Somme(int n1,int n2) {
		this.n1=n1;
		this.n2=n2;
	}
	
	public int sum() {
		return this.n1+this.n2;
	}

	@Override
	public String toString() {
		return "Somme [n1=" + this.n1 + ", n2=" + this.n2 + "]";
	}
	
	
}
