import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;


public class Main {
    public static void main(String[] args) {
        Const.setMod(Const.MOD99);
        FastScanner fsc = new FastScanner();
        int n = fsc.nextInt();
        long[][] xy = new long[n][2];
        for (int i = 0; i < n; i++) {
            long x = fsc.nextLong();
            long y = fsc.nextLong();
            xy[i][0] = x;
            xy[i][1] = y;
        }
        Arrays.sort(xy, (u, v) -> Long.compare(u[0], v[0]));
        xy = ArrayUtil.transpose(xy);
        int[] y = ArrayUtil.compress(xy[1]);
        int[][] k = new int[4][n];
        BinaryIndexedTree t = new BinaryIndexedTree(0, n);
        for (int i = 0; i < n; i++) {
            k[2][i] = t.sum(y[i]);
            k[1][i] = i - k[2][i];
            t.add(y[i], 1);
        }
        BinaryIndexedTree u = new BinaryIndexedTree(0, n);
        for (int i = n - 1; i >= 0; i--) {
            k[3][i] = u.sum(y[i]);
            k[0][i] = n - 1 - i - k[3][i];
            u.add(y[i], 1);
        }
        long[] pow = ModUtil.powarr(2l, n);
        long ans = ModUtil.mul(n, pow[n - 1]);
        for (int i = 0; i < n; i++) {
            int a = k[0][i];
            int b = k[1][i];
            int c = k[2][i];
            int d = k[3][i];
            long add = pow[n] - (pow[a + b + d] + pow[c + b + d] - pow[b + d]) - (pow[b + a + c] + pow[d + a + c] - pow[a + c]);
            long rm = 0;
            for (int j = 1; j < (1 << 4); j++) {
                int sign = -1;
                int index = 0;
                for (int bit = 0; bit < 4; bit++) {
                    if ((j & (1 << bit)) == 0) {
                        index += k[bit][i];
                    } else {
                        sign *= -1;
                    }
                }
                rm += (pow[index] - 1) * sign;
            }
            ans += add - (pow[n - 1] - 1 - rm);
        }
        System.out.println(ModUtil.mod(ans));
    }
}

/**
 * BinaryIndexedTree(n=10): [         8          ]
 *                          [    4    ] 
 *                          [ 2 ]      [ 6 ]      [ 10 ]
 *                          [1]  [3]   [5]  [7]   [9]
 * 
 * original array: (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
 * 
 * if you want to get the sum of range (l, r], caluculate S(r)-S(l). (S(n) means
 * \sum_{i=1}^n array[i].)
 * 
 * then, you need to be able to calculate S(n) quickly. actually, you can.
 * 
 * 1. binarize n. Ex: n=5(10)=101(2). 2. decompose
 * n=2**p_1+2**p_2+...+2**p_m.(p_1<...<p_m) Ex: n=1+100. 3. acutually,
 * S(n)=\sum_{i=1}^m{tree[\sum_{j=i}^m 2**p_j]} Ex: S(n)=tree[101]+tree[100].
 * 
 * computational complexity of sum-query is O(log n).
 */

class BinaryIndexedTree {
    private int[] tree;
    private int[] originalArray;
    private int n;

    /**
     * @param array 0-indexed array.
     */
    public BinaryIndexedTree(int[] array) {
        this.originalArray = array.clone();
        this.n = array.length;
        this.tree = new int[n + 1];
        initTree();
    }

    public BinaryIndexedTree(int initial, int n) {
        this.originalArray = new int[n];
        this.n = n;
        this.tree = new int[n + 1];
        for (int i = 0; i < n; i++) {
            originalArray[i] = initial;
        }
        initTree();
    }

    public BinaryIndexedTree(int n) {
        this(0, n);
    }

    private void initTree() {
        for (int i = 1; i <= n; i++) {
            tree[i] += originalArray[i - 1];
            int parent = i + (-i & i);
            if (parent <= n) {
                tree[parent] += tree[i];
            }
        }
    }

    /**
     * Calculate the sum of range (l, r] in array (1-indexed).
     * 
     * @param l left border (open)
     * @param r right border (closed)
     * @return sum of range (l, r] in array (1-indexed).
     */
    public int sum(int l, int r) {
        return sum(r) - sum(l);
    }

    public int sum(int r) {
        int ret = 0;
        for (; r > 0; r -= -r & r) {
            ret += tree[r];
        }
        return ret;
    }

    public int sum() {
        return sum(n);
    }

    /**
     * add v to array[i] and update BIT.
     * 
     * @param i index of array (1-indexed)
     * @param v adding value
     */
    public void add(int i, int v) {
        originalArray[i - 1] += v;
        for (; i <= n; i += -i & i) {
            tree[i] += v;
        }
    }

    /**
     * update the value of array[i] to v and update BIT.
     * 
     * @param i index of array (1-indexed)
     * @param v adding value
     */
    public void update(int i, int v) {
        add(i, v - originalArray[i - 1]);
        originalArray[i] = v;
    }

    @Override
    public String toString() {
        int msb = 31 - Integer.numberOfLeadingZeros(n);
        char[][] c = new char[msb + 1][1 << (2 * msb + 1)];
        int[] indx = new int[msb + 1];
        for (int i = 1; i <= n; i++) {
            int j = Integer.numberOfTrailingZeros(-i & i);
            char[] intc = Integer.toString(tree[i]).toCharArray();
            int intl = intc.length;
            c[j][indx[j]] = '[';
            c[j][indx[j] + (1 << (j + 2)) - 1] = ']';
            int st = indx[j] + (1 << (j + 1)) - intl / 2 - 1;
            for (int l = 0; l < intl; l++) {
                c[j][st + l] = intc[l];
            }
            indx[j] += 1 << (j + 3);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = msb; i >= 0; i--){
            sb.append(String.valueOf(c[i])).append('\n');
        }
        return sb.toString();
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

class ModUtil {
    private static final long MOD = Const.MOD;

    public static long mod(long a) {
        a %= MOD;
        if (a < 0) a += MOD;
        return a;
    }

    public static long add(long... a) {
        long ret = 0;
        for (long c : a) ret += c;
        return mod(ret);
    }

    public static long add(long a, long b) {
        long s = a + b;
        return s >= Const.MOD ? s - Const.MOD : s;
    }

    public static long mul(long... a) {
        long ret = 1;
        for (long c : a) ret = (ret * c) % MOD;
        return ret;
    }

    public static long mul(long a, long b) {
        return (a * b) % Const.MOD;
    }

    public static long div(long a, long... b) {
        long ret = a;
        for (long c : b) ret = mul(ret, inv(c));
        return ret;
    }

    /**
     * Caluculate the value b s.t. a*b mod MOD = 1.
     * 
     * @param a
     * @return inverse of a
     */
    public static long inv(long a) {
        long b = MOD;
        long u = 1, v = 0;
        while (b >= 1) {
            long t = a / b;
            a -= t * b;
            long tmp1 = a; a = b; b = tmp1;
            u -= t * v;
            long tmp2 = u; u = v; v = tmp2;
        }
        u %= MOD;
        return u >= 0 ? u : u + MOD;
    }

    /**
     * Caluculate the combination nCr.
     * 
     * @param n left
     * @param r right
     * @return nCr
     */
    public static long comb(long n, long r) {
        if (n < r) return 0;
        r = Math.min(r, n - r);
        long res = 1;
        for (long d = 1; d <= r; d++) res = div(mul(res, n--), d);
        return res;
    }

    public static long[] fact(int n) {
        long[] fact = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i <= 1) {
                fact[i] = 1;
            } else {
                fact[i] = mul(fact[i - 1], i);
            }
        }
        return fact;
    }

    public static long[] powarr(long a, int n) {
        long[] ret = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                ret[i] = 1;
            } else {
                ret[i] = mul(ret[i - 1], a);
            }
        }
        return ret;
    }

    /**
     * Caluculate a^b (mod {@code MOD}) in O(log b) time.
     * 
     * @param a base
     * @param b index
     * @return a^b (mod {@code MOD})
     */
    public static long pow(long a, long b) {
        if (b == 0) {
            return 1;
        }
        long half = pow(a, b >> 1);
        if ((a & 1) == 0) {
            return mul(half, half);
        } else {
            return mul(half, half, a);
        }
    }
}

class Const {
    public static final long MOD7 = 1_000_000_007;
    public static final long MOD9 = 1_000_000_009;
    public static final long MOD99 = 998_244_353;

    public static final long LINF = 1_000_000_000_000_000_000l;
    public static final int IINF = 1_000_000_000;
    public static final double DINF = 1e150;

    public static final double DELTA = 0.000_000_000_1;
    public static final double LDELTA = 0.000_001;

    public static final String YES = "YES";
    public static final String NO = "NO";
    public static final String Yes = "Yes";
    public static final String No = "No";
    public static final String POSSIBLE = "POSSIBLE";
    public static final String IMPOSSIBLE = "IMPOSSIBLE";
    public static final String Possible = "Possible";
    public static final String Impossible = "Impossible";

    public static final int[] dx8 = {1, 0, -1, 0, 1, -1, -1, 1};
    public static final int[] dy8 = {0, 1, 0, -1, 1, 1, -1, -1};
    public static final int[] dx = {1, 0, -1, 0};
    public static final int[] dy = {0, 1, 0, -1};

    public static long MOD = MOD7;

    public static void setMod(long mod) {
        MOD = mod;
    }

    private Const(){}
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

    public static int[][] transpose(int[][] a) {
        int n = a.length;
        int m = a[0].length;
        int[][] ret = new int[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
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
            compress[i] = l + 1;
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

    public static long[][] transpose(long[][] a) {
        int n = a.length;
        int m = a[0].length;
        long[][] ret = new long[m][n];
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                ret[j][i] = a[i][j];
            }
        }
        return ret;
    }

    /*
     * other Array
     */
    public static void println(double[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (double e : a) {
            sb.append(e).append(sep);
        }
        System.out.println(sb);
    }

    public static void println(double[] a) {
        println(a, '\n');
    }

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

    public static <T> void println(T[] a, char sep) {
        StringBuilder sb = new StringBuilder();
        for (T e : a) {
            sb.append(e).append(sep);
        }
        System.out.print(sb);
    }

    public static <T> void println(T[] a) {
        println(a, '\n');
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
