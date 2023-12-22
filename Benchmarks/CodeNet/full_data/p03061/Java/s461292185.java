import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.Closeable;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HBonsai
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CGCDOnBlackboard solver = new CGCDOnBlackboard();
        solver.solve(1, in, out);
        out.close();
    }

    static class CGCDOnBlackboard {
        public void solve(int testNumber, FastScanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A = in.nextIntArray(N);
            if (N == 2) {
                out.println(Math.max(A[0], A[1]));
                return;
            }
            int gcdA = gcd(A[0], A[1]);
            for (int i = 0; i < N - 1; i++) {
                gcdA = gcd(A[i], A[i + 1]);
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = A[i] / gcdA;
            }
            int gcdB = gcd(B[0], B[1]);
            int cand = -1;
            for (int i = 0; i < N - 1; i++) {
                if (gcdB == 1) {
                    cand = i + 1;
                    break;
                }
                gcdB = gcd(gcdB, B[i + 1]);
            }
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                if (i == cand) continue;
                list.add(A[i]);
            }
            int ans1 = gcd(A[1], A[2]);
            int ans2 = gcd(list.get(0), list.get(1));
            for (int i = 1; i < N - 1; i++) {
                ans1 = gcd(ans1, A[i + 1]);
            }
            for (int i = 1; i < list.size(); i++) {
                ans2 = gcd(ans2, list.get(i));
            }
            out.println(Math.max(ans1, ans2));
        }

        private static int gcd(int m, int n) {
            if (m < n) return gcd(n, m);
            if (n == 0) return m;
            return gcd(n, m % n);
        }

    }

    static class FastScanner implements Closeable {
        private final InputStream in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int buflen = 0;

        public FastScanner(InputStream in) {
            this.in = in;
        }

        private boolean hasNextByte() {
            if (ptr < buflen) {
                return true;
            } else {
                ptr = 0;
                try {
                    buflen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (buflen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        public boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        public long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
            long n = 0;
            boolean minus = false;
            int b = readByte();
            if (b == '-') {
                minus = true;
                b = readByte();
            }
            if (b < '0' || '9' < b) {
                throw new NumberFormatException();
            }
            while (true) {
                if ('0' <= b && b <= '9') {
                    n *= 10;
                    n += b - '0';
                } else if (b == -1 || !isPrintableChar(b)) {
                    return minus ? -n : n;
                } else {
                    throw new NumberFormatException();
                }
                b = readByte();
            }
        }

        public int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        public void close() {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

