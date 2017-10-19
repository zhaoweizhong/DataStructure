package lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionD {
    public static void main(String[] args) {
        ArrayList<Integer> count = new ArrayList<>();
        ArrayList<Integer> index = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int numOfMessages = scanner.nextInt();
        for (int t = 0; t < numOfMessages; t++) {
            int numOfSoldiers = scanner.nextInt();
            int countNum = scanner.nextInt();
            int leader = 0;
            int counter = 1;
            for (int i = 0; i < numOfSoldiers; i++) {
                count.add(i, 0);
                index.add(i,i);
            }
            int round = 1;
            for (int currentSoldier = 0; currentSoldier < numOfSoldiers;) {
                if (numOfSoldiers == 1) {
                    break;
                }
                if (counter == countNum) {
                    count.remove(currentSoldier/* + 1*/);
                    index.remove(currentSoldier/* + 1*/);
                    if (leader == numOfSoldiers - 1) {
                        leader = 0;
                        round = 1;
                    } else {
                        leader++;
                        round = 1;
                    }
                    numOfSoldiers--;
                }
                if (currentSoldier != leader || round != 1) {
                    count.set(currentSoldier, counter);
                    counter++;
                }
                if (currentSoldier == numOfSoldiers - 1) {
                    currentSoldier = 0;
                } else {
                    currentSoldier++;
                }
                round++;
            }
            for (Integer num:index) {
                System.out.println(num);
            }
            count.clear();
            index.clear();
        }
    }
}
