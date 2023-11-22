package Persistence;

import PatronRepository.EmpleadoRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class MainExample {

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    public static void main(String[] args) {
        EntityManager em = getEntityManager();
        EmpleadoRepository er= new EmpleadoRepository();
        er.buscarTodas();
/*        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Empleado empleado = new Empleado();
        empleado.setNombre("Emi");
        em.persist(empleado);
        tx.commit();
        System.out.println("Objeto guardado!!!");
*/

        //Busco un datos en la base de datos, en este caso por el nro de ID
    /*    Empleado empleado1 = em.find(Empleado.class, 801L);
        System.out.println(empleado1.getNombre());

        //modifico algun datos de la entidad

        empleado1.setNombre("Emi Nuevo");
        em.getTransaction().begin();
        em.merge(empleado1);
        em.getTransaction().commit();
*/


        //listo varios datos de la base de datos
/*
        List<?> empleados = em.createQuery("SELECT empleado from Empleado empleado")
                .getResultList();
        System.out.println(empleados);
*/
    }

}
