package lab4;

import java.util.LinkedList;
import java.util.Scanner;

public class QuestionE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            int numOfLines = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < numOfLines; i++) {
                list.add(scanner.nextInt());
            }


        }
    }
}
