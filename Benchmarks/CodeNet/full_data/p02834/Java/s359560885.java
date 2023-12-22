import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        FPlayingTagOnTree solver = new FPlayingTagOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class FPlayingTagOnTree {
        public void solve(int testNumber, FastReader sc, PrintWriter out) {
            int n = Integer.parseInt(sc.next());
            int a = Integer.parseInt(sc.next()) - 1;
            int b = Integer.parseInt(sc.next()) - 1;

            Dijkstra dij = new Dijkstra(n);

            for (int i = 0; i < n - 1; i++) {
                int u = Integer.parseInt(sc.next()) - 1;
                int v = Integer.parseInt(sc.next()) - 1;
                dij.addEdge(u, v, 1);
            }

            long[] adist = dij.dijkstra(a);
            long[] bdist = dij.dijkstra(b);

            long firstDist = adist[b];

            long max = 0;
            for (int i = 0; i < n; i++) {
                if (adist[i] < bdist[i]) {
                    max = Math.max(max, bdist[i]);
                }
            }

            out.println(Math.max(max - 1, firstDist / 2));
        }

        class Dijkstra {
            public final long INF = (long) 1e18;
            private int n;
            private List<Edge>[] edge;

            public Dijkstra(int n) {
                this.n = n;
                edge = new List[n];
                for (int i = 0; i < n; i++) {
                    edge[i] = new ArrayList<>();
                }
            }

            public void addEdge(int from, int to, int cost) {
                edge[from].add(new Edge(from, to, cost));
                edge[to].add(new Edge(to, from, cost));
            }

            public long[] dijkstra(int from) {
                long[] dist = new long[n];
                Arrays.fill(dist, INF);
                dist[from] = 0;

                PriorityQueue<Vertex> q = new PriorityQueue<>();
                q.add(new Vertex(from, 0));
                while (q.size() != 0) {
                    int u = q.poll().ver;

                    for (Edge ne : edge[u]) {
                        int v = ne.to;
                        long weight = ne.cost;
                        if (dist[v] > dist[u] + weight) {
                            dist[v] = dist[u] + weight;
                            q.add(new Vertex(v, dist[v]));
                        }
                    }
                }

                return dist;
            }

        }

        class Edge implements Comparable<Edge> {
            public int from = 0;
            public int to = 0;
            public int cost = 0;

            public Edge(int from, int to, int cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
            }

            public int compareTo(Edge o) {
                return this.cost - o.cost;
            }

        }

        class Vertex implements Comparable<Vertex> {
            public int ver = 0;
            public long cost = 0;

            public Vertex(int ver, long cost) {
                this.ver = ver;
                this.cost = cost;
            }

            public int compareTo(Vertex o) {
                long tmp = this.cost - o.cost;
                if (tmp == 0) return 0;
                return (int) (tmp / Math.abs(tmp));
            }

        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private FastReader.SpaceCharFilter filter;

        public FastReader(InputStream stream) {
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

        public String nextString() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuilder res = new StringBuilder();
            do {
                if (Character.isValidCodePoint(c)) {
                    res.appendCodePoint(c);
                }
                c = read();
            } while (!isSpaceChar(c));
            return res.toString();
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

        public String next() {
            return nextString();
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }
}

