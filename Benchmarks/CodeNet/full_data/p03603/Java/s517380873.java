import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.io.Closeable;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 29);
        thread.start();
        thread.join();
    }

    static class TaskAdapter implements Runnable {
        @Override
        public void run() {
            InputStream inputStream = System.in;
            OutputStream outputStream = System.out;
            FastInput in = new FastInput(inputStream);
            FastOutput out = new FastOutput(outputStream);
            EBichromeTree solver = new EBichromeTree();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EBichromeTree {
        boolean valid = true;
        int[] last = new int[5001];
        int[] next = new int[5001];
        int inf = (int) 1e9;

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 1; i < n; i++) {
                Node p = nodes[in.readInt() - 1];
                p.adj.add(nodes[i]);
            }
            for (int i = 0; i < n; i++) {
                nodes[i].x = in.readInt();
            }

            dfs(nodes[0]);
            out.println(valid ? "POSSIBLE" : "IMPOSSIBLE");
        }

        public void dfs(Node root) {
            for (Node node : root.adj) {
                dfs(node);
            }
            Arrays.fill(last, inf);
            last[0] = 0;
            for (Node node : root.adj) {
                Arrays.fill(next, inf);
                for (int i = 0; i <= root.x; i++) {
                    if (node.x + i <= root.x) {
                        next[node.x + i] = Math.min(next[node.x + i], last[i] + node.y);
                    }
                    if (node.y + i <= root.x) {
                        next[node.y + i] = Math.min(next[node.y + i], last[i] + node.x);
                    }
                }
                int[] tmp = last;
                last = next;
                next = tmp;
            }
            for (int i = 1; i <= root.x; i++) {
                last[i] = Math.min(last[i], last[i - 1]);
            }
            if (last[root.x] >= inf) {
                valid = false;
            }
            root.y = last[root.x];
        }

    }

    static class FastOutput implements AutoCloseable, Closeable, Appendable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

        public FastOutput append(CharSequence csq) {
            cache.append(csq);
            return this;
        }

        public FastOutput append(CharSequence csq, int start, int end) {
            cache.append(csq, start, end);
            return this;
        }

        public FastOutput(Writer os) {
            this.os = os;
        }

        public FastOutput(OutputStream os) {
            this(new OutputStreamWriter(os));
        }

        public FastOutput append(char c) {
            cache.append(c);
            return this;
        }

        public FastOutput append(String c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(String c) {
            return append(c).println();
        }

        public FastOutput println() {
            cache.append(System.lineSeparator());
            return this;
        }

        public FastOutput flush() {
            try {
                os.append(cache);
                os.flush();
                cache.setLength(0);
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
            return this;
        }

        public void close() {
            flush();
            try {
                os.close();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }
        }

        public String toString() {
            return cache.toString();
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 13];
        private int bufLen;
        private int bufOffset;
        private int next;

        public FastInput(InputStream is) {
            this.is = is;
        }

        private int read() {
            while (bufLen == bufOffset) {
                bufOffset = 0;
                try {
                    bufLen = is.read(buf);
                } catch (IOException e) {
                    bufLen = -1;
                }
                if (bufLen == -1) {
                    return -1;
                }
            }
            return buf[bufOffset++];
        }

        public void skipBlank() {
            while (next >= 0 && next <= 32) {
                next = read();
            }
        }

        public int readInt() {
            int sign = 1;

            skipBlank();
            if (next == '+' || next == '-') {
                sign = next == '+' ? 1 : -1;
                next = read();
            }

            int val = 0;
            if (sign == 1) {
                while (next >= '0' && next <= '9') {
                    val = val * 10 + next - '0';
                    next = read();
                }
            } else {
                while (next >= '0' && next <= '9') {
                    val = val * 10 - next + '0';
                    next = read();
                }
            }

            return val;
        }

    }

    static class Node {
        List<Node> adj = new ArrayList<>();
        int x;
        int y;

    }
}

