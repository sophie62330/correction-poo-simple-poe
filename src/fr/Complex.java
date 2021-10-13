package fr;

public class Complex {
	int re;
	int im;
	
	public Complex() {}
	
	public Complex(int re,int im) {
		this.re=re;
		this.im=im;
	}
	
	public String somme(Complex c) {
		int reelle=this.re+c.re;
		int im=this.im+c.im;
		return reelle+"+"+im+"i";
	}

	@Override
	public String toString() {
		return "Complex [re=" + re + ", im=" + im + "]";
	}
	
	
}
