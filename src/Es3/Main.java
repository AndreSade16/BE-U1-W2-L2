package Es3;

public class Main {
    static void main(String[] args) {
        Rubrica rubrica = new Rubrica();
        rubrica.aggiungiContatto();
        System.out.println(rubrica.contatti);
        rubrica.aggiungiContatto();
        System.out.println(rubrica.contatti);
        rubrica.rimuoviContatto();
        rubrica.searchByNumber();
        rubrica.searchByName();
        rubrica.stampaContatti();
    }
}
