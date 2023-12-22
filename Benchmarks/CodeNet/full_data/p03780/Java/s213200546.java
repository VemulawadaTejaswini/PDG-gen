import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;
import static java.lang.Math.max;



public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int k = fsc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = fsc.nextInt();
        }
        int[][] front = new int[n + 1][k];
        front[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < k; j++) {
                if (front[i - 1][j] > 0) {
                    front[i][j] += front[i - 1][j];
                    if (j + a[i - 1] < k) {
                        front[i][j + a[i - 1]] += front[i - 1][j];
                    }
                }
            }
        }
        int[][] back = new int[n + 1][k];
        back[n][0] = 1;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < k; j++) {
                if (back[i + 1][j] > 0) {
                    back[i][j] += back[i + 1][j];
                    if (j + a[i] < k) {
                        back[i][j + a[i]] += back[i + 1][j];
                    }
                }
            }
        }
        int[][] bcsum = new int[n + 1][k + 1];
        for (int i = 0; i <= n; i++) {
            bcsum[i] = ArrayUtil.cumsum(back[i]);
        }
        int need = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                if (front[i][j] > 0 && bcsum[i + 1][k - j] - bcsum[i + 1][max(0, k - a[i] - j)] > 0) {
                    ++need;
                    break;
                }
            }
        }
        System.out.println(n - need);
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
        if (hasNextByte())
            return buffer[ptr++];
        else
            return -1;
    }

    private static boolean isPrintableChar(int c) {
        return 33 <= c && c <= 126;
    }

    public boolean hasNext() {
        while (hasNextByte() && !isPrintableChar(buffer[ptr]))
            ptr++;
        return hasNextByte();
    }

    public String next() {
        if (!hasNext())
            throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while (isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }

    public long nextLong() {
        if (!hasNext())
            throw new NoSuchElementException();
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
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
            throw new NumberFormatException();
        return (int) nl;
    }

    public double nextDouble() {
        return Double.parseDouble(next());
    }
}


class ArrayUtil {
    public static int[] map(IntUnaryOperator op, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = op.applyAsInt(a[i]);
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static int[] cumsum(int[] a) {
        int n = a.length;
        int[] s = new int[n + 1];
        for (int i = 1; i <= n; i++)
            s[i] = s[i - 1] + a[i - 1];
        return s;
    }

    public static int[][] cumsum(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        return s;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++)
            swap(a, i, begin + end - i - 1);
    }

    public static void reverse(int[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(int[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[] nextPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] > ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] > ret[i - 1])
                        pass = mid;
                    else
                        fail = mid;
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static int[] predPermutation(int[] a) {
        int[] ret = a.clone();
        int n = ret.length;
        for (int i = n - 1; i >= 1; i--) {
            if (ret[i] < ret[i - 1]) {
                int fail = n, pass = i;
                while (fail - pass > 1) {
                    int mid = pass + (fail - pass) / 2;
                    if (ret[mid] < ret[i - 1])
                        pass = mid;
                    else
                        fail = mid;
                }
                swap(ret, pass, i - 1);
                reverse(ret, i, n);
                return ret;
            }
        }
        return null;
    }

    public static void swap(int[] a, int u, int v) {
        int tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(int[] a, int[] b) {
        return compare(a, b) == 0;
    }

    /*
     * IntArray _________________________ LongArray
     */
    public static long[] map(LongUnaryOperator op, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = op.applyAsLong(a[i]);
        return b;
    }

    /**
     * s[i] is the sum of the range [0, i) in a.
     * 
     * @param a
     * @return cumulative sum array of a.
     */
    public static long[] cumsum(long[] a) {
        int n = a.length;
        long[] s = new long[n + 1];
        for (int i = 1; i <= n; i++)
            s[i] = s[i - 1] + a[i - 1];
        return s;
    }

    public static long[][] cumsum(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= m; j++)
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
        return s;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++)
            swap(a, i, begin + end - i - 1);
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static void compress(long[] a) {
        int n = a.length;
        long[] sorted = a.clone();
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sorted[m] <= a[i])
                    l = m;
                else
                    r = m;
            }
            a[i] = l;
        }
    }

    public static void swap(long[] a, int u, int v) {
        long tmp = a[u];
        a[u] = a[v];
        a[v] = tmp;
    }

    public static int compare(long[] a, long[] b) {
        for (int i = 0; i < a.length; i++) {
            if (i >= b.length) {
                return -1;
            } else if (a[i] > b[i]) {
                return 1;
            } else if (a[i] < b[i]) {
                return -1;
            }
        }
        if (a.length < b.length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static boolean equals(long[] a, long[] b) {
        return compare(a, b) == 0;
    }
}
