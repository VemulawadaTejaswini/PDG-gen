import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DSummerVacation solver = new DSummerVacation();
        solver.solve(1, in, out);
        out.close();
    }

    static class DSummerVacation {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            int n = s.nextInt();
            int m = s.nextInt();
            DSummerVacation.pair[] arr = new DSummerVacation.pair[n];
            for (int i = 0; i < n; i++) {
                int a = s.nextInt();
                int b = s.nextInt();
                arr[i] = new DSummerVacation.pair(a, b);
            }

            Arrays.sort(arr);
            long ans = 0;
            for (int i = 0; i < n && m > 0; i++) {
                if (arr[i].a <= m) {
                    ans += (long) (arr[i].b);
                    m--;
                }
            }


//        out.println(Arrays.toString(arr));
            out.println(ans);
        }

        private static class pair implements Comparable<DSummerVacation.pair> {
            int a;
            int b;

            public pair(int a, int b) {
                this.a = a;
                this.b = b;
            }

            public int compareTo(DSummerVacation.pair o) {
                if (this.b == o.b) {
                    return Integer.compare(o.a, this.a);
                }
                return Integer.compare(o.b, this.b);
            }

            public String toString() {
                final StringBuilder sb = new StringBuilder("pair{");
                sb.append("a=").append(a);
                sb.append(", b=").append(b);
                sb.append('}');
                return sb.toString();
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

