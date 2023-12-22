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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int m = in.readInt();
            PrimeFastFourierTransform fft = new PrimeFastFourierTransform(MiscUtils.MODF);
            long[] res = new long[n + 1];
            long[] revFac = IntegerUtils.generateReverseFactorials(n + 1, MiscUtils.MODF);
            for (int i = 0; i <= n; i++) {
                res[i] = (n + 1 - i) * revFac[i] % MiscUtils.MODF;
            }
            long[] ans1 = new long[n + 1];
            fft.power(ans1, res, m);
            long[] ans = new long[n + 1];
            long[] next = new long[n + 1];
            ans[0] = 1;
            long[] ansNext = new long[n + 1];
            for (int i = 0; (1 << i) <= m; i++) {
                if ((m >> i & 1) == 1) {
                    fft.multiply(ansNext, ans, res, n + 1);
                    long[] temp = ans;
                    ans = ansNext;
                    ansNext = temp;
                }
                fft.multiply(next, res, res, n + 1);
                long[] temp = res;
                res = next;
                next = temp;
            }
            long answer = 0;
            for (int i = 0; i <= n; i++) {
                answer += ans[i] * revFac[n - i] % MiscUtils.MODF;
            }
            answer *= IntegerUtils.factorial(n, MiscUtils.MODF);
            answer %= MiscUtils.MODF;
            out.printLine(answer);
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

    static class IntegerUtils {
        private static long _x;
        private static long _y;

        public static long trueMod(long a, long b) {
            a %= b;
            a += b;
            a %= b;
            return a;
        }

        public static long factorial(int n, long mod) {
            long result = 1;
            for (int i = 2; i <= n; i++) {
                result = result * i % mod;
            }
            return result % mod;
        }

        public static long power(long base, long exponent, long mod) {
            if (base >= mod) {
                base %= mod;
            }
            if (exponent == 0) {
                return 1 % mod;
            }
            long result = power(base, exponent >> 1, mod);
            result = result * result % mod;
            if ((exponent & 1) != 0) {
                result = result * base % mod;
            }
            return result;
        }

        public static long reverse(long number, long modulo) {
            extGcd(number, modulo);
            return trueMod(_x, modulo);
        }

        private static long extGcd(long a, long b) {
            if (a == 0) {
                _x = 0;
                _y = 1;
                return b;
            }
            long d = extGcd(b % a, a);
            long nx = _y - (b / a) * _x;
            _y = _x;
            _x = nx;
            return d;
        }

        public static long[] generateReverse(int upTo, long module) {
            long[] result = new long[upTo];
            if (upTo > 1) {
                result[1] = 1;
            }
            for (int i = 2; i < upTo; i++) {
                result[i] = (module - module / i * result[((int) (module % i))] % module) % module;
            }
            return result;
        }

        public static long[] generateReverseFactorials(int upTo, long module) {
            long[] result = generateReverse(upTo, module);
            if (upTo > 0) {
                result[0] = 1;
            }
            for (int i = 1; i < upTo; i++) {
                result[i] = result[i] * result[i - 1] % module;
            }
            return result;
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

    static class PrimeFastFourierTransform {
        private final long MOD;
        private final long root;
        private final long reverseRoot;
        private int rootPower;
        private long[] aa;
        private long[] bb;

        public PrimeFastFourierTransform(long MOD) {
            this.MOD = MOD;
            rootPower = 1;
            int pw = 0;
            while ((MOD - 1) % (2 * rootPower) == 0) {
                rootPower *= 2;
                pw++;
            }
            for (int i = 2; ; i++) {
                if (IntegerUtils.power(i, IntegerUtils.power(2, pw - 1, MOD - 1), MOD) != 1 &&
                        IntegerUtils.power(i, IntegerUtils.power(2, pw, MOD - 1), MOD) == 1) {
                    root = i;
                    reverseRoot = IntegerUtils.reverse(i, MOD);
                    break;
                }
            }
        }

        public void multiply(long[] result, long[] first, long[] second, int length) {
            int resultSize = Integer.highestOneBit(result.length - 1) << 2;
            resultSize = Math.max(resultSize, 4);
            if (aa == null || aa.length < resultSize) {
                aa = new long[resultSize];
                bb = new long[resultSize];
            }
            Arrays.fill(aa, 0, resultSize, 0);
            Arrays.fill(bb, 0, resultSize, 0);
            for (int i = 0; i < length; i++) {
                aa[i] = first[i];
            }
            for (int i = 0; i < length; i++) {
                bb[i] = second[i];
            }
            fft(aa, false, resultSize);
            if (first == second) {
                System.arraycopy(aa, 0, bb, 0, resultSize);
            } else {
                fft(bb, false, resultSize);
            }
            for (int i = 0; i < resultSize; i++) {
                aa[i] *= bb[i];
                aa[i] %= MOD;
            }
            fft(aa, true, resultSize);
            for (int i = 0; i < result.length; i++) {
                result[i] = aa[i] % MOD;
            }

        }

        public void power(long[] result, long[] arg, long exponent) {
            int resultSize = Integer.highestOneBit(result.length - 1) << 2;
            resultSize = Math.max(resultSize, 4);
            if (aa == null || aa.length < resultSize) {
                aa = new long[resultSize];
                bb = new long[resultSize];
            }
            Arrays.fill(aa, 0, resultSize, 0);
            for (int i = 0; i < result.length; i++) {
                aa[i] = arg[i];
            }
            fft(aa, false, resultSize);
            for (int i = 0; i < resultSize; i++) {
                aa[i] = IntegerUtils.power(aa[i], exponent, MOD);
            }
            fft(aa, true, resultSize);
            long delta = IntegerUtils.reverse(IntegerUtils.power(resultSize, exponent - 2, MOD), MOD);
            for (int i = 0; i < resultSize; i++) {
                aa[i] = aa[i] * delta % MOD;
            }
            for (int i = 0; i < result.length; i++) {
                result[i] = aa[i] % MOD;
            }
        }

        private void fft(long[] array, boolean invert, int size) {
            for (int i = 1, j = 0; i < size; ++i) {
                int bit = size >> 1;
                for (; j >= bit; bit >>= 1) {
                    j -= bit;
                }
                j += bit;
                if (i < j) {
                    long temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            for (int len = 2; len <= size; len <<= 1) {
                long wlen = invert ? reverseRoot : root;
                for (int i = len; i < rootPower; i <<= 1) {
                    wlen = wlen * wlen % MOD;
                }
                int half = len >> 1;
                for (int i = 0; i < size; i += len) {
                    long w = 1;
                    for (int j = 0; j < half; ++j) {
                        long u = array[i + j], v = array[i + j + half] * w % MOD;
                        array[i + j] = u + v < MOD ? u + v : u + v - MOD;
                        array[i + j + half] = u - v >= 0 ? u - v : u - v + MOD;
                        w = w * wlen % MOD;
                    }
                }
            }
            if (invert) {
                long reverseSize = IntegerUtils.reverse(size, MOD);
                for (int i = 0; i < size; ++i) {
                    array[i] = array[i] * reverseSize % MOD;
                }
            }
        }

    }

    static class MiscUtils {
        public static final int MODF = 998244353;

    }
}

