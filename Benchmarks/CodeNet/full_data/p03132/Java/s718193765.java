import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.PriorityQueue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.util.regex.Pattern;
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
        DEars solver = new DEars();
        solver.solve(1, in, out);
        out.close();
    }

    static class DEars {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            int n = in.ints();
            long[] a = in.longs(n);
            long[] sum = new long[n + 1];
            int[] odd = new int[n + 1], even = new int[n + 1];
            int[] zero = new int[n + 1];
            for (int i = 0; i < n; i++) {
                sum[i + 1] = sum[i] + a[i];
                zero[i + 1] = zero[i] + (a[i] == 0 ? 1 : 0);
                odd[i + 1] = odd[i];
                even[i + 1] = even[i];
                if (a[i] % 2 == 0) {
                    even[i + 1]++;
                } else {
                    odd[i + 1]++;
                }
            }

            PriorityQueue<DEars.IndexedSegment> rse = new PriorityQueue<>(Comparator.comparing(v -> v.cost));
            for (int i = 0; i <= n; i++) {
                rse.add(new DEars.IndexedSegment(i, sum[n] - sum[i] + odd[i] + 2 * zero[i]));
            }
            //System.out.println("G");
            PriorityQueue<DEars.IndexedSegment> rss = new PriorityQueue<>(Comparator.comparing(v -> v.cost));
            for (int i = 0; i <= n; i++) {
                while (rse.peek().index < i) {
                    rse.poll();
                }
                rss.add(new DEars.IndexedSegment(i, rse.peek().cost - odd[i] + even[i] - zero[i]));
            }
            //System.out.println(rss);

            PriorityQueue<DEars.IndexedSegment> lse = new PriorityQueue<>(Comparator.comparing(v -> v.cost));
            for (int i = 0; i <= n; i++) {
                while (rss.peek().index < i) {
                    rss.poll();
                }
                lse.add(new DEars.IndexedSegment(i, rss.peek().cost + odd[i] - even[i] + zero[i]));
            }
            //System.out.println(lse);

            PriorityQueue<DEars.IndexedSegment> lss = new PriorityQueue<>(Comparator.comparing(v -> v.cost));
            for (int i = 0; i <= n; i++) {
                while (lse.peek().index < i) {
                    lse.poll();
                }
                lss.add(new DEars.IndexedSegment(i, lse.peek().cost - odd[i] + sum[i] - 2 * zero[i]));
            }
            //System.out.println(lss);

            out.ans(lss.peek().cost).ln();
        }

        private static class IndexedSegment {
            public int index;
            public long cost;

            public IndexedSegment(int index, long cost) {
                this.index = index;
                this.cost = cost;
            }

            public String toString() {
                return "{" +
                        "i=" + index +
                        ", cost=" + cost +
                        '}';
            }

        }

    }

    static class Debug {
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\((.+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void enable(String s) {
            enabled = true;
            src = s;
            if (debugRegex == null) {
                debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
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
}

