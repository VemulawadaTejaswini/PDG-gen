import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Pradyumn
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            List<Integer>[] g = new List[n];
            for (int i = 0; i < n; ++i) g[i] = new ArrayList<>();
            DJSet ds = new DJSet(n);
            for (int i = 0; i < m; ++i) {
                int u = in.nextInt() - 1;
                int v = in.nextInt() - 1;
                int d = in.nextInt();
                g[u].add(v);
                g[u].add(d);
                g[v].add(u);
                g[v].add(d);
                ds.union(u, v);
            }
            boolean exist = true;
            for (int i = 0; i < n; ++i) if (ds.upper[i] < 0) exist &= Dijkstra(g, i);
            out.println(exist ? "Yes" : "No");
        }

        public static boolean Dijkstra(List<Integer>[] g, int from) {
            int n = g.length;
            long[] totalDistance = new long[n];
            long oo = Long.MAX_VALUE >> 1;
            ArrayUtils.fill(totalDistance, oo);
            boolean[] visited = new boolean[n];
            boolean flag = true;
            MinHeapL q = new MinHeapL(n);
            q.add(from, 0);
            totalDistance[from] = 0;
            while (q.size() > 0) {
                int cur = q.argmin();
                q.remove(cur);
                visited[cur] = true;
                for (int i = 0; i < g[cur].size(); i += 2) {
                    int next = g[cur].get(i);
                    int w = g[cur].get(i + 1);
                    long nd = totalDistance[cur] + w;

                    if (totalDistance[next] != oo && nd > totalDistance[next] && !visited[next]) flag = false;
                    if (nd < totalDistance[next]) {
                        if (totalDistance[next] != oo) flag = false;
                        totalDistance[next] = nd;
                        q.update(next, nd);
                    }
                }
            }
            return flag;
        }

    }

    static class DJSet {
        public int[] upper;

        public DJSet(int n) {
            upper = new int[n];
            Arrays.fill(upper, -1);
        }

        public int root(int x) {
            return upper[x] < 0 ? x : (upper[x] = root(upper[x]));
        }

        public boolean union(int x, int y) {
            x = root(x);
            y = root(y);
            if (x != y) {
                if (upper[y] < upper[x]) {
                    int d = x;
                    x = y;
                    y = d;
                }
                upper[x] += upper[y];
                upper[y] = x;
                return true;
            }
            return false;
        }

    }

    static class FastReader {
        private InputStream stream;
        private byte[] buf = new byte[8192];
        private int curChar;
        private int pnumChars;

        public FastReader(InputStream stream) {
            this.stream = stream;
        }

        private int pread() {
            if (pnumChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= pnumChars) {
                curChar = 0;
                try {
                    pnumChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (pnumChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = pread();
            while (isSpaceChar(c))
                c = pread();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = pread();
            }
            int res = 0;
            do {
                if (c == ',') {
                    c = pread();
                }
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                res *= 10;
                res += c - '0';
                c = pread();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        private boolean isSpaceChar(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

    }

    static class MinHeapL {
        public long[] a;
        public int[] map;
        public int[] imap;
        public int n;
        public int pos;
        public static long INF = Long.MAX_VALUE;

        public MinHeapL(int m) {
            n = Integer.highestOneBit((m + 1) << 1);
            a = new long[n];
            map = new int[n];
            imap = new int[n];
            Arrays.fill(a, INF);
            Arrays.fill(map, -1);
            Arrays.fill(imap, -1);
            pos = 1;
        }

        public long add(int ind, long x) {
            int ret = imap[ind];
            if (imap[ind] < 0) {
                a[pos] = x;
                map[pos] = ind;
                imap[ind] = pos;
                pos++;
                up(pos - 1);
            }
            return ret != -1 ? a[ret] : x;
        }

        public long update(int ind, long x) {
            int ret = imap[ind];
            if (imap[ind] < 0) {
                a[pos] = x;
                map[pos] = ind;
                imap[ind] = pos;
                pos++;
                up(pos - 1);
            } else {
                a[ret] = x;
                up(ret);
                down(ret);
            }
            return x;
        }

        public long remove(int ind) {
            if (pos == 1) return INF;
            if (imap[ind] == -1) return INF;

            pos--;
            int rem = imap[ind];
            long ret = a[rem];
            map[rem] = map[pos];
            imap[map[pos]] = rem;
            imap[ind] = -1;
            a[rem] = a[pos];
            a[pos] = INF;
            map[pos] = -1;

            up(rem);
            down(rem);
            return ret;
        }

        public int argmin() {
            return map[1];
        }

        public int size() {
            return pos - 1;
        }

        private void up(int cur) {
            for (int c = cur, p = c >>> 1; p >= 1 && a[p] > a[c]; c >>>= 1, p >>>= 1) {
                long d = a[p];
                a[p] = a[c];
                a[c] = d;
                int e = imap[map[p]];
                imap[map[p]] = imap[map[c]];
                imap[map[c]] = e;
                e = map[p];
                map[p] = map[c];
                map[c] = e;
            }
        }

        private void down(int cur) {
            for (int c = cur; 2 * c < pos; ) {
                int b = a[2 * c] < a[2 * c + 1] ? 2 * c : 2 * c + 1;
                if (a[b] < a[c]) {
                    long d = a[c];
                    a[c] = a[b];
                    a[b] = d;
                    int e = imap[map[c]];
                    imap[map[c]] = imap[map[b]];
                    imap[map[b]] = e;
                    e = map[c];
                    map[c] = map[b];
                    map[b] = e;
                    c = b;
                } else {
                    break;
                }
            }
        }

    }

    static class ArrayUtils {
        public static void fill(long[] array, long value) {
            Arrays.fill(array, value);
        }

    }
}

