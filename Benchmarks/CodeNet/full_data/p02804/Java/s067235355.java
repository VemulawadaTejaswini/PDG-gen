import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Main {
    static final class ModCombination {
        private final int mod;
        private final long[] factorial;
        private final long[] factorialInverse;

        public ModCombination(int mod, int maxN) {
            this.mod = mod;
            factorial = new long[maxN + 1];
            long[] inverse = new long[factorial.length];
            factorialInverse = new long[factorial.length];

            factorial[0] = factorial[1] = 1;
            inverse[1] = 1;
            factorialInverse[0] = factorialInverse[1] = 1;
            for (int i = 2; i < factorial.length; i++) {
                factorial[i] = factorial[i - 1] * i % mod;
                inverse[i] = mod - inverse[mod % i] * (mod / i) % mod;
                factorialInverse[i] =
                        factorialInverse[i - 1] * inverse[i] % mod;
            }
        }
        public long of(int n, int k) {
            if (k > n) {
                return 0;
            }
            return factorial[n]
                   * (factorialInverse[k] * factorialInverse[n - k] % mod)
                   % mod;
        }
    }
    static final class Mod {
        private final int divisor;
        public Mod(int divisor) {
            if (divisor <= 0) {
                throw new IllegalArgumentException();
            }
            this.divisor = divisor;
        }
        public long mod(long dividend) {
            return Math.floorMod(dividend, divisor);
        }
        public long add(long a, long b) {
            return mod(mod(a) + mod(b));
        }
        public long subtract(long a, long b) {
            return mod(mod(a) - mod(b));
        }
        public long multiply(long a, long b) {
            return mod(mod(a) * mod(b));
        }
        public long pow(long a, long b) {
            if (b < 0) {
                throw new IllegalArgumentException();
            }
            long r = 1;
            while (b > 0) {
                if ((b & 1) == 1) {
                    r = multiply(r, a);
                }
                a = multiply(a, a);
                b >>= 1;
            }
            return r;
        }
        public long inverse(long a) {
            // assert isCoprime(a, divisor);
            if (a == 0) {
                throw new IllegalArgumentException();
            }
            a = mod(a);
            long b = divisor;
            long u = 1;
            long v = 0;
            while (b != 0) {
                long q = a / b;
                a -= q * b;
                u -= q * v;

                long tmp = a;
                a = b;
                b = tmp;

                tmp = u;
                u = v;
                v = tmp;
            }
            return mod(u);
        }
        public long div(long a, long b) {
            return multiply(a, inverse(b));
        }
        public Value value(long initialValue) {
            return new Value(this, initialValue);
        }

        public static final class Value {
            private final Mod mod;
            private long value;
            private Value(Mod mod, long initialValue) {
                this.mod = mod;
                value = mod.mod(initialValue);
            }
            public long longValue() {
                return value;
            }
            public Value add(long a) {
                value = mod.add(value, a);
                return this;
            }
            public Value add(Value a) {
                return add(a.value);
            }
            public Value subtract(long a) {
                value = mod.subtract(value, a);
                return this;
            }
            public Value subtract(Value a) {
                return subtract(a.value);
            }
            public Value multiply(long a) {
                value = mod.multiply(value, a);
                return this;
            }
            public Value multiply(Value a) {
                return multiply(a.value);
            }
            public Value pow(long a) {
                value = mod.pow(value, a);
                return this;
            }
            public Value inverse() {
                value = mod.inverse(value);
                return this;
            }
            public Value div(long a) {
                value = mod.div(value, a);
                return this;
            }
            public Value div(Value a) {
                return div(a.value);
            }
            @Override
            public String toString() {
                return Long.toString(value);
            }
        }
    }
    static final int MOD = 1_000_000_007;
    static final Mod mod = new Mod(MOD);

    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        int k = in.nextInt();
        long[] a = in.nextLongArray(n);
        Arrays.sort(a);
        ModCombination c = new ModCombination(MOD, n);
        Mod.Value max = mod.value(0);
        for (int i = k - 1; i < n; i++) {
            max.add(mod.value(a[i]).multiply(c.of(i, k - 1)));
        }
        Mod.Value min = mod.value(0);
        for (int i = 0; i <= n - k; i++) {
            min.add(mod.value(a[i]).multiply(c.of(n - 1 - i, k - 1)));
        }
        out.println(max.subtract(min));
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        static final int BUFFER_SIZE = 8192;
        private final InputStream in;
        private final byte[] buffer = new byte[BUFFER_SIZE];
        private int point;
        private int readLength;
        MyScanner(InputStream in) {
            this.in = in;
        }
        private byte readByte() {
            if (point < readLength) {
                byte result = buffer[point];
                point += 1;
                return result;
            }
            try {
                readLength = in.read(buffer);
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
            if (readLength == -1) {
                return -1;
            }
            point = 1;
            return buffer[0];
        }
        private static boolean isPrintableCharExceptSpace(byte c) {
            return 33 <= c && c <= 126;
        }
        public char nextChar() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            return (char)c;
        }
        public String next() {
            return next(16);
        }
        public String next(int n) {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            StringBuilder b = new StringBuilder(n);
            do {
                b.append((char)c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        public long nextLong() {
            byte c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1) {
                throw new NoSuchElementException();
            }
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9') {
                    throw new InputMismatchException();
                }
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        public int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE) {
                throw new InputMismatchException();
            }
            return (int)n;
        }
        public double nextDouble() {
            return Double.parseDouble(next());
        }
        public int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        public long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        public char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        public char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        public int[][] nextVerticalIntArrays(int arrayCount, int arrayLength) {
            int[][] result = new int[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextInt();
                }
            }
            return result;
        }
        public long[][] nextVerticalLongArrays(int arrayCount,
                                               int arrayLength) {
            long[][] result = new long[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextLong();
                }
            }
            return result;
        }
        public char[][] nextVerticalCharArrays(int arrayCount,
                                               int arrayLength) {
            char[][] result = new char[arrayCount][arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                for (int j = 0; j < arrayCount; j++) {
                    result[j][i] = nextChar();
                }
            }
            return result;
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        public void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(long[] x) {
            joinAndPrintln(x, " ");
        }
        public void joinAndPrintln(long[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
        public void joinAndPrintln(Iterable<?> iterable) {
            joinAndPrintln(iterable, " ");
        }
        public void joinAndPrintln(Iterable<?> iterable, String delimiter) {
            StringBuilder b = new StringBuilder();
            for (Iterator<?> i = iterable.iterator(); i.hasNext();) {
                b.append(i.next());
                while (i.hasNext()) {
                    b.append(delimiter).append(i.next());
                }
            }
            println(b.toString());
        }
    }
}
