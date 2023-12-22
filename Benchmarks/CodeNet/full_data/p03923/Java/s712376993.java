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
import java.util.Comparator;
import java.util.TreeSet;
import java.io.InputStream;
/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }
    static class TaskE {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            long n = in.readLong();
            long a = in.readLong();
//        PriorityQueue<State> pq = new PriorityQueue<>(new Comparator<State>() {
//            @Override
//            public int compare(State o1, State o2) {
//                return Long.compare(o1.time, o2.time);
//            }
//        });
            TreeSet<State> pq = new TreeSet<>(new Comparator<State>() {
                public int compare(State a, State b) {
                    if (a.time != b.time) return Long.compare(a.time, b.time);
                    if (a.rate != b.rate) return Long.compare(a.rate, b.rate);
                    return Long.compare(a.cookies, b.cookies);
                }
            });
            pq.add(new State(0, 1, 0));
            while (!pq.isEmpty()) {
                State state = pq.pollFirst();
                if (state.cookies >= n) {
                    out.printLine(state.time);
                    return;
                }
                pq.add(new State(state.cookies + state.rate, state.rate, state.time + 1));
                pq.add(new State(0, state.cookies, state.time + a));
            }
        }
        class State {
            long cookies;
            long rate;
            long time;
            public State(long cookies, long rate, long time) {
                this.cookies = cookies;
                this.rate = rate;
                this.time = time;
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
        public void close() {
            writer.close();
        }
        public void printLine(long i) {
            writer.println(i);
        }
    }
}

