import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Objects;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DCake123 solver = new DCake123();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCake123 {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int x = in.nextInt();

            int y = in.nextInt();

            int z = in.nextInt();

            int k = in.nextInt();

            Long[] a = in.nextLongArrayBoxed(x);
            Long[] b = in.nextLongArrayBoxed(y);
            Long[] c = in.nextLongArrayBoxed(z);

            Arrays.sort(a, Comparator.reverseOrder());
            Arrays.sort(b, Comparator.reverseOrder());
            Arrays.sort(c, Comparator.reverseOrder());

            PriorityQueue<triple> triples = new PriorityQueue<>((t1, t2) -> Long.compare(t2.sum, t1.sum));

            triples.add(new triple(0, 0, 0, a[0] + b[0] + c[0]));

            Set<triple> set = new HashSet<>();

            set.add(new triple(0, 0, 0, a[0] + b[0] + c[0]));

            for (int i = 0; i < k; i++) {
                triple ct = triples.poll();

                out.println(ct.sum);

                int ci = ct.i;
                int cj = ct.j;
                int ck = ct.k;

                if (ci + 1 < x && !set.contains(new triple(ci + 1, cj, ck, -1))) {
                    triples.add(new triple(ci + 1, cj, ck, a[ci + 1] + b[cj] + c[ck]));
                    set.add(new triple(ci + 1, cj, ck, a[ci + 1] + b[cj] + c[ck]));
                }

                if (cj + 1 < y && !set.contains(new triple(ci, cj + 1, ck, -1))) {
                    triples.add(new triple(ci, cj + 1, ck, a[ci] + b[cj + 1] + c[ck]));
                    set.add(new triple(ci, cj + 1, ck, a[ci] + b[cj + 1] + c[ck]));
                }

                if (ck + 1 < z && !set.contains(new triple(ci, cj, ck + 1, -1))) {
                    triples.add(new triple(ci, cj, ck + 1, a[ci] + b[cj] + c[ck + 1]));
                    set.add(new triple(ci, cj, ck + 1, a[ci] + b[cj] + c[ck + 1]));
                }
            }

        }

        class triple {
            int i;
            int j;
            int k;
            long sum;

            public triple(int i, int j, int k, long sum) {
                this.i = i;
                this.j = j;
                this.k = k;
                this.sum = sum;
            }

            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                triple triple = (triple) o;
                return i == triple.i &&
                        j == triple.j &&
                        k == triple.k;
            }

            public int hashCode() {
                return Objects.hash(i, j, k);
            }

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void close() {
            writer.close();
        }

        public void println(long i) {
            writer.println(i);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
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
            while (isSpaceChar(c)) {
                c = read();
            }
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
            while (isSpaceChar(c)) {
                c = read();
            }
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public Long[] nextLongArrayBoxed(int n) {
            Long[] array = new Long[n];
            for (int i = 0; i < n; ++i) array[i] = nextLong();
            return array;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

