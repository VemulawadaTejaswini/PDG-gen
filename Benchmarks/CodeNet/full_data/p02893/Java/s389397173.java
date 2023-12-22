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
        CDivisionByTwoWithSomething solver = new CDivisionByTwoWithSomething();
        solver.solve(1, in, out);
        out.close();
    }

    static class CDivisionByTwoWithSomething {
        private static final int MOD = 998244353;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            char[] x = in.string().toCharArray();

            long xmod = 0;
            for (int i = 0; i < n; i++) {
                xmod *= 2;
                if (x[i] == '1') xmod++;
                xmod %= MOD;
            }
            xmod++;
            xmod %= MOD;
            long ans = 2 * n * xmod % MOD;

            int[] convered = new int[n + 1];
            for (int bits = 1; bits < n; bits++) {
                if (n % bits != 0) continue;
                int num = n / bits;
                if (num % 2 == 0) continue;

                boolean ok = true;
                outer:
                for (int i = 1; i < num; i++) {
                    for (int j = 0; j < bits; j++) {
                        char dBst = i % 2 == 0 ? x[j] : (char) ('a' - x[j]);
                        char dAct = x[i * bits + j];
                        if (dBst == dAct) continue;
                        if (dBst > dAct) ok = false;
                        break outer;
                    }
                }

                long variety = 0;
                for (int i = 0; i < bits; i++) {
                    variety <<= 1;
                    if (x[i] == '1') variety |= 1;
                    variety %= MOD;
                }


                if (ok) variety++;
                variety += MOD - convered[bits];
                variety %= MOD;

                //System.out.println("Variety for bits=" + bits + " was " + variety + " : " + ok);


                long costDiff = (2L * bits + MOD - 2L * n) % MOD;
                ans += variety * costDiff % MOD;
                ans %= MOD;

                for (int i = bits * 2; i <= n; i += bits) {
                    convered[i] += variety;
                    convered[i] %= MOD;
                }
            }
            out.ans(ans).ln();
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

        public int ints() {
            return Integer.parseInt(string());
        }

    }
}

