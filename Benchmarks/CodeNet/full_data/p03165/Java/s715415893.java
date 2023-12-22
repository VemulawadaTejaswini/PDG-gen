import java.util.*;

public class Main {

    long INF = 1000000001;
    long[][] dp;
    boolean A, B, C;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        dp = new long[S.length() + 1][T.length() + 1];
        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < T.length(); j++) {
                if (s[i] == t[j]) {
                    dp[i + 1][j + 1] = dp[i][j] + 1;
                } else {
                    dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j + 1]);
                }
            }
        }

        String ans = "";
        int i = S.length();
        int j = T.length();
        while (i > 0 && j > 0) {
            if (s[i - 1] == t[j - 1]) {
                ans = String.valueOf(s[i - 1]) + ans;
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }
        System.out.println(ans);
    }
}