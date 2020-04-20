package gregory.thiago.ExampleScope;

import gregory.thiago.ExampleScope.DAO.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@SpringBootApplication
public class ExampleScopeApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ExampleScopeApplication.class, args);

		ClassDAO objectDAO1 = applicationContext.getBean(ClassDAO.class);
		ClassDAO objectDAO2 = applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO 1: " + objectDAO1);
		System.out.println("Object JDBC 1: " + objectDAO1.getObjectJDBC());

		System.out.println("Object DAO 2: " + objectDAO2);
		System.out.println("Object JDBC 2: " + objectDAO2.getObjectJDBC());
	}

}
