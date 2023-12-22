import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        Thread thread = new Thread(null, new TaskAdapter(), "", 1 << 27);
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
            EBichromization solver = new EBichromization();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class EBichromization {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
                nodes[i].d = in.readInt();
            }
            List<Edge> edges = new ArrayList<>(m);
            for (int i = 0; i < m; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                Edge e = new Edge();
                e.a = a;
                e.b = b;
                edges.add(e);

                if (a.d <= b.d) {
                    b.satisfy = true;
                }
                if (b.d <= a.d) {
                    a.satisfy = true;
                }
            }

            for (int i = 1; i <= n; i++) {
                if (!nodes[i].satisfy) {
                    out.println(-1);
                    return;
                }
            }

            List<Edge> sorted = new ArrayList<>(edges);
            sorted.sort((a, b) -> (a.a.d + a.b.d) - (b.a.d + b.b.d));
            for (Edge e : sorted) {
                if (e.a.color != -1 && e.b.color != -1) {
                    e.len = (int) 1e9;
                } else {
                    if (e.a.color != -1) {
                        e.b.color = 1 - e.a.color;
                    } else if (e.b.color != -1) {
                        e.a.color = 1 - e.b.color;
                    } else {
                        e.a.color = 0;
                        e.b.color = 1;
                    }
                    e.len = Math.max(e.a.d, e.b.d);
                }
            }

            for (int i = 1; i <= n; i++) {
                out.append(nodes[i].color == 0 ? 'W' : 'B');
            }
            out.println();
            for (Edge e : edges) {
                out.println(e.len);
            }
        }

    }

    static class Edge {
        Node a;
        Node b;
        int len = -1;

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

    static class FastOutput implements AutoCloseable, Closeable {
        private StringBuilder cache = new StringBuilder(10 << 20);
        private final Writer os;

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

        public FastOutput println(int c) {
            cache.append(c);
            println();
            return this;
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

    static class Node {
        int color = -1;
        int d;
        boolean satisfy;

    }
}

