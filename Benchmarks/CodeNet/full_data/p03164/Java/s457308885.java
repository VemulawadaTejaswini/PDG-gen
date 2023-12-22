import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.util.HashMap;
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
        EKnapsack2 solver = new EKnapsack2();
        solver.solve(1, in, out);
        out.close();
    }

    static class EKnapsack2 {
        int[] val;
        long[] wei;
        HashMap<Long, Long> hm;

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            long ww = in.scanLong();
            val = new int[n];
            wei = new long[n];

            hm = new HashMap<>();
            for (int i = 0; i < n; i++) {
                wei[i] = in.scanInt();
                val[i] = in.scanInt();
            }


            long dp[][] = new long[n][(int) (1e5 + 5)];
            for (long arr[] : dp) Arrays.fill(arr, Long.MAX_VALUE / 2);
            dp[0][0] = 0;
            dp[0][val[0]] = wei[0];
            for (int i = 1; i < n; i++) {
                for (int j = 0; j <= 100000; j++) {
                    if (j - val[i] >= 0) dp[i][j] = Math.min(dp[i][j], dp[i - 1][j - val[i]] + wei[i]);
                    dp[i][j] = Math.min(dp[i][j], dp[i - 1][j]);
                }
            }

            long ans = 0;
            for (int j = 0; j <= 100000; j++) if (dp[n - 1][j] <= ww) ans = Math.max(ans, j);
            out.println(ans);
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

        public long scanLong() {
            long I = 0;
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

    }
}

