import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
        AConnectionAndDisconnection solver = new AConnectionAndDisconnection();
        solver.solve(1, in, out);
        out.close();
    }

    static class AConnectionAndDisconnection {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            char[] s = in.string().toCharArray();
            int n = s.length;
            long k = in.longs();
            long ans = 0;


            int[][] dp1 = new int[2][n];
            dp1[1][0] = 1;
            for (int i = 1; i < n; i++) {
                if (s[i - 1] == s[i]) {
                    dp1[0][i] = dp1[1][i - 1];
                } else {
                    dp1[0][i] = Math.min(dp1[0][i - 1], dp1[1][i - 1]);
                }
                dp1[1][i] = Math.min(dp1[0][i - 1], dp1[1][i - 1]) + 1;
            }

            int[][] dp2 = new int[2][n];
            dp2[0][0] = 10000;
            dp2[1][0] = 1;
            for (int i = 1; i < n; i++) {
                if (s[i - 1] == s[i]) {
                    dp2[0][i] = dp2[1][i - 1];
                } else {
                    dp2[0][i] = Math.min(dp2[0][i - 1], dp2[1][i - 1]);
                }
                dp2[1][i] = Math.min(dp2[0][i - 1], dp2[1][i - 1]) + 1;
            }

            long base = Math.min(dp1[0][n - 1], dp1[1][n - 1]);
            if (s[0] != s[n - 1]) {
                out.ans(base * k).ln();
            } else {
                long a = base + Math.min(dp2[0][n - 1], dp2[1][n - 1]) * (k - 1L);
                long b = base + dp1[1][n - 1] * (k - 1L);

                System.out.println("a=" + a + " b=" + b);
                out.ans(Math.min(a, b)).ln();
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

        public long longs() {
            return Long.parseLong(string());
        }

    }
}

