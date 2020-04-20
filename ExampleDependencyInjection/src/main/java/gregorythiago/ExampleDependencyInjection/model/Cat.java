package gregorythiago.ExampleDependencyInjection.model;

import gregorythiago.ExampleDependencyInjection.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Qualifier("cat")
public class Cat implements IAnimal {

    @Override
    public void comunicate() {
        System.out.println("Miau");
    }
}