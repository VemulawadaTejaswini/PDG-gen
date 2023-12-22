import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try (final Scanner sc = new Scanner(System.in)) {
            final String input = sc.nextLine();
            for (int i = 0; i < input.length(); i++) {
                final char c = input.charAt(i);
                if (i % 2 == 0 && !(c == 'R' || c == 'U' || c == 'D')) {
                    System.out.println("NO");
                    return;
                }
                if (i % 2 == 1 && !(c == 'L' || c == 'U' || c == 'D')) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }
    }
}