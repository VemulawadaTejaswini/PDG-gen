import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        String s = scanner.next();
        String t = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            s = s.charAt(s.length() - 1) + s.substring(0, s.length() - 1);
            if (s.equals(t)) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}