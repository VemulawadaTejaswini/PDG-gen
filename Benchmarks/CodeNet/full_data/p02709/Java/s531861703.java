import java.io.*;
import java.text.*;
import java.util.*;

public class Main {

    static InputReader sc = new InputReader(System.in);
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        solver s = new solver();
        int t = 1;
        while (t > 0) {
            s.solve();
            t--;
        }
        out.close();
    }

    static class InputReader {

        public BufferedReader br;
        public StringTokenizer token;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream), 32768);
            token = null;
        }

        public String sn() {
            while (token == null || !token.hasMoreTokens()) {
                try {
                    token = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return token.nextToken();
        }

        public int ni() {
            return Integer.parseInt(sn());
        }

        public String snl() throws IOException {
            return br.readLine();
        }

        public long nlo() {
            return Long.parseLong(sn());
        }

        public double nd() {
            return Double.parseDouble(sn());
        }

        public int[] na(int n) {
            int a[] = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.ni();
            return a;
        }

        public long[] nal(int n) {
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nlo();
            return a;
        }
    }

    static int inf = 5000013;

    static class solver {
        DecimalFormat df = new DecimalFormat("0.00000000000000000000");
        long max = 1000000000000000l, min = -10000000000000000l;
        long mod = (long) 1e9 + 7;

        long pro(long a, long b) {
            return (a % mod * b % mod) % mod;
        }

        long add(long a, long b) {
            return (a + b) % mod;
        }

        long sub(long a, long b) {
            return ((a % mod - b % mod) + mod) % mod;
        }

        long ncr3(long n) {
            return (n * (n - 1) * (n - 2)) / 6l;
        }

        long ncr2(long n) {
            return n * (n - 1) / 2l;
        }

        long ncr(long n, long r) {
            double res = 1.0;
            for (long i = n, j = r; i > (n - r); i--, j--) {
                res *= (i * 1.0) / j;
            }
            return (long) Math.ceil(res);
        }

        long modPow(long x, long y) {
            long res = 1;
            x = x % mod;
            while (y > 0) {
                if (y % 2 != 0)
                    res = pro(res, x);
                x = pro(x, x);
                y = y >> 1;
            }
            return res;
        }

        int gcd(int a, int b) {
            if (b == 0)
                return a;
            return gcd(b, a % b);
        }

        final int maxn = 200005;

        class pair implements Comparable<pair> {
            long a;
            int in;

            pair(long a, int b) {
                this.a = a;
                in = b;
            }

            public int compareTo(pair other) {
                if (this.a != other.a)
                    return (int) (other.a - this.a);
                return this.in - other.in;
            }
        }

        void solve() {
            int n = sc.ni();
            pair a[] = new pair[n];
            for (int i = 0; i < n; i++) {
                a[i] = new pair(sc.nlo(), i);
            }
            Arrays.sort(a);
            long dp[][] = new long[2005][2005];
            L:
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (n <= (i + j)) continue L;
                    long w = a[i + j].a;
                    int x = a[i + j].in;
                    dp[i + 1][j] = Math.max(dp[i + 1][j], dp[i][j] + (i - x) * w);
                    dp[i][j + 1] = Math.max(dp[i][j + 1], dp[i][j] + w * (n - j - x - 1) * w);
                }
            }
            long ans = 0;
            for (int i = 0; i < n + 1; i++) {
                ans = Math.max(ans, dp[i][n - i]);
            }
            out.println(ans);
        }
    }
}
