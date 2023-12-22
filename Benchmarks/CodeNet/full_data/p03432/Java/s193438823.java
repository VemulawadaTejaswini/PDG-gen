import java.io.*;
import java.util.*;

public class Main {
    FastScanner in;
    PrintWriter out;


    final long mod = 998244353;

    long add(long x, long y) {
        x += y;
        if (x >= mod) {
            x -= mod;
        }
        return x;
    }

    long mul(long x, long y) {
        return (x * y) % mod;
    }

    long[][] prec(int n) {
        long[][] ways = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            ways[0][i] = 1;
        }
        long[][] centerWays = new long[n + 1][n + 1];
        for (int was = 1; was <= n; was++) {
            for (int l = 0; l <= was; l++) {
                for (int r = 0; r + l <= was; r++) {
                    int curCenter = was - l - r;
                    centerWays[was][curCenter] = add(centerWays[was][curCenter], (l + 1) * (r + 1));
                }
            }
        }
        for (int was = 1; was <= n; was++) {
            for (int add = 1; add + was <= n; add++) {
                for (int center = 0; center <= was; center++) {
                    if (center > 0 && add == 1) {
                        continue;
                    }
                    int curC = (add == 1 ? 1 : c[center + add - 2][add - 2]);
                    long w = mul(curC, centerWays[was][center]);
                    ways[was][add] = add(ways[was][add], w);
                }
            }
        }
        return ways;
    }

    int[][] c;

    void solve() {
        int n = in.nextInt();

        c = new int[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            c[i][0] = 1;
            if (i != 0) {
                for (int j = 1; j <= n; j++) {
                    c[i][j] = c[i - 1][j - 1] + c[i - 1][j];
                    if (c[i][j] >= mod) {
                        c[i][j] -= mod;
                    }
                }
            }
        }
        int m = in.nextInt();
        long[] dp = new long[n + 1];
        dp[0] = 1;
        long[] ndp = new long[n + 1];
        long[][] pr = prec(n);
//        System.err.println(Arrays.deepToString(pr));
        for (int i = 0; i < m; i++) {
            Arrays.fill(ndp, 0);
            for (int cur = 0; cur <= n; cur++) {
                long now = dp[cur];
                if (now == 0) {
                    continue;
                }
                int ways = cur * (cur + 1) / 2 + 1;
                ndp[cur] = add(ndp[cur], mul(ways, now));
                for (int add = 1; add + cur <= n; add++) {
                    int nextCur = add + cur;
                    ndp[nextCur] = add(ndp[nextCur], mul(now, pr[cur][add]));
                }
            }
//            System.err.println(Arrays.toString(ndp));
            long[] tmp = dp;
            dp = ndp;
            ndp = tmp;
        }
//        System.err.println(Arrays.toString(dp));
        long res = 0;
        for (int i = 0; i <= n; i++) {
            res = add(res, mul(c[n][i], dp[i]));
        }
        out.println(res);
    }

    void run() {
        try {
            in = new FastScanner(new File("Main.in"));
            out = new PrintWriter(new File("Main.out"));

            solve();

            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    void runIO() {

        in = new FastScanner(System.in);
        out = new PrintWriter(System.out);

        solve();

        out.close();
    }

    class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner(File f) {
            try {
                br = new BufferedReader(new FileReader(f));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public FastScanner(InputStream f) {
            br = new BufferedReader(new InputStreamReader(f));
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return null;
                st = new StringTokenizer(s);
            }
            return st.nextToken();
        }

        boolean hasMoreTokens() {
            while (st == null || !st.hasMoreTokens()) {
                String s = null;
                try {
                    s = br.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (s == null)
                    return false;
                st = new StringTokenizer(s);
            }
            return true;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    public static void main(String[] args) {
        new Main().runIO();
    }
}