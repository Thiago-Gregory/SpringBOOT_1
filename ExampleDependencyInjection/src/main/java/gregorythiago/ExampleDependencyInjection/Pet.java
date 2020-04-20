package gregorythiago.ExampleDependencyInjection;

import gregorythiago.ExampleDependencyInjection.interfaces.IAnimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
public class Pet {

    @Autowired
    @Qualifier("cat")
    private IAnimal iAnimal;

//    public Pet(IAnimal iAnimal) {
//        this.iAnimal = iAnimal;
//    }

    public void execute() {
        iAnimal.comunicate();
    }
}