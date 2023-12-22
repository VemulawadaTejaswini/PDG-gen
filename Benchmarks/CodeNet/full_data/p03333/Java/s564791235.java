import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            C.Segment[] segments = new C.Segment[n];
            for (int i = 0; i < n; i++) {
                segments[i] = new C.Segment(in.readInt(), in.readInt(), i);
            }
            long maxAns = Long.MIN_VALUE;
            {
                TreeSet<C.Segment> right = new TreeSet<>((a, b) -> {
                    int r = -Integer.compare(a.L, b.L);
                    if (r != 0) return r;
                    return Integer.compare(a.i, b.i);
                });
                TreeSet<C.Segment> left = new TreeSet<>((a, b) -> {
                    int r = Integer.compare(a.R, b.R);
                    if (r != 0) return r;
                    return Integer.compare(a.i, b.i);
                });
                for (C.Segment s : segments) {
                    left.add(s);
                    right.add(s);
                }
                long ans = 0;
                int curPos = 0;
                TreeSet<C.Segment> currentSet = left; // differs here
                while (true) {
                    C.Segment s = currentSet.pollFirst();
                    if (s == null) break;
                    ans += s.distanceTo(curPos);
                    left.remove(s);
                    right.remove(s);
                    curPos = s.closestPointTo(curPos);
                    if (currentSet == left) currentSet = right;
                    else currentSet = left;
                }
                ans += Math.abs(curPos);
                maxAns = Math.max(maxAns, ans);
            }
            {
                TreeSet<C.Segment> right = new TreeSet<>((a, b) -> {
                    int r = -Integer.compare(a.L, b.L);
                    if (r != 0) return r;
                    return Integer.compare(a.i, b.i);
                });
                TreeSet<C.Segment> left = new TreeSet<>((a, b) -> {
                    int r = Integer.compare(a.R, b.R);
                    if (r != 0) return r;
                    return Integer.compare(a.i, b.i);
                });
                for (C.Segment s : segments) {
                    left.add(s);
                    right.add(s);
                }
                long ans = 0;
                int curPos = 0;
                TreeSet<C.Segment> currentSet = right; // differs here
                while (true) {
                    C.Segment s = currentSet.pollFirst();
                    if (s == null) break;
                    ans += s.distanceTo(curPos);
                    left.remove(s);
                    right.remove(s);
                    curPos = s.closestPointTo(curPos);
                    if (currentSet == left) currentSet = right;
                    else currentSet = left;
                }
                ans += Math.abs(curPos);
                maxAns = Math.max(maxAns, ans);
            }
            out.printLine(maxAns);
        }

        static class Segment {
            int L;
            int R;
            int i;

            public Segment(int l, int r, int i) {
                L = l;
                R = r;
                this.i = i;
            }

            public int distanceTo(int x) {
                if (L <= x && x <= R) {
                    return 0;
                }
                return Math.min(Math.abs(x - L), Math.abs(x - R));
            }

            public int closestPointTo(int x) {
                if (L <= x && x <= R) {
                    return x;
                }
                if (Math.abs(x - L) < Math.abs(x - R)) {
                    return L;
                } else {
                    return R;
                }
            }

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

