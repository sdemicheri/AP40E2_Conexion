package TPI.Model;

import javax.persistence.*;

@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
    @ManyToOne(targetEntity = Aplicacion.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Aplicacion aplicacion;

    public Especialidad(String nombre) {
        this.nombre=nombre;
    }

    public Especialidad() {
    }

}
