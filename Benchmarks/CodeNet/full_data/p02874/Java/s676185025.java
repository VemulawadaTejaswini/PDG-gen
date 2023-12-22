import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.stream.LongStream;

public class Main {
    static class Pair {
        final long leftToMinRight;
        final long maxLeftToRight;
        Pair(long leftToMinRight, long maxLeftToRight) {
            this.leftToMinRight = leftToMinRight;
            this.maxLeftToRight = maxLeftToRight;
        }
        public long getLeftToMinRight() {
            return leftToMinRight;
        }
        public long getMaxLeftToRight() {
            return maxLeftToRight;
        }
    }
    static void solve(MyScanner in, MyWriter out) {
        int n = in.nextInt();
        long[][] lr = in.nextVerticalLongArrays(2, n);
        long[] l = LongStream.of(lr[0]).map(Math::decrementExact).toArray();
        long[] r = lr[1];
        if (n == 2) {
            out.println((r[0] - l[0]) + (r[1] - l[1]));
            return;
        }
        long maxLeft = Long.MIN_VALUE;
        int maxLeftIndex = -1;
        long minRight = Long.MAX_VALUE;
        int minRightIndex = -1;
        for (int i = 0; i < n; i++) {
            if (maxLeft < l[i]) {
                maxLeft = l[i];
                maxLeftIndex = i;
            }
            if (minRight > r[i]) {
                minRight = r[i];
                minRightIndex = i;
            }
        }
        if (maxLeftIndex == minRightIndex) {
            long maxLength = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                if (i != maxLeftIndex) {
                    maxLength = Math.max(maxLength, r[i] - l[i]);
                }
            }
            out.println((r[maxLeftIndex] - l[maxLeftIndex]) + maxLength);
            return;
        }
        long maxLength = Long.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (i != maxLeftIndex && i != minRightIndex) {
                maxLength = Math.max(maxLength, r[i] - l[i]);
            }
        }
        long ans = Math.max(0, r[minRightIndex] - l[maxLeftIndex]) + maxLength;
        Pair[] pairs = new Pair[n - 2];
        for (int i = 0, j = 0; i < n; i++) {
            if (i != maxLeftIndex && i != minRightIndex) {
                pairs[j] = new Pair(Math.max(0, minRight - l[i]),
                                    Math.max(0, r[i] - maxLeft));
                j++;
            }
        }
        Arrays.sort(pairs,
                    Comparator.comparingLong(Pair::getMaxLeftToRight)
                              .thenComparing(Comparator.comparingLong(Pair::getLeftToMinRight)
                                                       .reversed()));
        long contestA = r[maxLeftIndex] - l[maxLeftIndex];
        long contestB = r[minRightIndex] - l[minRightIndex];
        for (Pair p : pairs) {
            ans = Math.max(ans,
                           Math.min(contestA, p.maxLeftToRight) + contestB);
            contestB = Math.min(contestB, p.leftToMinRight);
        }
        ans = Math.max(ans, contestA + contestB);
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
