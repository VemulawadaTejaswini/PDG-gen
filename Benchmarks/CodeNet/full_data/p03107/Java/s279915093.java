import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '0') {
                if (stack.size() > 0 && stack.peek() == '1') {
                    stack.pop();
                    continue;
                }

            }
            else {
                if (stack.size() > 0 && stack.peek() == '0') {
                    stack.pop();
                    continue;
                }
            }
            stack.push(c);
        }
        System.out.println(s.length() - stack.size());
    }
}
