package unicartagena.web.unidad3.modelo;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
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
    @Basic(optional = false)
    @Column(name = "id", nullable = false, length = 10)
    private String id;
    @NotEmpty
    private String password;
    @NotEmpty
    private String name;
    private String last_name;
    @NotEmpty
    private String role;
    @Email
    private String email;
    @NotEmpty
    private String phone;
    @NotEmpty
    private String status;
    @NotEmpty
    private String created_at;

}
