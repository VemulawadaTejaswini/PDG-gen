import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        CStrawberryCakes solver = new CStrawberryCakes();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrawberryCakes {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int h = in.ints(), w = in.ints(), k = in.ints();
            char[][] s = new char[h][];
            int min = h;
            for (int i = 0; i < h; i++) {
                s[i] = in.string().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (s[i][j] == '#') min = Math.min(min, i);
                }
            }
            int[][] ans = new int[h][w];
            int cur = 0;
            for (int i = min; i < h; i++) {
                int last = -1;
                for (int j = w - 1; j >= 0; j--) {
                    if (s[i][j] == '#') {
                        if (last == -1) last = j;
                        ans[i][j] = ++cur;
                    } else if (j < w - 1) {
                        ans[i][j] = cur;
                    }
                }
                if (last == -1) {
                    System.arraycopy(ans[i - 1], 0, ans[i], 0, w);
                } else {
                    for (int j = w - 1; j > last; j--) ans[i][j] = ans[i][last];
                }
            }
            for (int i = min - 1; i >= 0; i--) {
                System.arraycopy(ans[i + 1], 0, ans[i], 0, w);
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.ans(ans[i][j]);
                }
                out.ln();
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
}

