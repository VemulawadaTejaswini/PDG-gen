import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        FEngines solver = new FEngines();
        solver.solve(1, in, out);
        out.close();
    }

    static class FEngines {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            long[][] ar = new long[n + 1][2];
            for (int i = 1; i <= n; i++) {
                ar[i][0] = in.scanInt();
                ar[i][1] = in.scanInt();
            }
            long[][] dp = new long[n + 1][2];
            double[] ans = new double[n + 1];
            double aa = 0;
            for (int i = 1; i <= n; i++) {
                dp[i][0] = ar[i][0];
                dp[i][1] = ar[i][1];
                for (int j = 0; j < i; j++) {
                    double anss = Math.sqrt((ar[i][0] + dp[j][0]) * (ar[i][0] + dp[j][0]) + (ar[i][1] + dp[j][1]) * (ar[i][1] + dp[j][1]));
                    if (anss > ans[i]) {
                        dp[i][0] = ar[i][0] + dp[j][0];
                        dp[i][1] = ar[i][1] + dp[j][1];
                        ans[i] = anss;
                    }
                    aa = Math.max(aa, ans[i]);
                }
            }
            out.println(aa);
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

