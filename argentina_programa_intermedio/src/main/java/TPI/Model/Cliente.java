package TPI.Model;

import javax.persistence.*;

@Entity
@Table (name="persona")
public class Cliente extends Persona{
    public Cliente(String nombreCliente) {
        this.setNombre(nombreCliente);
    }

    public Cliente() {
    }

    public String toString() {
        return this.getId()+"-"+this.getNombre();
    }
}
