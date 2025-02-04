
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
        List<Integer> list[];
        long dp[][];
        long ans = 0;

        void solve() {
            n = sc.ni();
            list = new ArrayList[n];
            dp = new long[n][2];
            for (int i = 0; i < n; i++)
                list[i] = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                int u = sc.ni() - 1;
                int v = sc.ni() - 1;
                list[u].add(v);
                list[v].add(u);
            }
            dfs(0, -1);
            long ans = (dp[0][0] + dp[0][1]) % mod;
            out.println(ans);
        }

        long pro(long a, long b) {
            return (a % mod * b % mod) % mod;
        }

        void dfs(int s, int p) {
            long b = 1, w = 1;
            for (int v : list[s]) {
                if (v != p) {
                    dfs(v, s);
                    b = pro(b, dp[v][1]);
                    w = pro(w, dp[v][0] + dp[v][1]);
                }
            }
            dp[s][0] = b;
            dp[s][1] = w;
        }
    }
}
