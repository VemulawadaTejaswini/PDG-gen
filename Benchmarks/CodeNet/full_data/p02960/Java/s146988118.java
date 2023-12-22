import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.*;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(System.out);

    private static final long MOD = (long) 1e9 + 7;

    public static void main(String[] args) {
        solve();
        out.flush();
    }

    private static void solve() {
        String s = in.next();
        char[] ch = s.toCharArray();

        int length = s.length();
        int[][] dp = new int[length+1][13];
        dp[0][0] = 1;

        for (int i=0; i < length; i++) {
            int c = ch[i] == '?' ? -1 : Integer.valueOf(String.valueOf(ch[i]));
            for (int next=0; next < 10; next++) {
                if (c == -1 || c == next) {
                    for (int j=0; j < 13; j++) {
                        dp[i + 1][(j * 10 + next) % 13] += dp[i][j];
                        dp[i + 1][(j * 10 + next) % 13] %= MOD;
                    }
                }
            }
        }

        out.println(dp[length][5]);
    }


}
