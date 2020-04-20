package GregoryApps.TesteMaven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Thiago Araújo
 * @since 14/04/2020 - 18:10
 * @version 1.0
 */
@SpringBootApplication
public class TestMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestMavenApplication.class, args);

		System.out.println("Test Finished Successfully!");
	}

}
