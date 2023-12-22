import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.IOException;
import java.util.TreeSet;
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
            BAvoidingCollision solver = new BAvoidingCollision();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class BAvoidingCollision {
        Modular mod = new Modular(1e9 + 7);
        long inf = (long) 1e18;
        Debug debug = new Debug(false);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            int m = in.readInt();

            Node[] nodes = new Node[n];

            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
            }

            Node s = nodes[in.readInt() - 1];
            Node t = nodes[in.readInt() - 1];

            Edge[] edges = new Edge[m];
            for (int i = 0; i < m; i++) {
                Edge e = new Edge();
                e.a = nodes[in.readInt() - 1];
                e.b = nodes[in.readInt() - 1];
                e.len = in.readInt();
                e.a.adj.add(e);
                e.b.adj.add(e);
                edges[i] = e;
            }

            dijkstra(nodes, s, 0);
            dijkstra(nodes, t, 1);

            long best = t.dists[0];
            int sum = 0;

            //vertex
            for (Node node : nodes) {
                if (node.dists[0] + node.dists[1] != best ||
                        node.dists[0] != node.dists[1]) {
                    continue;
                }
                int local = mod.mul(node.ways[0], node.ways[1]);
                local = mod.mul(local, local);
                sum = mod.plus(sum, local);
            }

            //edge
            for (Edge e : edges) {
                if (e.a.dists[0] > e.b.dists[0]) {
                    Node tmp = e.a;
                    e.a = e.b;
                    e.b = tmp;
                }

                if (e.a.dists[0] + e.b.dists[1] + e.len != best) {
                    continue;
                }

                if (e.a.dists[0] >= e.b.dists[1] + e.len || e.b.dists[1] >= e.a.dists[0] + e.len) {
                    continue;
                }
                int local = mod.mul(e.a.ways[0], e.b.ways[1]);
                local = mod.mul(local, local);
                sum = mod.plus(sum, local);
            }

            int ans = mod.mul(t.ways[0], s.ways[1]);
            debug.debug("ans", ans);
            debug.debug("sum", sum);
            ans = mod.subtract(ans, sum);


            out.println(ans);
        }

        public void dijkstra(Node[] nodes, Node s, int i) {
            for (Node node : nodes) {
                node.ways[i] = 0;
                node.dists[i] = inf;
            }
            s.dists[i] = 0;
            s.ways[i] = 1;
            TreeSet<Node> pq = new TreeSet<>((a, b) -> a.dists[i] == b.dists[i] ? Integer.compare(a.id, b.id) : Long.compare(a.dists[i], b.dists[i]));

            pq.add(s);
            while (!pq.isEmpty()) {
                Node top = pq.pollFirst();
                for (Edge e : top.adj) {
                    Node node = e.other(top);
                    long newDist = top.dists[i] + e.len;
                    if (newDist < node.dists[i]) {
                        pq.remove(node);
                        node.ways[i] = 0;
                        node.dists[i] = newDist;
                        pq.add(node);
                    }
                    if (newDist == node.dists[i]) {
                        node.ways[i] = mod.plus(node.ways[i], top.ways[i]);
                    }
                }
            }
        }

    }

    static class Modular {
        int m;

        public Modular(int m) {
            this.m = m;
        }

        public Modular(long m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public Modular(double m) {
            this.m = (int) m;
            if (this.m != m) {
                throw new IllegalArgumentException();
            }
        }

        public int valueOf(int x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return x;
        }

        public int valueOf(long x) {
            x %= m;
            if (x < 0) {
                x += m;
            }
            return (int) x;
        }

        public int mul(int x, int y) {
            return valueOf((long) x * y);
        }

        public int plus(int x, int y) {
            return valueOf(x + y);
        }

        public int subtract(int x, int y) {
            return valueOf(x - y);
        }

        public String toString() {
            return "mod " + m;
        }

    }

    static class Debug {
        private boolean offline;
        private PrintStream out = System.err;

        public Debug(boolean enable) {
            offline = enable && System.getSecurityManager() == null;
        }

        public Debug debug(String name, int x) {
            if (offline) {
                debug(name, "" + x);
            }
            return this;
        }

        public Debug debug(String name, String x) {
            if (offline) {
                out.printf("%s=%s", name, x);
                out.println();
            }
            return this;
        }

    }

    static class Node {
        int id;
        List<Edge> adj = new ArrayList<>();
        long[] dists = new long[2];
        int[] ways = new int[2];

        public String toString() {
            return "" + (id + 1);
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

        public FastOutput append(int c) {
            cache.append(c);
            return this;
        }

        public FastOutput println(int c) {
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

    static class Edge {
        Node a;
        Node b;
        long len;

        public Node other(Node x) {
            return x == a ? b : a;
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
}