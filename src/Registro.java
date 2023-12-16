import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Registro {
    ArrayList<Studente> registro = new ArrayList<>();

    public Registro() {
    }

    public ArrayList<Studente> getRegistro() {
        return registro;
    }

    public void aggiungiStudente(Studente studente) {
        try {
            boolean verificaDoppioni = false;
            for (Studente studente1 : registro) {
                if (studente1.getId().equals(studente.getId())) {
                    System.out.println("ID già esistente");
                    verificaDoppioni = true;
                }
            }
            if (!verificaDoppioni) {
                registro.add(studente);
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void modificaVoto(Integer id, Double voto) {
        for (Studente studente : registro) {
            if (studente.getId().equals(id)) {
                studente.setVoto(voto);
                System.out.println("voto modificato");
            }
        }
    }

    public void rimuoviStudente(Integer id) {
        Iterator<Studente> iterator = registro.iterator();
        while (iterator.hasNext()) {
            Studente studente1 = registro.iterator().next();
            if (id.equals(studente1.getId())) {
                registro.remove(studente1);
                System.out.println("studente rimosso");
                break;
            }
        }
    }

    public void visualizzaStudenti() {
        System.out.println("Studenti disponibili:");
        for (Studente studente : registro) {
            System.out.println(studente);
        }
    }

    @Override
    public String toString() {
        return "Registro{" +
                "registro=" + registro +
                '}';
    }
}
