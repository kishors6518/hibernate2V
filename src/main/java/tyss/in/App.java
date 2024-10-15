package tyss.in;

import hibernate2entity.Car;
import hibernate2entity.Engine;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class App {
	
	public static void main(String[] args) {
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("varun");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		transaction.begin();
		Car c=new Car("Black", "Mahindra", 1440000, new Engine(15.8, 20, "SK2207") );
		manager.persist(c);
		transaction.commit();
	}

	

}
