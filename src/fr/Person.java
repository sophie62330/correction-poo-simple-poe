package fr;

public class Person {
	protected int age;
	
	public Person() {}
	
	public Person(int age) {
		this.age=age;
	}
	
	public void setAge(int n) {
		this.age=n;
	}

	public void parler(String message) {
		System.out.println(message);
	}
	
	@Override
	public String toString() {
		return "Person [age=" + age + "]";
	}

	
}
