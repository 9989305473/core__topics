package core_java_topics.abstraction.abstractExm1;

public class BikeApp {

	public static void main(String[] args) {
		
		Bike honda = new Honda();
		Activa activa = new Activa();
		
		honda.run();
		activa.run();
		activa.changeOil();
	}
}
