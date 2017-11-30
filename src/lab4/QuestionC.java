package lab4;

import java.util.Scanner;
import java.util.Stack;

public class QuestionC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfCases = scanner.nextInt();
        for (int t = 0; t < numOfCases; t++) {
            scanner.nextInt();
            scanner.nextLine();
            if (check(scanner.nextLine())) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean check(String str) {
        Stack<Character> stack;
        if (str.length() % 2 == 1) {
            return false;
        } else {
            stack = new Stack<>();
            for (int i = 0; i < str.length(); i++) {
                if (stack.isEmpty()) {
                    stack.push(str.charAt(i)); // 当前栈是空的 存入当前位置的字符
                } else if ((stack.peek() == '[' && str.charAt(i) == ']')
                        || (stack.peek() == '(' && str.charAt(i) == ')')
                        || (stack.peek() == '{' && str.charAt(i) == '}')) {
                    stack.pop(); // 满足上面的条件 表示相邻的两个字符是一对匹配的括号 进行出栈操作
                } else {
                    stack.push(str.charAt(i));
                }
            }
            return stack.isEmpty();
        }
    }
}
