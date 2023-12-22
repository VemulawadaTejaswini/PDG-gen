import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        Pattern p = Pattern.compile("[ACGT]++");
        Matcher m = p.matcher(S);

        int max = 0;
        while (m.find()) {
            if ( max < m.group().length() ) max = m.group().length();
        }
        System.out.println(max);

    }

}