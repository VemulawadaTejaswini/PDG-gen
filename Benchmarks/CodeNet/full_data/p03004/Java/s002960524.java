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
        FMinimumBoundingBox solver = new FMinimumBoundingBox();
        solver.solve(1, in, out);
        out.close();
    }

    static class FMinimumBoundingBox {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int n = in.ints();
            int[][] min = new int[2][3], max = new int[2][3];
            ArrayUtil.fill(min, Integer.MAX_VALUE);
            ArrayUtil.fill(max, Integer.MIN_VALUE);

            for (int i = 0; i < n; i++) {
                int x = in.ints(), y = in.ints();
                char d = in.string().charAt(0);
                switch (d) {
                    case 'L':
                        min[0][0] = Math.min(min[0][0], x);
                        max[0][0] = Math.max(max[0][0], x);
                        break;
                    case 'U':
                    case 'D':
                        min[0][1] = Math.min(min[0][1], x);
                        max[0][1] = Math.max(max[0][1], x);
                        break;
                    case 'R':
                        min[0][2] = Math.min(min[0][2], x);
                        max[0][2] = Math.max(max[0][2], x);
                        break;
                }
                switch (d) {
                    case 'D':
                        min[1][0] = Math.min(min[1][0], y);
                        max[1][0] = Math.max(max[1][0], y);
                        break;
                    case 'L':
                    case 'R':
                        min[1][1] = Math.min(min[1][1], y);
                        max[1][1] = Math.max(max[1][1], y);
                        break;
                    case 'U':
                        min[1][2] = Math.min(min[1][2], y);
                        max[1][2] = Math.max(max[1][2], y);
                        break;
                }
            }

            double ans = Float.MAX_VALUE;
            for (int i = 0; i <= 200_000_000; i++) {
                double t = i * 0.25f;
                double xmin = min(min[0][1], min[0][0] - t, min[0][2] + t);
                double xmax = max(max[0][1], max[0][0] - t, max[0][2] + t);
                double ymin = min(min[1][1], min[1][0] - t, min[1][2] + t);
                double ymax = max(max[1][1], max[1][0] - t, max[1][2] + t);
                ans = Math.min(ans, (xmax - xmin) * (ymax - ymin));
            }
            out.ans(ans, 10).ln();
        }

        private static double min(double x, double y, double z) {
            return x < y && x < z ? x : y < z ? y : z;
        }

        private static double max(double x, double y, double z) {
            return x > y && x > z ? x : y > z ? y : z;
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

