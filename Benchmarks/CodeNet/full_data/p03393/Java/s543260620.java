import java.util.*;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();

        boolean[] exists = new boolean['z' - 'a' + 1];
        for (int i = 0; i < S.length(); i++) {
            exists[S.charAt(i) - 'a'] = true;
        }

        if (S.length() < 26) {
            out.print(S);
            for (int i = 0; i <= 'z' - 'a'; i++) {
                if (!exists[i]) {
                    out.println((char) ('a' + i));
                    return;
                }
            }
        } else {
            for (int i = S.length() - 1; i > 0; i--) {
                char changeChar = S.charAt(i);
                for (int k = i - 1; k >= 0; k--) {
                    if (S.charAt(k) < changeChar) {
                        for (int j = 0; j < S.length(); j++) {
                            if (j == k) {
                                out.println(changeChar);
                                return;
                            } else {
                                out.print(S.charAt(j));
                            }
                        }
                    }
                }
            }
            out.println(-1);
        }
    }
}