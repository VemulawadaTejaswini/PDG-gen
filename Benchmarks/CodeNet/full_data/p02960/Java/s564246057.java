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
            char[] chars = in.next().toCharArray();
            long[][] dp = new long[chars.length + 1][13];
            dp[0][0] = 1;

            for (int i = 0; i < chars.length; i++) {
                for (int k = 0; k < 13; k++) {
                    if (chars[i] == '?') {
                        for (int j = 0; j <= 9; j++) {
                            int index = (k * 10 + j) % 13;
                            dp[i + 1][index] += dp[i][k];
                            dp[i + 1][index] %= MOD;
                        }
                    } else {
                        int j = Integer.parseInt(String.valueOf(chars[i]));
                        int index = (k * 10 + j) % 13;
                        dp[i + 1][index] += dp[i][k];
                        dp[i + 1][index] %= MOD;
                    }
                }
            }
            out.println(dp[chars.length][5]);
        }

    }
}

