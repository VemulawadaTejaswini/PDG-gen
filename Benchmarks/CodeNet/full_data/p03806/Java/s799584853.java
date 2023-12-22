import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
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
        DMixingExperiment solver = new DMixingExperiment();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMixingExperiment {
        private static int n;
        private static DMixingExperiment.Drug[] drugs;
        private static int[][] dp;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            n = in.ints();
            int ma = in.ints(), mb = in.ints();
            dp = new int[500][500];
            ArrayUtil.fill(dp, -1);
            dp[0][0] = 0;
            drugs = new DMixingExperiment.Drug[n];
            for (int i = 0; i < n; i++) {
                drugs[i] = new DMixingExperiment.Drug(in.ints(), in.ints(), in.ints());
            }

            int ans = Integer.MAX_VALUE;
            int na = ma, nb = mb;
            while (na < 500 && nb < 500) {
                //System.out.println(na + nb);
                int v = dfs(na, nb);
                if (v < Integer.MAX_VALUE) {
                    ans = Math.min(ans, v);
                }
                na += ma;
                nb += mb;
            }
            if (ans == Integer.MAX_VALUE) {
                out.ansln(-1);
            } else {
                out.ansln(ans);
            }
        }

        private static int dfs(int a, int b) {
            if (dp[a][b] >= 0) {
                return dp[a][b];
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (a - drugs[i].a < 0 || b - drugs[i].b < 0) {
                    continue;
                }
                int v = dfs(a - drugs[i].a, b - drugs[i].b);
                if (v == Integer.MAX_VALUE) continue;
                ans = Math.min(ans, v + drugs[i].c);
            }
            return dp[a][b] = ans;
        }

        private static class Drug {
            int a;
            int b;
            int c;

            public Drug(int a, int b, int c) {
                this.a = a;
                this.b = b;
                this.c = c;
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

        public LightWriter ansln(int... n) {
            for (int n1 : n) {
                ans(n1).ln();
            }
            return this;
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

