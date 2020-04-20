package externalclasses;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * @authot Thiago Araújo
 * @since 16/04/2020
 * @version 1.0
 */

@Component
@Getter @Setter
public class ClassDAO {

    ClassJDBC objectJDBC;
}
