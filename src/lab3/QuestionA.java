package lab3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class QuestionA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMessages = scanner.nextInt();
        for (int i = 0; i < numOfMessages; i++) {
            int numSodier1 = scanner.nextInt();
            int numSodier2 = scanner.nextInt();
            scanner.nextLine();
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            LinkedList<Integer> list1 = new LinkedList<>(toLinkedList(line1));
            LinkedList<Integer> list2 = new LinkedList<>(toLinkedList(line2));
            ListIterator<Integer> it1 = list1.listIterator();
            ListIterator<Integer> it2 = list2.listIterator();
            LinkedList<Integer> result = new LinkedList<>();

            while(it1.hasNext() || it2.hasNext()) {
                if(it1.hasNext() && it2.hasNext()) {
                    Integer val0 = it1.next();
                    Integer val1 = it2.next();
                    if (val0 < val1) {
                        result.add(val0);
                        it2.previous();
                    } else {
                        result.add(val1);
                        it1.previous();
                    }
                } else if (!it1.hasNext()) {
                    Integer val = it2.next();
                    result.add(val);
                } else {
                    Integer val = it1.next();
                    result.add(val);
                }
            }
            for (Integer num:result) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    private static LinkedList toLinkedList(String line) {
        String[] listStr = line.split(" ");
        Integer[] listInt = new Integer[listStr.length];
        int j = 0;
        for (String str:listStr) {
            listInt[j] = Integer.parseInt(str);
            j++;
        }
        return new LinkedList<>(Arrays.asList(listInt));
    }
}