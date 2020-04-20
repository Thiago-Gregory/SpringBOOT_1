package GregoryApps.TesteGradle;

import GregoryApps.TesteGradle.model.Calculator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Thiago Araújo
 * @since 14/04/2020 - 18:20
 * @version 1.0
 */
@SpringBootApplication
public class TesteGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteGradleApplication.class, args);

		Calculator calculator = new Calculator();

		calculator.setValue1(10);
		calculator.setValue2(20);

		System.out.println(calculator);
	}
}
