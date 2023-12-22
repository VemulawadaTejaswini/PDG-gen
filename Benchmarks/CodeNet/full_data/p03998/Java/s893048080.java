import java.util.*;
import java.util.function.ToDoubleFunction;


public class Main {
    private static final String ex = "abcb\n" +
            "aacb\n" +
            "bccc";

    public static void main(String[] args) {
        solve(new Scanner(System.in));
//        solve(new Scanner(ex));
    }

    private static void solve(Scanner scanner) {
        LinkedList<Character> A = new LinkedList();
        for (char c: scanner.nextLine().toCharArray()) A.add(c);
        LinkedList<Character> B = new LinkedList();
        for (char c: scanner.nextLine().toCharArray()) B.add(c);
        LinkedList<Character> C = new LinkedList();
        for (char c: scanner.nextLine().toCharArray()) C.add(c);

        LinkedList<Character> player = A;

        while (true) {
            Character top = player.poll();
            if (top == 'a') player = A;
            else if (top == 'b') player = B;
            else if (top == 'c') player = C;

            if (player.size() == 0) {
                System.out.println(Character.toUpperCase(top));
                break;
            }
        }
    }
}
