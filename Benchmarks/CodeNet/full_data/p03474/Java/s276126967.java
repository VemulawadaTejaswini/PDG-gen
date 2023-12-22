import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();
        String result = "No";

        if (s.charAt(a) == '-') {
            String first = s.substring(0, b - 1);
            String second = s.substring(b);

            Pattern pattern = Pattern.compile("^\\d*$");
            Matcher firstMatcher = pattern.matcher(first);
            Matcher secondMatcher = pattern.matcher(second);

            if (firstMatcher.matches() && secondMatcher.matches()) {
                result = "Yes";
            }
        }

        System.out.println(result);
    }
}