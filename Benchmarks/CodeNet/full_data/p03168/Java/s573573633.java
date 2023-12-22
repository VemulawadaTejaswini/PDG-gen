import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ICoins solver = new ICoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ICoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            double[] dp = new double[n + 1];
            Arrays.fill(dp, 0);
            dp[0] = 1;

            for (int i = 0; i < n; i++) {
                double p = in.nextDouble();
                for (int j = dp.length - 1; j >= 0; j--) {
                    if (j > 0) {
                        dp[j] = dp[j] * (1 - p) + dp[j - 1] * p;
                    } else {
                        dp[0] *= (1 - p);
                    }
                }
            }

            double res = 0;
            for (int i = (n + 1) / 2; i <= n; i++) {
                res += dp[i];
            }
            out.println(res);

        }

    }
}

