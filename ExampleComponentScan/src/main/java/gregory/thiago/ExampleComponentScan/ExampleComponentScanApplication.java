package gregory.thiago.ExampleComponentScan;

import externalclasses.ClassDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@SpringBootApplication
@ComponentScan("externalclasses")
public class ExampleComponentScanApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExampleComponentScanApplication.class, args);

		ClassDAO objectDAO = applicationContext.getBean(ClassDAO.class);

		System.out.println("Object DAO: " + objectDAO);
	}

}
