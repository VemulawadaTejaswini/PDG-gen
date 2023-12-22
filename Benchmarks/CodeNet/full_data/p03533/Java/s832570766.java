import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    private static final String rightWord = "AKIHABARA";
    private static final String rightWordNoA = "KIHBR";
    private static final String checkWord = "KIH";

    Pattern pattern = Pattern.compile("AA");
    Pattern checkPattern = Pattern.compile("KIH");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Main main = new Main();
        String s = scanner.nextLine();
        System.out.println(main.checkToken(s)
                && main.checkDuplicateToken(s)
                && main.checkWord(s) ? "YES" : "NO");
    }

    private boolean checkToken(String s) {
        return rightWordNoA.equals(s.replaceAll("A", ""));
    }

    private boolean checkDuplicateToken(String s) {
        Matcher matcher = pattern.matcher(s);
        return !matcher.find();
    }

    private boolean checkWord(String s){
        Matcher matcher = checkPattern.matcher(s);
        return matcher.find();
    }
}
