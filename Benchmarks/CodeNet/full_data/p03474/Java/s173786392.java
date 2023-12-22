import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int A = sc.nextInt();
        final int B = sc.nextInt();
        final String S = sc.next();

        Pattern p = Pattern.compile("^[0-9]{" + A + "}-[0-9]{" + B + "}");
        System.out.println(p.matcher(S).matches() ? "Yes" : "No");
    }
}
