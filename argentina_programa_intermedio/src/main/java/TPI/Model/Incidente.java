package TPI.Model;

import Patrones.patrones_comportamiento.patron_comp_state.Estado;

import javax.persistence.*;

@Entity
@Table(name="incidente")
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String descripcion;
    private Estado estado;
    @ManyToOne(targetEntity = Cliente.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Cliente cliente;

    @ManyToOne(targetEntity = Tecnico.class, cascade= CascadeType.ALL, fetch=FetchType.LAZY )
    private Tecnico tecnico;

    public Incidente(Cliente cliente) {
        this.setCliente(cliente);
    }

    public Incidente() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }
}
