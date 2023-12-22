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

        void solve() {
            int n = sc.ni();
            long a[][] = new long[n][3];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nlo();
                a[i][1] = sc.nlo();
                a[i][2] = sc.nlo();
            }
            long dp[][] = new long[n][3];
            dp[0][0] = a[0][0];
            dp[0][1] = a[0][1];
            dp[0][2] = a[0][2];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    int x = (j + 1) % 3;
                    int y = (j + 2) % 3;
                    dp[i][j] = Math.max(dp[i][j], a[i][j] + Math.max(dp[i - 1][x], dp[i - 1][y]));
                }
            }
            out.println(Math.max(dp[n - 1][0], Math.max(dp[n - 1][1], dp[n - 1][2])));
        }
    }
}
