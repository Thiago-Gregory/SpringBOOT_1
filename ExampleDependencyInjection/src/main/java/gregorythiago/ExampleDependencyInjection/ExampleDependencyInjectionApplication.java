package gregorythiago.ExampleDependencyInjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@SpringBootApplication
public class ExampleDependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExampleDependencyInjectionApplication.class, args);

		Pet pet = applicationContext.getBean(Pet.class);
		pet.execute();
	}

}