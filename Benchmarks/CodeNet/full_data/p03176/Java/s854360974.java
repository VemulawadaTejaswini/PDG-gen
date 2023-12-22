import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author cunbidun
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        QFlowers solver = new QFlowers();
        solver.solve(1, in, out);
        out.close();
    }

    static class QFlowers {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.nextInt();
            int[] h = in.nextIntArray(n, 1);
            long[] a = in.nextLongArray(n, 1);
            STPointMaxLong sTree = new STPointMaxLong(n);
            for (int i = 1; i <= n; i++) {
                sTree.update(h[i], a[i] + sTree.getMax(1, MaxMin.Max(1, h[i] - 1)));
            }
            out.println(sTree.getMax(1, n));
        }

    }

    static class MaxMin {
        public static <T extends Comparable<T>> T Max(T x, T y) {
            T max = x;
            if (y.compareTo(max) > 0) max = y;
            return max;
        }

    }

    static class InputReader extends InputStream {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public int[] nextIntArray(int length, int stIndex) {
            int[] arr = new int[length + stIndex];
            for (int i = stIndex; i < stIndex + length; i++)
                arr[i] = nextInt();
            return arr;
        }

        public long[] nextLongArray(int length, int stIndex) {
            long[] arr = new long[length + stIndex];
            for (int i = stIndex; i < stIndex + length; i++)
                arr[i] = nextLong();
            return arr;
        }

        private static boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class STPointMaxLong {
        private long[] segmentMax;
        private long[] array;
        private int N;
        private long INF = (long) 5e9 + 7;

        public STPointMaxLong(int n) {
            segmentMax = new long[4 * n];
            N = n;
        }

        public STPointMaxLong(int n, long[] inputArray) {
            segmentMax = new long[4 * n];
            this.array = inputArray;
            N = n;
            buildTree(1, 1, N);
        }

        private void buildTree(int i, int l, int r) {
            if (l > r) return;
            if (l == r) {
                segmentMax[i] = array[l];
                return;
            }
            int m = (l + r) >> 1;
            buildTree(i * 2, l, m);
            buildTree(i * 2 + 1, m + 1, r);
            segmentMax[i] = MaxMin.Max(segmentMax[i * 2], segmentMax[i * 2 + 1]);
        }

        public void update(int p, long val) {
            update(1, 1, N, p, val);
        }

        private void update(int i, int l, int r, int p, long val) {
            if (l > p || p > r) return;
            if (l == r) {
                segmentMax[i] += val;
                return;
            }
            int m = (l + r) >> 1;
            update(i * 2, l, m, p, val);
            update(i * 2 + 1, m + 1, r, p, val);
            segmentMax[i] = MaxMin.Max(segmentMax[i * 2], segmentMax[i * 2 + 1]);
        }

        public long getMax(int l, int r) {
            return getMax(1, 1, N, l, r);
        }

        private long getMax(int i, int l, int r, int L, int R) {
            if (l > R || L > r || l > r) return -INF;
            if (L <= l && r <= R) return segmentMax[i];
            int m = (l + r) >> 1;
            return MaxMin.Max(getMax(i * 2, l, m, L, R), getMax(i * 2 + 1, m + 1, r, L, R));
        }

    }
}

