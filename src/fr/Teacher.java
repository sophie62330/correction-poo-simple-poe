package fr;

public class Teacher extends Person{
	private String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(int age,String subject) {
		this.age=age;
		this.subject=subject;
	}
	

	public void explain() {
		System.out.println("Explanation begins");
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + "]";
	}
	
	
}
