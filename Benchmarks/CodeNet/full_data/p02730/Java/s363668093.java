import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();

        String front = s.substring(0, (n - 1) / 2);
        String back = s.substring(((n + 3) / 2) - 1, n);

        if (isReversed(s) && isReversed(front) && isReversed(back)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

    static boolean isReversed(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
}