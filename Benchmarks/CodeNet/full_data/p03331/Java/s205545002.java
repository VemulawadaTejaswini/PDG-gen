import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            long ans = 0;
            TreeSet<Pair<Integer>> left = new TreeSet<>((o1, o2) -> {
                if (o1.b == o2.b) return o1.a - o2.a;
                return o1.b - o2.b;
            });
            TreeSet<Pair<Integer>> right = new TreeSet<>((o1, o2) -> {
                if (o1.a == o2.a) return o1.b - o2.b;
                return o1.a - o2.a;
            });
            for (int i = 0; i < n; i++) {
                int l = in.readInt();
                int r = in.readInt();
                Pair<Integer> p = new Pair<>(l, r);
                left.add(p);
                right.add(p);
            }

            int current = 0;
            for (int i = 0; left.size() > 0; i++) {
                Pair<Integer> t;
                if (i % 2 == 0) {
                    t = right.pollLast();
                    left.remove(t);
                    if (current < t.a || current > t.b) {
                        ans += Math.abs(current - t.a);
                        current = t.a;
                    }
                } else {
                    t = left.pollFirst();
                    right.remove(t);

                    if (current < t.a || current > t.b) {
                        ans += Math.abs(current - t.b);
                        current = t.b;
                    }
                }
            }


            out.println(ans + Math.abs(current));
        }

    }

    static class Pair<T> {
        public T a;
        public T b;
        public int idx;

        public Pair(T ta, T tb) {
            a = ta;
            b = tb;
        }

        public Pair(int idx, T ta, T tb) {
            a = ta;
            b = tb;
            this.idx = idx;
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
            if (numChars == -1)
                throw new InputMismatchException();
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0)
                    return -1;
            }
            return buf[curChar++];
        }

        public int readInt() {
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
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
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

