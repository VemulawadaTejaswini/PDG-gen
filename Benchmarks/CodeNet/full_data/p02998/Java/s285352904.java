import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.Set;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.util.ArrayDeque;
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
        FMustBeRectangular solver = new FMustBeRectangular();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMustBeRectangular {
        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.readInt();
            int[] x = new int[n];
            int[] y = new int[n];

            int idxX = 0;
            int idxY = 0;
            Map<Integer, Integer> mapX = new TreeMap<>();
            Map<Integer, Integer> mapY = new TreeMap<>();
            for (int i = 0; i < n; i++) {
                int xx = in.readInt();
                int yy = in.readInt();
                if (!mapX.containsKey(xx)) mapX.put(xx, idxX++);
                if (!mapY.containsKey(yy)) mapY.put(yy, idxY++);
                x[i] = mapX.get(xx);
                y[i] = mapY.get(yy);
            }
            int l = mapX.size();
            int m = mapY.size();
            for (int i = 0; i < n; i++) {
                y[i] += l;
            }

            Graph g = new Graph(l + m);
            for (int i = 0; i < n; i++) {
                g.addUndirectedEdge(x[i], y[i]);
            }

            long ans = 0;
            boolean[] used = new boolean[l + m];
            for (int i = 0; i < l; i++) {
                if (used[i]) continue;
                Queue<Integer> q = new ArrayDeque<>();
                q.add(i);
                long xCnt = 0;
                long yCnt = 0;
                long edgeCnt = 0;
                while (!q.isEmpty()) {
                    int from = q.poll();
                    if (used[from]) continue;
                    used[from] = true;
                    if (from < l) {
                        xCnt++;
                    } else {
                        yCnt++;
                    }
                    edgeCnt += g.get(from).size();
                    q.addAll(g.get(from));
                }
                ans += xCnt * yCnt - edgeCnt / 2;
            }

            out.printLine(ans);
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

    static class Graph {
        private int n;
        private List<Set<Integer>> g;

        public Graph(int n) {
            this.n = n;
            g = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                g.add(new HashSet<>());
            }
        }

        public void addUndirectedEdge(int from, int to) {
            g.get(from).add(to);
            g.get(to).add(from);
        }

        public Set<Integer> get(int from) {
            return g.get(from);
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

