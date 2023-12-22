
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    long MOD = (long)1e9 + 7;

    void run() {
        Scanner sc = new Scanner(System.in);

        int L = sc.nextInt(), R = sc.nextInt();

        debug();
        debug(count(L));
        debug();
        debug(count(R));

        System.out.println((10 * MOD + count(R) - count(L - 1) - R - L) % MOD);
    }

    long count(long X) {

        String s = Long.toBinaryString(X);
        int len = s.length();
        long[][] dp = new long[len + 1][4];
        dp[0][0] = 1;

        for (int i = 1; i <= len; i++) {
            int dig = i - 1;
            if (s.charAt(dig) == '0') {
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
                dp[i][1] = 0;
                dp[i][2] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
                dp[i][3] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
            } else {
                dp[i][0] = 0;
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
                dp[i][2] = 2 * (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3]) % MOD;
                dp[i][3] = 2 * (dp[i - 1][2] + dp[i - 1][3]) % MOD;
            }
            debug(dp[i]);
        }
        return (dp[len][0] + dp[len][1] + dp[len][2] + dp[len][3]) % MOD;
    }

    void debug(Object... os) {
        System.err.println(Arrays.deepToString(os));
    }

    public static void main(String[] args) {
        new Main().run();
    }

}
