import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.Comparator;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            final long[] x = new long[n], y = new long[n], z = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = in.readLong();
                y[i] = in.readLong();
                z[i] = in.readLong();
            }
            Integer[] idx = in.enumerator(n);
            long ans = 0;

            for (int i = 0; i < 8; i++) {
                final int t = i;
                Arrays.sort(idx, new Comparator<Integer>() {

                    public int compare(Integer o1, Integer o2) {
                        int a = ((t >> 2) & 1);
                        int b = ((t >> 1) & 1);
                        int c = ((t) & 1);

                        long v1 = 0;
                        if (a == 0) {
                            v1 += x[o1];
                        } else v1 -= x[o1];
                        if (b == 0) v1 += y[o1];
                        else v1 -= y[o1];

                        if (c == 0) v1 += z[o1];
                        else v1 -= z[o1];

                        long v2 = 0;
                        if (a == 0) v2 += x[o2];
                        else v2 -= x[o2];

                        if (b == 0) v2 += y[o2];
                        else v2 -= y[o2];

                        if (c == 0) v2 += z[o2];
                        else v2 -= z[o2];
                        return Long.compare(v2, v1);
                    }
                });
                long a = 0, b = 0, c = 0;
                for (int j = 0; j < m; j++) {
                    a += x[idx[j]];
                    b += y[idx[j]];
                    c += z[idx[j]];
                }
                ans = Math.max(Math.abs(a) + Math.abs(b) + Math.abs(c), ans);
            }
            out.println(ans);

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

        public long readLong() {
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

        public Integer[] enumerator(int size) {
            Integer[] ans = new Integer[size];
            for (int i = 0; i < size; i++) ans[i] = i;
            return ans;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

