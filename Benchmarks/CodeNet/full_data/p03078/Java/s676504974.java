import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        DCake123 solver = new DCake123();
        solver.solve(1, in, out);
        out.close();
    }

    static class DCake123 {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            // out.setBoolLabel(LightWriter.BoolLabel.YES_NO_FIRST_UP);
            int x = in.ints(), y = in.ints(), z = in.ints(), k = in.ints();
            long[] a = in.longs(x), b = in.longs(y), c = in.longs(z);
            long[] ab = new long[x * y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    ab[i * y + j] = a[i] + b[j];
                }
            }
            Arrays.sort(ab);

            long min = 3, max = 3001;
            while (max - min > 1) {
                long mid = (max + min) / 2;
                long sum = 0;
                for (int i = 0; i < z; i++) {
                    sum += x * y - ArrayUtil.lowerBound(ab, mid - c[i]);
                }
                if (sum >= k) {
                    min = mid;
                } else {
                    max = mid;
                }
            }

            List<Long> ans = new ArrayList<>(k);
            int cur = 0;
            for (int i = 0; i < z; i++) {
                for (int j = ArrayUtil.lowerBound(ab, min - c[i]); j < x * y; j++) {
                    ans.add(ab[j] + c[i]);
                }
            }
            ans.sort(Comparator.reverseOrder());
            for (int i = 0; i < k; i++) {
                out.ansln(ans.get(i));
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

        public LightWriter ansln(long... n) {
            for (long n1 : n) {
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

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static int lowerBound(long[] a, long t) {
            return lowerBound(a, t, 0);
        }

        public static int lowerBound(long[] a, long t, int min) {
            int max = a.length;
            while (min < max) {
                int mid = (min + max) / 2;
                if (t <= a[mid]) {
                    max = mid;
                } else {
                    min = mid + 1;
                }
            }
            return min;
        }

    }
}

