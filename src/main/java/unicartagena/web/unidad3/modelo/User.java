package unicartagena.web.unidad3.modelo;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Rene
 */

@Entity
@Table(name = "user")
@Data
public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String id;
    private String password;
    private String name;
    private String last_name;
    private String role;
    private String email;
    private String phone;
    private String status;
    private String created_at;

}
