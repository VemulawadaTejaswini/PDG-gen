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
        DClassified solver = new DClassified();
        solver.solve(1, in, out);
        out.close();
    }

    static class DClassified {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            int[][] ans = new int[n + 1][n + 1];
            int which = 1;
            for (int len = 1; len <= n / 2; len++, which ^= 3) {
                for (int i = 1; i <= n; i++) {
                    int prev = i;
                    int temp = prev + len;
                    if (temp > n) temp -= n;
                    int step = 1;
                    if (ans[prev][temp] == 0) {
                        ans[prev][temp] = which;
                        ans[temp][prev] = which;
                        while (temp != i) {
                            step++;
                            prev = temp;
                            temp = temp + len;
                            if (temp > n) temp -= n;
                            ans[prev][temp] = which;
                            ans[temp][prev] = which;
                        }
                        if (step % 2 == 1) {
                            ans[prev][temp] = which ^ 3;
                            ans[temp][prev] = which ^ 3;
                        }
                    }
                }

            }
            for (int i = 1; i <= n - 1; i++) {
                for (int j = i + 1; j <= n; j++) {
                    out.print(ans[i][j] + " ");
                }
                out.println();
            }
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

