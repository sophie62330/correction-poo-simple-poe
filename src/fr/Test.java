package fr;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Person p1=new Person();
		p1.parler("Hello");
		
		StudentExo6 student=new StudentExo6();
		student.setAge(15);
		student.parler("Hello");
		student.goToClass();
		student.displayAge();
		
		Teacher teacher=new Teacher(40,"subject");
		teacher.parler("Hello");
		teacher.explain();
		*/
		
		Door porte=new Door("blanche");
		House maison=new House(80,porte);
		PersonneExo7 sophie=new PersonneExo7("Sophie", maison);
		
		sophie.display();
	}

}
