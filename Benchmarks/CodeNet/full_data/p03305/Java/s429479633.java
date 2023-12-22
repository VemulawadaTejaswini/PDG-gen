import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.AbstractCollection;
import java.util.List;
import java.io.BufferedReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt() - 1;
            int t = in.nextInt() - 1;

            Graph g1 = new Graph(n);
            Graph g2 = new Graph(n);

            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int a = in.nextInt();
                int b = in.nextInt();
                g1.addEdge(u, v, a, i);
                g1.addEdge(v, u, a, i);
                g2.addEdge(u, v, b, i);
                g2.addEdge(v, u, b, i);
            }

            long[] d1 = g1.dijkstra(s)[0];
            long[] d2 = g2.dijkstra(t)[0];
            long[] ans = new long[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                ans[i] = Math.max(1_000000000_000000L - (d1[i] + d2[i]), ans[i + 1]);
            }
            for (int i = 0; i < n; i++) {
                out.println(ans[i]);
            }
        }

        class Edge {
            public final int edgeId;
            public final int to;
            public long cost;

            public Edge(int to, long cost, int edgeId) {
                this.to = to;
                this.cost = cost;
                this.edgeId = edgeId;
            }


            public String toString() {
                return String.format("[Edge id=%d, to=%d, cost=%d]", edgeId, to, cost);
            }

        }

        class Vertex {
            public final int id;
            public final List<Edge> edges = new ArrayList<>();

            public Vertex(final int id) {
                this.id = id;
            }

            public void addEdge(Edge e) {
                edges.add(e);
            }

        }

        class Graph {
            int V;
            int E;
            Vertex[] vertex;

            public Graph(int V) {
                this.V = V;
                this.E = 0;
                vertex = new Vertex[V];
                for (int i = 0; i < V; i++) vertex[i] = new Vertex(i);
            }

            public void addEdge(int s, int t, long c, int edgeId) {
                vertex[s].addEdge(new Edge(t, c, edgeId));
            }

            public long[][] dijkstra(int r) {
                final int mod = (int) 1e9 + 7;

                long[] dist = new long[V];
                long[] cnt = new long[V];
                Arrays.fill(dist, Long.MAX_VALUE);
                dist[r] = 0;
                cnt[r] = 1;
                PriorityQueue<long[]> que = new PriorityQueue<>((a, b) -> Long.compare(a[0], b[0]));
                que.add(new long[]{0, r});
                while (!que.isEmpty()) {
                    long[] q = que.poll();
                    long d = q[0];
                    int v = (int) q[1];
                    if (d != dist[v]) continue;
                    for (Edge e : vertex[v].edges) {
                        if (dist[e.to] > d + e.cost) {
                            dist[e.to] = d + e.cost;
                            cnt[e.to] = 0;
                            que.add(new long[]{dist[e.to], e.to});
                        }
                        if (dist[e.to] == d + e.cost) {
                            cnt[e.to] += cnt[v];
                            if (cnt[e.to] >= mod) cnt[e.to] -= mod;
                        }
                    }
                }
                return new long[][]{dist, cnt};
            }

        }

    }

    static class MyInput {
        private final BufferedReader in;
        private static int pos;
        private static int readLen;
        private static final char[] buffer = new char[1024 * 8];
        private static char[] str = new char[500 * 8 * 2];
        private static boolean[] isDigit = new boolean[256];
        private static boolean[] isSpace = new boolean[256];
        private static boolean[] isLineSep = new boolean[256];

        static {
            for (int i = 0; i < 10; i++) {
                isDigit['0' + i] = true;
            }
            isDigit['-'] = true;
            isSpace[' '] = isSpace['\r'] = isSpace['\n'] = isSpace['\t'] = true;
            isLineSep['\r'] = isLineSep['\n'] = true;
        }

        public MyInput(InputStream is) {
            in = new BufferedReader(new InputStreamReader(is));
        }

        public int read() {
            if (pos >= readLen) {
                pos = 0;
                try {
                    readLen = in.read(buffer);
                } catch (IOException e) {
                    throw new RuntimeException();
                }
                if (readLen <= 0) {
                    throw new MyInput.EndOfFileRuntimeException();
                }
            }
            return buffer[pos++];
        }

        public int nextInt() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            int ret = 0;
            if (str[0] == '-') {
                i = 1;
            }
            for (; i < len; i++) ret = ret * 10 + str[i] - '0';
            if (str[0] == '-') {
                ret = -ret;
            }
            return ret;
        }

        public char nextChar() {
            while (true) {
                final int c = read();
                if (!isSpace[c]) {
                    return (char) c;
                }
            }
        }

        int reads(int len, boolean[] accept) {
            try {
                while (true) {
                    final int c = read();
                    if (accept[c]) {
                        break;
                    }
                    if (str.length == len) {
                        char[] rep = new char[str.length * 3 / 2];
                        System.arraycopy(str, 0, rep, 0, str.length);
                        str = rep;
                    }
                    str[len++] = (char) c;
                }
            } catch (MyInput.EndOfFileRuntimeException e) {
            }
            return len;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

