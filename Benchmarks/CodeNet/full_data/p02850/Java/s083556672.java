import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Collection;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.ArrayList;
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
        PrintWriter out = new PrintWriter(outputStream);
        DColoringEdgesOnTree solver = new DColoringEdgesOnTree();
        solver.solve(1, in, out);
        out.close();
    }

    static class DColoringEdgesOnTree {
        int MAXN = 200005;
        PrintWriter out;
        InputReader in;
        ArrayList<Edge>[] tree = new ArrayList[MAXN];
        TreeSet<Integer>[] is_there = new TreeSet[MAXN];
        int[] color = new int[MAXN];

        void bfs(int v) {
            Queue<Integer> qu = new LinkedList<>();
            qu.add(v);
            boolean[] vis = new boolean[MAXN];
            vis[v] = true;
            while (qu.size() > 0) {
                int curr = qu.poll();
                int hola = 1;
                for (Edge e : tree[curr]) {
                    int u = e.other(curr);
                    if (!vis[u]) {
                        while (is_there[curr].contains(hola))
                            hola++;
                        color[e.id] = hola;
                        is_there[u].add(color[curr]);
                        vis[u] = true;
                        qu.add(u);
                        hola++;
                    }
                }
            }
        }

        public void solve(int testNumber, InputReader in, PrintWriter out) {
            this.out = out;
            this.in = in;
            int n = ni();
            int i = 0;
            for (i = 0; i < n; i++) {
                tree[i] = new ArrayList<>();
                is_there[i] = new TreeSet<>();
            }
            int[] deg = new int[n];
            for (i = 0; i < n - 1; i++) {
                int u = ni() - 1;
                int v = ni() - 1;
                Edge e = new Edge(u, v, i);
                tree[u].add(e);
                tree[v].add(e);
                deg[u]++;
                deg[v]++;
            }
            int mx = 0, mx_ind = -1;
            for (i = 0; i < n; i++) {
                if (deg[i] > mx) {
                    mx = deg[i];
                    mx_ind = i;
                }
            }
            bfs(mx_ind);
            pn(mx);
            for (i = 0; i < n - 1; i++)
                pn(color[i]);
        }

        int ni() {
            return in.nextInt();
        }

        void pn(long zx) {
            out.println(zx);
        }

        class Edge {
            int u;
            int v;
            int id;

            Edge(int a, int b, int ind) {
                u = a;
                v = b;
                id = ind;
            }

            int other(int a) {
                return u ^ v ^ a;
            }

        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new UnknownError();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new UnknownError();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public String next() {
            int c = read();
            while (isSpaceChar(c)) {
                c = read();
            }
            StringBuffer res = new StringBuffer();
            do {
                res.appendCodePoint(c);
                c = read();
            } while (!isSpaceChar(c));

            return res.toString();
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }
}

