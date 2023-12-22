import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        String s = stdin.next();
        
        Deque<Character> stack = new ArrayDeque<>();
        for (char ch : s.toCharArray()) {
            if (ch == 'B') {
                if (!stack.isEmpty()) {
                    stack.removeFirst();
                }
            } else {
                stack.addFirst(ch);
            }
        }
        
        String ans = stack.stream().map(String::valueOf).collect(Collectors.joining());
        System.out.println(ans);
    }
}
