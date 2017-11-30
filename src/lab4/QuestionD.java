package lab4;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class QuestionD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            int numOfLines = scanner.nextInt();
            Deque<Integer> deque = new LinkedList<>();
            for (int i = 0; i < numOfLines; i++) {
                switch (scanner.nextInt()) {
                    case 1: {
                        switch (scanner.nextInt()) {
                            case 1: {
                                deque.offerFirst(scanner.nextInt());
                                continue;
                            }
                            case 2: {
                                deque.pollFirst();
                                continue;
                            }
                        }
                        continue;
                    }
                    case 2: {
                        switch (scanner.nextInt()) {
                            case 1: {
                                deque.offerLast(scanner.nextInt());
                                continue;
                            }
                            case 2: {
                                deque.pollLast();
                            }
                        }
                    }
                }
            }
            for (int num:deque) {
                System.out.println(num);
            }
        }
    }
}
