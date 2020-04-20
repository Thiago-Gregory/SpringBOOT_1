package gregorythiago.ExampleDependencyInjection.interfaces;

import gregorythiago.ExampleDependencyInjection.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Primary
@Qualifier("dog")
public class Dog implements IAnimal {

    @Override
    public void comunicate() {
        System.out.println("Au auu auuuu");
    }
}