package TPI.Model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name="persona")
public class Tecnico extends Persona{
    @ManyToMany(targetEntity = Especialidad.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private List<Especialidad> especialidades;


}
