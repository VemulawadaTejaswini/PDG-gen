import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jaynil
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EFlatten solver = new EFlatten();
        solver.solve(1, in, out);
        out.close();
    }

    static class EFlatten {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) a[i] = in.nextInt();
            int pf[] = new int[1000001];
            long dp[] = new long[1000001];
            for (int i = 0; i < n; i++) {
                int count = 0;
                int temp = a[i];
                if (temp % 2 == 0) {
                    while (temp % 2 == 0) {
                        temp = temp / 2;
                        count++;
                    }
                }
                pf[2] = Math.max(pf[2], count);
                for (int j = 3; j * j <= temp; j++) {
                    count = 0;
                    if (temp % j == 0) {
                        while (temp % j == 0) {
                            temp = temp / j;
                            count++;
                        }
                    }
                    pf[j] = Math.max(pf[j], count);
                }
                if (temp >= 2) {
                    pf[temp] = Math.max(1, pf[temp]);
                }
            }
            long lcm = 1;
            int mod = 1000_000_007;

            for (int i = 2; i < 1000000; i++) {
                lcm *= Maths.power(i, pf[i], mod);
                lcm %= mod;
            }
            Maths.modInverseDP(1000000, mod, dp);
//        for(int i=0;i<5;i++)out.println(dp[i]);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                ans += (lcm * dp[a[i]]) % mod;
                ans %= mod;
            }
            out.println(ans);
        }

    }

    static class Maths {
        static void modInverseDP(int n, int prime, long dp[]) {

            dp[0] = dp[1] = 1;
            for (int i = 2; i <= n; i++)
                dp[i] = (dp[prime % i] *
                        (prime - prime / i)) % prime;

        }

        static long power(long x, long y, long p) {
            long res = 1;
            x = x % p;
            while (y > 0) {
                if ((y & 1) == 1)
                    res = (res * x) % p;
                y = y >> 1;
                x = (x * x) % p;
            }
            return res;
        }

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

