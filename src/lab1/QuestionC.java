package lab1;

import java.util.Scanner;

public class QuestionC {
    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String name = scanner.next();
            int n = 0;
            int[] hand = new int[22];
            if (name.equals("Farmer"))
            {
                n = 17;
            }
            if (name.equals("Dizhu"))
            {
                n = 20;
            }
            //int[] hand = new int[n+1];
            for (int i = 0; i < n; ++i) {
                String temp = scanner.next();
                if (temp.equals("RJ"))
                {
                    ++hand[17];
                    continue;
                }
                if (temp.equals("WJ"))
                {
                    ++hand[16];
                    continue;
                }
                if (temp.equals("2"))
                {
                    ++hand[15];
                    continue;
                }
                if (temp.equals("A"))
                {
                    ++hand[14];
                    continue;
                }
                if (temp.equals("K"))
                {
                    ++hand[13];
                    continue;
                }
                if (temp.equals("Q"))
                {
                    ++hand[12];
                    continue;
                }
                if (temp.equals("J"))
                {
                    ++hand[11];
                    continue;
                }
                if (temp.equals("10"))
                {
                    ++hand[10];
                    continue;
                }
                ++hand[temp.charAt(0)-48];
            }
            boolean p = false;
            if (hand[17] == 1)
            {
                System.out.print("RJ");
                p = true;
            }
            if (hand[16] == 1)
            {
                if (p)
                    System.out.print(" ");
                else
                    p = true;
                System.out.print("WJ");
            }
            for (int i = 4; i > 0; --i)
                for (int j = 15; j > 2; --j)
                    if (hand[j] == i)
                        for (int k = 0; k < i; ++k)
                        {
                            if (p)
                                System.out.print(" ");
                            else
                                p = true;
                            if (j == 15)
                            {
                                System.out.print("2");
                                continue;
                            }
                            if (j == 14)
                            {
                                System.out.print("A");
                                continue;
                            }
                            if (j == 13)
                            {
                                System.out.print("K");
                                continue;
                            }
                            if (j == 12)
                            {
                                System.out.print("Q");
                                continue;
                            }
                            if (j == 11)
                            {
                                System.out.print("J");
                                continue;
                            }
                            if (j == 10)
                            {
                                System.out.print("10");
                                continue;
                            }
                            System.out.printf("%d",j);
                        }
            System.out.printf("\n");
        }
    }
}
