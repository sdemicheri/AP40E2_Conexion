package Persistence;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column (name="nombre")
    private String nombre;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="empleado_id", referencedColumnName="id")
    private List<Fichaje> fichajes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String toString() {
        return this.getNombre();
    }
}