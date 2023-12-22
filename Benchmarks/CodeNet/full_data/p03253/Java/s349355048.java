import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.function.IntBinaryOperator;
import java.util.HashMap;

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
        DFactorization solver = new DFactorization();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFactorization {
        private static final long MOD = (int) 1e9 + 7;
        private static long[] frac;
        private static long[][] npr;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 素因数分解
            Map<Integer, Integer> facs = new HashMap<>();
            int n = in.nextInt(), m = in.nextInt();
            int p;
            while ((p = getp(m)) > 0) {
                facs.merge(p, 1, (x, y) -> x + y);
                m /= p;
            }
            facs.merge(m, 1, (x, y) -> x + y);//最大でも2が29個含まれている場合のみ


            // dp - 階乗
            frac = new long[n + 50];
            frac[0] = 1;
            for (int i = 1; i < frac.length; i++) {
                frac[i] = (frac[i - 1] * i) % MOD;
            }
            // dp - nPr
            npr = new long[50][/*n + */ 50]; // npr[x][y] = (n+y)Px
            Arrays.fill(npr[0], 1);
            for (int i = 0; i < 50; i++) {
                for (int j = 1; j < 50; j++) {
                    npr[j][i] = (npr[j - 1][i] * (n + i - j + 1)) % MOD;
                }
            }

            IntBinaryOperator nCr = (x, y) -> (int) ((npr[y][x - n] * pow(frac[y], MOD - 2)) % MOD);
            IntBinaryOperator nHr = (x, y) -> nCr.applyAsInt(x + y - 1, y);

            // calc
            long ans = 1;
            for (Map.Entry<Integer, Integer> e : facs.entrySet()) {
                ans *= nHr.applyAsInt(n, e.getValue());
                ans %= MOD;
            }
            out.println(ans);
        }

        private static int getp(int n) {
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    return i;
                }
            }
            return -1;
        }

        long pow(long x, long y) {
            if (y == 0) {
                return 1;
            } else if (y % 2 == 0) {
                long z = pow(x, y / 2);
                return (z * z) % MOD;
            } else {
                return (x % MOD) * pow(x, y - 1) % MOD;
            }
        }

    }
}

