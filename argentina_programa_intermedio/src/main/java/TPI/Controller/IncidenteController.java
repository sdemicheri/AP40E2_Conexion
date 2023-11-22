package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Incidente;
import TPI.Repository.IncidenteRepository;
import TPI.Repository.PersonaRepository;

public class IncidenteController {

    private IncidenteRepository ir;

    public IncidenteRepository getIr() {
        return ir;
    }

    public IncidenteController() {
        this.ir = new IncidenteRepository();
    }

    public void setIr(IncidenteRepository ir) {
        this.ir = ir;
    }

    public void agregarIncidente(Cliente cliente) {
        Incidente inc= new Incidente(cliente);

        ir.getEm().getTransaction().begin();
        ir.insertar(inc);
        ir.getEm().getTransaction().commit();
    }
}
