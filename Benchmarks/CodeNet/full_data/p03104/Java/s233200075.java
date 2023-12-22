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
 * @author prakharjain
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        DXORWorld solver = new DXORWorld();
        solver.solve(1, in, out);
        out.close();
    }

    static class DXORWorld {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long a = in.nextLong();

            long b = in.nextLong();


            long ans = cal(b);

            if (a > 0) {
                ans ^= cal(a - 1);
            }
            out.println(ans);
        }

        long cal(long a) {
            long t = a + 1;

            long ans = 0;
            for (int i = 0; i <= 40; i++) {
                if (i > 0) {
                    long pre = (1l << (i + 1));
                    long rem = t % pre;

                    if (rem > pre / 2) {
                        long rem2 = rem - pre / 2;

                        if (rem2 % 2 == 1) {
                            ans |= (1l << i);
                        }
                    }
                } else {
                    long pre = (1l << (i + 1));
                    long rem = t % pre;

                    long at = t / pre;

                    long val = 0;
                    if (at % 2 == 1) {
                        val = 1;
                    }
                    if (rem > pre / 2) {
                        long rem2 = rem - pre / 2;

                        if (rem2 % 2 == 1) {
                            val = 1 - val;
                        }
                    }

                    ans |= val;
                }
            }

            return ans;
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

        public void println(long i) {
            writer.println(i);
        }

    }
}

