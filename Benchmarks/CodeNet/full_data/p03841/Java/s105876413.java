import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        int[][] x = new int[n + 1][2];
        int[] a = new int[n * n];
        for (int i = 1; i <= n; i++) {
            x[i][0] = fsc.nextInt() - 1;
            x[i][1] = i;
        }
        x[0][0] = -1;
        Arrays.sort(x, (u, v) -> u[0] - v[0]);
        int xi = 1;
        int xi2 = 1;
        int xi3 = 1;
        int[] num = new int[n + 1];
        for (int i = 0; i < n * n; i++) {
            if (xi2 <= n && num[x[xi2][1]] == x[xi2][1] - 1) {
                xi2++;
            }
            if (xi3 <= n && num[x[xi3][1]] == n) {
                xi3++;
            }
            if (xi <= n && i == x[xi][0]) {
                if (num[x[xi][1]] != x[xi][1] - 1) {
                    System.out.println("No");
                    return;
                }
                a[i] = x[xi][1];
                num[x[xi++][1]]++;
            } else if (xi2 <= n) {
                a[i] = x[xi2][1];
                num[x[xi2][1]]++;
            } else {
                a[i] = x[xi3][1];
                num[x[xi3][1]]++;
            }
        }
        System.out.println("Yes");
        ArrayUtil.println(a, ' ');
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


class ArrayUtil {
    private ArrayUtil(){}
    
    public static int[] map(IntUnaryOperator op, int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.applyAsInt(a[i]);
        }
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
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }
        return s;
    }

    public static int[][] cumsum(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] s = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++){
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
            }
        }
        return s;
    }

    public static void reverse(int[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
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
                    if (ret[mid] > ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
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
                    if (ret[mid] < ret[i - 1]) {
                        pass = mid;
                    } else {
                        fail = mid;
                    }
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

    public static void println(int[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (int e : a) {
            sb.append(e).append(sep);
        }
        System.out.println(sb);
    }

    public static void println(int[] a) {
        println(a, '\n');
    }

    /*
     * IntArray _________________________ LongArray
     */
    public static long[] map(LongUnaryOperator op, long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = op.applyAsLong(a[i]);
        }
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
        for (int i = 1; i <= n; i++) {
            s[i] = s[i - 1] + a[i - 1];
        }
        return s;
    }

    public static long[][] cumsum(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] s = new long[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                s[i][j] = s[i - 1][j] + s[i][j - 1] - s[i - 1][j - 1] + a[i - 1][j - 1];
            }
        }
        return s;
    }

    public static void reverse(long[] a, int begin, int end) {
        for (int i = begin; i < begin + (end - begin) / 2; i++) {
            swap(a, i, begin + end - i - 1);
        }
    }

    public static void reverse(long[] a) {
        reverse(a, 0, a.length);
    }

    public static void revSort(long[] a) {
        Arrays.sort(a);
        reverse(a);
    }

    public static int[] compress(long[] a) {
        int n = a.length;
        long[] sorted = a.clone();
        int[] compress = new int[n];
        Arrays.sort(sorted);
        for (int i = 0; i < n; i++) {
            int l = 0, r = n;
            while (r - l > 1) {
                int m = l + (r - l) / 2;
                if (sorted[m] <= a[i]) {
                    l = m;
                } else {
                    r = m;
                }
            }
            compress[i] = l;
        }
        return compress;
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

    public static void println(long[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (long e : a) {
            sb.append(e).append(sep);
        }
        System.out.println(sb);
    }

    public static void println(long[] a) {
        println(a, '\n');
    }

    /*
     * other Array
     */
    public static void println(char[] s) {
        System.out.println(s);
    }

    public static void println(char[][] s) {
        StringBuilder sb = new StringBuilder();
        for (char[] c : s) {
            sb.append(c).append('\n');
        }
        System.out.print(sb);
    }

    public static boolean[][] inputGrid(FastScanner fsc, int h, int w, char t) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == t;
            }
        }
        return grid;
    }

    public static boolean[][] inputGrid(FastScanner fsc, int h, int w) {
        return inputGrid(fsc, h, w, '#');
    }

    public static boolean[][] inputGrid(FastScanner fsc, int n) {
        return inputGrid(fsc, n, n, '#');
    }

    public static boolean[][] inputGrid(FastScanner fsc, int n, char t) {
        return inputGrid(fsc, n, n, t);
    }
}
