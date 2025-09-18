import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contacto> contactos= new ArrayList<Contacto>();
    Scanner sc = new Scanner(System.in);


    public void anhadirContacto() {
        System.out.println("Introduzca el nombre: ");

        String nombre = sc.next();
        System.out.println("Introduzca el telefono: ");
        String telefono = sc.next();
        System.out.println("Contacto añadido correctamente.");

        Contacto nuevoContacto = new Contacto(nombre, telefono);
        contactos.add(nuevoContacto);


    }
    public void mostrarContactos() {
        System.out.println("Listado de Contactos:");
        for (Contacto contacto : contactos) {
            System.out.println(contacto);
        }
    }
    public void buscarContacto() {
        System.out.println("Introduzca el nombre a buscar: ");
        String nombre = sc.next();
        boolean existe = false;
        for(Contacto contacto : contactos) {

            if(contacto.getNombre().equals(nombre)) {
                existe = true;
                System.out.println("El numero de "+contacto.getNombre()+" es "+contacto.getTelefono());

            }
        }
        if(!existe) {
            System.out.println("Contacto no encontrado");
        }
    }
    public void salir(){
        System.out.println("Saliendo de la aplicacion...");-
        sc.close();
    }

}
