package Persistence;

import javax.persistence.*;

@Entity
@Table(name="fichaje")
public class Fichaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name="empleado_id", referencedColumnName="id")
    private Empleado empleado;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
