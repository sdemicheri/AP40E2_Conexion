package TPI.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table (name="persona")
public class Tecnico extends Persona{
    @ManyToMany(targetEntity = Especialidad.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Set<Especialidad> especialidades;


}
