import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.SortedSet;
import java.io.BufferedWriter;
import java.util.Set;
import java.util.NavigableSet;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.TreeSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
            int[] l = new int[n];
            int[] r = new int[n];
            in.readIntArrays(l, r);
            long answer = 0;
            for (int i = 0; i < 2; i++) {
                long current = 0;
                int at = 0;
                NavigableSet<Integer> byLeft = new TreeSet<>((a, b) -> l[a] == l[b] ? a - b : l[b] - l[a]);
                NavigableSet<Integer> byRight = new TreeSet<>((a, b) -> r[b] == r[a] ? b - a : r[a] - r[b]);
                for (int j = 0; j < n; j++) {
                    byLeft.add(j);
                    byRight.add(j);
                }
                for (int j = 0; j < n; j++) {
                    int next;
                    if (j % 2 == 0) {
                        next = byLeft.first();
                    } else {
                        next = byRight.first();
                    }
                    byLeft.remove(next);
                    byRight.remove(next);
                    if (at < l[next]) {
                        current += l[next] - at;
                        at = l[next];
                    } else if (at > r[next]) {
                        current += at - r[next];
                        at = r[next];
                    }
                }
                current += Math.abs(at);
                answer = Math.max(answer, current);
                for (int j = 0; j < n; j++) {
                    int temp = l[j];
                    l[j] = -r[j];
                    r[j] = -temp;
                }
            }
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

        public void readIntArrays(int[]... arrays) {
            for (int i = 0; i < arrays[0].length; i++) {
                for (int j = 0; j < arrays.length; j++) {
                    arrays[j][i] = readInt();
                }
            }
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

