import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // String input = scanner.nextLine();
        // System.out.println(input);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        scanner.close();

        boolean b = false;
        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(s.length()-1);
            s = c + s.substring(0, s.length()-1);

            // System.out.println(c);
            // System.out.println(s);

            if (s.equals(t)) {
                b = true;
            }
        }

        if (b) {
            System.out.println("Yes");
        }
        else {
            System.out.println("NO");
        }
    }
}