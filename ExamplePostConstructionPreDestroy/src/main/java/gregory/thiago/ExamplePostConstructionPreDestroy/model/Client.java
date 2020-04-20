package gregory.thiago.ExamplePostConstructionPreDestroy.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Getter @Setter
@AllArgsConstructor
@ToString
public class Client {

    private String nome;

    public Client() {
        System.out.println("Client Class");
    }
}
