package unicartagena.web.unidad3.modelo;

import lombok.Data;

/**
 *
 * @author Rene
 */

@Data
public class User {

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
