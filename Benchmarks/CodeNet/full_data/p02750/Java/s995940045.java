import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.io.BufferedOutputStream;
import java.io.UncheckedIOException;
import java.util.List;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.Comparator;
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
        DMangaMarket solver = new DMangaMarket();
        solver.solve(1, in, out);
        out.close();
    }

    static class DMangaMarket {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long t = in.longs();
            List<Long> constant = new ArrayList<>();
            List<DMangaMarket.Store> dynamic = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long a = in.longs(), b = in.longs();
                if (a == 0) constant.add(b + 1);
                else dynamic.add(new DMangaMarket.Store(a, b));
            }
            constant.sort(Comparator.naturalOrder());
            dynamic.sort(Comparator.reverseOrder());
            n = dynamic.size();

            long[][] dp = new long[30][n + 1];
            ArrayUtil.fill(dp, t + 10);
            dp[0][0] = 0;
            for (int i = 0; i < n; i++) {
                DMangaMarket.Store store = dynamic.get(i);
                for (int j = 0; j < 30; j++) dp[j][i + 1] = dp[j][i];
                for (int j = 0; j < 29; j++) {
                    long d = (dp[j][i] + 1) * store.a + store.b;
                    if (dp[j][i] + d > t) continue;
                    dp[j + 1][i + 1] = Math.min(dp[j + 1][i + 1], dp[j][i] + d);
                }
            }
            int ans = 0;
            for (int i = 0; i < 30; i++) {
                if (dp[i][n] > t) continue;
                long room = t - dp[i][n];
                int cnt = i;
                for (long x : constant) {
                    if (x <= room) {
                        room -= x;
                        cnt++;
                    }
                }
                ans = Math.max(ans, cnt);
            }
            out.ans(ans).ln();
        }

        private static class Store implements Comparable<DMangaMarket.Store> {
            long a;
            long b;

            Store(long a, long b) {
                this.a = a;
                this.b = b + 1;
            }

            public int compareTo(DMangaMarket.Store o) {
                return Long.compare(a * o.b, o.a * b);
            }

        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void fill(long[] a, long v) {
            Arrays.fill(a, v);
        }

        public static void fill(long[][] a, long v) {
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

        public long longs() {
            return Long.parseLong(string());
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

