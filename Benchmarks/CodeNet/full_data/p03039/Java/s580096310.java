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
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author maheshwari29
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        ECellDistance solver = new ECellDistance();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECellDistance {
        static long mod = (long) 1e9 + 7;

        static long exponent(long a, long n) {
            long ans = 1;
            while (n != 0) {
                if (n % 2 == 1) ans = (ans * a) % mod;
                a = (a * a) % mod;
                n = n >> 1;
            }
            return ans;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int i, j;
            long n = in.nl();
            long m = in.nl();
            long k = in.nl();
            long fac[] = new long[100005];
            fac[0] = 1;
            for (i = 1; i <= fac.length; i++)
                fac[i] = mul(i, fac[i - 1]);
            long sum1 = 0;
            for (i = 1; i <= n - 1; i++)
                sum1 = add(sum1, mul(i, mul((n - i), m * m)));
            long sum2 = 0;
            for (i = 1; i <= m - 1; i++)
                sum2 = add(sum2, mul(i, mul((m - i), n * n)));
            long sum3 = add(sum1, sum2);
            long temp1 = fac[(int) (n * m) - 2];
            long temp2 = fac[(int) (n * m - k)];
            long temp3 = fac[(int) k - 2];
            long temp4 = mul(temp2, temp3);
            long temp5 = exponent(temp4, mod - 2);
            long temp6 = mul(temp5, temp1);
            //out.println(temp1);
            //out.println("temp6="+temp6);
            long ans = mul(temp6, sum3);
            out.println(ans);
        }

        public long mul(long a, long b) {
            return (a % mod * b % mod) % mod;
        }

        public long add(long a, long b) {
            return (a % mod + b % mod) % mod;
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

        public long nl() {
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

