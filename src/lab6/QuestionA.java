package lab6;

import java.util.Scanner;

public class QuestionA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            int numOfNodes = scanner.nextInt();
            System.out.println((int)Math.floor(log2((double)numOfNodes)));
        }
    }

    static public double log2(double value) {
        return Math.log(value) / Math.log(2.0);
    }
}
