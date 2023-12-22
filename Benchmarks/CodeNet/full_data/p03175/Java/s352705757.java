import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Jenish
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        PIndependentSet solver = new PIndependentSet();
        solver.solve(1, in, out);
        out.close();
    }

    static class PIndependentSet {
        int n;
        int[][] g;
        long[][] dp;
        private static final long mod = (long) (1e9 + 7);

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            n = in.scanInt();
            dp = new long[n + 1][2];
            {
                int from[] = new int[n - 1];
                int to[] = new int[n - 1];
                for (int i = 0; i < n - 1; i++) {
                    from[i] = in.scanInt();
                    to[i] = in.scanInt();
                }
                g = CodeX.packGraph(from, to, n);
            }
            DFS(1, -1);
            out.println((dp[1][0] + dp[1][1]) % mod);
        }

        void DFS(int cur, int par) {
            dp[cur][0] = dp[cur][1] = 1;
            for (int j : g[cur]) {
                if (j != par) {
                    DFS(j, cur);
                    dp[cur][0] = (dp[cur][0] * dp[j][1]) % mod;
                    dp[cur][1] = (dp[cur][1] * (dp[j][1] + dp[j][0]) % mod) % mod;
                }
            }

        }

    }

    static class CodeX {
        public static int[][] packGraph(int[] from, int[] to, int n) {
            int[][] g = new int[n + 1][];
            int p[] = new int[n + 1];
            for (int i : from) p[i]++;
            for (int i : to) p[i]++;
            for (int i = 0; i <= n; i++) g[i] = new int[p[i]];
            for (int i = 0; i < from.length; i++) {
                g[from[i]][--p[from[i]]] = to[i];
                g[to[i]][--p[to[i]]] = from[i];
            }
            return g;
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int INDEX;
        private BufferedInputStream in;
        private int TOTAL;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (INDEX >= TOTAL) {
                INDEX = 0;
                try {
                    TOTAL = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (TOTAL <= 0) return -1;
            }
            return buf[INDEX++];
        }

        public int scanInt() {
            int I = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    I *= 10;
                    I += n - '0';
                    n = scan();
                }
            }
            return neg * I;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

