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
        ABC_110_D solver = new ABC_110_D();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_110_D {
        int mod = 1000000007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int mNokori = m;
            long ans = 1;
            for (int i = 2; i * i <= mNokori; i++) {
                if (mNokori % i == 0) {
                    int cnt = 0;
                    while (mNokori % i == 0) {
                        cnt++;
                        mNokori /= i;
                    }
                    ans *= calcComb(cnt + n - 1, n - 1);
                    ans %= mod;
                }
            }
            if (mNokori != 1) {
                ans *= calcComb(n + 1 - 1, n - 1);
                ans %= mod;
            }


            out.print(ans);


        }

        long modpow(long a, int p) {
            if (p == 0) return 1;
            if (p % 2 == 0) {
                int halfP = p / 2;
                long halfA = modpow(a, halfP);
                return halfA * halfA % mod;
            } else {
                return a * modpow(a, p - 1) % mod;
            }
        }

        long calcComb(int a, int b) {
            if (b > a - b) return calcComb(a, a - b);
            long ansMul = 1;
            long ansDiv = 1;
            for (int i = 0; i < b; i++) {
                ansMul *= (a - i);
                ansDiv *= (i + 1);
                ansMul %= mod;
                ansDiv %= mod;
            }
            //ansMul / ansDivをやりたい
            //ansDivの逆元を使いたい
            long ans = ansMul * modpow(ansDiv, mod - 2) % mod;

            return ans;
        }

    }
}

