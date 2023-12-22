import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.BufferedWriter;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author gaidash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        COneStrokePath solver = new COneStrokePath();
        solver.solve(1, in, out);
        out.close();
    }

    static class COneStrokePath {
        private COneStrokePath.Vertex[] vs;
        private HashSet<COneStrokePath.Edge> allowed = new HashSet<>();

        private void dfs(int par, int v) {
            vs[v].visited = true;
            for (int next : vs[v].outgo) {
                if (next != par && !vs[next].visited) {
                    COneStrokePath.Edge edge = new COneStrokePath.Edge(v, next);
                    if (allowed.contains(edge)) {
                        allowed.remove(edge);
                        dfs(v, next);
                        break;
                    }
                }
            }
        }

        private boolean everythingVisited() {
            boolean ret = true;
            for (COneStrokePath.Vertex v : vs) {
                if (!v.visited) {
                    ret = false;
                }
                v.visited = false;
            }
            return ret;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int nVertices = in.nextInt();
            int nEdges = in.nextInt();
            vs = new COneStrokePath.Vertex[nVertices];
            for (int i = 0; i < nVertices; i++) {
                vs[i] = new COneStrokePath.Vertex();
            }
            COneStrokePath.Edge[] edges = new COneStrokePath.Edge[nEdges];
            for (int i = 0; i < nEdges; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                vs[u].outgo.add(v);
                vs[v].outgo.add(u);
                edges[i] = new COneStrokePath.Edge(u, v);
            }

            int ret = 0;
            outer:
            for (int mask = 1; mask < (1 << nEdges); mask++) {
                boolean[] all = new boolean[nVertices];
                for (int which = 0; which < nEdges; which++) {
                    if (((mask >> which) & 1) == 1) {
                        allowed.add(edges[which]);
                        all[edges[which].from] = all[edges[which].to] = true;
                    }
                }
                for (boolean b : all) {
                    if (!b) {
                        continue outer;
                    }
                }
                dfs(-1, 0);
                if (everythingVisited() && allowed.size() == 0) {
                    ret++;
                }
                allowed.clear();
            }

            out.println(ret);
        }

        private static class Vertex {
            private boolean visited;
            private ArrayList<Integer> outgo = new ArrayList<>();

        }

        private static class Edge {
            private int from;
            private int to;

            private Edge(int from, int to) {
                if (from > to) {
                    int t = from;
                    from = to;
                    to = t;
                }
                this.from = from;
                this.to = to;
            }

            public int hashCode() {
                return from * 31 + to;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null) {
                    return false;
                }
                if (getClass() != obj.getClass()) {
                    return false;
                }
                COneStrokePath.Edge other = (COneStrokePath.Edge) obj;
                return from == other.from && to == other.to;
            }

            public String toString() {
                return "(" + from + " -> " + to + ")";
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

        public void println(int i) {
            writer.println(i);
        }

    }
}

