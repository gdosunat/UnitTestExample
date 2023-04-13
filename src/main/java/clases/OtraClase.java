package clases;

import java.util.ArrayList;
import java.util.List;

public class OtraClase {
    public Boolean esDeAR(String nombre){
        List<String> miembrosARLista = new ArrayList<>();
        miembrosARLista.add("German");
        miembrosARLista.add("Lupita");
        miembrosARLista.add("Jesus");
        miembrosARLista.add("Daan");
        miembrosARLista.add("Ramiro");

        if(miembrosARLista.stream().filter(miembro -> miembro.equals(nombre)).count() > 0)
            return true;
        else return false;
    }
}
