package TPI.Repository;

import TPI.Model.Cliente;
import TPI.Model.Incidente;
import TPI.Model.Persona;
import TPI.Model.Tecnico;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class IncidenteRepository {
    @PersistenceContext
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Incidente> buscar() {
        return em.createQuery("select t from Incidente t", Incidente.class).getResultList();
    }

    public void insertar(Incidente incidente) {
        em.persist(incidente);
    }

}
