import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FilterInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;

/**
 * @author khokharnikunj8
 */

public class Main {
    public static void main(String[] args) {
        new Thread(null, new Runnable() {
            public void run() {
                new Main().solve();
            }
        }, "1", 1 << 26).start();
    }

    void solve() {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        ScanReader in = new ScanReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        EGetEverything solver = new EGetEverything();
        solver.solve(1, in, out);
        out.close();
    }

    static class EGetEverything {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int m = in.scanInt();
            long[][] dp = new long[2][1 << n];
            Arrays.fill(dp[0], Long.MAX_VALUE / 3);
            Arrays.fill(dp[1], Long.MAX_VALUE / 3);
            dp[0][0] = 0;

            for (int i = 1; i <= m; i++) {
                int cost = in.scanInt();
                int b = in.scanInt();
                int mask = 0;
                for (int j = 0; j < b; j++) mask |= (1 << (in.scanInt() - 1));
                for (int j = 0; j < 1 << n; j++) {
                    dp[i & 1][j] = Math.min(dp[(i & 1)][j], dp[(i - 1) & 1][j]);
                    dp[i & 1][j | mask] = Math.min(dp[i & 1][j | mask], dp[(i - 1) & 1][j] + cost);
                }
            }
            if (dp[m & 1][(1 << n) - 1] != Long.MAX_VALUE / 3) out.println(dp[m & 1][(1 << n) - 1]);
            else out.println(-1);
        }

    }

    static class ScanReader {
        private byte[] buf = new byte[4 * 1024];
        private int index;
        private BufferedInputStream in;
        private int total;

        public ScanReader(InputStream inputStream) {
            in = new BufferedInputStream(inputStream);
        }

        private int scan() {
            if (index >= total) {
                index = 0;
                try {
                    total = in.read(buf);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (total <= 0) return -1;
            }
            return buf[index++];
        }

        public int scanInt() {
            int integer = 0;
            int n = scan();
            while (isWhiteSpace(n)) n = scan();
            int neg = 1;
            if (n == '-') {
                neg = -1;
                n = scan();
            }
            while (!isWhiteSpace(n)) {
                if (n >= '0' && n <= '9') {
                    integer *= 10;
                    integer += n - '0';
                    n = scan();
                }
            }
            return neg * integer;
        }

        private boolean isWhiteSpace(int n) {
            if (n == ' ' || n == '\n' || n == '\r' || n == '\t' || n == -1) return true;
            else return false;
        }

    }
}

