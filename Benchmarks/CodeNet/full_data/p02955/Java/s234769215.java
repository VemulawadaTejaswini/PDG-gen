import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.LongBinaryOperator;

public class Main {
    private static List<Long> divisors(long n) {
        if (n <= 0)
            throw new IllegalArgumentException();
        List<Long> result = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i != 0) {
                continue;
            }
            result.add(i);
            if (i * i != n) {
                result.add(n / i);
            }
        }
        return result;
    }
    private static final class Cumulation {
        private final long[] cumulated;
        private final LongBinaryOperator inverse;
        Cumulation(long[] a,
                   long identityElement,
                   LongBinaryOperator op,
                   LongBinaryOperator inverse) {
            if (inverse == null)
                throw new NullPointerException();
            this.inverse = inverse;

            cumulated = new long[a.length + 1];
            cumulated[0] = identityElement;
            for (int i = 0; i < a.length; i++) {
                cumulated[i + 1] = op.applyAsLong(cumulated[i], a[i]);
            }
        }
        long valueOfRange(int start, int end) {
            if (start > end)
                throw new IndexOutOfBoundsException();
            return inverse.applyAsLong(cumulated[end], cumulated[start]);
        }
        static Cumulation cumulateByAdd(long[] a) {
            return new Cumulation(a, 0, Math::addExact, Math::subtractExact);
        }
        static Cumulation cumulateByMultiply(long[] a) {
            return new Cumulation(a, 1, Math::multiplyExact, Math::floorDiv);
        }
        static Cumulation cumulateByXor(long[] a) {
            LongBinaryOperator op = (left, right) -> left ^ right;
            return new Cumulation(a, 0, op, op);
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int N = in.nextInt();
        int K = in.nextInt();
        long[] A = in.nextLongArray(N);
        long ans = 1;
        for (Long d : divisors(Arrays.stream(A).sum())) {
            long[] r = Arrays.stream(A).map(a -> a % d).sorted().toArray();
            Cumulation down = Cumulation.cumulateByAdd(r);
            Cumulation up =
                    Cumulation.cumulateByAdd(Arrays.stream(r)
                                                   .map(a -> a == 0 ? 0 : d - a)
                                                   .toArray());
            long minOpCount = Long.MAX_VALUE;
            for (int i = 1; i < A.length; i++) {
                long opCount = Math.max(down.valueOfRange(0, i),
                                        up.valueOfRange(i, N));
                minOpCount = Math.min(minOpCount, opCount);
            }
            if (minOpCount <= K) {
                ans = Math.max(ans, d);
            }
        }
        out.println(ans);
    }

    public static void main(String[] args) {
        MyWriter w = new MyWriter(System.out);
        solve(new MyScanner(System.in), w);
        w.flush();
    }

    static final class MyScanner {
        private final InputStream in;
        MyScanner(InputStream in) {
            this.in = new BufferedInputStream(in);
        }
        private int readByte() {
            try {
                return in.read();
            } catch (IOException e) {
                throw new AssertionError(null, e);
            }
        }
        private static boolean isPrintableCharExceptSpace(int c) {
            return 33 <= c && c <= 126;
        }
        String next() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            StringBuilder b = new StringBuilder();
            do {
                b.appendCodePoint(c);
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return b.toString();
        }
        long nextLong() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            boolean minus = false;
            if (c == '-') {
                minus = true;
                c = readByte();
            }
            long result = 0L;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                result = result * 10L + (c - '0');
                c = readByte();
            } while (c != -1 && isPrintableCharExceptSpace(c));
            return minus ? -result : result;
        }
        int nextInt() {
            long n = nextLong();
            if (n < Integer.MIN_VALUE || n > Integer.MAX_VALUE)
                throw new InputMismatchException();
            return (int)n;
        }
        double nextDouble() {
            return Double.parseDouble(next());
        }
        int[] nextIntArray(int n) {
            int[] result = new int[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextInt();
            }
            return result;
        }
        private static boolean allSameLength(int[] a, int[] b, int[]... c) {
            if (a.length != b.length)
                return false;
            for (int[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        private static boolean allSameLength(char[] a, char[] b, char[]... c) {
            if (a.length != b.length)
                return false;
            for (char[] element : c)
                if (a.length != element.length)
                    return false;
            return true;
        }
        void nextVerticalIntArrays(int[] a, int[] b, int[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextInt();
                b[i] = nextInt();
                for (int[] d : c) {
                    d[i] = nextInt();
                }
            }
        }
        long[] nextLongArray(int n) {
            long[] result = new long[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextLong();
            }
            return result;
        }
        char nextChar() {
            int c = readByte();
            while (!(c == -1 || isPrintableCharExceptSpace(c))) {
                c = readByte();
            }
            if (c == -1)
                throw new NoSuchElementException();
            return (char)c;
        }
        char[] nextCharArray(int n) {
            char[] result = new char[n];
            for (int i = 0; i < n; i++) {
                result[i] = nextChar();
            }
            return result;
        }
        char[][] next2dCharArray(int n, int m) {
            char[][] result = new char[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    result[i][j] = nextChar();
                }
            }
            return result;
        }
        void nextVerticalCharArrays(char[] a, char[] b, char[]... c) {
            if (!allSameLength(a, b, c))
                throw new IllegalArgumentException();
            for (int i = 0; i < a.length; i++) {
                a[i] = nextChar();
                b[i] = nextChar();
                for (char[] d : c) {
                    d[i] = nextChar();
                }
            }
        }
    }
    static final class MyWriter extends PrintWriter {
        MyWriter(OutputStream out) {
            super(out);
        }
        void joinAndPrintln(int[] x) {
            joinAndPrintln(x, " ");
        }
        void joinAndPrintln(int[] x, String delimiter) {
            StringBuilder b = new StringBuilder();
            if (x.length > 0) {
                b.append(x[0]);
                for (int i = 1; i < x.length; i++) {
                    b.append(delimiter).append(x[i]);
                }
            }
            println(b.toString());
        }
    }
}
