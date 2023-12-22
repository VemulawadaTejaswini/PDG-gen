import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Denis Nedelyaev
 */
public class Main {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastScanner in = new FastScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AtB solver = new AtB(in, out);
        solver.solve(1);
        out.close();
    }

    static class AtB {
        private final FastScanner in;
        private final PrintWriter out;
        private Pair[] a;

        public AtB(FastScanner in, PrintWriter out) {
            this.in = in;
            this.out = out;
        }

        public void solve(int testNumber) {
            int n = 0;
            n = in.nextInt();
            int[] b = in.nextInts(n);

            out.println(realSolve(b));
        }

        public long realSolve(int[] b) {
            int n = b.length;
            a = new Pair[n];
            for (int i = 0; i < n; i++) {
                a[i] = new Pair(b[i], i);
            }

            Arrays.sort(a, Comparator.comparingLong(x -> x.value));

            return calc(0, 0, n - 1);
        }

        private long calc(int i, long from, long to) {
            if (i == a.length) {
                if (from <= to) {
                    throw new AssertionError();
                }
                return 0;
            }
            long index = a[i].index;
            if (index < from || index > to) {
                return calc(i + 1, from, to);
            }
            long sum = a[i].value * (index - from + 1) * (to - index + 1);
            return sum + calc(i + 1, from, index - 1) + calc(i + 1, index + 1, to);
        }

    }

    static class FastScanner {
        private final static int BUFFER_SIZE = 4096;
        private final InputStream in;
        private byte[] buffer = new byte[BUFFER_SIZE];
        private int pos = 0;
        private int size;

        public FastScanner(InputStream inputStream) throws IOException {
            in = inputStream;
            size = 0;
        }

        public int nextInt() {
            int c = skipWhitespace();

            int sign = -1;
            if (c == '-') {
                sign = 1;
                c = read();
            }

            int ans = 0;

            while (c > ' ') {
                ans *= 10;
                ans -= c - '0';
                c = read();
            }

            return sign * ans;
        }

        public int[] nextInts(int n) {
            int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        private int skipWhitespace() {
            while (true) {
                int c = read();
                if (c > ' ' || c == -1) {
                    return c;
                }
            }
        }

        private int read() {
            if (pos >= size) {
                try {
                    size = in.read(buffer, 0, BUFFER_SIZE);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                if (size <= 0) {
                    return -1;
                }
                pos = 0;
            }
            return buffer[pos++];
        }

    }

    static class Pair {
        final long value;
        final int index;

        Pair(long value, int index) {
            this.value = value;
            this.index = index;
        }

    }
}

