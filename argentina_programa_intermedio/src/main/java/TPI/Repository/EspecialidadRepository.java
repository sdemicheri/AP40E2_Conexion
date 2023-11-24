package TPI.Repository;

import TPI.Model.Especialidad;
import TPI.Model.Incidente;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class EspecialidadRepository {
    @PersistenceContext
    private EntityManager em;

    public EntityManager getEm() {
        return em;
    }

    public void setEm(EntityManager em) {
        this.em = em;
    }

    public List<Especialidad> buscar() {
        return em.createQuery(
                "select t from Especialidad t", Especialidad.class).getResultList();
    }

    public void insertar(Especialidad especialidad) {
        em.persist(especialidad);
    }

}
