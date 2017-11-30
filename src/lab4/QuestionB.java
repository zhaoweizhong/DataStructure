package lab4;

import java.util.Scanner;

public class QuestionB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            Queue queue = new Queue(scanner.nextInt());
            int numOfLines = scanner.nextInt();
            for (int i = 0; i < numOfLines; i++) {
                switch (scanner.nextInt()) {
                    case 1: {
                        if (queue.isFull()) {
                            System.out.println(scanner.nextInt());
                            continue;
                        } else {
                            queue.enqueue(scanner.nextInt());
                            continue;
                        }
                    }
                    case 2: {
                        if (!queue.isEmpty()) {
                        System.out.println(queue.dequeue());
                        }
                    }
                }
            }
            while (!queue.isEmpty()) {
                System.out.println(queue.dequeue());
            }
        }
    }
}
