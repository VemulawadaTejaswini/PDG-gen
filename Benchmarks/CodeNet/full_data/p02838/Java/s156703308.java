import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author naruse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        XorSum4 solver = new XorSum4();
        solver.solve(1, in, out);
        out.close();
    }

    static class XorSum4 {
        final long mod = (long) 1e9 + 7L;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long a[] = new long[n];
            for (int i = 0; i < n; i++) a[i] = in.nextLong();
            int cnt[][] = new int[n][61];
            for (int i = 0; i < n; i++) {
                for (int j = 0; (a[i] >> j) > 0; j++) {
                    long now = a[i] >> j;
                    if (now % 2L == 1L) cnt[i][j] = 1;
                }
            }
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 61; j++) {
                    cnt[i][j] = cnt[i][j] + cnt[i - 1][j];
                }
            }
            long ans = 0L;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < 61; j++) {
                    long now = a[i] >> j;
                    int CntTrue = cnt[n - 1][j] - cnt[i][j];
                    long sum = 0;
                    if (now % 2L == 1L) {
                        sum = n - 1 - i - CntTrue;
                    } else {
                        sum = CntTrue;
                    }
                    for (int k = 0; k < j; k++) {
                        sum = (sum % mod) << 1;
                        sum %= mod;
                    }
                    ans = (ans % mod) + (sum % mod);
                    ans %= mod;
                }
            }
            out.println(ans);
        }

    }
}

