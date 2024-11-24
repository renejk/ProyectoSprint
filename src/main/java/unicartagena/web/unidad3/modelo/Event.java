package unicartagena.web.unidad3.modelo;

import java.io.Serializable;

import javax.validation.constraints.NotEmpty;

import jakarta.persistence.Basic;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 *
 * @author Rene
 */

@Entity
@Table(name = "event")
@Data
public class Event implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false, length = 10)
    private String id;
    @NotEmpty
    private String name;
    @NotEmpty
    private int attendees;
    @NotEmpty
    private String event_date;
    // foreign key
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
