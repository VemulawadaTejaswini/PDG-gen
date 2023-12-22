import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
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
        DFriendSuggestions solver = new DFriendSuggestions();
        solver.solve(1, in, out);
        out.close();
    }

    static class DFriendSuggestions {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints(), k = in.ints();
            IntUnionFind uf = new IntUnionFind(n);
            List<List<Integer>> friends = new ArrayList<>(n), blocked = new ArrayList<>(n);
            for (int i = 0; i < n; i++) {
                friends.add(new ArrayList<>());
                blocked.add(new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                uf.union(x, y);
                friends.get(x).add(y);
                friends.get(y).add(x);
            }
            for (int i = 0; i < k; i++) {
                int x = in.ints() - 1, y = in.ints() - 1;
                blocked.get(x).add(y);
                blocked.get(y).add(x);
            }
            for (int i = 0; i < n; i++) {
                int ans = uf.size(i) - friends.get(i).size() - 1;
                for (int block : blocked.get(i)) {
                    if (uf.find(block) == uf.find(i)) ans--;
                }
                out.ans(ans).ln();
            }
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

        public int size(int i) {
            return -nodes[find(i)];
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

        public LightWriter ans(int i) {
            return ans(Integer.toString(i));
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

