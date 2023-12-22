import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
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
        TaskE solver = new TaskE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE {
        long w;
        List<Edge>[] g;
        int[] depth;
        int[] par;
        long[] parW;
        boolean[][] used = new boolean[1000][1000];
        int cntW;
        int cntAny;
        MinValueCounter counter = new MinValueCounter();
        final int mod = (int) 1e9 + 7;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            long x = in.nextLong();
            Edge[] es = new Edge[m];

            for (int i = 0; i < es.length; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int w = in.nextInt();
                es[i] = new Edge(u, v, w, false);
            }
            Arrays.sort(es);

            UnionFind uf = new UnionFind(n);
            List<Long> costs = new ArrayList<>();
            long cost = 0;
            for (Edge e : es) {
                if (!uf.same(e.u, e.v)) {
                    uf.union(e.u, e.v);
                    cost += e.w;
                    costs.add(e.w);
                    e.used = true;
                }
            }

            if (cost > x) {
                out.println(0);
                return;
            }

            g = new List[n];
            for (int i = 0; i < n; i++) g[i] = new ArrayList<>();
            for (Edge e : es) {
                g[e.u].add(new Edge(e.u, e.v, e.w, e.used));
                g[e.v].add(new Edge(e.v, e.u, e.w, e.used));
            }

//        dump(cost, x);
//        w = x - cost + costs.get(costs.size() - 1);
            w = x - cost;
            long ww = w + costs.get(costs.size() - 1);
            if (Arrays.stream(es).allMatch(e -> !e.used || e.w == ww)) {
                cntW = (int) Arrays.stream(es).filter(e -> e.w == ww).count();
                long ans = (pow(2, cntW) - 2) % mod * pow(2, m - cntW) % mod;
                out.println(ans);
                return;
            }

            depth = new int[n];
            par = new int[n];
            parW = new long[n];
            Arrays.fill(depth, -1);
            dfs1(0, -1, 0);

            dfs(0, -1);
            long ans = 2 * (pow(2, cntW) - 1) % mod * pow(2, cntAny) % mod;
//        dump(cntW, cntAny, ans);
            out.println(ans);
        }

        void dfs1(int v, int p, int d) {
            if (depth[v] != -1) {
                return;
            }
            depth[v] = d;
            par[v] = p;
            for (Edge e : g[v]) {
                if (e.used && e.v != p) {
                    parW[e.v] = e.w;
                    dfs1(e.v, v, d + 1);
                }
            }
        }

        void dfs(int v, int p) {
            for (Edge e : g[v]) {
                if (used[e.u][e.v]) continue;
                used[e.u][e.v] = used[e.v][e.u] = true;

                MinValueCounter cnt = countMinWeight(e.u, e.v);
//            dump(e.u, e.v, e.w - cnt.val, w);
                if (e.w - cnt.val == w) {
                    cntW++;
                } else if (e.w - cnt.val > w) {
                    cntAny++;
                }

                if (e.used && e.v != p) {
                    dfs(e.v, v);
                }
            }
        }

        MinValueCounter countMinWeight(int u, int v) {
            counter.init();
            for (; depth[u] < depth[v]; v = par[v]) counter.update(parW[v]);
            for (; depth[u] > depth[v]; u = par[u]) counter.update(parW[u]);
            for (; u != v; u = par[u], v = par[v]) {
                counter.update(parW[v]);
                counter.update(parW[u]);
            }
            return counter;
        }

        long pow(int x, int y) {
            long res = 1;
            for (int i = 0; i < y; i++) res = res * x % mod;
            return res;
        }

        class MinValueCounter {
            long val;
            long sum;
            int count;

            void init() {
                val = Long.MIN_VALUE;
                sum = 0;
                count = 0;
            }

            void update(long w) {
                sum += w;
                if (val < w) {
                    val = w;
                    count = 1;
                } else if (val == w) {
                    count++;
                }
            }

        }

        class Edge implements Comparable<Edge> {
            final int u;
            final int v;
            final long w;
            boolean used;

            Edge(int u, int v, long w, boolean used) {
                this.u = u;
                this.v = v;
                this.w = w;
                this.used = used;
            }


            public int compareTo(Edge o) {
                return Long.compare(w, o.w);
            }

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

            public boolean same(int x, int y) {
                return root(x) == root(y);
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

        public long nextLong() {
            int len = 0;
            str[len++] = nextChar();
            len = reads(len, isSpace);
            int i = 0;
            long ret = 0;
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

