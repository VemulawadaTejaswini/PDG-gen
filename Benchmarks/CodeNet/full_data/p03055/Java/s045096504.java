import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.List;
import java.util.stream.Stream;
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
        CRemovingCoins solver = new CRemovingCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class CRemovingCoins {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            out.setBoolLabel(LightWriter.BoolLabel.FIRST_SECOND_FIRST_UP);
            int n = in.ints();
            CRemovingCoins.Node[] nodes = IntStream.range(0, n).mapToObj(CRemovingCoins.Node::new).toArray(CRemovingCoins.Node[]::new);
            for (int i = 1; i < n; i++) {
                int a = in.ints() - 1, b = in.ints() - 1;
                nodes[a].neg.add(nodes[b]);
                nodes[b].neg.add(nodes[a]);
            }

            nodes[0].dfs(null, 0);
            CRemovingCoins.Node maxNode = null;
            for (int i = 0; i < n; i++) {
                if (maxNode == null || nodes[i].d > maxNode.d) {
                    maxNode = nodes[i];
                }
            }

            maxNode.dfs(null, 1);
            int len = 0;
            for (int i = 0; i < n; i++) {
                len = Math.max(len, nodes[i].d);
            }
            out.ans(len % 3 != 2).ln();
        }

        private static class Node {
            private final int index;
            private final List<CRemovingCoins.Node> neg = new ArrayList<>();
            private int d = 0;

            public Node(int index) {
                this.index = index;
            }

            private void dfs(CRemovingCoins.Node parent, int depth) {
                for (CRemovingCoins.Node n : neg) {
                    if (n == parent) continue;
                    n.dfs(this, depth + 1);
                }
                d = depth;
            }

        }

    }

    static class LightWriter implements AutoCloseable {
        private final Writer out;
        private boolean autoflush = false;
        private boolean breaked = true;
        private LightWriter.BoolLabel boolLabel = LightWriter.BoolLabel.YES_NO_FIRST_UP;

        public LightWriter(Writer out) {
            this.out = out;
        }

        public LightWriter(OutputStream out) {
            this(new BufferedWriter(new OutputStreamWriter(out, Charset.defaultCharset())));
        }

        public void setBoolLabel(LightWriter.BoolLabel label) {
            this.boolLabel = Objects.requireNonNull(label);
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

        public LightWriter ans(boolean b) {
            return ans(boolLabel.transfer(b));
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

        public enum BoolLabel {
            YES_NO_FIRST_UP("Yes", "No"),
            YES_NO_ALL_UP("YES", "NO"),
            YES_NO_ALL_DOWN("yes", "no"),
            POSSIBLE_IMPOSSIBLE_FIRST_UP("Possible", "Impossible"),
            POSSIBLE_IMPOSSIBLE_ALL_UP("POSSIBLE", "IMPOSSIBLE"),
            POSSIBLE_IMPOSSIBLE_ALL_DOWN("possible", "impossible"),
            FIRST_SECOND_FIRST_UP("First", "Second"),
            ;
            private final String positive;
            private final String negative;

            BoolLabel(String positive, String negative) {
                this.positive = positive;
                this.negative = negative;
            }

            private String transfer(boolean f) {
                return f ? positive : negative;
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
}

