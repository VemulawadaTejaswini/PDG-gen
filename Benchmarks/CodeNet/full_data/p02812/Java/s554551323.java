import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        Pattern pattern = Pattern.compile("ABC");
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);
    }
}