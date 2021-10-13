package fr;

public class House {
	private double surface;
	private Door porte;
	
	public double getSurface() {
		return surface;
	}

	public void setSurface(double surface) {
		this.surface = surface;
	}

	public House() {}
	
	public House(double surface) {
		this.surface=surface;
	}
	
	public House(double surface, Door porte) {
		this.surface=surface;
		this.porte=porte;
	}

	public void display() {
		System.out.println("Je suis une maison. Ma surface est de "+surface+"m².");
	}
	
	public Door getDoor() {
		return this.porte;
	}
	
	@Override
	public String toString() {
		return "House [surface=" + surface + "]";
	}
	

}
