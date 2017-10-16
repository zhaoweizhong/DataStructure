package lab1;

import java.math.BigInteger;
import java.util.Scanner;

public class QuestionB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            BigInteger s1 = scanner.nextBigInteger();
            BigInteger s2 = scanner.nextBigInteger();
            System.out.println(s1.add(s2));
        }
    }
}