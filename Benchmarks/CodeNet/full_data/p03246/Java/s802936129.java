import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Map<Integer, Integer> m1 = new HashMap<>();
            for (int i = 0; i < n; i += 2) {
                m1.merge(a[i], 1, (x, y) -> x + y);
            }

            Map<Integer, Integer> m2 = new HashMap<>();
            for (int i = 1; i < n; i += 2) {
                m2.merge(a[i], 1, (x, y) -> x + y);
            }

            List<num> l1 = new ArrayList<>();
            for (int key : m1.keySet()) {
                l1.add(new num(key, m1.get(key)));
            }

            List<num> l2 = new ArrayList<>();
            for (int key : m2.keySet()) {
                l2.add(new num(key, m2.get(key)));
            }

            l1.sort((n1, n2) -> n2.cnt - n1.cnt);

            l2.sort((n1, n2) -> n2.cnt - n1.cnt);


            num num00 = l1.get(0);
            num num01 = l2.get(0);

            int ans = n - 1;
            if (num00.num != num01.num) {
                ans = n - num00.cnt - num01.cnt;
            } else {
                ans = Math.min(n - num00.cnt - (l2.size() >= 2 ? l2.get(1).cnt : 0), ans);
                ans = Math.min(ans, n - (l1.size() >= 2 ? l1.get(1).cnt : 0) - num01.cnt);
            }

            out.println(ans);
        }

        class num {
            int num;
            int cnt;

            public num(int num, int cnt) {
                this.num = num;
                this.cnt = cnt;
            }

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

        public int nextInt() {
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

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

