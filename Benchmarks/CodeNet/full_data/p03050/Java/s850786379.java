import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Ribhav
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDivRemNumber solver = new DDivRemNumber();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDivRemNumber {
        public void solve(int testNumber, FastReader s, PrintWriter out) {
            long n = s.nextLong();
            ArrayList<Long> div = DDivRemNumber.Maths.printDivisors(n);
            long sum = 0;
            for (long curr : div) {
                long m = curr - 1;
                if (m == 0) {
                    continue;
                }

                if (n / m == (n % m)) {
                    sum += m;
                }
            }
            out.println(sum);
        }

        private static class Maths {
            static ArrayList<Long> printDivisors(long n) {
                // Note that this loop runs till square root
                ArrayList<Long> list = new ArrayList<>();
                for (long i = 1; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        if (n / i == i) {
                            list.add(i);
                        } else {
                            list.add(i);
                            list.add(n / i);
                        }
                    }
                }
                return list;
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

