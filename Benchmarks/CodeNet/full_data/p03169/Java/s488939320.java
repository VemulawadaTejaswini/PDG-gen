import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
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
        JSushi solver = new JSushi();
        solver.solve(1, in, out);
        out.close();
    }

    static class JSushi {
        private static int n;
        private static double[][][] dp;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            n = in.ints();
            int[] c = new int[4];
            dp = new double[n + 1][n + 1][n + 1];
            ArrayUtil.fill(dp, Double.NaN);
            dp[0][0][0] = 0;
            for (int i = 0; i < n; i++) c[in.ints()]++;
            out.ans(dp(c[1], c[2], c[3]), 15).ln();
        }

        private static double dp(int c1, int c2, int c3) {
            if (!Double.isNaN(dp[c1][c2][c3])) return dp[c1][c2][c3];
            double sum = c1 + c2 + c3;
            double ans = n / sum;
            if (c1 > 0) ans += c1 / sum * dp(c1 - 1, c2, c3);
            if (c2 > 0) ans += c2 / sum * dp(c1 + 1, c2 - 1, c3);
            if (c3 > 0) ans += c3 / sum * dp(c1, c2 + 1, c3 - 1);
            //System.out.println(n + "/" + c1 + "," + c2 + "," + c3 + ":" + ans);
            return dp[c1][c2][c3] = ans;
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(double[] a, double v) {
            Arrays.fill(a, v);
        }

        public static void fill(double[][] a, double v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

        public static void fill(double[][][] a, double v) {
            for (int i = 0; i < a.length; i++) {
                fill(a[i], v);
            }
        }

    }

    static class LightScanner implements AutoCloseable {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public LightScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
        }

        public String string() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
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

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
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

        public LightWriter ans(double x, int n) {
            if (!breaked) {
                print(' ');
            }
            if (x < 0) {
                print('-');
                x = -x;
            }
            x += Math.pow(10, -n) / 2;
            print(Long.toString((long) x)).print('.');
            x -= (long) x;
            for (int i = 0; i < n; i++) {
                x *= 10;
                print((char) ('0' + ((int) x)));
                x -= (int) x;
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
}

