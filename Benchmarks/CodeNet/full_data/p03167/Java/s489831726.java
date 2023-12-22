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

        void solve() {
            int n = sc.ni();
            int m = sc.ni();
            char c[][] = new char[n][m];
            for (int i = 0; i < n; i++)
                c[i] = sc.sn().toCharArray();
            long dp[][] = new long[n][m];
            dp[0][0] = 1;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    int x = i - 1;
                    int y = j - 1;
                    if (valid(x, j, n, m, c))
                        dp[i][j] = (dp[i][j] + dp[x][j]) % mod;
                    if (valid(i, y, n, m, c))
                        dp[i][j] = (dp[i][j] + dp[i][y]) % mod;
                }
            }
            out.println((dp[n - 1][m - 1] + mod) % mod);
        }

        boolean valid(int i, int j, int n, int m, char c[][]) {
            return i >= 0 && j >= 0 && i < n && j < m && c[i][j] != '#';
        }
    }
}
