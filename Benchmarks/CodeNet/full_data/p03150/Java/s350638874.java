import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main{
    /**
     *
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String[] K = new String[8];
        K[0] = ".*keyence";
        K[1] = "k.*eyence";
        K[2] = "ke.*yence";
        K[3] = "key.*ence";
        K[4] = "keye.*nce";
        K[5] = "keyen.*ce";
        K[6] = "keyenc.*e";
        K[7] = "keyence.*";
        // Pattern[] p = new Pattern[8];
        for (int i = 0; i < 8; i++) {
            Pattern p = Pattern.compile(K[i]);
            Matcher m = p.matcher(S);
            if (m.find()) {
                System.out.println("YES");
                return;
            }
            // p[i] = Pattern.compile(K[i]);
        }
        System.out.println("NO");

        sc.close();
    }
}
