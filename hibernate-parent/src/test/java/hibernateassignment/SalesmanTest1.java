package hibernateassignment;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import com.hcl.model.Salesman;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test

public class SalesmanTest1 {
	
	
	//import static org.testng.Assert.assertEquals;
		private SessionFactory factory = null;

		@BeforeClass
		public void setup() {
			StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
			factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		}

		@Test
		public void Salesman() {
		Salesman sal = new Salesman(1, "preetha", "9898974282", "abc@gmail.com", "pree#07", "preetha@07",
					"postoffice street,koundipalayam,namakkal-637203");
			Salesman Sal1 = new Salesman(2, "sai", "9865534282", "sai@gmail.com", "sai@98", "sai@26",
					"kanapathy street,vasanthapuram,namakkal-637203");
			Transaction transaction = null;

			try (Session session = factory.openSession()) {
				
				transaction = session.beginTransaction();
				
				session.save(sal);
				
				session.save(Sal1);

				
				transaction.commit();
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}

		@Test(dependsOnMethods = "saveSalesman")
		public void readSalesman() {
			Transaction transaction = null;
			try (Session session = factory.openSession()) {

				List<Salesman> sale = session.createQuery("from Salesman", Salesman.class).list();
				sale.forEach(c -> System.out.println(c.getSalesman_name()));
			} catch (Exception e) {
				if (transaction != null) {
					transaction.rollback();
				}
				e.printStackTrace();
			}
		}
	}

}
