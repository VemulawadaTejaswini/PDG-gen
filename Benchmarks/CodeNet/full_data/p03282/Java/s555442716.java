import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        String s = scanner.next();
        long k = scanner.nextLong();
        Matcher matcher = Pattern.compile("[2-9]").matcher(s);
        if (matcher.find() && matcher.start() < k) {
            System.out.println(matcher.group());
        } else {
            System.out.println(1);
        }
    }
}