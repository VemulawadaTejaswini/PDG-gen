import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
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
        ECoinsRespawn solver = new ECoinsRespawn();
        solver.solve(1, in, out);
        out.close();
    }

    static class ECoinsRespawn {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints(), p = in.ints();
            BellmanFord bf = new BellmanFord(n + 1);
            for (int i = 0; i < m; i++) {
                bf.addEdge(in.ints() - 1, in.ints() - 1, p - in.ints());
            }
            bf.addEdge(n - 1, n, 0);
            //try {
            out.ans(Math.max(0, -bf.shortestPath(0, n))).ln();
            //} catch (RuntimeException ex) {
            //    out.ans(-1).ln();
            //}
        }

    }

    static class BellmanFord {
        private final int nodes;
        private final List<BellmanFord.Edge> edges = new ArrayList<>();
        private long[] distance;

        public BellmanFord(int n) {
            nodes = n;
            distance = new long[n];
        }

        public void addEdge(int from, int to, int cost) {
            edges.add(new BellmanFord.Edge(from, to, cost));
        }

        public long shortestPath(int src, int dst) {
            Arrays.fill(distance, Long.MAX_VALUE);
            distance[src] = 0;
            for (int i = 0; i < 2 * nodes; i++) {
                boolean updated = false;
                for (BellmanFord.Edge e : edges) {
                    if (distance[e.from] < Long.MAX_VALUE && distance[e.to] > distance[e.from] + e.cost) {
                        updated = true;
                        distance[e.to] = distance[e.from] + e.cost;
                        if (i == nodes - 1 && e.to == dst) {
                            throw new RuntimeException("negative loop");
                        }
                    }
                }
                if (!updated) {
                    break;
                }
            }
            return distance[dst];
        }

        private static class Edge {
            int from;
            int to;
            long cost;

            Edge(int from, int to, long cost) {
                this.from = from;
                this.to = to;
                this.cost = cost;
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

