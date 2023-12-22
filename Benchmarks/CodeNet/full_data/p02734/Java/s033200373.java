import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FKnapsackForAllSegments solver = new FKnapsackForAllSegments();
        solver.solve(1, in, out);
        out.close();
    }

    static class FKnapsackForAllSegments {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            int s = in.nextInt();
            int[] a = new int[n];

            ModInt[][] dp = new ModInt[n][3001];
            ModInt ans = new ModInt(0);
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            for (int i = 0; i <= s; i++) {
                dp[0][i] = new ModInt(0);
            }
            dp[0][a[0]] = new ModInt(1);
            for (int i = 1; i < n; i++) {
                for (int j = 1; j <= s; j++) {
                    if (j < a[i]) {
                        dp[i][j] = dp[i - 1][j];
                    } else if (j == a[i]) {
                        dp[i][j] = dp[i - 1][j].add(i + 1);
                    } else {
                        dp[i][j] = dp[i - 1][j].add(dp[i - 1][j - a[i]]);
                    }
                }
                ans = ans.add(dp[i][s]);
            }

            out.println(ans.getVal());

        }

    }

    static class ModInt {
        long val;
        int MOD = 998244353;

        public ModInt(long i) {
            this.val = (int) ((i + MOD) % MOD);
        }

        public ModInt add(long l) {
            return new ModInt(this.val + l);
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public long getVal() {
            return val;
        }

    }
}

