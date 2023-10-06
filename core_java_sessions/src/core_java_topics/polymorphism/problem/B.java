package core_java_topics.polymorphism.problem;

public class B extends A{

	public void m() {
		System.out.println("This is specific to child class B m() method....");
	}
	public static void main(String[] args) {
		
		B b = new B();
		b.m();
	}
}
