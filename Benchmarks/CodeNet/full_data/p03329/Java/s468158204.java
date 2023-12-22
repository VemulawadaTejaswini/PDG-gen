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
        ABC099_C solver = new ABC099_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC099_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] dp = new int[100010];

            dp[0] = 0;
            for (int i = 1; i <= 100000; i++) {
                dp[i] = Integer.MAX_VALUE;
                int power = 1;
                while (power <= i) {
                    dp[i] = Math.min(dp[i], dp[i - power] + 1);
                    power *= 6;
                }

                power = 1;
                while (power <= i) {
                    dp[i] = Math.min(dp[i], dp[i - power] + 1);
                    power *= 9;
                }
            }
            out.print(dp[n]);
        }

    }
}

