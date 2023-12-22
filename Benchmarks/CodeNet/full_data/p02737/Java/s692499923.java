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
            CGiantGraph solver = new CGiantGraph();
            solver.solve(1, in, out);
            out.close();
        }
    }

    static class CGiantGraph {
        Modular mod = new Modular(998244353);
        IntegerVersionArray iva = new IntegerVersionArray(10000);

        public void solve(int testNumber, FastInput in, FastOutput out) {
            int n = in.readInt();
            Node[][] nodes = new Node[3][n];

            int sqrt = (int) Math.sqrt(2e5) + 1;
            int[][] sum = new int[3][sqrt + 1];

            int base = mod.valueOf((long) 1e18);
            CachedPow pow = new CachedPow(base, mod);


            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < n; j++) {
                    nodes[i][j] = new Node();
                    nodes[i][j].id = j + 1;
                }
                int m = in.readInt();
                for (int j = 0; j < m; j++) {
                    Node a = nodes[i][in.readInt() - 1];
                    Node b = nodes[i][in.readInt() - 1];
                    if (a.id > b.id) {
                        Node tmp = a;
                        a = b;
                        b = tmp;
                    }
                    a.next.add(b);
                }

                for (int j = 0; j < n; j++) {
                    dfsForSG(nodes[i][j]);
                }
                for (Node node : nodes[i]) {
                    sum[i][node.sg] = mod.plus(sum[i][node.sg], pow.pow(node.id));
                }
            }

            int ans = 0;
            for (int i = 0; i <= sqrt; i++) {
                for (int j = 0; j <= sqrt; j++) {
                    int k = i ^ j;
                    if (k > sqrt) {
                        continue;
                    }
                    int local = mod.mul(sum[0][i], mod.mul(sum[1][j], sum[2][k]));
                    ans = mod.plus(ans, local);
                }
            }

            out.println(ans);
        }

        public void dfsForSG(Node root) {
            if (root.visited) {
                return;
            }
            root.visited = true;
            for (Node node : root.next) {
                dfsForSG(node);
            }
            iva.clear();
            for (Node node : root.next) {
                iva.set(node.sg, 1);
            }
            while (iva.get(root.sg) == 1) {
                root.sg++;
            }
        }

    }

    static class Node {
        List<Node> next = new ArrayList<>();
        int sg;
        int id;
        boolean visited;

    }

    static class IntegerVersionArray {
        int[] data;
        int[] version;
        int now;
        int def;

        public IntegerVersionArray(int cap) {
            this(cap, 0);
        }

        public IntegerVersionArray(int cap, int def) {
            data = new int[cap];
            version = new int[cap];
            now = 0;
            this.def = def;
        }

        public void clear() {
            now++;
        }

        public void visit(int i) {
            if (version[i] < now) {
                version[i] = now;
                data[i] = def;
            }
        }

        public void set(int i, int v) {
            version[i] = now;
            data[i] = v;
        }

        public int get(int i) {
            visit(i);
            return data[i];
        }

    }

    static class CachedPow {
        private int[] first;
        private int[] second;
        private Modular mod;
        private Modular powMod;
        private static int step = 16;
        private static int limit = 1 << step;
        private static int mask = limit - 1;

        public CachedPow(int x, Modular mod) {
            this.mod = mod;
            this.powMod = mod.getModularForPowerComputation();
            first = new int[limit];
            second = new int[Integer.MAX_VALUE / limit + 1];
            first[0] = 1;
            for (int i = 1; i < first.length; i++) {
                first[i] = mod.mul(x, first[i - 1]);
            }
            second[0] = 1;
            int step = mod.mul(x, first[first.length - 1]);
            for (int i = 1; i < second.length; i++) {
                second[i] = mod.mul(second[i - 1], step);
            }
        }

        public int pow(int exp) {
            return mod.mul(first[exp & mask], second[exp >> step]);
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

        public Modular getModularForPowerComputation() {
            return new Modular(m - 1);
        }

        public String toString() {
            return "mod " + m;
        }

    }

    static class FastInput {
        private final InputStream is;
        private byte[] buf = new byte[1 << 20];
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
}

