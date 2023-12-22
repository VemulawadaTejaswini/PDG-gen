import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
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
        FTreeAndConstraints solver = new FTreeAndConstraints();
        solver.solve(1, in, out);
        out.close();
    }

    static class FTreeAndConstraints {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            ModMath mod = new ModMath(MOD);
            FTreeAndConstraints.Node[] nodes = new FTreeAndConstraints.Node[n];
            for (int i = 0; i < n; i++) nodes[i] = new FTreeAndConstraints.Node(i);
            for (int i = 0; i < n - 1; i++) {
                int a = in.ints() - 1, b = in.ints() - 1;
                nodes[a].adj.add(new FTreeAndConstraints.Edge(i, nodes[b]));
                nodes[b].adj.add(new FTreeAndConstraints.Edge(i, nodes[a]));
            }
            int m = in.ints();
            long[] a = new long[m];
            for (int i = 0; i < m; i++) a[i] = nodes[in.ints() - 1].dfs(0, in.ints() - 1);
            long ans = 0;
            for (int i = 0; i < (1 << m); i++) {
                long s = (1L << (n - 1)) - 1;
                for (int j = 0; j < m; j++) if (((i >> j) & 1) == 1) s &= ~a[j];
                int free = Long.bitCount(s);
                if (Integer.bitCount(i) % 2 == 0) ans += 1L << free;
                else ans -= 1L << free;
            }
            out.ans(ans).ln();
        }

        private static class Node {
            int index;
            List<FTreeAndConstraints.Edge> adj = new ArrayList<>();

            Node(int index) {
                this.index = index;
            }

            long dfs(long path, int dest) {
                if (dest == this.index) return path;
                long res = 0;
                for (FTreeAndConstraints.Edge e : adj) {
                    if ((path & (1L << e.index)) != 0) continue;
                    res |= e.dest.dfs(path | (1L << e.index), dest);
                }
                return res;
            }

        }

        private static class Edge {
            int index;
            FTreeAndConstraints.Node dest;

            Edge(int index, FTreeAndConstraints.Node dest) {
                this.index = index;
                this.dest = dest;
            }

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

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod, boolean unsafe) {
        /*if (!unsafe && !IntMath.isPrime(mod)) {
            throw new RuntimeException("This class is designed for primes!");
        }*/
            this.mod = mod;
        }

        public ModMath(long mod) {
            this(mod, false);
        }

        public ModMath() {
            this(DEFAULT_MOD, true);
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
}

