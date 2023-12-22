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
        DecimalFormat df = new DecimalFormat("0.00000000");
        long maxi = Integer.MAX_VALUE;
        long mod = (long) (1e9 + 7);
        int n;
        char c[];
        int d;

        void solve() {
            c = sc.sn().toCharArray();
            n = c.length;
            d = sc.ni();
            fill();
            out.println((digit(0, 0, 0)%mod - 1%mod+mod)%mod);
        }

        long dp[][][] = new long[10001][2][101];

        void fill() {
            for (int i = 0; i < 10001; i++) {
                for (int j = 0; j < 2; j++)
                    for (int k = 0; k < 101; k++)
                        dp[i][j][k] = -1;
            }
        }

        long digit(int i, int t, int r) {
            if (i == n) {
                if (r == 0)
                    return 1l;
                return 0l;
            }
            if (dp[i][t][r] != -1)
                return dp[i][t][r];
            int limit = (t == 1) ? 9 : (c[i] - '0');
            long res = 0;
            for (int j = 0; j <= limit; j++) {
                int cur = t;
                if (j < (c[i] - '0'))
                    cur = 1;
                res = (res + digit(i + 1, cur, (r + j) % d)) % mod;
            }
            return dp[i][t][r] = res % mod;
        }
    }
}
