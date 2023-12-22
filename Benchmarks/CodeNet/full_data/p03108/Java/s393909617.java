import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public static long union(int ar[], int p, int q, int siz[], long no) {
            int a = root(ar, p);
            int b = root(ar, q);
            if (a == b)
                return no;
            ar[b] = a;
            int sz1 = siz[a];
            int sz2 = siz[b];
            no -= (sz1 * (sz1 - 1)) / 2;
            no -= (sz2 * (sz2 - 1)) / 2;
            siz[a] += siz[b];
            siz[b] = siz[a];
            sz1 = siz[a];
            no += (sz1 * (sz1 - 1)) / 2;
            return no;
        }

        public static int root(int ar[], int index) {
            int i = index;
            while (i != ar[i])
                i = ar[i];
            return i;
        }

        public void solve(int testNumber, InputReader sc, OutputWriter out) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int l[] = new int[m];
            int r[] = new int[m];
            for (int i = 0; i < m; i++) {
                int s = sc.nextInt();
                int e = sc.nextInt();
                l[i] = s;
                r[i] = e;
            }
            int ar[] = new int[n];
            for (int i = 0; i < n; i++) {
                ar[i] = i;
            }
            int size[] = new int[n];
            Arrays.fill(size, 1);
            List<Long> li = new ArrayList<>();
            long put = n * (n - 1);
            put /= 2;
            li.add(put);
            long total = put;
            long now = 0;
            for (int i = m - 1; i > 0; i--) {
                long rr = now;
                now = union(ar, l[i] - 1, r[i] - 1, size, rr);
                li.add(total - now);
            }
            StringBuilder sb = new StringBuilder();
            for (int i = li.size() - 1; i >= 0; i--)
                sb.append(li.get(i)).append('\n');
            out.println(sb.toString());
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

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void println(Object... objects) {
            print(objects);
            writer.println();
        }

        public void close() {
            writer.close();
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

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

