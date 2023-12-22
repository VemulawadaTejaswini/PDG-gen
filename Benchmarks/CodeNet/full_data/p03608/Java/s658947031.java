import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.io.Writer;
import java.io.OutputStreamWriter;
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
            int n = in.readInt();
            int m = in.readInt();
            int r = in.readInt();
            int[] rr = in.readIntArray(r);
            ArrayUtils.decreaseByOne(rr);
            WarshallFloyd wf = new WarshallFloyd(n);
            for (int i = 0; i < m; i++) {
                int a = in.readInt() - 1;
                int b = in.readInt() - 1;
                int c = in.readInt();
                wf.addUndirectedEdge(a, b, c);
            }

            int[][] dist = wf.getDist();
            long min = Long.MAX_VALUE;
            int[] arr = IntStream.range(0, r).toArray();
            do {
                long tmp = 0;
                for (int i = 0; i < r - 1; i++) {
                    tmp += dist[rr[arr[i]]][rr[arr[i + 1]]];
                }
                min = Math.min(min, tmp);
            } while (Permutation.next(arr));
            out.printLine(min);
        }

    }

    static class ArrayUtils {
        public static void decreaseByOne(int[] array) {
            int n = array.length;
            for (int i = 0; i < n; i++) {
                array[i]--;
            }
        }

    }

    static class WarshallFloyd {
        int n;
        int[][] dist;
        int INF = Integer.MAX_VALUE / 3;

        public WarshallFloyd(int[][] a) {
            n = a.length;
            dist = new int[n][];
            for (int i = 0; i < n; i++) {
                dist[i] = a[i].clone();
            }
        }

        public WarshallFloyd(int n) {
            this.n = n;
            dist = new int[n][n];
            for (int i = 0; i < n; i++) {
                Arrays.fill(dist[i], INF);
                dist[i][i] = 0;
            }
        }

        public void addUndirectedEdge(int from, int to, int cost) {
            dist[from][to] = cost;
            dist[to][from] = cost;
        }

        public int[][] getDist() {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        dist[j][k] = Math.min(dist[j][k], dist[j][i] + dist[i][k]);
                    }
                }
            }
            return dist;
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

    static class Permutation {
        public static boolean next(int[] a) {
            int n = a.length;

            int i = n - 1;
            while (i > 0 && a[i - 1] >= a[i]) i--;
            if (i <= 0) return false;

            int j = n - 1;
            while (a[j] <= a[i - 1]) j--;
            swap(a, i - 1, j);

            int k = n - 1;
            while (i < k) swap(a, i++, k--);

            return true;
        }

        private static void swap(int[] a, int i, int j) {
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
        }

    }
}

