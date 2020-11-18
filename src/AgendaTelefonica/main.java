package AgendaTelefonica;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args)   throws IOException {
        boolean regresar = false;
        int opcion = 0;

        do {
            System.out.println("Agenda ");
            System.out.println("1° Mostar listado ");
            System.out.println("2° Crear Nuevo Contacto ");
            System.out.println("3° Eliminar contacto ");
            System.out.println("4° Salir ");
            try {
                System.out.println("Elige una de las opciones ");
                opcion = Integer.parseInt(entrada.readLine());
            } catch (NumberFormatException e) {
                System.err.println("Opcion no valida, tiene que ser alguno de los numeros del menu");
            }
            switch (opcion) {
                case 1:
                    System.out.println("Contactos agendados ");

                    AddressBook.list();
                    break;

                case 2:
                    System.out.println("Crea tu nuevo contacto");
                    System.out.println("ingresa el numero de tu contacto");
                    String numero = entrada.readLine();
                    System.out.println("ingresa el nombre de tu contacto ");
                    String nombre = entrada.readLine();
                    AddressBook.create(numero,nombre);
                    System.out.println("Contacto creado... "+ AddressBook.Agenda.size());
                    break;

                case 3:
                    System.out.println("Ingresa el id (numero telefonico a eliminar ");
                    String id = entrada.readLine();
                    AddressBook.delete(id);

                    System.out.println("Contacto eliminado ");
                    break;

                case 4:
                    System.out.println("Regresando... ");
                    regresar=true;
                    break;

                default:
                    System.out.println("La Opcion elegida no se encuentra en el menu ");
                    regresar=false;
                    break;
            }
        }while (regresar!=true);
    }
}
