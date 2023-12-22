import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // ee or eXe だけなのでそれがないかをチェック
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                out.println((i + 1) + " " + (i + 2));
                return;
            }
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                out.println((i + 1) + " " + (i + 3));
                return;
            }
        }

        out.println("-1 -1");
    }
}