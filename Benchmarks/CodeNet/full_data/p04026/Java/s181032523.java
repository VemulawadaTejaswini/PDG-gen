import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        for (int i = 1; i < s.length(); i++) {
            if (i < s.length() - 1 && s.charAt(i - 1) == s.charAt(i + 1)) {
                System.out.println(i + " " + (i + 2));
                return;
            }
            if (s.charAt(i - 1) == s.charAt(i)) {
                System.out.println(i + " " + (i + 1));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}