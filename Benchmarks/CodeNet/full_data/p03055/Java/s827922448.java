import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.Reader;
import java.io.InputStreamReader;
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
        CRemovingCoins solver = new CRemovingCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemovingCoins {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            SimpleAdjListGraph g = new SimpleAdjListGraph(n);
            for (int i = 0; i < n - 1; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g.addEdge(a, b);
                g.addEdge(b, a);
            }
            int d = g.farthestVertexPairOnTree()[2] + 1;
            boolean[] win = new boolean[d + 2];
            win[0] = false;
            win[1] = true;
            win[2] = false;
            for (int i = 3; i <= d; i++) {
                win[i] = !win[i - 1] || !win[i - 2];
            }
            out.println(win[d] ? "First" : "Second");
        }

        class SimpleAdjListGraph {
            int m;
            int V;
            int E;
            int[] head;
            int[] next;
            int[] to;

            public SimpleAdjListGraph(int V) {
                this.V = V;
                this.E = V;
                head = new int[V];
                next = new int[E];
                to = new int[E];
                clear();
            }

            public void clear() {
                m = 0;
                Arrays.fill(head, -1);
            }

            public void addEdge(int s, int t) {
                if (m == next.length) {
                    int[] tmp = new int[Math.max(next.length + 5, next.length * 3 / 2)];
                    System.arraycopy(next, 0, tmp, 0, next.length);
                    next = tmp.clone();
                    System.arraycopy(to, 0, tmp, 0, to.length);
                    to = tmp;
                }

                next[m] = head[s];
                head[s] = m;
                to[m++] = t;
            }

            int farthestVertex(final int[] dist) {
                int ret = 0;
                for (int i = 0; i < dist.length; i++) {
                    if (dist[ret] < dist[i]) {
                        ret = i;
                    }
                }
                return ret;
            }

            int[] farthestVertexPairOnTree() {
                final int[][] dist = new int[3][];
                dist[0] = bfs(0)[0];
                final int v0 = farthestVertex(dist[0]);
                dist[1] = bfs(v0)[0];
                final int v1 = farthestVertex(dist[1]);
                return new int[]{v0, v1, dist[1][v1]};
            }

            public int[][] bfs(final int src) {
                final int[] dist = new int[head.length];
                final int[] prev = new int[head.length];
                final int[] q = new int[2 * head.length + 10];
                int s = 0, t = 0;

                Arrays.fill(dist, -1);
                Arrays.fill(prev, -1);
                dist[src] = 0;
                q[t++] = src;
                while (s != t) {
                    final int v = q[s++];
                    for (int e = head[v]; e != -1; e = next[e]) {
                        final int u = to[e];
                        if (dist[u] == -1) {
                            dist[u] = dist[v] + 1;
                            prev[u] = v;
                            q[t++] = u;
                        }
                    }
                }
                return new int[][]{dist, prev};
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

