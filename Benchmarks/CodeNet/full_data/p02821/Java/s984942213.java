import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.LongBinaryOperator;
import java.util.function.LongPredicate;

public class Main {
    public static int lowerBound(long[] a, long key) {
        return lowerBound(a, 0, a.length, key);
    }
    public static int lowerBound(long[] a, int from, int to, long key) {
        if (from >= to) {
            throw new IllegalArgumentException();
        }
        while (from < to) {
            int mid = (from + to) >>> 1;
            if (key <= a[mid]) {
                to = mid;
            } else {
                from = mid + 1;
            }
        }
        return to;
    }
    public static long upperBound(long from, long to, LongPredicate p) {
        if (from >= to) {
            throw new IllegalArgumentException();
        }
        while (from < to) {
            long mid = (from + to) >>> 1;
            if (p.test(mid)) {
                from = mid + 1;
            } else {
                to = mid;
            }
        }
        return from;
    }
    static final class Cumulation {
        private final long[] cumulated;
        private final LongBinaryOperator inverse;
        public Cumulation(long[] a,
                          long identityElement,
                          LongBinaryOperator op,
                          LongBinaryOperator inverse) {
            if (inverse == null) {
                throw new NullPointerException();
            }
            this.inverse = inverse;

            cumulated = new long[a.length + 1];
            cumulated[0] = identityElement;
            for (int i = 0; i < a.length; i++) {
                cumulated[i + 1] = op.applyAsLong(cumulated[i], a[i]);
            }
        }
        public long valueOfRange(int fromIndex, int toIndex) {
            if (fromIndex > toIndex) {
                throw new IndexOutOfBoundsException();
            }
            return inverse.applyAsLong(cumulated[toIndex],
                                       cumulated[fromIndex]);
        }
        public static Cumulation cumulateByAdd(long[] a) {
            return new Cumulation(a, 0, Math::addExact, Math::subtractExact);
        }
    }
    static final long MIN_A = 1;
    static final long MAX_A = 100_000;

    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        long m = in.nextLong();
        long[] a = in.nextLongArray(n);

        Arrays.sort(a);

        long bound = upperBound(2 * MIN_A, 2 * MAX_A + 1, happiness -> {
            long countOfM = 0;
            for (long e : a) {
                int p = lowerBound(a, happiness - e);
                countOfM += a.length - p;
            }
            return countOfM >= m;
        });
        bound--;

        Cumulation cumulation = Cumulation.cumulateByAdd(a);
        long countOfM = 0;
        long ans = 0;
        for (long e : a) {
            int p = lowerBound(a, bound - e);
            int c = a.length - p;
            countOfM += c;
            ans += cumulation.valueOfRange(p, a.length) + e * c;
        }
        if (countOfM > m) {
            ans -= bound * (countOfM - m);
        }
        out.println(ans);
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
