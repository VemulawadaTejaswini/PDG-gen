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
 * @author Egor Kulikov (egor@egork.net)
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] a = in.readIntArray(n);
            long[] sum = new long[1000001];
            for (int i : a) {
                for (int j = 1; j * j <= i; j++) {
                    if (i % j == 0) {
                        sum[j] += i;
                        if (j * j != i) {
                            sum[i / j] += i;
                        }
                    }
                }
            }
//        int[] divisor = generateDivisorTable(1000001);
            long[] reverse = IntegerUtils.generateReverse(1000001, MiscUtils.MODF);
            sum[1] %= MiscUtils.MODF;
            long answer = sum[1] * sum[1];
//        int[] done = new int[1000001];
            long[] f = new MultiplicativeFunction() {

                protected long value(long p, int exponent, long power) {
                    return -p + 1;
                }
            }.calculateUpTo(1000001);
            for (int i = 2; i <= 1000000; i++) {
                sum[i] %= MiscUtils.MODF;
//            if (sum[i] == 0) {
//                continue;
//            }
                long base = sum[i] * sum[i] % MiscUtils.MODF;
                answer += f[i] * reverse[i] % MiscUtils.MODF * base % MiscUtils.MODF;
/*            answer -= base;
            answer += base * reverse[i] % MODF;
            int current = i;
            while (current != 1) {
                int div = divisor[current];
                if (done[div] != i) {
                    done[div] = i;
                    answer += base;
                    answer -= base * reverse[i / div] % MODF;
                }
                current /= div;
            }*/
            }
            answer %= MiscUtils.MODF;
            answer -= sum[1];
            answer *= reverse[2];
            answer %= MiscUtils.MODF;
            if (answer < 0) {
                answer += MiscUtils.MODF;
            }
            out.printLine(answer);
        }

    }

    static class IntegerUtils {
        public static int[] generateDivisorTable(int upTo) {
            int[] divisor = new int[upTo];
            for (int i = 1; i < upTo; i++) {
                divisor[i] = i;
            }
            for (int i = 2; i * i < upTo; i++) {
                if (divisor[i] == i) {
                    for (int j = i * i; j < upTo; j += i) {
                        divisor[j] = i;
                    }
                }
            }
            return divisor;
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

    static abstract class MultiplicativeFunction {
        protected abstract long value(long p, int exponent, long power);

        public long[] calculateUpTo(int upTo) {
            int[] divisor = IntegerUtils.generateDivisorTable(upTo);
            long[] result = new long[upTo];
            if (upTo <= 1) {
                return result;
            }
            result[1] = 1;
            for (int i = 2; i < upTo; i++) {
                int iDivided = i;
                int exponent = 0;
                do {
                    iDivided /= divisor[i];
                    exponent++;
                } while (iDivided % divisor[i] == 0);
                result[i] = result[iDivided] * value(divisor[i], exponent, i / iDivided);
            }
            return result;
        }

    }

    static class MiscUtils {
        public static final int MODF = 998_244_353;

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

        public int[] readIntArray(int size) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = readInt();
            }
            return array;
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
}

