package fr;

public class Rectangle {
	double a;
	double b;
	
	public Rectangle() {}
	
	public Rectangle(double a,double b) {
		this.a=a;
		this.b=b;
	}
	
	public double surface() {
		return this.a*this.b;
	}

	@Override
	public String toString() {
		return "Rectangle [a=" + this.a + ", b=" + this.b + "]";
	}
	
	
}
