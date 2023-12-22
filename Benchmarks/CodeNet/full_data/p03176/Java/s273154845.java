import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        QFlowers solver = new QFlowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class QFlowers {
        public void solve(int testNumber, ScanReader in, PrintWriter out) {
            int n = in.scanInt();
            MaxSeg maxSeg = new MaxSeg(n + 5);
            int hi[] = new int[n];
            long arr[] = new long[n];
            in.scanInt(hi);
            in.scanLong(arr);
            long ans = 0;

            for (int i = 0; i < n; i++) {
                maxSeg.setMax(hi[i], Math.max(maxSeg.max(hi[i], hi[i]), arr[i]));
                maxSeg.setMax(hi[i], Math.max(maxSeg.max(hi[i], hi[i]), maxSeg.max(0, hi[i] - 1) + arr[i]));
            }
            out.println(maxSeg.max(1, n));


            ///  0 20 60 10 50 0 0 0 0
            ///  0 1  2 3  4  5 6 7 8
        }

    }

    static class MaxSeg {
        long[] tree;
        int n;

        public MaxSeg(int n) {
            this.n = n;
            tree = new long[2 * n];
            Arrays.fill(tree, Integer.MIN_VALUE);
        }

        public void setMax(int i, long value) {
            i += this.tree.length / 2;
            this.tree[i] = value;
            for (; i > 1; i >>= 1)
                this.tree[i >> 1] = Math.max(this.tree[i], this.tree[i ^ 1]);
        }

        public long max(int a, int b) {
            long res = Long.MIN_VALUE;
            for (a += this.tree.length / 2, b += this.tree.length / 2; a <= b; a = (a + 1) >> 1, b = (b - 1) >> 1) {
                res = Math.max(res, this.tree[a]);
                res = Math.max(res, this.tree[b]);
            }
            return res;
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

        public void scanInt(int[] A) {
            for (int i = 0; i < A.length; i++) A[i] = scanInt();
        }

    }
}

