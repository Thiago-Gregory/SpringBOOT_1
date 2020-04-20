package gregory.thiago.ExamplePostConstructionPreDestroy;

import gregory.thiago.ExamplePostConstructionPreDestroy.DAO.ClientDAO;
import gregory.thiago.ExamplePostConstructionPreDestroy.model.Client;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ExamplePostConstructionPreDestroyApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(ExamplePostConstructionPreDestroyApplication.class, args);

		ClientDAO clientDAO = applicationContext.getBean(ClientDAO.class);

		clientDAO.setClient(new Client("Thiago Araújo"));

		System.out.println("Object ClientDAO: " + clientDAO);
		System.out.println("Object Client: " + clientDAO.getClient());
	}

}
