import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.io.Writer;
import java.security.AccessControlException;
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
        EConnectingCities solver = new EConnectingCities();
        solver.solve(1, in, out);
        out.close();
    }

    static class EConnectingCities {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.autoEnable();
            int n = in.ints();
            long d = in.longs();
            long[] a = in.longs(n);
            Vec2l[] b = new Vec2l[n];
            Vec2l[] c = new Vec2l[n];
            for (int i = 0; i < n; i++) {
                b[i] = new Vec2l(i, a[i] + i * d);
                c[i] = new Vec2l(i, a[i] + (n - i - 1) * d);
            }
            MergeSort.sort(b, Comparator.comparing(e -> e.y));
            MergeSort.sort(c, Comparator.comparing(e -> e.y));

            int cur = 0;
            ArrayList<Pair<Long, Vec2i>> edges = new ArrayList<>(2 * n);
            for (int i = 0; i < n - 1; i++) {
                while (b[cur].x <= i) {
                    cur++;
                }
                long weight = a[i] + d * (b[cur].x - i) + a[(int) b[cur].x];
                edges.add(new Pair<>(weight, new Vec2i(i, (int) b[cur].x)));
            }

            cur = 0;
            for (int i = n - 1; i > 0; i--) {
                while (c[cur].x >= i) {
                    cur++;
                }
                long weight = a[i] + d * (i - c[cur].x) + a[(int) c[cur].x];
                edges.add(new Pair<>(weight, new Vec2i(i, (int) c[cur].x)));
            }


            long ans = 0;
            UnionFind uf = new UnionFind(n);
            edges.sort(Comparator.comparing(e -> e.key));
            for (Pair<Long, Vec2i> edge : edges) {
                if (uf.find(edge.value.x) != uf.find(edge.value.y)) {
                    ans += edge.key;
                    uf.union(edge.value.x, edge.value.y);
                }
            }
            out.ans(ans).ln();
        }

    }

    static class MergeSort {
        private static final int INSERTIONSORT_THRESHOLD = 7;

        private MergeSort() {
        }

        static <T> void sort(T[] src, T[] dest, int low, int high, int off, Comparator<? super T> comparator) {
            int length = high - low;
            if (length < INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(dest, low, high, comparator);
                return;
            }
            int destLow = low;
            int destHigh = high;
            low += off;
            high += off;
            int mid = (low + high) / 2;
            sort(dest, src, low, mid, -off, comparator);
            sort(dest, src, mid, high, -off, comparator);
            if (comparator.compare(src[mid - 1], src[mid]) <= 0) {
                System.arraycopy(src, low, dest, destLow, length);
                return;
            }
            for (int i = destLow, p = low, q = mid; i < destHigh; i++) {
                if (q >= high || p < mid && comparator.compare(src[p], src[q]) <= 0) {
                    dest[i] = src[p++];
                } else {
                    dest[i] = src[q++];
                }
            }
        }

        public static <T> void sort(T[] a, Comparator<? super T> comparator) {
            sort(a.clone(), a, 0, a.length, 0, comparator);
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static <T> void sort(T[] a, int low, int high, Comparator<? super T> comparator) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && comparator.compare(a[j - 1], a[j]) > 0; j--) {
                    T t = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = t;
                }
            }
        }

    }

    static final class UnionFind {
        private final int[] groups;
        private final int[] rank;

        public UnionFind(int n) {
            groups = IntStream.range(0, n).toArray();
            rank = new int[n];
        }

        public int find(int i) {
            int ans = groups[i];
            if (ans == i) {
                return i;
            } else {
                return groups[i] = find(ans);
            }
        }

        public boolean union(int x, int y) {
            x = find(x);
            y = find(y);
            if (x == y) {
                return false;
            } else if (rank[x] < rank[y]) {
                groups[x] = y;
            } else if (rank[x] == rank[y]) {
                rank[x]++;
                groups[y] = x;
            } else {
                groups[y] = x;
            }
            return true;
        }

    }

    static class Vec2i {
        public final int x;
        public final int y;

        public Vec2i(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2i vec2i = (Vec2i) o;
            return x == vec2i.x && y == vec2i.y;
        }

        public int hashCode() {
            return 31 * x + y;
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
        }

    }

    static class Pair<K, V> {
        public K key;
        public V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair<?, ?> pair = (Pair<?, ?>) o;
            return Objects.equals(key, pair.key) &&
                    Objects.equals(value, pair.value);
        }

        public int hashCode() {
            return Objects.hash(key, value);
        }

        public String toString() {
            return "Pair{" +
                    "x=" + key +
                    ", y=" + value +
                    '}';
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

    static class Debug {
        private static final String DEBUG_PROPERTY = "enabled";
        private static final String DEBUG_CALL_PATTERN = "^.+\\.debug\\(([a-zA-Z0-9]+)\\);.*$";
        private static Pattern debugRegex;
        private static boolean enabled = false;
        private static String src;

        public static void autoEnable() {
            try {
                src = System.getProperty(DEBUG_PROPERTY);
                if (src != null) {
                    enabled = true;
                    if (debugRegex == null) {
                        debugRegex = Pattern.compile(DEBUG_CALL_PATTERN);
                    }
                }
            } catch (AccessControlException ex) {
                src = null;
            }
        }

    }

    static class Vec2l {
        public long x;
        public long y;

        public Vec2l(long x, long y) {
            this.x = x;
            this.y = y;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec2l vec2i = (Vec2l) o;
            return x == vec2i.x &&
                    y == vec2i.y;
        }

        public int hashCode() {
            return Objects.hash(x, y);
        }

        public String toString() {
            return "(" + x + ", " + y + ")";
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

