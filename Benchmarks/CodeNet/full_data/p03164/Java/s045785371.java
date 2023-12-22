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
        int n;
        long w;
        int wv[][];

        void solve() {
            n = sc.ni();
            w = sc.nlo();
            wv = new int[n][2];
            int sum = 0;
            for (int i = 0; i < n; i++) {
                wv[i][0] = sc.ni();
                wv[i][1] = sc.ni();
                sum += wv[i][1];
            }
            long dp[][] = new long[n + 1][(int) sum + 1];
            boolean dp2[][] = new boolean[n + 1][sum + 1];
            for (int i = 0; i <= n; i++)
                dp2[i][0] = true;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j >= wv[i - 1][1])
                        dp2[i][j] = dp2[i - 1][j] | dp2[i - 1][j - wv[i - 1][1]];
                    else
                        dp2[i][j] = dp2[i - 1][j];
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= sum; j++) {
                    if (j >= wv[i - 1][1])
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - (int) wv[i - 1][1]] + wv[i - 1][0]);
                    else
                        dp[i][j] = dp[i - 1][j];
                }
            }
            for (int i = sum; i >= 0; i--) {
                if (dp2[n][i] && dp[n][i] <= w) {
                    out.println(i);
                    break;
                }
            }
        }
    }
}
