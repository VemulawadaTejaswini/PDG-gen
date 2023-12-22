import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import java.io.BufferedWriter;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
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
            int a = in.readInt();
            int b = in.readInt();
            int q = in.readInt();

            long[] s = in.readLongArray(a);
            long[] t = in.readLongArray(b);

            for (int i = 0; i < q; i++) {
                long x = in.readLong();

                List<Long> sList = new ArrayList<>();
                List<Long> tList = new ArrayList<>();
                int idx;
                idx = ArrayUtils.lowerBound(s, x);
                if (idx < a) sList.add(s[idx]);
                idx = ArrayUtils.upperBound(s, x);
                if (idx >= 0) sList.add(s[idx]);
                idx = ArrayUtils.lowerBound(t, x);
                if (idx < b) tList.add(t[idx]);
                idx = ArrayUtils.upperBound(t, x);
                if (idx >= 0) tList.add(t[idx]);

                long ans = Long.MAX_VALUE;
                for (int j = 0; j < sList.size(); j++) {
                    for (int k = 0; k < tList.size(); k++) {
                        ans = Math.min(ans, Math.abs(x - sList.get(j)) + Math.abs(sList.get(j) - tList.get(k)));
                        ans = Math.min(ans, Math.abs(x - tList.get(k)) + Math.abs(sList.get(j) - tList.get(k)));
                    }
                }
                out.printLine(ans);
            }
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

    static class ArrayUtils {
        public static int lowerBound(long[] a, long x) {
            int high = a.length;
            int low = -1;
            while (high - low > 1) {
                int mid = (high + low) / 2;
                if (a[mid] < x) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
            return high;
        }

        public static int upperBound(long[] a, long x) {
            int high = a.length;
            int low = -1;
            while (high - low > 1) {
                int mid = (high + low) / 2;
                if (a[mid] <= x) {
                    low = mid;
                } else {
                    high = mid;
                }
            }
            return low;
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
}

