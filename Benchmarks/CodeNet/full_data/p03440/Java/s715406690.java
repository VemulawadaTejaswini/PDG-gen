import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStreamReader;
import java.util.AbstractCollection;
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
            int[] a = in.nextIntArray(n);
            UnionFind uf = new UnionFind(n);
            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                uf.union(x, y);
            }
            PriorityQueue<Long>[] que = new PriorityQueue[n];
            long[] ary = new long[n];
            for (int i = 0; i < n; i++) {
                que[i] = new PriorityQueue<>();
                ary[i] = Long.MAX_VALUE;
            }
            for (int i = 0; i < n; i++)
                if (uf.size(i) > 1) {
                    int r = uf.root(i);
                    que[r].add((long) a[i] << 32 | r);
                    ary[r] = Math.min(ary[r], que[r].peek());
                }
            Seg2 seg = new Seg2(n);
//        seg.init(ary);

            for (int i = 0; i < n; i++) {
                seg.set(i, ary[i]);
            }
//        for (int i = 0; i < n; i++) {
//            dump(i, seg.query(i, i));
//        }

            long ans = 0;
            while (true) {
                long min = seg.query(0, n);
                if (min == Long.MAX_VALUE) break;
                int idx = uf.root((int) (min & 0x7FFFFFFF));
                long next = Math.min(seg.query(0, idx), seg.query(idx + 1, n));
                if (next == Long.MAX_VALUE) break;
                ans += (min >>> 32) + (next >>> 32);
                int ni = uf.root((int) (next & 0x7FFFFFFF));
//            dump(idx, ni, seg.query(0, idx), seg.query(idx + 1, n));
//            for (int i = 0; i < n; i++) {
//                dump(i, seg.query(i, i + 1));
//            }
                que[idx].poll();
                que[ni].poll();
                if (que[idx].size() < que[ni].size()) {
                    que[ni].addAll(que[idx]);
                    que[idx].clear();
                } else {
                    que[idx].addAll(que[ni]);
                    que[ni].clear();
                }
                uf.union(idx, ni);
                if (uf.root(idx) == idx ^ que[ni].isEmpty()) {
                    PriorityQueue<Long> t = que[ni];
                    que[ni] = que[idx];
                    que[idx] = t;
                }
//            dump(idx, ni, uf.root(idx), que[idx].size(), que[ni].size());
                seg.set(idx, que[idx].isEmpty() ? Long.MAX_VALUE : que[idx].peek());
                seg.set(ni, que[ni].isEmpty() ? Long.MAX_VALUE : que[ni].peek());
            }

            for (int i = 0; i < n; i++)
                if (uf.size(i) == 1) {
                    int r = uf.root(i);
                    que[r].add((long) a[i] << 32 | r);
                }

            int mi = 0;
            for (int i = 0; i < n; i++) {
                if (que[i].size() > que[mi].size()) {
                    mi = i;
                }
            }

            for (int i = 0; i < n; i++) {
                if (uf.size(i) == 1 && mi != i) {
                    if (que[mi].isEmpty()) {
                        break;
                    }
                    ans += que[mi].poll() >>> 32;
                    ans += a[i];
                    uf.union(i, mi);
                }
            }

            if (uf.size(0) != n) {
                out.println("Impossible");
            } else {
                out.println(ans);
            }
        }

        class Seg2 {
            final int n;
            final long[] seg;

            public Seg2(final int n) {
                this.n = Integer.highestOneBit(n) << 1;
                seg = new long[this.n << 1];
                Arrays.fill(seg, Long.MAX_VALUE);
            }

            long query(int l, int r) {
                return query(l, r, 0, 0, n);
            }

            long query(int l, int r, int k, int curL, int curR) {
                if (curR <= l || curL >= r) return Long.MAX_VALUE;
                if (l <= curL && curR <= r) {
                    return seg[k];
                }
                final int curM = (curL + curR) / 2;
                return Math.min(
                        query(l, r, 2 * k + 1, curL, curM),
                        query(l, r, 2 * k + 2, curM, curR));
            }

            void set(int i, long v) {
                i += n - 1;
                seg[i] = v;
                while (i != 0) {
                    i = (i - 1) / 2;
                    seg[i] = Math.min(seg[2 * i + 1], seg[2 * i + 2]);
                }
            }

        }

        class UnionFind {
            private int[] data;

            public UnionFind(int size) {
                data = new int[size];
                clear();
            }

            public UnionFind(final UnionFind uf) {
                data = uf.data.clone();
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

            public int size(int x) {
                return -data[root(x)];
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

