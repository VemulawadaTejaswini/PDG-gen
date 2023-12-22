import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        int t = s.length();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) {
                t = Math.min(t, Math.max(i, s.length() - i));
            }
        }
        System.out.println(t);
    }
}