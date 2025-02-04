import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWeLoveABC solver = new DWeLoveABC();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWeLoveABC {
        private static final long MOD = (int) 1e9 + 7;
        private long[] pow;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            pow = new long[s.length()];
            int[] a = new int[s.length()];
            int[] c = new int[s.length()];
            int[] q = new int[s.length()];
            a[0] = s.charAt(0) == 'A' ? 1 : 0;
            c[0] = s.charAt(0) == 'C' ? 1 : 0;
            q[0] = s.charAt(0) == '?' ? 1 : 0;
            for (int i = 1; i < s.length(); i++) {
                a[i] = a[i - 1] + (s.charAt(i) == 'A' ? 1 : 0);
                c[i] = c[i - 1] + (s.charAt(i) == 'C' ? 1 : 0);
                q[i] = q[i - 1] + (s.charAt(i) == '?' ? 1 : 0);
            }
            int allC = c[s.length() - 1];
            int allQ = q[s.length() - 1];

            long ans = 0;
            for (int i = 0; i < s.length(); i++) {
                int d;
                if (s.charAt(i) == 'B') {
                    d = 0;
                } else if (s.charAt(i) == '?') {
                    d = 1;
                } else {
                    continue;
                }
                int aLeft = a[i];
                int qLeft = q[i] - d;
                int cRight = allC - c[i];
                int qRight = allQ - q[i];
                ans += (aLeft * cRight % MOD) * pow(allQ - d) % MOD;
                ans += (qLeft * cRight % MOD) * pow(allQ - d - 1) % MOD;
                ans += (aLeft * qRight % MOD) * pow(allQ - d - 1) % MOD;
                ans += (qLeft * qRight % MOD) * pow(allQ - d - 2) % MOD;
                ans %= MOD;
            }
            out.println(ans);
        }

        long pow(int y) {
            if (y < 0) {
                return 0; // 1より小さいので実質0
            } else if (y == 0) {
                return 1;
            } else if (pow[y] != 0) {
                return pow[y];
            } else if (y % 2 == 0) {
                long z = pow(y / 2);
                return pow[y] = (z * z) % MOD;
            } else {
                return pow[y] = 3 * pow(y - 1) % MOD;
            }
        }

    }
}

