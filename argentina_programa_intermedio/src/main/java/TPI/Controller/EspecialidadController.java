package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Especialidad;
import TPI.Model.Incidente;
import TPI.Repository.EspecialidadRepository;
import TPI.Repository.IncidenteRepository;

public class EspecialidadController {

    private EspecialidadRepository ir;

    public EspecialidadRepository getIr() {
        return ir;
    }

    public void setIr(EspecialidadRepository ir) {
        this.ir = ir;
    }

    public EspecialidadController() {
        this.ir = new EspecialidadRepository();
    }

    public void agregarEspecialidad() {

            Especialidad inc = new Especialidad("Especialidad 1");


            ir.getEm().getTransaction().begin();
            ir.insertar(inc);
            ir.getEm().getTransaction().commit();

    }
}
