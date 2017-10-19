package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionD {
    private static ArrayList<Integer> group = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfMessages = scanner.nextInt();
        for (int t = 0; t < numOfMessages; t++) {
            int numOfSoldiers = scanner.nextInt();
            int countNum = scanner.nextInt();
            int leader = 0;
            int count = 1;
            for (int i = 0; i < numOfSoldiers; i++) {
                group.add(i, 0);
            }
            for (int currentSoldier = 0; currentSoldier < numOfSoldiers; currentSoldier++) {
                if (numOfSoldiers == 1) {
                    break;
                }
                if (currentSoldier != leader) {
                    group.set(currentSoldier, count);
                    count++;
                }
                if (count == countNum) {
                    if (currentSoldier == numOfSoldiers - 1) {
                        group.set(0, -1);
                        numOfSoldiers--;
                    } else {
                        group.set(currentSoldier + 1, -1);
                        leader = currentSoldier + 1;
                        numOfSoldiers--;
                    }
                }
                if (currentSoldier == numOfSoldiers - 1) {
                    currentSoldier = 0;
                }
            }
            System.out.println();
        }
    }
}
