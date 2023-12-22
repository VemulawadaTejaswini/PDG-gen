import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.stream.IntStream;
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
import java.util.regex.Pattern;
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
        DDecayedBridges solver = new DDecayedBridges();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDecayedBridges {
        public void solve(int testNumber, LightScanner in, LightWriter out) {
            Debug.enable("src");
            int n = in.ints(), m = in.ints();
            UnionFind uf = new UnionFind(n);
            long[] siz = new long[n];
            Arrays.fill(siz, 1);

            Vec2i[] v2 = new Vec2i[m];
            for (int i = 0; i < m; i++) {
                v2[i] = new Vec2i(in.ints() - 1, in.ints() - 1);
            }
            ArrayUtil.reverse(v2, 0, m);

            long[] res = new long[m];
            long ans = n * (n - 1) / 2;
            for (int i = 0; i < m; i++) {
                if (uf.find(v2[i].x) == uf.find(v2[i].y)) {
                    res[i] = ans;
                    continue;
                }
                long prod = siz[uf.find(v2[i].x)] * siz[uf.find(v2[i].y)];
                //System.out.println(v2[i] + ": "+prod);
                res[i] = ans;
                ans -= prod;
                long wa = siz[uf.find(v2[i].x)] + siz[uf.find(v2[i].y)];
                uf.union(v2[i].x, v2[i].y);
                siz[uf.find(v2[i].x)] = wa;
            }
            ArrayUtil.reverse(res, 0, m);

            //System.out.println(Arrays.toString(siz));

            for (int i = 0; i < m; i++) {
                out.ansln(res[i]);
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

    static class Vec2i implements Comparable<Vec2i> {
        public int x;
        public int y;

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

        public int compareTo(Vec2i o) {
            if (x == o.x) {
                return Integer.compare(y, o.y);
            }
            return Integer.compare(x, o.x);
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void reverse(long[] a, int left, int right) {
            right--;
            while (left < right) {
                long temp = a[left];
                a[left++] = a[right];
                a[right--] = temp;
            }
        }

        public static <T> void reverse(T[] a, int left, int right) {
            right--;
            while (left < right) {
                T temp = a[left];
                a[left++] = a[right];
                a[right--] = temp;
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

