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
        CDivisionByTwoWithSomething solver = new CDivisionByTwoWithSomething();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisionByTwoWithSomething {
        long MOD = 998244353;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            char[] xc = in.next().toCharArray();
            int[] x = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = xc[i] - '0';
            }

            long ans = 0;
            long t = 0;
            for (int i = 0; i < n; i++) {
                ans = (ans * 2 + x[i]) % MOD;
            }
            ans = (ans + 1) % MOD;
            ans = (ans * 2 * n) % MOD;

            long[] moe = new long[n + 1];
            for (int i = 1; i <= n; i++) {
                moe[i] = 1;
                int ii = i;
                for (int j = 2; j * j <= ii; j++) {
                    int k = 0;
                    while (ii % j == 0) {
                        ii /= j;
                        k++;
                    }
                    if (k == 1) {
                        moe[i] = -moe[i];
                    } else if (k > 1) {
                        moe[i] = 0;
                    }
                }
                if (ii > 1) {
                    moe[i] = -moe[i];
                }
            }

            int[] y = new int[n];
            for (int i = 1; i < n; i++) {
                if ((n / i) % 2 == 1 && n % i == 0) {
                    long num = 0;
                    for (int j = 0; j < i; j++) {
                        num = (num * 2 + x[j]) % MOD;
                    }
                    int p = 0;
                    boolean good = true;
                    int f = 0;
                    for (int j = 0; j < n; j++, f++) {
                        y[j] = x[f] ^ p;
                        if ((j + 1) % i == 0) {
                            p = 1 - p;
                            f = -1;
                        }
                        if (y[j] > x[j]) {
                            good = false;
                            break;
                        }
                        if (y[j] < x[j]) {
                            break;
                        }
                    }
                    if (good) {
                        num = (num + 1) % MOD;
                    }
                    long coef = 0;
                    for (int j = i; j <= n; j++) {
                        if (j % i == 0 && (n / j) % 2 == 1 && n % j == 0) {
                            coef += moe[j / i] * 2 * j;
                        }
                    }
                    ans = ((ans + num * coef) % MOD + MOD) % MOD;
                }

            }
            out.println(ans);
        }

    }
}

