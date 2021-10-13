package fr;

import java.util.ArrayList;

public class Student {
	String nom;
	ArrayList<Double> notes;
	
	public Student() {}
	
	public Student(String nom,double...notes) {
		this.nom=nom;
		this.notes=new ArrayList<Double>();
		for (double note : notes) {
			this.notes.add(note);
		}
	}

	public double calcMoy() {
		double somme=0;
		for (int i=0;i<this.notes.size();i++) {
			somme+=notes.get(i);
		}
		
		return somme/this.notes.size();
	}
	
	public void show() {
		System.out.println("Nom : "+this.nom+" - moyenne : "+this.calcMoy());
	}

	@Override
	public String toString() {
		return "Student [nom=" + nom + ", notes=" + notes + "]";
	}
	

	
	
}
