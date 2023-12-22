import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;



public class Main {
    public static void main(String[] args) {
        StringBuilder out = new StringBuilder();
        solve(out);
        PrintWriter pw = new PrintWriter(System.out);
        pw.println(out);
        pw.flush();
        pw.close();
    }

    public static void solve(StringBuilder out) {
        int n = In.ni();
        long[] a = In.nl(n);
        int[] index = IndexSort.sortDescending(a);
        long[][] dp = new long[n + 1][n + 1];
        for (int s = 1; s <= n; s++) {
            int i = index[s - 1];
            for (int l = 0, r = s; l <= s; l++, r--) {
                long vl = l == 0 ? 0 : dp[l - 1][r] + a[i] * (i - l + 1);
                long vr = r == 0 ? 0 : dp[l][r - 1] + a[i] * (n - r - i);
                dp[l][r] = Math.max(vl, vr);
            }
        }
        long max = 0;
        for (int l = 0, r = n; l <= n; l++, r--) {
            max = Math.max(max, dp[l][r]);
        }
        out.append(max);
    }
}


/**
 * @author https://atcoder.jp/users/suisen
 */
class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int ni(IntUnaryOperator f) {
        return f.applyAsInt(fsc.nextInt());
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[] ni (int n, IntUnaryOperator f) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> ni(f));
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static int[][] ni(int n, int m, IntUnaryOperator f) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m, f));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long nl(LongUnaryOperator f) {
        return f.applyAsLong(fsc.nextLong());
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[] nl(int n, LongUnaryOperator f) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> nl(f));
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
        return a;
    }

    public static long[][] nl(int n, int m, LongUnaryOperator f) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m, f));
        return a;
    }

    public static char[] nc() {
        return fsc.next().toCharArray();
    }

    public static char[][] nc(int n, int m) {
        char[][] c = new char[n][m];
        Arrays.setAll(c, i -> nc());
        return c;
    }

    public static double nd() {
        return fsc.nextDouble();
    }

    public static double nd(DoubleUnaryOperator f) {
        return f.applyAsDouble(fsc.nextDouble());
    }

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> fsc.nextDouble());
        return a;
    }

    public static double[] nd(int n, DoubleUnaryOperator f) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd(f));
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
        return a;
    }

    public static double[][] nd(int n, int m, DoubleUnaryOperator f) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m, f));
        return a;
    }

    public static String ns() {
        return fsc.next();
    }

    public static String[] ns(int n) {
        String[] s = new String[n];
        Arrays.setAll(s, i -> ns());
        return s;
    }

    public static boolean[][] grid(int h, int w, char trueCharacter) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == trueCharacter;
            }
        }
        return grid;
    }
}


class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;

    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        } else {
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }

    private int readByte() {
        if (hasNextByte()) {
            return buffer[ptr++];
        } else {
            return -1;
        }
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr])) {
            ptr++;
        }
        return hasNextByte();
    }

    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while (true) {
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            } else if (b == -1 || !isPrintableChar(b)) {
                return minus ? -n : n;
            } else {
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }

    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
            throw new NumberFormatException();
        }
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


class IndexSort {
    public static int[] sort(int[] a) {
        int n = a.length;
        int[] index = new int[n];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[i] - a[j]);
        return index;
    }

    public static int[] sortDescending(int[] a) {
        int n = a.length;
        int[] index = new int[n];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> a[j] - a[i]);
        return index;
    }

    public static int[] sort(long[] a) {
        int n = a.length;
        int[] index = new int[n];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[i], a[j]));
        return index;
    }

    public static int[] sortDescending(long[] a) {
        int n = a.length;
        int[] index = new int[n];
        Arrays.setAll(index, IntUnaryOperator.identity());
        ComparativeMergeSort.sort(index, (i, j) -> Long.compare(a[j], a[i]));
        return index;
    }
}

@FunctionalInterface
interface IntComparator {
    public int compare(int i, int j);

    public default boolean eq(int i, int j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(int i, int j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(int i, int j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(int i, int j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(int i, int j) {
        return compare(i, j) < 0;
    }

    public default boolean le(int i, int j) {
        return compare(i, j) <= 0;
    }
}

@FunctionalInterface
interface LongComparator {
    public int compare(long i, long j);

    public default boolean eq(long i, long j) {
        return compare(i, j) == 0;
    }

    public default boolean ne(long i, long j) {
        return compare(i, j) != 0;
    }

    public default boolean gt(long i, long j) {
        return compare(i, j) > 0;
    }

    public default boolean ge(long i, long j) {
        return compare(i, j) >= 0;
    }

    public default boolean lt(long i, long j) {
        return compare(i, j) < 0;
    }

    public default boolean le(long i, long j) {
        return compare(i, j) <= 0;
    }
}


final class ComparativeMergeSort {
    private static int INSERTION_SORT_THRESHOLD = 60;

    public static void sort(int[] a, final IntComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(int[] a, final int begin, final int end, final IntComparator comparator) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (comparator.gt(a[i], a[j]) && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    int tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final int[] work = new int[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, begin, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }

    public static void sort(long[] a, final LongComparator comparator) {
        sort(a, 0, a.length, comparator);
    }

    public static void sort(long[] a, final int begin, final int end, final LongComparator comparator) {
        for (int i = begin, j = i + 1, cnt = 0, threshold = ((end - begin) << 2) / 5; j < end; i = j, j++) {
            if (comparator.gt(a[i], a[j]) && ++cnt >= threshold) {
                int l = begin, r = end - 1;
                while (r > l) {
                    long tmp = a[l]; a[l] = a[r]; a[r] = tmp;
                    l++; r--;
                }
                break;
            }
        }
        for (int i = begin;;) {
            int j = i + INSERTION_SORT_THRESHOLD;
            if (j < end) {
                ComparativeInsertionSort.sort(a, i, j, comparator);
            } else {
                ComparativeInsertionSort.sort(a, i, end, comparator);
                break;
            }
            i = j;
        }
        final int len = end - begin;
        final long[] work = new long[len];
        for (int block = INSERTION_SORT_THRESHOLD; block <= len; block <<= 1) {
            final int twoBlocks = block << 1;
            for (int from = begin, max = end - block; from < max; from += twoBlocks) {
                final int mid = from + block;
                final int to = Math.min(from + twoBlocks, end);
                System.arraycopy(a, begin, work, 0, block);
                for (int i = from, wi = 0, ti = mid;; i++) {
                    if (ti == to) {
                        System.arraycopy(work, wi, a, i, block - wi);
                        break;
                    } else if (comparator.gt(work[wi], a[ti])) {
                        a[i] = a[ti++];
                    } else {
                        a[i] = work[wi++];
                        if (wi == block) {
                            break;
                        }
                    }
                }
            }
        }
    }
}


final class ComparativeInsertionSort {
    public static void sort(int[] a, final int from, final int to, final IntComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final int tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }

    public static void sort(long[] a, final int from, final int to, final LongComparator comparator) {
        for (int i = from + 1; i < to; i++) {
            final long tmp = a[i];
            if (comparator.gt(a[i - 1], tmp)) {
                int j = i;
                do {
                    a[j] = a[j - 1];
                    j--;
                } while (j > from && comparator.gt(a[j - 1], tmp));
                a[j] = tmp;
            }
        }
    }
}
