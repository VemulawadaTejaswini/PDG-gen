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
        long h[], a[], t[], dp[];

        void build(int v, int l, int r) {
            if (l == r) {
                t[v] = dp[l];
            } else {
                int mid = (l + r) / 2;
                build(2 * v, l, mid);
                build(2 * v + 1, mid + 1, r);
                t[v] = Math.max(t[2 * v], t[2 * v + 1]);
            }
        }

        void update(int v, int l, int r, int pos, long val) {
            if (l == r) {
                t[v] = val;
            } else {
                int mid = (l + r) / 2;
                if (pos <= mid)
                    update(2 * v, l, mid, pos, val);
                else
                    update(2 * v + 1, mid + 1, r, pos, val);
                t[v] = Math.max(t[2 * v], t[2 * v + 1]);
            }
        }

        long getMax(int v, int l, int r, int st, int end) {
            if (st > end || l > r)
                return 0;
            if (l == st && r == end)
                return t[v];
            else {
                int mid = (l + r) / 2;
                return Math.max(getMax(2 * v, l, mid, st, Math.min(mid, end)), getMax(2 * v + 1, mid + 1, r, Math.max(mid + 1, st), end));
            }
        }

        void solve() {
            n = sc.ni();
            h = sc.nal(n);
            a = sc.nal(n);
            t = new long[4 * n];
            long ans = 0;
            dp = new long[n + 1];
            build(1, 1, n);
            for (int i = 0; i < n; i++) {
                int j = (int) h[i];
                long mx = getMax(1, 1, n, 1, j - 1);
                dp[j] = Math.max(dp[j], mx + a[i]);
//                out.println(mx + " " + dp[j]);
                update(1, 1, n, j, dp[j]);
//                out.println(Arrays.toString(t));
            }
            for (int i = 0; i <= n; i++)
                ans = Math.max(ans, dp[i]);
            out.println(ans);
        }
    }
}
