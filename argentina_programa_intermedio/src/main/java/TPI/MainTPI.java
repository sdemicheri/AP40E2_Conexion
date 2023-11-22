package TPI;

import PatronRepository.EmpleadoRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class MainTPI {

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA_PU");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

    public static void main(String[] args) {
        EntityManager em = getEntityManager();

    }
}
