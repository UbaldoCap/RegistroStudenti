public class Main {
    public static void main(String[] args) {
        Registro registro = new Registro();
        Studente studente1 = new Studente(123, "Marco", 7);
        Studente studente2 = new Studente(123, "Marco", 7);
        Studente studente3 = new Studente(126, "Mario", 9);
        Studente studente4 = new Studente(126, "Carlo", 8);
        Studente studente5 = new Studente(444, "Pio", 2);
        registro.aggiungiStudente(studente1);
        registro.visualizzaStudenti();
        registro.aggiungiStudente(studente2);
        registro.visualizzaStudenti();
        registro.aggiungiStudente(studente3);
        registro.visualizzaStudenti();
        registro.aggiungiStudente(studente4);
        registro.visualizzaStudenti();
        registro.modificaVoto(123, 5.0);
        registro.visualizzaStudenti();
        registro.rimuoviStudente(123);
        registro.visualizzaStudenti();
        registro.aggiungiStudente(studente5);
        registro.visualizzaStudenti();
        registro.rimuoviStudente(126);
        registro.visualizzaStudenti();

    }
}
