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
        Aatcoder solver = new Aatcoder();
        solver.solve(1, in, out);
        out.close();
    }

    static class Aatcoder {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {

            int n = in.scanInt();
            int k = in.scanInt();
            if (k >= n) {
                out.println(1);
                return;
            }
            int ind = -1;
            int[] ar = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = in.scanInt();
                if (ar[i] == 1) ind = i;
            }
            int ans = 0;
            for (int i = ind; i < n - 1; i = i + (k - 1)) {
                ans++;
            }

            for (int i = ind; i >= 1; i -= (k - 1)) {
                ans++;
            }
            out.println(Math.min(ans, n - k + 1));
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

