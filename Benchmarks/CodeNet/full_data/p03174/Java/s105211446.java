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
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        private static final long mod = (long) (1e9 + 7);

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            boolean mat[][] = new boolean[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++)
                    mat[i][j] = (in.scanInt() == 1);


            long dp[][] = new long[n][(1 << n)];

            for (int j = 0; j < n; ++j) if (mat[0][j]) dp[0][1 << j] = 1;
            for (int i = 1; i < n; i++) {
                for (int mask = 0; mask < (1 << n); mask++) {
                    for (int e = 0; e < n; e++) {
                        if (mat[i][e]) {
                            if ((mask & (1 << e)) != 0) {
                                if (i != 0) dp[i][mask] = (dp[i][mask] + dp[i - 1][mask ^ (1 << e)]) % mod;
                            }
                        }
                    }
                }
            }
            out.println(dp[n - 1][(1 << n) - 1]);
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

