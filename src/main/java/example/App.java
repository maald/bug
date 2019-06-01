package example;

import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
		
		System.out.println("STARTING ..");
		
		try {
			var emf = Persistence.createEntityManagerFactory("default");
			var em = emf.createEntityManager();
			
			em.close();
			emf.close();
		} 
		catch (Exception e) { e.printStackTrace(); }
		
		System.out.println("DONE ..");
	}
}
