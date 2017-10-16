package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class QuestionD {
    private static int[] l = new int[100];
    private static int[] r = new int[100];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext())
        {
            long leftm = scanner.nextLong();
            long rightm = scanner.nextLong();
            int[] temp = new int[100];
            Arrays.fill(l,0);
            Arrays.fill(r,0);
            Arrays.fill(temp,0);

            for (;leftm > 0; l[0]++)
            {
                l[l[0]+1] = (int)(leftm % 10);
                leftm /= 10;
            }
            for (int i = 1; i <= l[0]/2; i++)
            {
                int t = l[i];
                l[i] = l[l[0]-i+1];
                l[l[0]-i+1] = t;
            }
            for (;rightm > 0; r[0]++)
            {
                r[r[0]+1] = (int)(rightm % 10);
                rightm /= 10;
            }
            for (int i = 1; i <= r[0]/2; i++)
            {
                int t = r[i];
                r[i] = r[r[0]-i+1];
                r[r[0]-i+1] = t;
            }
            if (l[0] == 0)
                l[0] = 1;
            if (r[0] == 0)
                r[0] = 1;
            int sum = 0;
            temp[0] = 1;
            sum += counts(temp);
            temp[1] = 1;
            sum += counts(temp);
            temp[1] = 8;
            sum += counts(temp);
            temp[0] = 2;
            temp[1] = 6;
            temp[2] = 9;
            sum += counts(temp);
            temp[1] = temp[2] = 1;
            sum += counts(temp);
            temp[1] = temp[2] = 8;
            sum += counts(temp);
            temp[1] = 9;
            temp[2] = 6;
            sum += counts(temp);
            System.out.println(sum);
        }
    }

    private static boolean same(int[] n,int[] t){
        if (n[0] != t[0])
            return false;
        for (int i = 1; i <= n[0]; i++)
            if (n[i] != t[i])
                return false;
        return true;
    }

    private static boolean bigger(int[] a,int[] b){
        if (a[0] > b[0])
            return true;
        if (b[0] > a[0])
            return false;
        for (int i = 1; i <= a[0]; i++)
        {
            if (a[i] > b[i])
                return true;
            if (a[i] < b[i])
                return false;
        }
        return true;
    }

    private static int change(int[] q,int x){
        int[] n = new int[100];
        for (int i = 0; i <= q[0]; i++)
            n[i] = q[i];
        int p = n[0] / 2;
        if (n[0] % 2 == 1)
        {
            n[0]++;
            for (int i = n[0]; i > p+2; -- i)
                n[i] = n[i-1];
            n[p+2] = x;
            n[0]++;
            for (int i = n[0]; i > p+1; -- i)
                n[i] = n[i-1];
            if (x == 9)
                n[p+1] = 6;
            else
            if (x == 6)
                n[p+1] = 9;
            else
                n[p+1] = x;
            return counts(n);
        }
        n[0]++;
        for (int i = n[0]; i > p+1; -- i)
            n[i] = n[i-1];
        n[0]++;
        n[p+1] = x;
        for (int i = n[0]; i > p+1; -- i)
            n[i] = n[i-1];
        if (x == 9)
            n[p+1] = 6;
        else
        if (x == 6)
            n[p+1] = 9;
        else
            n[p+1] = x;
        return counts(n);
    }

    private static int counts(int[] p){
        int[] n = new int[100];
        for (int i = 0; i <= p[0]; i++)
            n[i] = p[i];
        if (same(n,l))
            if (n[0] < 2)
                return change(n,1) + change(n,6) + change(n,8) + change(n,9) + 1;
            else
                return change(n,0) + change(n,1) + change(n,6) + change(n,8) + change(n,9) + 1;
        if (same(r,n))
            return 1;
        if (bigger(n,r))
            return 0;
        if (bigger(l,n))
        {
            if (n[0] < 2)
                return change(n,1) + change(n,6) + change(n,8) + change(n,9);
            else
                return change(n,0) + change(n,1) + change(n,6) + change(n,8) + change(n,9);
        }
        if (n[0] < 2)
            return change(n,1) + change(n,6) + change(n,8) + change(n,9) + 1;
        else
            return change(n,0) + change(n,1) + change(n,6) + change(n,8) + change(n,9) + 1;
    }
}
