package TPI.Controller;

import TPI.Model.Cliente;
import TPI.Model.Tecnico;
import TPI.Repository.PersonaRepository;

import javax.persistence.EntityManager;
import java.util.Scanner;

public class PersonaController {
    private PersonaRepository pr;

    public PersonaRepository getPr() {
        return pr;
    }

    public void setPr(PersonaRepository pr) {
        this.pr = pr;
    }

    public PersonaController() {
        this.pr = new PersonaRepository();
    }

    public void agregarCliente(Scanner scanner) {
        System.out.print("Ingrese el nombre del cliente: ");
        String nombreCliente = scanner.next();

        Cliente cliente = new Cliente();
        cliente.setNombre(nombreCliente);

        pr.getEm().getTransaction().begin();
        pr.insertar(cliente);
        pr.getEm().getTransaction().commit();

        System.out.println("Cliente agregado con éxito.\n");
    }

    public void agregarTecnico(Scanner scanner) {
        System.out.print("Ingrese el nombre del tecnico: ");
        String nombre = scanner.next();

        Tecnico tecnico = new Tecnico();
        tecnico.setNombre(nombre);

        pr.getEm().getTransaction().begin();
        pr.insertar(tecnico);
        pr.getEm().getTransaction().commit();

        System.out.println("Tecnico agregado con éxito.\n");
    }

    public void mostrarClientes() {
        System.out.println("Clientes:");
        pr.buscarClientes().forEach(
                cliente -> System.out.println(cliente));
        System.out.println();
    }

    public Cliente buscarClienteId(long nroCliente) {
        Cliente cliente = pr.buscarUno(nroCliente);
        System.out.println(cliente);
        return cliente;
    }
}
