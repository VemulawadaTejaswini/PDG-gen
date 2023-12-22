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
        EAlmostEverywhereZero solver = new EAlmostEverywhereZero();
        solver.solve(1, in, out);
        out.close();
    }

    static class EAlmostEverywhereZero {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            char[] s = in.chars();
            int k = in.ints(), n = s.length;

            if (n <= 7) {
                int z = Integer.parseInt(String.valueOf(s));
                int ans = 0;
                for (int i = 1; i <= z; i++) {
                    int t = i, c = 0;
                    while (t > 0) {
                        if (t % 10 != 0) c++;
                        t /= 10;
                    }
                    if (c == k) ans++;
                }
                out.ans(ans).ln();
                return;
            }
            for (int i = 0; i < n; i++) s[i] -= '0';

            if (k == 1) {
                out.ans(s[0] + 9 * (n - 1)).ln();
            } else if (k == 2) {
                long ans = (n - 1L) * (n - 2L) / 2 * 81;
                ans += (n - 2L) * 9 * s[0];
                ans += (s[0] - 1) * 9 + s[1];
                out.ans(ans).ln();
            } else {
                long ans = (n - 1L) * (n - 2L) * (n - 3L) / 6 * 729;
                ans += (n - 2L) * (n - 3L) / 2 * 81 * s[0];
                ans += ((s[0] - 1) * 9 + s[1]) * (n - 3L) * 9;
                ans += (s[0] - 1) * 81 + (s[1] - 1) * 9 + s[2];
                out.ans(ans).ln();
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

        public char[] chars() {
            return string().toCharArray();
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

        public LightWriter ans(long l) {
            return ans(Long.toString(l));
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

