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
import java.util.Comparator;
import java.util.TreeSet;
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
        ERoadwork solver = new ERoadwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class ERoadwork {
        public static int INF = 1 << 29;

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt(), q = in.nextInt();
            ERoadwork.Event[] es = new ERoadwork.Event[2 * n];
            int[] s = new int[n], t = new int[n], x = new int[n];
            for (int i = 0; i < n; i++) {
                s[i] = 2 * in.nextInt();
                t[i] = 2 * in.nextInt();
                x[i] = 2 * in.nextInt();
                es[2 * i] = new ERoadwork.Event(s[i] - x[i] - 1, i, +1);
                es[2 * i + 1] = new ERoadwork.Event(t[i] - x[i] - 1, i, -1);
            }
            Arrays.sort(es, Comparator.comparingInt(y -> y.time));
            ERoadwork.Query[] qs = new ERoadwork.Query[q];
            for (int i = 0; i < q; i++) {
                qs[i] = new ERoadwork.Query(2 * in.nextInt(), i);
            }
            Arrays.sort(qs, Comparator.comparingInt(y -> y.time));
            int[] ans = new int[q];
            int ptr = 0;
            TreeSet<Integer> ts = new TreeSet<>(Comparator.comparingLong(y -> 1L * x[y] * n + y));
            for (int i = 0; i < q; i++) {
                while (ptr < es.length && es[ptr].time < qs[i].time) {
                    if (es[ptr].type == +1) ts.add(es[ptr].idx);
                    else ts.remove(es[ptr].idx);
                    ptr++;
                }
                if (ts.size() == 0) ans[i] = INF;
                else ans[i] = x[ts.first()];
            }

            for (int i = 0; i < q; i++) {
                if (ans[i] == INF) ans[i] = -1;
                else ans[i] /= 2;
            }

            out.println(ans);

        }

        static class Event {
            public int time;
            public int idx;
            public int type;

            public Event(int time, int idx, int type) {
                this.time = time;
                this.idx = idx;
                this.type = type;
            }

        }

        static class Query {
            public int time;
            public int idx;

            public Query(int time, int idx) {
                this.time = time;
                this.idx = idx;
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

        public void print(int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(array[i]);
            }
        }

        public void println(int[] array) {
            print(array);
            writer.println();
        }

        public void close() {
            writer.close();
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

        public static boolean isSpaceChar(int c) {
            return c == 32 || c == 10 || c == 13 || c == 9 || c == -1;
        }

    }
}

