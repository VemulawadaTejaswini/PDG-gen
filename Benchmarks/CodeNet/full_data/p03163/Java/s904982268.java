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
        int maxi = 200000000;

        void solve() {
            int n = sc.ni();
            int W = sc.ni();
            long dp[][] = new long[n + 1][W + 1];
            long a[][] = new long[n][2];
            for (int i = 0; i < n; i++) {
                long w = sc.ni();
                long v = sc.ni();
                a[i][0] = w;
                a[i][1] = v;
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= W; j++) {
                    if (j >= a[i - 1][0])
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - (int) a[i - 1][0]] + a[i - 1][1]);
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            out.println(dp[n][W]);
        }
    }
}
