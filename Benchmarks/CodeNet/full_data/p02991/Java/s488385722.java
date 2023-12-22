import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Collection;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
        EHopscotchAddict solver = new EHopscotchAddict();
        solver.solve(1, in, out);
        out.close();
    }

    static class EHopscotchAddict {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints(), m = in.ints();
            EHopscotchAddict.Node[] nodes = new EHopscotchAddict.Node[n];
            for (int i = 0; i < n; i++) {
                nodes[i] = new EHopscotchAddict.Node(i);
            }
            for (int i = 0; i < m; i++) {
                nodes[in.ints() - 1].neg.add(nodes[in.ints() - 1]);
            }
            int s = in.ints() - 1, t = in.ints() - 1;

            int[][] dp = new int[3][n];
            ArrayUtil.fill(dp, -1);
            Queue<EHopscotchAddict.Cur> q = new ArrayDeque<>();
            q.offer(new EHopscotchAddict.Cur(nodes[s], 0));
            dp[0][s] = 0;
            while (!q.isEmpty()) {
                EHopscotchAddict.Cur cur = q.poll();
                int ns = (cur.step + 1) % 3;
                for (EHopscotchAddict.Node next : cur.node.neg) {
                    if (dp[ns][next.index] >= 0) continue;
                    dp[ns][next.index] = dp[cur.step][cur.node.index] + (ns == 0 ? 1 : 0);
                    q.offer(new EHopscotchAddict.Cur(next, ns));
                }
            }
            out.ans(dp[0][t]).ln();
        }

        private static class Cur {
            EHopscotchAddict.Node node;
            int step;

            Cur(EHopscotchAddict.Node node, int step) {
                this.node = node;
                this.step = step;
            }

        }

        private static class Node {
            int index;
            List<EHopscotchAddict.Node> neg = new ArrayList<>();

            Node(int index) {
                this.index = index;
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

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(int[] a, int v) {
            Arrays.fill(a, v);
        }

        public static void fill(int[][] a, int v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }
}

