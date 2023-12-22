import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.TreeSet;
import java.util.Stack;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.io.BufferedReader;
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
        MyInput in = new MyInput(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CThreeCircuits solver = new CThreeCircuits();
        solver.solve(1, in, out);
        out.close();
    }

    static class CThreeCircuits {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] deg = new int[n];
            List<Integer>[] gg = new List[n];
            SimpleAdjListGraph g = new SimpleAdjListGraph(n, m * 2);
            List<int[]> es = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                gg[i] = new ArrayList<>();
            }
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                es.add(new int[]{a, b});
                deg[a]++;
                deg[b]++;
                gg[a].add(b);
                gg[b].add(a);
            }

            Queue<Integer> q = new ArrayDeque<>();
            for (int i = 0; i < n; i++) {
                if (deg[i] == 1) {
                    q.add(i);
                }
            }
            while (!q.isEmpty()) {
                int v = q.poll();
                deg[v] = 0;
                for (int t : gg[v]) {
                    if (--deg[t] == 0) {
                        q.add(t);
                    }
                }
            }

            for (int[] e : es) {
                if (deg[e[0]] > 0 && deg[e[1]] > 0) {
                    g.addEdge(e[0], e[1]);
                    g.addEdge(e[1], e[0]);
                }
            }

            List<Integer> art = new ArrayList<>();
            g.articulationPoint(art);
            Set<Integer> a = new TreeSet<>(art);
            UnionFind uf = new UnionFind(n);
            for (int[] e : es) {
                if (a.contains(e[0]) || a.contains(e[1])) {
                    continue;
                }
                uf.union(e[0], e[1]);
            }
            int cnt = 0;
            for (int i = 0; i < n; i++) {
                if (deg[i] <= 0) continue;
                if (i == uf.root(i)) cnt++;
            }

            out.println(cnt >= 3 ? "Yes" : "No");
        }

        class UnionFind {
            private int[] data;

            public UnionFind(int size) {
                data = new int[size];
                clear();
            }

            public void clear() {
                Arrays.fill(data, -1);
            }

            public int root(int x) {
                return data[x] < 0 ? x : (data[x] = root(data[x]));
            }

            public void union(int x, int y) {
                if ((x = root(x)) != (y = root(y))) {
                    if (data[y] < data[x]) {
                        final int t = x;
                        x = y;
                        y = t;
                    }
                    data[x] += data[y];
                    data[y] = x;
                }
            }

        }

        class SimpleAdjListGraph {
            int m;
            int V;
            int E;
            int[] head;
            int[] next;
            int[] from;
            int[] to;
            int time;

            public SimpleAdjListGraph(int V, int E) {
                this.V = V;
                this.E = E;
                head = new int[V];
                next = new int[E];
                from = new int[E];
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
                from[m] = s;
                to[m++] = t;
            }

            void articulationPoint(List<Integer> art) {
                final int n = head.length;
                final int[] low = new int[n];
                final int[] num = new int[n];
                Stack<Integer> s = new Stack<Integer>();
                for (int i = 0; i < n; i++)
                    if (num[i] == 0) {
                        time = 0;
                        visitArticulationPoint(i, -1, art, s, num, low);
                    }
            }

            private void visitArticulationPoint(int v, int u, List<Integer> art, Stack<Integer> s, final int[] num, final int[] low) {
                low[v] = num[v] = ++time;
                for (int e = head[v]; e != -1; e = next[e]) {
                    int w = to[e];
                    if (num[w] < num[v]) {
                        s.push(e);
                    }
                    if (num[w] != 0) {
                        low[v] = Math.min(low[v], num[w]);
                    } else {
                        visitArticulationPoint(w, v, art, s, num, low);
                        low[v] = Math.min(low[v], low[w]);
                        if (num[v] == 1 && num[w] != 2 || num[v] != 1 && low[w] >= num[v]) {
                            art.add(v);
                        }
                    }
                }
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

