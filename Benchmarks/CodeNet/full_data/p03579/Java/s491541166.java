import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, MyInput in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            SimpleAdjListGraph g = new SimpleAdjListGraph(n);
            for (int i = 0; i < m; i++) {
                int a = in.nextInt() - 1;
                int b = in.nextInt() - 1;
                g.addEdge(a, b);
                g.addEdge(b, a);
            }
            int[] color = g.bipartite();
            long ans = 0;
            if (color == null) {
                ans = n * (n - 1L) / 2 - m;
            } else {
                long cnt = IntStream.of(color).sum();
                ans = cnt * (n - cnt) - m;
            }
            out.println(ans);
        }

    }

    static class SimpleAdjListGraph {
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

        int[] bipartite() {
            int[] color = new int[V];
            int[] st = new int[V];
            int sp = 0;
            st[sp++] = 0;
            Arrays.fill(color, -1);
            color[0] = 0;
            while (sp > 0) {
                int v = st[--sp];
                for (int e = head[v]; e != -1; e = next[e]) {
                    final int t = to[e];
                    if (color[t] == -1) {
                        st[sp++] = t;
                        color[t] = 1 ^ color[v];
                    }
                }
            }
            for (int v = 0; v < V; v++) {
                for (int e = head[v]; e != -1; e = next[e]) {
                    final int t = to[e];
                    if (color[v] == color[t]) {
                        return null;
                    }
                }
            }
            return color;
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

