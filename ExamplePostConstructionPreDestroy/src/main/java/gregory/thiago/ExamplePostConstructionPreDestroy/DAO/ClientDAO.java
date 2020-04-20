package gregory.thiago.ExamplePostConstructionPreDestroy.DAO;

import gregory.thiago.ExamplePostConstructionPreDestroy.model.Client;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Getter @Setter
public class ClientDAO {

    @Autowired
    private Client client;

    @PostConstruct
    public void postConstructor() {
        System.out.println("Object Created");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Object Deleted");
    }
}
