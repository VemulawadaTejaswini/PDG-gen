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
 * Built using CHelper plug-in Actual solution is at the top
 * 
 * @author daltao
 */
public class Main {
    public static void main(String[] args) throws Exception {
        Thread thread = new Thread(null, new TaskAdapter(), "daltao", 1 << 27);
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
            SquaredGraph solver = new SquaredGraph();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class SquaredGraph {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();

            Node[] nodes = new Node[n + 1];
            for (int i = 1; i <= n; i++) {
                nodes[i] = new Node();
            }
            for (int i = 0; i < m; i++) {
                Node a = nodes[in.readInt()];
                Node b = nodes[in.readInt()];
                a.next.add(b);
                b.next.add(a);

                Node.merge(a, b);
            }

            int even = 0;
            int odd = 0;
            int single = 0;
            for (int i = 1; i <= n; i++) {
                if (nodes[i].find() != nodes[i]) {
                    continue;
                }
                if (paint(nodes[i], 0)) {
                    nodes[i].even = true;
                } else {
                    nodes[i].even = false;
                }
            }

            for (int i = 1; i <= n; i++) {
                nodes[i].find().size++;
            }

            for (int i = 1; i <= n; i++) {
                if (nodes[i].find() != nodes[i]) {
                    continue;
                }
                if (nodes[i].even) {
                    if (nodes[i].size == 1) {
                        single++;
                    } else {
                        even++;
                    }
                } else {
                    odd++;
                }
            }

            long ans = (long) even * even * 2 + (long) odd * odd + (long) even * odd * 2 + (long) single * single
                            + (long) single * (n - single) * 2;
            out.println(ans);

        }

        public boolean paint(Node root, int color) {
            if (root.visited) {
                return root.color == color;
            }
            root.visited = true;
            root.color = color;
            for (Node node : root.next) {
                if (!paint(node, 1 - color)) {
                    return false;
                }
            }
            return true;
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
        List<Node> next = new ArrayList<>();
        boolean visited;
        boolean even;
        int color;
        Node p = this;
        int size;
        int rank;

        public Node find() {
            return p.p == p ? p : (p = p.find());
        }

        public static void merge(Node a, Node b) {
            a = a.find();
            b = b.find();
            if (a == b) {
                return;
            }
            if (a.rank == b.rank) {
                a.rank++;
            }
            if (a.rank > b.rank) {
                b.p = a;
            } else {
                a.p = b;
            }
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

        public FastOutput println(long c) {
            cache.append(c).append('\n');
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

    }
}

