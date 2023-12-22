import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.TreeMap;
import java.io.BufferedWriter;
import java.util.Map;
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
        BDoNotDuplicate solver = new BDoNotDuplicate();
        solver.solve(1, in, out);
        out.close();
    }

    static class BDoNotDuplicate {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            long k = in.readLong();

            int[] a = in.readIntArray(n);
            int[] b = new int[2 * n];
            for (int i = 0; i < n; i++) {
                b[i] = b[n + i] = a[i];
            }

            int[] next = new int[n];
            int[] add = new int[n];
            int[] prev = new int[200005];
            for (int i = 2 * n - 1; i >= 0; i--) {
                if (i < n) {
                    int tmp = prev[b[i]];
                    if (tmp >= n) {
                        add[i] = 1;
                        tmp -= n;
                    }
                    next[i] = (tmp + 1) % n;
                }
                prev[b[i]] = i;
            }

            long cnt = 0;
            int now = 0;
            do {
                cnt += add[now];
                now = next[now];
                if (next[now] == 0) cnt++;
            } while (now != 0);

            k %= cnt;
            if (k == 0) {
                return;
            }

            while (k > 1) {
                k -= add[now];
                now = next[now];
                if (next[now] == 0) k--;
            }

            int[] stack = new int[n];
            int size = 0;
            Map<Integer, Integer> cnt2 = new TreeMap<>();
            for (int i = now; i < n; i++) {
                if (!cnt2.containsKey(a[i]) || cnt2.get(a[i]) == 0) {
                    stack[size++] = a[i];
                    cnt2.put(a[i], 1);
                } else {
                    while (stack[size - 1] != a[i]) {
                        cnt2.put(stack[size - 1], 0);
                        size--;
                    }
                    cnt2.put(a[i], 0);
                    size--;
                }
            }
            for (int i = 0; i < size; i++) {
                if (i > 0) out.print(" ");
                out.print(stack[i]);
            }
            out.printLine();
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

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void print(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
        }

        public void printLine() {
            writer.println();
        }

        public void close() {
            writer.close();
        }

        public void print(int i) {
            writer.print(i);
        }

    }
}

