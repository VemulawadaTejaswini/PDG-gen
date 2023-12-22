import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.io.UncheckedIOException;
import java.util.List;
import java.util.stream.Stream;
import java.util.Map;
import java.io.Closeable;
import java.io.Writer;
import java.util.Map.Entry;
import java.util.Optional;
import java.io.OutputStreamWriter;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in Actual solution is at the top
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
            TaskD solver = new TaskD();
            solver.solve(1, in, out);
            out.close();
        }
    }
    static class TaskD {
        public void solve(int testNumber, FastInput in, FastOutput out) {
            NumberTheory.Modular mod = new NumberTheory.Modular(1e9 + 7);
            NumberTheory.Factorial fact = new NumberTheory.Factorial(200000, mod);
            int n = in.readInt();
            int x = in.readInt();
            int y = in.readInt();

            if (n == 1) {
                out.println(1);
                return;
            }

            Node[] nodes = new Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new Node();
                nodes[i].id = i;
                nodes[i].c = in.readInt();
                nodes[i].w = in.readInt();
                nodes[i].colorCnts.put(nodes[i].c, 1);
            }

            Node min = CompareUtils.minOf(nodes, 0, n - 1, (a, b) -> Integer.compare(a.w, b.w));
            Node second = Arrays.stream(nodes).filter((a) -> a.c != min.c).min((a, b) -> Integer.compare(a.w, b.w))
                            .orElse(min);


            Map<Integer, List<Node>> map = Arrays.stream(nodes).collect(Collectors.groupingBy(a -> a.c));
            for (List<Node> nodeList : map.values()) {
                nodeList.sort((a, b) -> Integer.compare(a.w, b.w));
                Node head = nodeList.get(0);
                for (Node node : nodeList) {
                    if (head.w + node.w <= x) {
                        Node.merge(node, head);
                    }
                    if (node.c != min.c && node.w + min.w <= y) {
                        Node.merge(node, min);
                    }
                    if (node.c != second.c && node.w + second.w <= y) {
                        Node.merge(node, second);
                    }
                }
            }

            int ans = 1;
            for (Node node : nodes) {
                if (node.find() != node) {
                    continue;
                }
                int local = fact.fact(node.size);
                for (int cnt : node.colorCnts.values()) {
                    local = mod.mul(local, fact.invFact(cnt));
                }
                ans = mod.mul(ans, local);
            }

            out.println(ans);
        }

    }
    static class Node {
        int c;
        int w;
        Node p = this;
        int size = 1;
        int rank;
        int id;
        Map<Integer, Integer> colorCnts = new HashMap<>(1);

        public String toString() {
            return "" + id;
        }

        public Node find() {
            return p.p == p ? p : (p = p.find());
        }

        static void merge(Node a, Node b) {
            a = a.find();
            b = b.find();
            if (a == b) {
                return;
            }
            if (a.rank == b.rank) {
                a.rank++;
            }
            if (a.rank < b.rank) {
                Node tmp = a;
                a = b;
                b = tmp;
            }
            b.p = a;
            a.size += b.size;
            a.colorCnts = CollectionUtils.mergeCountMapHeuristically(a.colorCnts, b.colorCnts);
        }

    }
    static class CollectionUtils {
        public static <K, T extends Map<K, Integer>> Map<K, Integer> mergeCountMapHeuristically(T a, T b) {
            if (a.size() < b.size()) {
                T tmp = a;
                a = b;
                b = tmp;
            }
            for (Map.Entry<K, Integer> kv : b.entrySet()) {
                a.put(kv.getKey(), a.getOrDefault(kv.getKey(), 0) + kv.getValue());
            }
            return a;
        }

    }
    static class NumberTheory {
        public static class Modular {
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

            public String toString() {
                return "mod " + m;
            }

        }

        public static class InverseNumber {
            int[] inv;

            public InverseNumber(int[] inv, int limit, NumberTheory.Modular modular) {
                this.inv = inv;
                inv[1] = 1;
                int p = modular.m;
                for (int i = 2; i <= limit; i++) {
                    int k = p / i;
                    int r = p % i;
                    inv[i] = modular.mul(-k, inv[r]);
                }
            }

            public InverseNumber(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], limit, modular);
            }

        }

        public static class Factorial {
            int[] fact;
            int[] inv;
            NumberTheory.Modular modular;

            public Factorial(int[] fact, int[] inv, NumberTheory.InverseNumber in, int limit,
                            NumberTheory.Modular modular) {
                this.modular = modular;
                this.fact = fact;
                this.inv = inv;
                fact[0] = inv[0] = 1;
                for (int i = 1; i <= limit; i++) {
                    fact[i] = modular.mul(fact[i - 1], i);
                    inv[i] = modular.mul(inv[i - 1], in.inv[i]);
                }
            }

            public Factorial(int limit, NumberTheory.Modular modular) {
                this(new int[limit + 1], new int[limit + 1], new NumberTheory.InverseNumber(limit, modular), limit,
                                modular);
            }

            public int fact(int n) {
                return fact[n];
            }

            public int invFact(int n) {
                return inv[n];
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

        public FastOutput println(int c) {
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

        public String toString() {
            return cache.toString();
        }

    }
    static class CompareUtils {
        private CompareUtils() {}

        public static <T> T minOf(T[] a, int l, int r, Comparator<T> comp) {
            T x = a[l];
            for (int i = l; i <= r; i++) {

                x = min(x, a[i], comp);
            }
            return x;
        }

        public static <T> T min(T a, T b, Comparator<T> comp) {
            return comp.compare(a, b) <= 0 ? a : b;
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

