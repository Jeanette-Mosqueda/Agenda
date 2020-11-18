package AgendaTelefonica;
import java.util.HashMap;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class AddressBook {

        static HashMap<String, String> Agenda = new HashMap<String, String>();



    public static void list() {
        for (String i : Agenda.keySet()) {
            System.out.println("{ " + i + " } : { " + Agenda.get(i) + " }");
        }
    }

    public static void create(String numero, String nombre) {
        Agenda.put(numero,nombre);
    }

    public static void delete(String id) {
        Agenda.remove(id);
    }
}
