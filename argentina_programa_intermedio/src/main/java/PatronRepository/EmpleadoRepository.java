package PatronRepository;

import Persistence.Empleado;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class EmpleadoRepository {
    @PersistenceContext
    private EntityManager em;

    public List<Empleado> buscarTodas() {

        return em.createQuery("select e from Empleado e", Empleado.class).getResultList();
    }

    public Empleado buscarUno(int numero) {

        return em.find(Empleado.class, numero);
    }

    public void insertar(Empleado empleado) {

        em.persist(empleado);
    }

    public void actualizar(Empleado empleado) {

        em.merge(empleado);
    }


    public List<Empleado> buscarPorNombre(String nombre) {
        TypedQuery<Empleado> consulta = em.createQuery(
                "select e from Empleado e where e.nombre= %:nombrex%",
                Empleado.class);
        consulta.setParameter("nombrex", nombre);
        return consulta.getResultList();
    }




////cuando los parametros de busqueda comienzan a ser mayores
    public List<Empleado> buscarPorEjemplo(Empleado ejemplo) {

        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Empleado> cc = cb.createQuery(Empleado.class);
        // consulta raiz
        Root<Empleado> empleados = cc.from(Empleado.class);
        List<Predicate> predicados = new ArrayList<>();

        if (ejemplo != null) {

            // una instruccion de return con el filtrado

            if (ejemplo.getNombre() != null) {

                predicados.add(cb.equal(empleados.get("nombre"), ejemplo.getNombre()));
            }

        /*    if (ejemplo.getImporte() != 0) {

                predicados.add(cb.equal(empleados.get("importe"), ejemplo.getImporte()));
            }*/
        }
        // convertir una lista en un array
        cc.select(empleados).where(predicados.toArray(new Predicate[] {}));

        TypedQuery<Empleado> consulta=em.createQuery(cc);


        return consulta.getResultList();
    }

}