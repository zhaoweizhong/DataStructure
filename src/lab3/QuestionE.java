package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMessages = scanner.nextInt();
        for (int t = 0; t < numOfMessages; t++) {
            int numOfTerms1 = scanner.nextInt();
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(0);
            for (int n = 0; n < numOfTerms1; n++) {
                list1.add(scanner.nextInt()); //coefficient
                list1.add(scanner.nextInt()); //exponent
            }
            int numOfTerms2 = scanner.nextInt();
            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(0);
            for (int n = 0; n < numOfTerms2; n++) {
                list2.add(scanner.nextInt()); //coefficient
                list2.add(scanner.nextInt()); //exponent
            }
            ArrayList<Integer> result = new ArrayList<>();
            result.add(0);
            int k = 1;
            for (int i = 1; i <= numOfTerms1; i++) {
                for (int j = 1; j <= numOfTerms2; j++) {
                    result.add(k * 2 - 1, list1.get(i * 2 - 1) * list2.get(j * 2 - 1));
                    result.add(k * 2, list1.get(i * 2) + list2.get(j * 2));
                    k++;
                }
            }
            for (int i = 1; i <= (result.size() - 1) / 2; i++) {
                for (int j = 1; j <= (result.size() - 1) / 2; j++) {
                    if (i != j) {
                        if (result.get(i * 2).equals(result.get(j * 2))) {
                            result.set(i * 2 - 1, result.get(i * 2 - 1) + result.get(j * 2 - 1));
                            result.set(j * 2 - 1, 0);
                            //result.set(j * 2, -1);
                        }
                    }
                }
            }
            for (int r = 1; r <= (result.size() - 1) / 2; r++) {
                if (!result.get(r * 2 - 1).equals(0)) {
                    if (r != 1) {
                        System.out.print("+");
                    }
                    if (result.get(r * 2).equals(0)) {
                        System.out.print(result.get(r * 2 - 1));
                    } else if (result.get(r * 2).equals(1) && !result.get(r * 2 - 1).equals(1)) {
                        System.out.print(result.get(r * 2 - 1) + "x");
                    } else if (result.get(r * 2).equals(1) && result.get(r * 2 - 1).equals(1)) {
                        System.out.print("x");
                    } else if (result.get(r * 2 - 1).equals(1)) {
                        System.out.print("x^" + result.get(r * 2));
                    } else {
                        System.out.print(result.get(r * 2 - 1) + "x^" + result.get(r * 2));
                    }
                }
            }
        }
    }
}
