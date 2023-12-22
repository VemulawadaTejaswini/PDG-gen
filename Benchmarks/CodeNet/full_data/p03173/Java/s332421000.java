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
        NSlimes solver = new NSlimes();
        solver.solve(1, in, out);
        out.close();
    }

    static class NSlimes {
        long[] arr;
        long[][] dp;
        long[] pre;

        long findit(int i, int j) {

            if (i > j) return 0;
            if (i == j) return dp[i][j] = arr[i];
            if (dp[i][j] != -1) return dp[i][j];
            long temp = Long.MAX_VALUE / 2;
            long sum = sum(i, j);
            for (int k = i + 1; k <= j; k++) temp = Math.min(temp, findit(i, k - 1) + findit(k, j) + sum);
            return dp[i][j] = temp;
        }

        long sum(int i, int j) {
            return (i != 0) ? (pre[j] - pre[i - 1]) : pre[j];
        }

        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            arr = new long[n];
            dp = new long[n][n];
            pre = new long[n];
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    dp[i][j] = -1;


            in.scanLong(arr);
            for (int i = 0; i < n; i++) pre[i] = arr[i];
            for (int i = 1; i < n; i++) pre[i] += pre[i - 1];
            out.println(findit(0, n - 1) - sum(0, n - 1));
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

        public void scanLong(long[] A) {
            for (int i = 0; i < A.length; i++) A[i] = scanLong();
        }

    }
}

