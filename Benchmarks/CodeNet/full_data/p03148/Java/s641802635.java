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
import java.util.TreeSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.Collections;
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
        DVariousSushi solver = new DVariousSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class DVariousSushi {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            long[] t = new long[n + 1];

            long[] d = new long[n + 1];

            for (int i = 1; i <= n; i++) {
                t[i] = in.nextLong();
                d[i] = in.nextLong();
            }

            pair<Long, Long>[] a = new pair[n];

            for (int i = 1; i <= n; i++) {
                a[i - 1] = new pair(d[i], t[i]);
            }

            Arrays.sort(a);
            Collections.reverse(Arrays.asList(a));

            long sum = 0;

            Queue<Long> q = new PriorityQueue<>();

            Set<Long> res = new TreeSet<>();

            for (int i = 0; i < k; i++) {
                sum += a[i].fi;

                if (res.contains(a[i].se)) {
                    q.add(a[i].fi);
                } else {
                    res.add(a[i].se);
                }
            }

            long sz = res.size();

            long ans = sum + sz * sz;

            //out.println(ans);

            for (int i = k; i < n; i++) {
                if (!res.contains(a[i].se) && res.size() != k) {
                    long front = q.peek();

                    //out.println(front);

                    q.poll();

                    res.add(a[i].se);

                    sum -= front;
                    sum += a[i].fi;

                    long tt = res.size();

                    ans = Math.max(ans, sum + tt * tt);
                }
            }

            out.println(ans);
        }

        class pair<T, W> implements Comparable<pair> {
            private T fi;
            private W se;

            public pair() {

            }

            public pair(T fi, W se) {
                this.fi = fi;
                this.se = se;
            }

            public int compareTo(pair o) {
                if (fi != o.fi) return Long.valueOf((Long) fi).compareTo(Long.valueOf((Long) o.fi));
                return Long.valueOf((Long) se).compareTo((Long.valueOf((Long) o.fi)));
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

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

