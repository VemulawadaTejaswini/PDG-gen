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
        MCandies solver = new MCandies();
        solver.solve(1, in, out);
        out.close();
    }

    static class MCandies {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            ModInt[][] dp = new ModInt[n + 1][k + 1];
            Arrays.fill(dp[0], new ModInt(0));
            dp[0][0] = new ModInt(1);
            for (int i = 0; i < n; i++) {
                ModInt syakSum = new ModInt(0);
                for (int j = 0; j < a[i]; j++) {
                    syakSum = syakSum.add(dp[i][j]);
                    dp[i + 1][j] = syakSum;
                }
                for (int j = a[i]; j <= k; j++) {
                    syakSum = syakSum.add(dp[i][j]);
                    // 尺取り
                    dp[i + 1][j] = syakSum;
                    syakSum = syakSum.sub(dp[i][j - a[i]]);
                }
            }

            out.println(dp[n][k].getVal());

        }

    }

    static class ModInt {
        long val;
        int MOD = (int) 1e9 + 7;

        public ModInt(long i) {
            this.val = (i + MOD) % MOD;
        }

        public ModInt add(ModInt m) {
            return new ModInt(this.val + m.getVal());
        }

        public ModInt sub(ModInt m) {
            return new ModInt(this.val - m.getVal());
        }

        public long getVal() {
            return val;
        }

        public String toString() {
            return Long.toString(val);
        }

    }
}

