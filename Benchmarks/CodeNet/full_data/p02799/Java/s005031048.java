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
import java.util.Comparator;
import java.util.Collections;
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
        EBichromization solver = new EBichromization();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBichromization {
        boolean[] tree;
        boolean[] black;
        int[] w;
        int n;
        int m;
        int[] d;
        List<E>[] g;

        public void solve(int testNumber, MyInput in, PrintWriter out) {
            n = in.nextInt();
            m = in.nextInt();
            g = new List[n];
            for (int i = 0; i < n; i++) {
                g[i] = new ArrayList<>();
            }

            List<int[]> es = new ArrayList<>();
            d = in.nextIntArray(n);
            for (int i = 0; i < m; i++) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                g[u].add(new E(v, i));
                g[v].add(new E(u, i));
                es.add(new int[]{Math.max(d[u], d[v]), u, v, i});
                dump(i, m);
            }

            tree = new boolean[m];
            UnionFind uf = new UnionFind(n);
            Collections.sort(es, Comparator.comparingInt(x -> x[0]));
            for (int[] e : es) {
                if (!uf.same(e[1], e[2])) {
                    uf.union(e[1], e[2]);
                    tree[e[3]] = true;
                }
            }

            black = new boolean[n];
            w = new int[m];
            Arrays.fill(w, 1_000_000_000);
            dfs(0, -1, true);
            for (int v = 0; v < n; v++) {
                int min = Integer.MAX_VALUE;
                for (E e : g[v]) {
                    min = Math.min(min, w[e.idx]);
//                if (v < e.to)
//                dump(v, black[v], w[e.idx], v + 1, e.to + 1);
                }
                if (min != d[v]) {
                    out.println(-1);
                    return;
                }
            }
            for (int i = 0; i < n; i++) {
                if (black[i]) {
                    out.print('B');
                } else {
                    out.print('W');
                }
            }
            out.println();
            for (int ww : w) {
                out.println(ww);
            }
        }

        void dfs(int v, int p, boolean color) {
            black[v] = color;
            for (E e : g[v]) {
                if (e.to != p && tree[e.idx]) {
                    dfs(e.to, v, !color);
                    w[e.idx] = Math.max(d[v], d[e.to]);
                }
            }
        }

        static void dump(Object... o) {
            System.err.println(Arrays.deepToString(o));
        }

        class E {
            int to;
            int idx;

            E(int to, int idx) {
                this.to = to;
                this.idx = idx;
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

        public int[] nextIntArray(final int n) {
            final int[] res = new int[n];
            for (int i = 0; i < n; i++) {
                res[i] = nextInt();
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

