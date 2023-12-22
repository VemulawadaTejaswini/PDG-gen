import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
 * @author lewin
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TPermutation solver = new TPermutation();
        solver.solve(1, in, out);
        out.close();
    }

    static class TPermutation {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            char[] s = in.next().toCharArray();
            int pc = 0;
            for (char c : s) if (c == '<') pc++;
            int[] pos = new int[pc];
            int id = 0;
            for (int i = 0; i < s.length; i++) {
                if (s[i] == '<') pos[id++] = i + 1;
            }
            out.println(countPermutations(n, pos));
        }

        public int countPermutations(int N, int[] pos) {
            if (pos.length == 0) {
                return 1;
            }

            Arrays.sort(pos);
            int m = pos.length;
            int[] ws = new int[m + 1];
            ws[0] = pos[0];
            for (int i = 0; i < m - 1; i++) {
                ws[i + 1] = pos[i + 1] - pos[i];
            }
            ws[m] = N - pos[m - 1];

            int[] wcum = new int[m + 2];
            for (int i = 1; i <= m + 1; i++) {
                wcum[i] = wcum[i - 1] + ws[i - 1];
            }

            int mod = 1000000007;
            long[] dp = new long[m + 2];
            dp[0] = m % 2 == 1 ? 1 : mod - 1;
            int[][] fif = enumFIF(1000005, mod);
            for (int i = 1; i <= N; i++) dp[0] = dp[0] * i % mod;
            long big = 8L * mod * mod;
            for (int i = 1; i <= m + 1; i++) {
                long v = 0;
                for (int j = 1; j <= i; j++) {
                    v += (long) fif[1][wcum[i] - wcum[i - j]] * (mod - dp[i - j]);
                    if (v >= big) v -= big;
                }
                dp[i] = v % mod;
            }

            return (int) dp[m + 1];
        }

        public static int[][] enumFIF(int n, int mod) {
            int[] f = new int[n + 1];
            int[] invf = new int[n + 1];
            f[0] = 1;
            for (int i = 1; i <= n; i++) {
                f[i] = (int) ((long) f[i - 1] * i % mod);
            }
            long a = f[n];
            long b = mod;
            long p = 1, q = 0;
            while (b > 0) {
                long c = a / b;
                long d;
                d = a;
                a = b;
                b = d % b;
                d = p;
                p = q;
                q = d - c * q;
            }
            invf[n] = (int) (p < 0 ? p + mod : p);
            for (int i = n - 1; i >= 0; i--) {
                invf[i] = (int) ((long) invf[i + 1] * (i + 1) % mod);
            }
            return new int[][]{f, invf};
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

        public int nextInt() {
            int c;
            for (c = this.read(); isSpaceChar(c); c = this.read()) {
                ;
            }

            byte sgn = 1;
            if (c == 45) {
                sgn = -1;
                c = this.read();
            }

            int res = 0;

            while (c >= 48 && c <= 57) {
                res *= 10;
                res += c - 48;
                c = this.read();
                if (isSpaceChar(c)) {
                    return res * sgn;
                }
            }

            throw new InputMismatchException();
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
}

