package TPI.Model;

import javax.persistence.*;

@Entity
@Table(name="especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
}
