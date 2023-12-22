import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedOutputStream;
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
        DChecker solver = new DChecker();
        solver.solve(1, in, out);
        out.close();
    }

    static class DChecker {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), k = in.ints();
            int[][] a = new int[k + 1][k + 1];
            int base = 0;
            for (int i = 0; i < n; i++) {
                int x = in.ints() % (2 * k), y = in.ints() % (2 * k), d = "B".equals(in.string()) ? 1 : -1;
                if (x >= k) {
                    x -= k;
                    d *= -1;
                }
                if (y >= k) {
                    y -= k;
                    d *= -1;
                }
                if (d == -1) base++;
                a[y + 1][x + 1] += d;
            }

            for (int i = 0; i < k; i++)
                for (int j = 0; j < k; j++)
                    a[i + 1][j + 1] += a[i][j + 1] + a[i + 1][j] - a[i][j];

            int ans = 0;
            for (int i = 0; i < k; i++) {
                for (int j = 0; j < k; j++) {
                    ans = Math.max(ans, a[i][j] + a[k][k] - a[i][k] - a[k][j] + a[i][j]);
                    ans = Math.max(ans, a[i][k] + a[k][j] - 2 * a[i][j]);
                }
            }
            out.ans(ans + base).ln();
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

