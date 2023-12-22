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
import java.util.Objects;
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
        DModuloOperations solver = new DModuloOperations();
        solver.solve(1, in, out);
        out.close();
    }

    static class DModuloOperations {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints(), x = in.ints();
            int[] s = in.ints(n);
            IntroSort.sort(s);
            ModMath mod = new ModMath();
            Factorial fact = mod.getFactorial(n + 1);

            long[][] dp = new long[n + 1][x + 1];
            dp[n][x] = 1;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j <= x; j++) {
                    dp[i][j % s[i]] += dp[i + 1][j];
                    dp[i][j % s[i]] %= MOD;
                    dp[i][j] += dp[i + 1][j] * i % MOD;
                    dp[i][j] %= MOD;
                }
            }

            //Stream.of(dp).map(Arrays::toString).forEach(System.out::println);

            long ans = 0;
            for (int i = 0; i <= x; i++) {
                ans += i * dp[0][i] % MOD;
                ans %= MOD;
            }
            out.ansln(ans);
        }

    }

    static class HeapSort {
        private HeapSort() {
        }

        private static void heapfy(int[] a, int low, int high, int i, int val) {
            int child = 2 * i - low + 1;
            while (child < high) {
                if (child + 1 < high && a[child] < a[child + 1]) {
                    child++;
                }
                if (val >= a[child]) {
                    break;
                }
                a[i] = a[child];
                i = child;
                child = 2 * i - low + 1;
            }
            a[i] = val;
        }

        static void sort(int[] a, int low, int high) {
            for (int p = (high + low) / 2 - 1; p >= low; p--) {
                heapfy(a, low, high, p, a[p]);
            }
            while (high > low) {
                high--;
                int pval = a[high];
                a[high] = a[low];
                heapfy(a, low, high, low, pval);
            }
        }

    }

    static class Factorial {
        private final ModMath mod;
        private final int max;
        private final long[] natural;
        private final long[] reverse;

        public Factorial(ModMath mod, int max) {
            this.mod = mod;
            this.max = max;
            this.natural = new long[max];
            this.reverse = new long[max];
            natural[0] = 1;
            for (int i = 1; i < max; i++) {
                natural[i] = mod.mod(natural[i - 1] * i);
            }
            reverse[max - 1] = mod.inv(natural[max - 1]);
            for (int i = max - 1; i > 0; i--) {
                reverse[i - 1] = mod.mod(reverse[i] * i);
            }
        }

        public String toString() {
            return "Factorial{" +
                    "natural=" + Arrays.toString(natural) +
                    ", reverse=" + Arrays.toString(reverse) +
                    '}';
        }

    }

    static class QuickSort {
        private QuickSort() {
        }

        private static void med(int[] a, int low, int x, int y, int z) {
            if (a[z] < a[x]) {
                ArrayUtil.swap(a, low, x);
            } else if (a[y] < a[z]) {
                ArrayUtil.swap(a, low, y);
            } else {
                ArrayUtil.swap(a, low, z);
            }
        }

        static int step(int[] a, int low, int high) {
            int x = low + 1, y = low + (high - low) / 2, z = high - 1;
            if (a[x] < a[y]) {
                med(a, low, x, y, z);
            } else {
                med(a, low, y, x, z);
            }

            int lb = low + 1, ub = high;
            while (true) {
                while (a[lb] < a[low]) {
                    lb++;
                }
                ub--;
                while (a[low] < a[ub]) {
                    ub--;
                }
                if (lb >= ub) {
                    return lb;
                }
                ArrayUtil.swap(a, lb, ub);
                lb++;
            }
        }

    }

    static class IntroSort {
        private static int INSERTIONSORT_THRESHOLD = 16;

        private IntroSort() {
        }

        static void sort(int[] a, int low, int high, int maxDepth) {
            while (high - low > INSERTIONSORT_THRESHOLD) {
                if (maxDepth-- == 0) {
                    HeapSort.sort(a, low, high);
                    return;
                }
                int cut = QuickSort.step(a, low, high);
                sort(a, cut, high, maxDepth);
                high = cut;
            }
            InsertionSort.sort(a, low, high);
        }

        public static void sort(int[] a) {
            if (a.length <= INSERTIONSORT_THRESHOLD) {
                InsertionSort.sort(a, 0, a.length);
            } else {
                sort(a, 0, a.length, 2 * BitMath.msb(a.length));
            }
        }

    }

    static class Vec3l implements Comparable<Vec3l> {
        public long x;
        public long y;
        public long z;

        public Vec3l(long x, long y, long z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3l o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Long.compare(z, o.z);
                }
                return Long.compare(y, o.z);
            }
            return Long.compare(x, o.x);
        }

    }

    static final class BitMath {
        private BitMath() {
        }

        public static int count(int v) {
            v = (v & 0x55555555) + ((v >> 1) & 0x55555555);
            v = (v & 0x33333333) + ((v >> 2) & 0x33333333);
            v = (v & 0x0f0f0f0f) + ((v >> 4) & 0x0f0f0f0f);
            v = (v & 0x00ff00ff) + ((v >> 8) & 0x00ff00ff);
            v = (v & 0x0000ffff) + ((v >> 16) & 0x0000ffff);
            return v;
        }

        public static int msb(int v) {
            if (v == 0) {
                throw new IllegalArgumentException("Bit not found");
            }
            v |= (v >> 1);
            v |= (v >> 2);
            v |= (v >> 4);
            v |= (v >> 8);
            v |= (v >> 16);
            return count(v) - 1;
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

        public int[] ints(int length) {
            return IntStream.range(0, length).map(x -> ints()).toArray();
        }

    }

    static final class ArrayUtil {
        private ArrayUtil() {
        }

        public static void swap(int[] a, int x, int y) {
            int t = a[x];
            a[x] = a[y];
            a[y] = t;
        }

    }

    static class LongEuclidSolver {
        private LongEuclidSolver() {
        }

        public static Vec3l solve(long p, long q) {
            if (q == 0) {
                return new Vec3l(p, 1, p);
            }
            Vec3l vals = solve(q, p % q);
            long a = vals.y;
            long b = vals.x - (p / q) * a;
            return new Vec3l(a, b, vals.z);
        }

    }

    static class Vec3i implements Comparable<Vec3i> {
        public int x;
        public int y;
        public int z;

        public Vec3i(int x, int y, int z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Vec3i vec3i = (Vec3i) o;
            return x == vec3i.x &&
                    y == vec3i.y &&
                    z == vec3i.z;
        }

        public int hashCode() {
            return Objects.hash(x, y, z);
        }

        public String toString() {
            return "(" + x + ", " + y + ", " + z + ")";
        }

        public int compareTo(Vec3i o) {
            if (x == o.x) {
                if (y == o.y) {
                    return Integer.compare(z, o.z);
                }
                return Integer.compare(y, o.z);
            }
            return Integer.compare(x, o.x);
        }

    }

    static class ModMath {
        private static final int DEFAULT_MOD = 1_000_000_007;
        private final long mod;

        public ModMath(long mod) {
            this.mod = mod;
        }

        public ModMath() {
            this(DEFAULT_MOD);
        }

        public long mod(long x) {
            x %= mod;
            return x < 0 ? x + mod : x;
        }

        public long inv(long x) {
            return mod(LongEuclidSolver.solve(x, -mod).x);
        }

        public Factorial getFactorial(int n) {
            return new Factorial(this, n);
        }

    }

    static class InsertionSort {
        private InsertionSort() {
        }

        static void sort(int[] a, int low, int high) {
            for (int i = low; i < high; i++) {
                for (int j = i; j > low && a[j - 1] > a[j]; j--) {
                    ArrayUtil.swap(a, j - 1, j);
                }
            }
        }

    }
}

