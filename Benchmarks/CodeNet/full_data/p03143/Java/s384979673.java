import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Set;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.io.BufferedReader;
import java.util.Comparator;
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
        EWeightsOnVerticesAndEdges solver = new EWeightsOnVerticesAndEdges();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWeightsOnVerticesAndEdges {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int[] x = in.nextIntArray(n);
            int[][] es = in.nextIntArray2D(m, 3);
            Arrays.sort(es, Comparator.comparingInt(e -> e[2]));
            EWeightsOnVerticesAndEdges.S[] set = new EWeightsOnVerticesAndEdges.S[n];
            for (int i = 0; i < n; i++) {
                set[i] = new EWeightsOnVerticesAndEdges.S(x[i]);
            }
            UnionFind uf = new UnionFind(n);
            int idx = 0;
            for (int[] e : es) {
                int a = uf.root(--e[0]);
                int b = uf.root(--e[1]);
                uf.union(a, b);
                int c = uf.root(a);
                set[c] = EWeightsOnVerticesAndEdges.S.merge(set[a], set[b], idx++);
                if (set[c].sum >= e[2]) {
                    set[c].es.clear();
                }
            }
            out.println(set[uf.root(0)].es.size());
        }

        static class S {
            Set<Integer> es = new HashSet<>();
            long sum;

            S(int v) {
                sum += v;
            }

            static EWeightsOnVerticesAndEdges.S merge(EWeightsOnVerticesAndEdges.S a, EWeightsOnVerticesAndEdges.S b, int idx) {
                if (a != b) {
                    if (a.es.size() < b.es.size()) {
                        EWeightsOnVerticesAndEdges.S tmp = a;
                        a = b;
                        b = tmp;
                    }
                    a.sum += b.sum;
                    a.es.addAll(b.es);
                }
                a.es.add(idx);
                return a;
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

        public int[][] nextIntArray2D(final int n, final int k) {
            final int[][] res = new int[n][];
            for (int i = 0; i < n; i++) {
                res[i] = nextIntArray(k);
            }
            return res;
        }

        static class EndOfFileRuntimeException extends RuntimeException {
        }

    }
}

