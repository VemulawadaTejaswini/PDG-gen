import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        FPass solver = new FPass();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPass {
        int mod = 998244353;

        int[] getSeq(char[] c, int want) {
            int n = c.length;
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            for (int i = 0; i < n; i++) {
                if (c[i] == '0') {
                    a1[i] = 0;
                    a2[i] = 0;
                } else if (c[i] == '1') {
                    a1[i] = 0;
                    a2[i] = 1;
                } else {
                    a1[i] = 1;
                    a2[i] = 1;
                }
            }
            int[] seq = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                if (a1[0] == want) {
                    seq[i] = want;
                    a1[0] = -1;
                } else if (a2[0] == want) {
                    seq[i] = want;
                    a2[0] = -1;
                } else {
                    seq[i] = 1 - want;
                    a1[0] = -1;
                }
                for (int j = 1; j < n; j++) {
                    int have = (a1[j] == want || a2[j] == want) ? want : 1 - want;
                    if (have == want) {
                        if (a1[j] == want) a1[j] = -1;
                        else a2[j] = -1;
                    } else {
                        if (a1[j] != -1) a1[j] = -1;
                        else a2[j] = -1;
                    }

                    if (a1[j - 1] == -1) a1[j - 1] = have;
                    else a2[j - 1] = have;
                }
            }
            return seq;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            char[] c = in.next().toCharArray();
            int n = c.length;
            int[] min = getSeq(c, 0);
            int[] max = getSeq(c, 1);
            for (int i = 1; i < 2 * n; i++) {
                min[i] += min[i - 1];
                max[i] += max[i - 1];
            }

            int[] dp = new int[2 * n + 1];
            dp[0] = 1;
            for (int i = 0; i < 2 * n; i++) {
                int[] ndp = new int[2 * n + 1];
                for (int have = min[i]; have <= max[i]; have++) {
                    ndp[have] += dp[have];
                    if (have > 0) ndp[have] += dp[have - 1];
                    if (ndp[have] >= mod) ndp[have] -= mod;
                }
                dp = ndp;
            }
            out.println(AUtils.sum(dp));
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

        public void println(int i) {
            writer.println(i);
        }

    }

    static class AUtils {
        public static int sum(int[] arr) {
            return Arrays.stream(arr).reduce(0, Integer::sum);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1 << 16];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (this.numChars == -1) {
                throw new InputMismatchException();
            } else {
                if (this.curChar >= this.numChars) {
                    this.curChar = 0;

                    try {
                        this.numChars = this.stream.read(this.buf);
                    } catch (IOException var2) {
                        throw new InputMismatchException();
                    }

                    if (this.numChars <= 0) {
                        return -1;
                    }
                }

                return this.buf[this.curChar++];
            }
        }

        public String next() {
            int c;
            while (isSpaceChar(c = this.read())) {
                ;
            }

            StringBuilder result = new StringBuilder();
            result.appendCodePoint(c);

            while (!isSpaceChar(c = this.read())) {
                result.appendCodePoint(c);
            }

            return result.toString();
        }

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

