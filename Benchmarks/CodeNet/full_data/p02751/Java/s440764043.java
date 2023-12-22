import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
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
        EOddSumRectangles solver = new EOddSumRectangles();
        solver.solve(1, in, out);
        out.close();
    }

    static class EOddSumRectangles {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), m = in.ints();
            int h = (1 << n) - 1, w = (1 << m) - 1;
            char[][] res = new char[h][w];
            ArrayUtil.fill(res, '1');
            if (n == 1 && m == 1) {
                out.ans('1').ln();
                return;
            } else if (n == 1 || m == 1) {
                for (int i = 0; i < h; i++) {
                    out.ans(String.valueOf(res[i])).ln();
                }
                return;
            }

            for (int i = 1; i < h; i += 4) {
                res[i][w / 2] = '0';
            }
            for (int i = 1; i < w; i += 4) {
                res[h / 2][i] = '0';
            }

            for (int i = 0; i < h; i++) {
                out.ans(String.valueOf(res[i])).ln();
            }

            /*
            int odd = 0;
            for (int h1 = 0; h1 < h; h1++) {
                for (int h2 = h1; h2 < h; h2++) {
                    for (int w1 = 0; w1 < w; w1++) {
                        for (int w2 = w1; w2 < w; w2++) {
                            int cnt = 0;
                            for (int j = h1; j <= h2; j++) {
                                for (int k = w1; k <= w2; k++) {
                                    if (res[j][k] == '1') cnt++;
                                }
                            }
                            if (cnt % 2 == 1) odd++;
                        }
                    }
                }
            }
            System.out.println("ODDNESS=" + odd);
            //*/
        /*

        int n = 15;
        int max = 0;
        for (int i = 0; i < (1 << n); i++) {
            int odd = 0;
            for (int r = 0; r < n; r++) {
                for (int l = 0; l <= r; l++) {
                    int cnt = 0;
                    for (int j = l; j <= r; j++) {
                        if (((i >> j) & 1) == 1) cnt++;
                    }
                    if (cnt % 2 == 1) odd++;
                }
            }
            if (odd >= max) {
                max = odd;
                int zeros = BitMath.count(((1 << n) - 1) & ~i);
                if (zeros == 0) System.out.println(Integer.toBinaryString(i) + " => " + odd);
            }
        }
        //*/

        /*int max = 0, mask = (1 << (h * w)) - 1;
        for (int i = 0; i < (1 << (h * w)); i++) {
            int odd = 0;
            for (int h1 = 0; h1 < h; h1++) {
                for (int h2 = h1; h2 < h; h2++) {
                    for (int w1 = 0; w1 < w; w1++) {
                        for (int w2 = w1; w2 < w; w2++) {
                            int cnt = 0;
                            for (int j = h1; j <= h2; j++) {
                                for (int k = w1; k <= w2; k++) {
                                    if (((i >> (j * w + k)) & 1) == 1) cnt++;
                                }
                            }
                            if (cnt % 2 == 1) odd++;
                        }
                    }
                }
            }
            if (odd >= max) {
                max = odd;
                int zeros = BitMath.count(mask & ~i), ones = BitMath.count(i);
                if (zeros == 1) System.out.println("max=" + max+" pat="+Integer.toBinaryString(i));
                //System.out.println("MAX" + odd + " : " + zeros + " : " + ones);
            }
        }
        //*/
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(char[] a, char v) {
            Arrays.fill(a, v);
        }

        public static void fill(char[][] a, char v) {
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

        public LightWriter ans(char c) {
            if (!breaked) {
                print(' ');
            }
            return print(c);
        }

        public LightWriter ans(String s) {
            if (!breaked) {
                print(' ');
            }
            return print(s);
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

