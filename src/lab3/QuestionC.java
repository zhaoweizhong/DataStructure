package lab3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuestionC {
    private static ArrayList<Integer> group = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMessages = scanner.nextInt();
        for (int t = 0; t < numOfMessages; t++) {
            int numOfSoldiers = scanner.nextInt();
            for (int i = 0; i < numOfSoldiers; i++) {
                group.add(scanner.nextInt());
            }
            int numOfOperations = scanner.nextInt();
            for (int i = 0; i < numOfOperations; i++) {
                switch (scanner.nextInt()) {
                    case 1: {
                        int position = scanner.nextInt();
                        int value = scanner.nextInt();
                        insert(value, position);
                        print();
                        continue;
                    }
                    case 2: {
                        int position = scanner.nextInt();
                        delete(position);
                        print();
                        continue;
                    }
                    case 3: {
                        int position = scanner.nextInt();
                        int value = scanner.nextInt();
                        update(value, position);
                        print();
                        continue;
                    }
                    case 4: reverse(); print();
                }
            }
        }
    }

    private static void insert(int value, int position) {
        group.add(position, value);
    }

    private static void delete(int position) {
        group.remove(position);
    }

    private static void update(int value, int position) {
        group.set(position, value);
    }

    private static void reverse() {
        Collections.reverse(group);
    }

    private static void print() {
        for (int num:group) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
