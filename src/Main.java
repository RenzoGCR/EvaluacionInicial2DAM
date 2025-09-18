import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Agenda de Contactos");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar todos los contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Salir");
        Scanner sc = new Scanner(System.in);
        Agenda agenda=new Agenda();

        int opcion =0;
        do {
            System.out.println("Selecciona una opcion: ");
            opcion = Integer.parseInt(sc.next());
            switch (opcion) {
                case 1 -> agenda.anhadirContacto();
                case 2 -> agenda.mostrarContactos();
                case 3-> agenda.buscarContacto();
                case 4-> agenda.salir();

            }
        }while(opcion!=4);
        sc.close();
    }
}