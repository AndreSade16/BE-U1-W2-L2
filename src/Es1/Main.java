package Es1;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        int wordsNum = 0;
        HashSet<String> repeatedWords = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        while (wordsNum == 0) {
            System.out.println("\nScrivi il numero di parole da inserire: ");
            try {
                wordsNum = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Formato non valido, inserire un numero diverso da 0.");
            }
        }

        HashSet<String> wordsSet = new HashSet<>();

        for (int i = 0; i < wordsNum; i++) {
            System.out.println("Inserisci la prossima parola: " + "(" + i + "/" + wordsNum + ")");
            String newWord = scanner.nextLine();
            if (wordsSet.contains(newWord)) {
                repeatedWords.add(newWord);
            } else {
                wordsSet.add(newWord);
            }
        }

        System.out.println("Parole ripetute: " + repeatedWords);
        System.out.println("Numero parole distinte: " + wordsSet.size());
        System.out.println("Parole distinte: " + wordsSet);

    }
}
