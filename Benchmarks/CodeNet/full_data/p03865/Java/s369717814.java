import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int l = s.length();
        for (int i = 1; i < l; i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                System.out.println("Second");
                return;
            }
        }
        if (s.charAt(l - 1) == s.charAt(0)) {
            System.out.println(l % 2 == 0 ? "First" : "Second");
        } else {
            System.out.println(l % 2 == 0 ? "Second" : "First");
        }
    }
}