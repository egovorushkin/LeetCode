package easy;

import java.util.Stack;

public class Easy20ValidParentheses {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        var stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '(' || c == '[') {
                stack.push(c);
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "()[]{}";
        String s2 = "([}}])";
        System.out.println(isValid(s));
        System.out.println(isValid(s2));
    }
}
