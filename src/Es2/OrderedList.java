package Es2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class OrderedList {


    public static List<Integer> listAndItsReverse(List<Integer> list) {
        List<Integer> list2 = new ArrayList<>(list);
        list2.addAll(list.reversed());
        return list2;
    }

    public static void printEvenOrOddPositions(List<Integer> list, boolean bool) {
        List<Integer> evenNums = new ArrayList<>();
        List<Integer> unevenNums = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (i % 2 == 0) {
                evenNums.add(list.get(i));
            } else {
                unevenNums.add(list.get(i));
            }
        }
        if (bool) {
            System.out.println("Numeri su indici pari: " + evenNums);
        } else {
            System.out.println("Numeri su indici dispari: " + unevenNums);
        }
    }

    public List<Integer> fillOrderedList(int size) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int newRandom = random.nextInt(100);
            list.add(newRandom);
        }
        list.sort((a, b) -> {
            return -1 * a.compareTo(b);
        });
        return list;
    }
}
