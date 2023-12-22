import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.util.Arrays;
import java.util.function.LongBinaryOperator;
import java.io.BufferedOutputStream;
import java.nio.charset.Charset;
import java.util.StringTokenizer;
import java.io.OutputStreamWriter;
import java.io.OutputStream;
import java.util.stream.LongStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.io.UncheckedIOException;
import java.util.Objects;
import java.util.stream.Stream;
import java.io.Writer;
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
        RWalk solver = new RWalk();
        solver.solve(1, in, out);
        out.close();
    }

    static class RWalk {
        private static final int MOD = (int) 1e9 + 7;

        public void solve(int testNumber, LightScanner in, LightWriter out) {
            int n = in.ints();
            long k = in.longs();
            long[][] a = in.longs(n, n);
            IntMatrix mat = new IntMatrix(n, n, a);
            MatrixExponentiation exp = new MatrixExponentiation(mat, 60, 0, 1, (x, y) -> {
                long s = x + y;
                return s >= MOD ? s - MOD : s;
            }, (x, y) -> x * y % MOD);
            IntMatrix res = exp.power(k);
            long ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    ans += res.get(i, j);
                }
            }
            out.ans(ans % MOD).ln();
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

        public long longs() {
            return Long.parseLong(string());
        }

        public long[] longs(int length) {
            return IntStream.range(0, length).mapToLong(x -> longs()).toArray();
        }

        public long[][] longs(int height, int width) {
            return IntStream.range(0, height).mapToObj(x -> longs(width)).toArray(long[][]::new);
        }

        public void close() {
            try {
                this.reader.close();
            } catch (IOException ex) {
                throw new UncheckedIOException(ex);
            }
        }

    }

    static class MatrixExponentiation {
        private static final int DEFAULT_SIZE = 64;
        private final int size;
        private final long zero;
        private final long one;
        private final LongBinaryOperator add;
        private final LongBinaryOperator prod;
        private final IntMatrix[] exps;

        public MatrixExponentiation(IntMatrix e0, int size, long zero, long one, LongBinaryOperator add, LongBinaryOperator prod) {
            this.size = size;
            this.zero = zero;
            this.one = one;
            this.add = add;
            this.prod = prod;
            exps = new IntMatrix[size];
            exps[0] = e0;
            for (int i = 1; i < size; i++) {
                exps[i] = exps[i - 1].product(exps[i - 1], zero, add, prod);
            }
        }

        public MatrixExponentiation(IntMatrix e0, long zero, long one, LongBinaryOperator add, LongBinaryOperator prod) {
            this(e0, DEFAULT_SIZE, zero, one, add, prod);
        }

        public MatrixExponentiation(IntMatrix e0, int size) {
            this.size = size;
            zero = 0;
            one = 1;
            add = null;
            prod = null;
            exps = new IntMatrix[size];
            exps[0] = e0;
            for (int i = 1; i < size; i++) {
                exps[i] = exps[i - 1].product(exps[i - 1]);
            }
        }

        public MatrixExponentiation(IntMatrix e0) {
            this(e0, DEFAULT_SIZE);
        }

        public IntMatrix power(long p) {
            IntMatrix res = IntMatrix.getUnitMatrix(exps[0].getRows(), zero, one);
            for (int i = 0; i < size; i++) {
                if (((1L << i) & p) == 0) {
                    continue;
                }
                if (add == null) {
                    res = res.product(exps[i]);
                } else {
                    res = res.product(exps[i], zero, add, prod);
                }
            }
            return res;
        }

    }

    static class IntMatrix {
        private final int n;
        private final int m;
        final long[][] contents;

        public IntMatrix(int n, int m, long[][] contents) {
            this.n = n;
            this.m = m;
            this.contents = contents;
        }

        public IntMatrix(int n, int m) {
            this(n, m, new long[n][m]);
        }

        public long get(int i, int j) {
            return contents[i][j];
        }

        public void set(int i, int j, long v) {
            contents[i][j] = v;
        }

        public IntMatrix product(IntMatrix other) {
            if (this.m != other.n) {
                throw new IllegalArgumentException("size mismatch");
            }
            IntMatrix res = new IntMatrix(n, other.m);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < other.m; k++) {
                        res.contents[i][k] += this.contents[i][j] * other.contents[j][k];
                    }
                }
            }
            return res;
        }

        public IntMatrix product(IntMatrix other, long zero, LongBinaryOperator add, LongBinaryOperator prod) {
            if (this.m != other.n) {
                throw new IllegalArgumentException("size mismatch");
            }
            IntMatrix res = new IntMatrix(n, other.m);
            ArrayUtil.fill(res.contents, zero);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    for (int k = 0; k < other.m; k++) {
                        res.contents[i][k] = add.applyAsLong(
                                res.contents[i][k],
                                prod.applyAsLong(this.contents[i][j], other.contents[j][k])
                        );
                    }
                }
            }
            return res;
        }

        public int getRows() {
            return n;
        }

        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IntMatrix matrix = (IntMatrix) o;
            return n == matrix.n &&
                    m == matrix.m &&
                    Arrays.equals(contents, matrix.contents);
        }

        public int hashCode() {
            int result = Objects.hash(n, m);
            result = 31 * result + Arrays.hashCode(contents);
            return result;
        }

        public String toString() {
            return Stream.of(contents).map(Arrays::toString).collect(Collectors.joining(System.lineSeparator()));
        }

        public static IntMatrix getUnitMatrix(int n, long zero, long one) {
            IntMatrix unit = new IntMatrix(n, n);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    unit.set(i, j, i == j ? one : zero);
                }
            }
            return unit;
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
}

