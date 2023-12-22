import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String rightWord = "AKIHABARA";
    private static final String rightWordNoA = "KIHBR";

    Pattern pattern = Pattern.compile("AA");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String s = scanner.nextLine();
        System.out.println(main.checkToken(s) && main.checkDuplicateToken(s) ? "YES" : "NO");

    }

    private boolean checkToken(String s) {
        return rightWordNoA.equals(s.replaceAll("A", ""));
    }

    private boolean checkDuplicateToken(String s) {
        Matcher matcher = pattern.matcher(s);
        return !matcher.find();
    }
}
