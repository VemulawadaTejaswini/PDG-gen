import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        ETravelByCar solver = new ETravelByCar();
        solver.solve(1, in, out);
        out.close();
    }

    static class ETravelByCar {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int l = in.nextInt();

            Graph graph = new Graph(n);

            for (int i = 0; i < m; i++) {
                int s = in.nextInt() - 1;
                int t = in.nextInt() - 1;
                int c = in.nextInt();
                if (c <= l) {
                    graph.addEdge(s, t, c, i);
                    graph.addEdge(t, s, c, i);
                }
            }
//
//        PriorityQueue<Integer> que1 = new PriorityQueue<>();
//        que1.add(0);
//        que1.add(1);
//        dump(que1.poll());


            int[][] val = new int[n][];
            for (int i = 0; i < n; i++) {
                int[] cnt = new int[n];
                int[] fuel = new int[n];
                boolean[] visited = new boolean[n];
                Arrays.fill(cnt, 1 << 29);
                cnt[i] = 0;
                fuel[i] = l;
                for (int v = 0; v < n - 1; v++) {
                    int k = -1;
                    for (int j = 0; j < n; j++) {
                        if (visited[j]) continue;
                        if (k < 0 || cnt[j] < cnt[k] || cnt[j] == cnt[k] && fuel[j] > fuel[k]) {
                            k = j;
                        }
                    }
                    visited[k] = true;
                    for (Edge e : graph.vertex[k].edges) {
                        int j = e.to;
                        int c = cnt[k];
                        int f = (int) (fuel[k] - e.cost);
                        if (f < 0) {
                            c++;
                            f = (int) (l - e.cost);
                        }

                        if (cnt[j] > c || cnt[j] == c && fuel[j] < f) {
                            cnt[j] = c;
                            fuel[j] = f;
                        }
                    }
                }
                dump(cnt, fuel);
                val[i] = cnt;
            }

            int q = in.nextInt();
            while (q-- > 0) {
                int s = in.nextInt() - 1;
                int t = in.nextInt() - 1;
                if (val[s][t] >= 1 << 29) {
                    out.println(-1);
                } else {
                    out.println(val[s][t]);
                }
            }
        }

        static void dump(Object... o) {
            System.err.println(Arrays.deepToString(o));
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

