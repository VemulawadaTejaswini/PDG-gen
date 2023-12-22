import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DigitsParade solver = new DigitsParade();
        solver.solve(1, in, out);
        out.close();
    }

    static class DigitsParade {
        public static int MOD = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            char[] chars = reverse(in.next());
            long[][] dp = new long[chars.length][13];

            if (chars[0] == '?') {
                for (int i = 0; i <= 9; i++) {
                    dp[0][i] = 1;
                }
            } else {
                int i = Integer.parseInt(String.valueOf(chars[0]));
                dp[0][i] = 1;
            }

            for (int i = 1; i < chars.length; i++) {
                if (chars[i] == '?') {
                    for (int j = 0; j <= 9; j++) {
                        for (int k = 0; k < 13; k++) {
                            int index = (k + (j * (int) (modPow(10, i, 13)))) % 13;
                            dp[i][index] += dp[i - 1][k];
                            dp[i][index] %= MOD;
                        }
                    }
                } else {
                    int j = Integer.parseInt(String.valueOf(chars[i]));
                    for (int k = 0; k < 13; k++) {
                        int index = (k + j * (int) (modPow(10, i, 13))) % 13;
                        dp[i][index] += dp[i - 1][k];
                        dp[i][index] %= MOD;
                    }
                }
            }
            out.println(dp[chars.length - 1][5]);
        }

        static long modPow(long x, long n, long mod) {
            if (n == 0) {
                return 1;
            }
            long result = modPow(x, n / 2, mod);

            if (n % 2 == 0) {
                return (result * result) % mod;
            }
            return (((result * result) % mod) * x) % mod;
        }

        public static char[] reverse(String text) {
            return new StringBuilder(text).reverse().toString().toCharArray();
        }

    }
}

