import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Mufaddal Naya
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FSilverFoxVsMonster solver = new FSilverFoxVsMonster();
        solver.solve(1, in, out);
        out.close();
    }

    static class FSilverFoxVsMonster {
        public void solve(int testNumber, InputReader c, OutputWriter w) {
            int n = c.readInt(), d = c.readInt(), aa = c.readInt();
            mons a[] = new mons[n];
            for (int i = 0; i < n; i++) {
                a[i] = new mons(c.readInt(), c.readInt());
            }
            Arrays.sort(a);


            long res = 0;
            TreeSet<ts> tr = new TreeSet<>();
            tr.add(new ts(Integer.MAX_VALUE, 0));
            for (int i = 0; i < n; i++) {
                a[i].h -= tr.ceiling(new ts(a[i].x, 0)).tot;
                if (a[i].h <= 0) {
                    continue;
                }
                long to = (a[i].h - 1) / aa + 1;
                res += to;
                tr.add(new ts(a[i].x + 2 * d, tr.first().tot + to * aa));

            }
            w.printLine(res);

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

        public int readInt() {
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

    static class ts implements Comparable<ts> {
        long x;
        long tot;

        public ts(long x, long tot) {
            this.x = x;
            this.tot = tot;
        }

        public int compareTo(ts o) {
            return Long.compare(x, o.x);
        }

    }

    static class mons implements Comparable<mons> {
        long x;
        long h;

        public mons(long x, long h) {
            this.x = x;
            this.h = h;
        }

        public int compareTo(mons o) {
            return Long.compare(x, o.x);
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

        public void printLine(long i) {
            writer.println(i);
        }

    }
}

