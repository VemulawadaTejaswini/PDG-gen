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
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int A = in.readInt();
            int B = in.readInt();
            int Q = in.readInt();
            long[] s = in.readLongArray(A);
            long[] t = in.readLongArray(B);
            long[] x = in.readLongArray(Q);

            for (int i = 0; i < Q; i++) {
                out.printLine(getAns(s, t, x[i]));
            }
        }

        public long getAns(long[] s, long[] t, long x) {
            long ans1 = 0;
            long ans2 = 0;

            long minDiff = Long.MAX_VALUE;
            int minIndex = Integer.MAX_VALUE;
            long current = x;
            if (current >= s[s.length - 1]) {
                minDiff = Math.abs(current - s[s.length - 1]);
                minIndex = s.length - 1;
            } else if (current <= s[0]) {
                minDiff = Math.abs(current - s[0]);
                minIndex = 0;
            } else {
                for (int i = 1; i < s.length; i++) {
                    if (current - s[i] < 0) {
                        if (Math.abs(current - s[i - 1]) > Math.abs(current - s[i])) {
                            minDiff = Math.abs(current - s[i]);
                            minIndex = i;
                        } else {
                            minDiff = Math.abs(current - s[i - 1]);
                            minIndex = i - 1;
                        }
                        break;
                    }
                }
            }
            current = s[minIndex];
            ans1 += minDiff;
            minDiff = Long.MAX_VALUE;
            minIndex = Integer.MAX_VALUE;
            if (current >= t[t.length - 1]) {
                minDiff = Math.abs(current - t[t.length - 1]);
                minIndex = t.length - 1;
            } else if (current <= t[0]) {
                minDiff = Math.abs(current - t[0]);
                minIndex = 0;
            } else {
                for (int i = 1; i < t.length; i++) {
                    if (current - t[i] < 0) {
                        if (Math.abs(current - t[i - 1]) > Math.abs(current - t[i])) {
                            minDiff = Math.abs(current - t[i]);
                            minIndex = i;
                        } else {
                            minDiff = Math.abs(current - t[i - 1]);
                            minIndex = i - 1;
                        }
                        break;
                    }
                }
            }
            ans1 += minDiff;

            minDiff = Long.MAX_VALUE;
            minIndex = Integer.MAX_VALUE;
            current = x;
            if (current >= t[t.length - 1]) {
                minDiff = Math.abs(current - t[t.length - 1]);
                minIndex = t.length - 1;
            } else if (current <= t[0]) {
                minDiff = Math.abs(current - t[0]);
                minIndex = 0;
            } else {
                for (int i = 1; i < t.length; i++) {
                    if (current - t[i] < 0) {
                        if (Math.abs(current - t[i - 1]) > Math.abs(current - t[i])) {
                            minDiff = Math.abs(current - t[i]);
                            minIndex = i;
                        } else {
                            minDiff = Math.abs(current - t[i - 1]);
                            minIndex = i - 1;
                        }
                        break;
                    }
                }
            }
            current = t[minIndex];
            ans2 += minDiff;
            minDiff = Long.MAX_VALUE;
            minIndex = Integer.MAX_VALUE;
            if (current >= s[s.length - 1]) {
                minDiff = Math.abs(current - s[s.length - 1]);
                minIndex = s.length - 1;
            } else if (current <= s[0]) {
                minDiff = Math.abs(current - s[0]);
                minIndex = 0;
            } else {
                for (int i = 1; i < s.length; i++) {
                    if (current - s[i] < 0) {
                        if (Math.abs(current - s[i - 1]) > Math.abs(current - s[i])) {
                            minDiff = Math.abs(current - s[i]);
                            minIndex = i;
                        } else {
                            minDiff = Math.abs(current - s[i - 1]);
                            minIndex = i - 1;
                        }
                        break;
                    }
                }
            }
            ans2 += minDiff;

            return Math.min(ans1, ans2);
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

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public long[] readLongArray(int size) {
            long[] array = new long[size];
            for (int i = 0; i < size; i++) {
                array[i] = readLong();
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

        public long readLong() {
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

