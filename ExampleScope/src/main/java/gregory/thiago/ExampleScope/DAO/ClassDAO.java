package gregory.thiago.ExampleScope.DAO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Getter @Setter
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ClassDAO {

    @Autowired
    ClassJDBC objectJDBC;
}
