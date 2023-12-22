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
        Flatten solver = new Flatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class Flatten {
        final int MOD = 1000000000 + 7;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int PrimeMax[] = new int[1000001];
            for (int i = 0; i < n; i++) {
                int now = a[i];
                for (int j = 2; j * j <= now; j++) {
                    int cnt = 0;
                    while (now % j == 0) {
                        now /= j;
                        cnt++;
                    }
                    PrimeMax[j] = Math.max(PrimeMax[j], cnt);
                }
                if (now > 1) {
                    PrimeMax[now] = Math.max(PrimeMax[now], 1);
                }
            }
            int GCD = 1;
            for (int i = 0; i < PrimeMax.length; i++) {
                if (PrimeMax[i] == 0) continue;
                GCD = (int) (((long) GCD % MOD) * (ModPow(i, PrimeMax[i]) % MOD) % MOD);
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                ans = ((ans % MOD) + (DivMod(GCD, a[i]) % MOD)) % MOD;
            }
            out.println(ans);
        }

        private int DivMod(int gcd, int i) {
            return (int) ((long) (gcd % MOD) * (ModPow(i, MOD - 2) % MOD) % MOD);
        }

        private int ModPow(int i, int primeMax) {
            int now = primeMax;
            long res = 1;
            long nowi = i;
            while (now > 0) {
                if (now % 2 == 1) {
                    res = (res % MOD) * (nowi % MOD) % MOD;
                }
                now >>= 1;
                nowi = ((nowi % MOD) * (nowi % MOD)) % MOD;
            }
            return (int) res;
        }

    }
}

