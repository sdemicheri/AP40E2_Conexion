package TPI.Model;

import javax.persistence.*;

@Entity
@Table(name="aplicacion")
public class Aplicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;
}
