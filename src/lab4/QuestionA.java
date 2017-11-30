package lab4;

import java.util.Scanner;

public class QuestionA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            Stack stack = new Stack(scanner.nextInt());
            int numOfLines = scanner.nextInt();
            for (int i = 0; i < numOfLines; i++) {
                switch (scanner.nextInt()) {
                    case 1: stack.push(scanner.nextInt()); continue;
                    case 2: System.out.println(stack.pop());
                }
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
    }
}
