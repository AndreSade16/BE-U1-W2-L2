package Es3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Rubrica {
    HashMap<String, Long> contatti;
    Scanner scanner = new Scanner(System.in);

    public Rubrica() {
        this.contatti = new HashMap<>();
    }

    public void aggiungiContatto() {
        System.out.println("Inserisci il nome del contatto: ");
        String name = scanner.nextLine();
        Long number = null;
        try {
            System.out.println("Inserisci il numero di telefono di " + name);
            number = Long.valueOf(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Formato errato: inserisci un numero.");
        }
        contatti.put(name, number);
    }

    public void rimuoviContatto() {
        System.out.println("Inserisci il nome del contatto da eliminare: ");
        String name = scanner.nextLine();
        if (contatti.containsKey(name)) {
            contatti.remove(name);
            System.out.println("Contatto rimosso.");
        } else {
            System.out.println("Contatto non trovato.");
        }
    }

    public void searchByNumber() {
        System.out.println("Inserisci il numero da cercare: ");
        Long number = Long.valueOf(scanner.nextLine());
        if (contatti.containsValue(number)) {
            for (Map.Entry<String, Long> entry : contatti.entrySet()) {
                if (entry.getValue().equals(number)) {
                    System.out.println("Il contatto che ha numero " + number + " è: " + entry.getKey());
                }
            }
        } else {
            System.out.println("Contatto non trovato");
        }
    }

    public void searchByName() {
        System.out.println("Inserisci il nome da cercare:");
        String name = scanner.nextLine();
        if (contatti.containsKey(name)) {
            System.out.println("Numero di " + name + ": " + contatti.get(name));
        }
    }

    public void stampaContatti() {
        System.out.println(contatti);
    }
}
