package Es2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OrderedList list = new OrderedList();
        List<Integer> firstList = list.fillOrderedList(4);
        System.out.println("Prima lista: " + firstList);
        List<Integer> secondList = OrderedList.listAndItsReverse(firstList);
        System.out.println("Seconda lista: " + secondList);
        OrderedList.printEvenOrOddPositions(secondList, true);
        OrderedList.printEvenOrOddPositions(secondList, false);
    }


}
