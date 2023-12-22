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

            PriorityQueue<Integer>[] que = new PriorityQueue[n];
            for (int i = 0; i < n; i++) {
                que[i] = new PriorityQueue<>();
            }
            for (int i = 0; i < n; i++) {
                que[uf.root(i)].add(a[i]);
            }

            PriorityQueue<PriorityQueue<Integer>> qq = new PriorityQueue<>((x, y) -> {
                if (x.size() == 1) return 1;
                if (y.size() == 1) return -1;
                return Integer.compare(x.peek(), y.peek());
            });

            for (int i = 0; i < n; i++) {
                if (que[i].size() > 1) {
                    qq.add(que[i]);
                }
            }

            long ans = 0;
            while (qq.size() > 1) {
                PriorityQueue<Integer> x = qq.poll();
                PriorityQueue<Integer> y = qq.poll();
                ans += x.poll() + y.poll();
                qq.add(merge(x, y));
            }

            int cnt1 = 0;
            long sum = 0;
            for (int i = 0; i < n; i++) {
                if (uf.size(i) == 1) {
                    cnt1++;
                    sum += a[i];
                }
            }

            if (qq.isEmpty()) {
                if (cnt1 > 2) {
                    out.println("Impossible");
                    return;
                }
                if (cnt1 == 2) {
                    ans += sum;
                }
            } else {
                if (qq.peek().size() < cnt1) {
                    out.println("Impossible");
                    return;
                }

                ans += sum;
                for (int i = 0; i < cnt1; i++) {
                    ans += qq.peek().poll();
                }
            }

            out.println(ans);
        }

        PriorityQueue<Integer> merge(PriorityQueue<Integer> a, PriorityQueue<Integer> b) {
            if (a.size() < b.size()) {
                b.addAll(a);
                a.clear();
                return b;
            } else {
                a.addAll(b);
                b.clear();
                return a;
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

