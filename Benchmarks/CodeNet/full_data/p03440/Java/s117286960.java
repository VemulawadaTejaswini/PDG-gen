import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.util.function.BiFunction;
import java.util.AbstractQueue;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.BinaryOperator;
import java.io.UncheckedIOException;
import java.util.AbstractCollection;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        LightScanner in = new LightScanner(inputStream);
        LightWriter out = new LightWriter(outputStream);
        DForest solver = new DForest();
        solver.solve(1, in, out);
        out.close();
    }

    static class DForest {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            DForest.Node[] nodes = new DForest.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new DForest.Node(in.ints());
            UnionFind<DForest.Node> uf = new UnionFind<>(nodes, DForest.Node::merge);
            for (int i = 0; i < m; i++) uf.union(in.ints(), in.ints());

            PriorityQueue<DForest.Node> q = new PriorityQueue<>(Comparator.comparing(DForest.Node::peek));
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (!nodes[i].isEmpty()) {
                    q.offer(nodes[i]);
                    count++;
                }
            }

            long cost = 0;
            while (count > 1) {
                if (q.size() < 2) {
                    out.ans("Impossible").ln();
                    return;
                }
                DForest.Node x = q.poll(), y = q.poll();
                cost += x.poll() + y.poll();
                DForest.Node z = x.merge(y);
                if (!z.isEmpty()) q.offer(z);
                count--;
            }
            out.ans(cost).ln();
        }

        private static class Node {
            final PriorityQueue<Integer> costs;

            Node(int a) {
                this.costs = new PriorityQueue<>();
                costs.add(a);
            }

            DForest.Node merge(DForest.Node other) {
                costs.addAll(other.costs);
                other.costs.clear();
                return this;
            }

            boolean isEmpty() {
                return costs.isEmpty();
            }

            int poll() {
                return costs.poll();
            }

            int peek() {
                return costs.peek();
            }

        }

    }

    static class UnionFind<T> {
        private final BinaryOperator<T> op;
        private final int[] groups;
        private final int[] rank;
        private final T[] meta;

        public UnionFind(T[] meta, BinaryOperator<T> op) {
            this.op = op;
            groups = IntStream.range(0, meta.length).toArray();
            rank = new int[meta.length];
            this.meta = meta;
        }

        public int find(int i) {
            int ans = groups[i];
            if (ans == i) {
                return i;
            } else {
                return groups[i] = find(ans);
            }
        }

        public boolean union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return false;
            } else if (rank[x] < rank[y]) {
                groups[x] = y;
                meta[y] = op.apply(meta[y], meta[x]);
            } else if (rank[x] == rank[y]) {
                rank[x]++;
                groups[y] = x;
                meta[x] = op.apply(meta[x], meta[y]);
            } else {
                groups[y] = x;
                meta[x] = op.apply(meta[x], meta[y]);
            }
            return true;
        }

    }

    static class LightScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ints() {
            return Integer.parseInt(string());
        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public LightWriter print(char c) {
            try {
                out.write(c);
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter print(String s) {
            try {
                out.write(s, 0, s.length());
                breaked = false;
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
            return this;
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
        }

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
        }

        public LightWriter ln() {
            print(System.lineSeparator());
            breaked = true;
            if (autoflush) {
                try {
                    out.flush();
                } catch (IOException ex) {
                    throw new UncheckedIOException(ex);
                }
            }
            return this;
        }

        public void close() {
            try {
                out.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }
}

