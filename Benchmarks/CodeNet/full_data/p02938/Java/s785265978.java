
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    long MOD = (long)1e9 + 7;

    void run() {
        Scanner sc = new Scanner(System.in);

        long L = sc.nextLong(), R = sc.nextLong();

//        debug(dev(L - 1), dev(R));


        debug();
        debug(count(L - 1));
        debug();
        debug(count(R));

        System.out.println((10 * MOD + count(R) - count(L - 1) - L + 1) % MOD);
    }

    long dev(long X) {

        long cnt = 0;
        for (long x = 1; x <= X; x++) for (long y = x; y <= X; y++) {
            if ((x | y) == y && Long.toBinaryString(x).length() == Long.toBinaryString(y).length()) cnt++;
        }
        return cnt;
    }

    long count(long X) {
        if (X == 0) return 0;

        String s = Long.toBinaryString(X);
        int len = s.length();
        long[][] dp = new long[len + 1][4];
        dp[0][0] = 1;
        dp[1][1] = 1;

        // 0: 0でギリ, 1: 1でギリ, 2: 0でギリじゃない, 3: 1でギリじゃない, 4: null
        for (int i = 2; i <= len; i++) {
            int dig = i - 1;
            if (s.charAt(dig) == '0') {
                dp[i][0] = (dp[i - 1][0] + dp[i - 1][1]) % MOD;
                dp[i][1] = 0;
                dp[i][2] = (dp[i - 1][2] + dp[i - 1][3]) % MOD;
                dp[i][3] = (1 + 2 * (dp[i - 1][2] + dp[i - 1][3])) % MOD;
            } else {
                dp[i][0] = 0;
                dp[i][1] = 2 * (dp[i - 1][0] + dp[i - 1][1]) % MOD;
                dp[i][2] = (dp[i - 1][0] + dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][3]) % MOD;
                dp[i][3] = (1 + 2 * (dp[i - 1][2] + dp[i - 1][3])) % MOD;
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
