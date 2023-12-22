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
        K[0] = ".*keyence\\z";
        K[1] = "k.*eyence\\z";
        K[2] = "ke.*yence\\z";
        K[3] = "key.*ence\\z";
        K[4] = "keye.*nce\\z";
        K[5] = "keyen.*ce\\z";
        K[6] = "keyenc.*e\\z";
        K[7] = "keyence.*\\z";
        for (int i = 0; i < 8; i++) {
            Pattern p = Pattern.compile(K[i]);
            Matcher m = p.matcher(S);
            if (m.find()) {
                System.out.println("YES");
                sc.close();
                return;
            }
        }
        // kaaaaaaaaabbbbbbbbbbccccccccccddddddddddeeeeeeeeeeffffffffffgggggggggghhhhhhhhhhiiiiiiiiiijjjjeyence
        // keaaaaeyence
        // keyaaaaencellll
        System.out.println("NO");

        sc.close();
    }
}
