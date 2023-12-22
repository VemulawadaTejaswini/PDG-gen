import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.AbstractQueue;
import java.util.HashMap;
import java.io.BufferedOutputStream;
import java.util.AbstractCollection;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.util.Map;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.io.Writer;
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
            int n = in.ints(), m = in.ints();
            long[] a = in.longs(n);
            IntUnionFind uf = new IntUnionFind(n);
            for (int i = 0; i < m; i++) uf.union(in.ints(), in.ints());
            Map<Integer, PriorityQueue<Long>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int gr = uf.find(i);
                if (!map.containsKey(gr)) map.put(gr, new PriorityQueue<>());
                map.get(gr).offer(a[i]);
            }
            PriorityQueue<PriorityQueue<Long>> pq = new PriorityQueue<>(Comparator.comparing(PriorityQueue::peek));
            pq.addAll(map.values());
            long ans = 0;
            for (int i = m + 1; i < n; i++) {
                if (pq.size() < 2) {
                    out.ans("Impossible");
                    return;
                }
                PriorityQueue<Long> x = pq.poll(), y = pq.poll();
                ans += x.poll() + y.poll();
                if (x.isEmpty()) {
                    if (!y.isEmpty()) pq.offer(y);
                } else if (y.isEmpty()) {
                    pq.offer(x);
                } else {
                    if (x.size() > y.size()) {
                        x.addAll(y);
                        pq.offer(x);
                    } else {
                        y.addAll(x);
                        pq.offer(y);
                    }
                }
            }
            out.ans(ans).ln();
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
            this(new OutputStreamWriter(new BufferedOutputStream(out), Charset.defaultCharset()));
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

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }

    static final class IntUnionFind {
        private int groups;
        private final int[] nodes;
        private final int[] rank;

        public IntUnionFind(int n) {
            groups = n;
            nodes = new int[n];
            Arrays.fill(nodes, -1);
            rank = new int[n];
        }

        public int find(int i) {
            int ans = nodes[i];
            if (ans < 0) {
                return i;
            } else {
                return nodes[i] = find(ans);
            }
        }

        public boolean union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return false;
            } else if (rank[x] < rank[y]) {
                nodes[y] += nodes[x];
                nodes[x] = y;
            } else if (rank[x] == rank[y]) {
                rank[x]++;
                nodes[x] += nodes[y];
                nodes[y] = x;
            } else {
                nodes[x] += nodes[y];
                nodes[y] = x;
            }
            groups--;
            return true;
        }

    }
}

