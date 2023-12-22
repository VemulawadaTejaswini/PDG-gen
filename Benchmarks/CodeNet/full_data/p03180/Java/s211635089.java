import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;


public class Main {
    public static int n;
    public static long[] dp;
    public static long[][] a;
    public static void main(String[] args) {
        Out out = new Out();
        solve(out);
        out.outln();
        out.flush();
        out.close();
    }

    public static void solve(Out out) {
        n = In.ni();
        a = In.nl(n, n);
        dp = new long[1 << n];
        Arrays.fill(dp, -Const.LINF);
        out.append(dp((1 << n) - 1));
    }

    public static long dp(int set) {
        if (dp[set] > -Const.LINF) {
            return dp[set];
        }
        dp[set] = eval(set);
        for (int j = (set - 1) & set; j > 0; j = (j - 1) & set) {
            dp[set] = Math.max(dp[set], dp(j) + dp(set ^ j));
        }
        return dp[set];
    }

    public static long eval(int set) {
        ArrayList<Integer> one = BitUtil.ones(set);
        int size = one.size();
        long ret = 0;
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                ret += a[one.get(i)][one.get(j)];
            }
        }
        return ret;
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


class BitUtil {
    public static final int LONG_BIT = 64;
    public static final int INT_BIT = 32;

    private static final int[] INT_MASK = {
        0x0000_0000, 
        0x0000_0001, 0x0000_0003, 0x0000_0007, 0x0000_000f, 
        0x0000_001f, 0x0000_003f, 0x0000_007f, 0x0000_00ff, 
        0x0000_01ff, 0x0000_03ff, 0x0000_07ff, 0x0000_0fff,
        0x0000_1fff, 0x0000_3fff, 0x0000_7fff, 0x0000_ffff, 
        0x0001_ffff, 0x0003_ffff, 0x0007_ffff, 0x000f_ffff, 
        0x001f_ffff, 0x003f_ffff, 0x007f_ffff, 0x00ff_ffff, 
        0x01ff_ffff, 0x03ff_ffff, 0x07ff_ffff, 0x0fff_ffff, 
        0x1fff_ffff, 0x3fff_ffff, 0x7fff_ffff, 0xffff_ffff
    };
    private static final long[] LONG_MASK = {
        0x0000_0000_0000_0000l, 
        0x0000_0000_0000_0001l, 0x0000_0000_0000_0003l, 0x0000_0000_0000_0007l, 0x0000_0000_0000_000fl, 
        0x0000_0000_0000_001fl, 0x0000_0000_0000_003fl, 0x0000_0000_0000_007fl, 0x0000_0000_0000_00ffl, 
        0x0000_0000_0000_01ffl, 0x0000_0000_0000_03ffl, 0x0000_0000_0000_07ffl, 0x0000_0000_0000_0fffl,
        0x0000_0000_0000_1fffl, 0x0000_0000_0000_3fffl, 0x0000_0000_0000_7fffl, 0x0000_0000_0000_ffffl, 
        0x0000_0000_0001_ffffl, 0x0000_0000_0003_ffffl, 0x0000_0000_0007_ffffl, 0x0000_0000_000f_ffffl, 
        0x0000_0000_001f_ffffl, 0x0000_0000_003f_ffffl, 0x0000_0000_007f_ffffl, 0x0000_0000_00ff_ffffl, 
        0x0000_0000_01ff_ffffl, 0x0000_0000_03ff_ffffl, 0x0000_0000_07ff_ffffl, 0x0000_0000_0fff_ffffl, 
        0x0000_0000_1fff_ffffl, 0x0000_0000_3fff_ffffl, 0x0000_0000_7fff_ffffl, 0x0000_0000_ffff_ffffl,
        0x0000_0001_ffff_ffffl, 0x0000_0003_ffff_ffffl, 0x0000_0007_ffff_ffffl, 0x0000_000f_ffff_ffffl, 
        0x0000_001f_ffff_ffffl, 0x0000_003f_ffff_ffffl, 0x0000_007f_ffff_ffffl, 0x0000_00ff_ffff_ffffl, 
        0x0000_01ff_ffff_ffffl, 0x0000_03ff_ffff_ffffl, 0x0000_07ff_ffff_ffffl, 0x0000_0fff_ffff_ffffl,
        0x0000_1fff_ffff_ffffl, 0x0000_3fff_ffff_ffffl, 0x0000_7fff_ffff_ffffl, 0x0000_ffff_ffff_ffffl, 
        0x0001_ffff_ffff_ffffl, 0x0003_ffff_ffff_ffffl, 0x0007_ffff_ffff_ffffl, 0x000f_ffff_ffff_ffffl, 
        0x001f_ffff_ffff_ffffl, 0x003f_ffff_ffff_ffffl, 0x007f_ffff_ffff_ffffl, 0x00ff_ffff_ffff_ffffl, 
        0x01ff_ffff_ffff_ffffl, 0x03ff_ffff_ffff_ffffl, 0x07ff_ffff_ffff_ffffl, 0x0fff_ffff_ffff_ffffl, 
        0x1fff_ffff_ffff_ffffl, 0x3fff_ffff_ffff_ffffl, 0x7fff_ffff_ffff_ffffl, 0xffff_ffff_ffff_ffffl
    };

    private static final char[] hex = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static boolean test(long n, int bit) {
        return (n & (1l << bit)) != 0;
    }

    public static boolean test(int n, int bit) {
        return (n & (1 << bit)) != 0;
    }

    public static long set(long n, int bit) {
        return n | (1l << bit);
    }

    public static int set(int n, int bit) {
        return n | (1 << bit);
    }

    public static long set(long n, int from, int to) {
        return n | (LONG_MASK[to - from] << from);
    }

    public static int set(int n, int from, int to) {
        return n | (INT_MASK[to - from] << from);
    }

    public static long set(long n, int bit, boolean b) {
        return b ? n | (1l << bit) : n & ~(1l << bit);
    }

    public static int set(int n, int bit, boolean b) {
        return b ? n | (1 << bit) : n & ~(1 << bit);
    }

    public static long set(long n, int from, int to, boolean b) {
        return b ? n | (LONG_MASK[to - from] << from) : n & ~(LONG_MASK[to - from] << from);
    }

    public static int set(int n, int from, int to, boolean b) {
        return b ? n | (INT_MASK[to - from] << from) : n & ~(INT_MASK[to - from] << from);
    }

    public static long clear(long n, int bit) {
        return n & ~(1l << bit);
    }

    public static int clear(int n, int bit) {
        return n & ~(1 << bit);
    }

    public static long clear(long n, int from, int to) {
        return n & ~(LONG_MASK[to - from] << from);
    }

    public static int clear(int n, int from, int to) {
        return n & ~(INT_MASK[to - from] << from);
    }

    public static long mask(long n, int bit) {
        return n & (1l << bit);
    }

    public static int mask(int n, int bit) {
        return n & (1 << bit);
    }

    public static long mask(long n, int from, int to) {
        return n & (LONG_MASK[to - from] << from);
    }

    public static int mask(int n, int from, int to) {
        return n & (INT_MASK[to - from] << from);
    }

    public static int get(long n, int bit) {
        return (n & (1l << bit)) == 0 ? 1 : 0;
    }

    public static int get(int n, int bit) {
        return (n & (1 << bit)) == 0 ? 1 : 0;
    }

    public static long flip(long n, int bit) {
        return n ^ (1l << bit);
    }

    public static int flip(int n, int bit) {
        return n ^ (1 << bit);
    }

    public static long flip(long n, int from, int to) {
        return n ^ (LONG_MASK[to - from] << from);
    }

    public static int flip(int n, int from, int to) {
        return n ^ (INT_MASK[to - from] << from);
    }

    public static ArrayList<Integer> ones(long n) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < LONG_BIT; i++) {
            if (test(n, i)) {
                set.add(i);
            }
        }
        return set;
    }

    public static ArrayList<Integer> ones(int n) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i < INT_BIT; i++) {
            if (test(n, i)) {
                set.add(i);
            }
        }
        return set;
    }

    public static int msbPlace(long n) {
        return LONG_BIT - Long.numberOfLeadingZeros(n) - 1;
    }

    public static int msbPlace(int n) {
        return INT_BIT - Integer.numberOfLeadingZeros(n) - 1;
    }

    public static int lsbPlace(long n) {
        return Long.numberOfTrailingZeros(n);
    }

    public static int lsbPlace(int n) {
        return Integer.numberOfTrailingZeros(n);
    }

    public static String toBinaryString(long n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < LONG_BIT; i++, n >>= 1) {
            sb.append(n & 1);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }

    public static String toBinaryString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < INT_BIT; i++, n >>= 1) {
            sb.append(n & 1);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }

    public static String toHexString(long n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, t = LONG_BIT >> 2; i < t; i++, n >>= 4) {
            sb.append(hex[(int) n & 0xf]);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }

    public static String toHexString(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, t = INT_BIT >> 2; i < t; i++, n >>= 4) {
            sb.append(hex[n & 0xf]);
            if ((i & 3) == 3) {
                sb.append('_');
            }
        }
        return sb.reverse().toString();
    }
}


class Out {
    private StringBuilder sb = new StringBuilder();
    private PrintWriter w = new PrintWriter(System.out);

    public Out() {
    }

    public void append(int v) {
        sb.append(v);
    }

    public void append(long v) {
        sb.append(v);
    }

    public void append(char c) {
        sb.append(c);
    }

    public void append(double v) {
        sb.append(v);
    }

    public void append(char[] c) {
        sb.append(c);
    }

    public void append(String s) {
        sb.append(s);
    }

    public void append(Object e) {
        sb.append(e);
    }

    public void append(int[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(long[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(double[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(char[][] c, String sep) {
        for (int i = 0; i < c.length; i++) {
            append(c[i]);
            if (i < c.length - 1) {
                append(sep);
            }
        }
    }

    public void append(String[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void append(Object[] a, String sep) {
        for (int i = 0; i < a.length; i++) {
            append(a[i]);
            if (i < a.length - 1) {
                append(sep);
            }
        }
    }

    public void out() {
        w.print(sb);
        clearBuilder();
    }

    public void outln() {
        w.println(sb);
        clearBuilder();
    }

    public void print(int v) {
        w.print(v);
    }

    public void print(long v) {
        w.print(v);
    }

    public void print(char c) {
        w.print(c);
    }

    public void print(double v) {
        w.print(v);
    }

    public void print(String s) {
        w.print(s);
    }

    public void print(Object e) {
        w.print(e);
    }

    public void print(String sep, int... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, long... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, char... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, double... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, String... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void print(String sep, Object... a) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            s.append(a[i]);
            if (i < a.length - 1) {
                s.append(sep);
            }
        }
        print(s);
    }

    public void println() {
        w.println();
    }

    public void println(int v) {
        w.println(v);
    }

    public void println(long v) {
        w.println(v);
    }

    public void println(double v) {
        w.println(v);
    }

    public void println(char c) {
        w.println(c);
    }

    public void println(String s) {
        w.println(s);
    }

    public void println(Object e) {
        w.println(e);
    }

    public void println(String sep, int... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, long... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, double... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, char... a) {
        print(sep, a);
        println();
    }

    public void println(String sep, String... a) {
        print(sep, a);
        println();
    }

    // public void println(String sep, Object... a) {
    //     print(sep, a);
    //     println();
    // }

    public void flush() {
        w.flush();
    }

    public void close() {
        w.close();
    }

    public void clearBuilder() {
        sb = new StringBuilder();
    }

    public void reverse() {
        sb.reverse();
    }

    public void delete(int start, int end) {
        sb.delete(start, end);
    }

    public void delete(int length) {
        sb.delete(sb.length() - length, sb.length());
    }

    public int length() {
        return sb.length();
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

    private Const(){}
}


class In {
    public static final FastScanner fsc = new FastScanner();

    public static int ni() {
        return fsc.nextInt();
    }

    public static int[] ni(int n) {
        int[] a = new int[n];
        Arrays.setAll(a, i -> fsc.nextInt());
        return a;
    }

    public static int[][] ni(int n, int m) {
        int[][] a = new int[n][m];
        Arrays.setAll(a, i -> ni(m));
        return a;
    }

    public static long nl() {
        return fsc.nextLong();
    }

    public static long[] nl(int n) {
        long[] a = new long[n];
        Arrays.setAll(a, i -> fsc.nextLong());
        return a;
    }

    public static long[][] nl(int n, int m) {
        long[][] a = new long[n][m];
        Arrays.setAll(a, i -> nl(m));
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

    public static double[] nd(int n) {
        double[] a = new double[n];
        Arrays.setAll(a, i -> nd());
        return a;
    }

    public static double[][] nd(int n, int m) {
        double[][] a = new double[n][m];
        Arrays.setAll(a, i -> nd(m));
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

    public static boolean[][] inputGrid(int h, int w, char truechar) {
        boolean[][] grid = new boolean[h][w];
        for (int i = 0; i < h; i++) {
            char[] s = fsc.next().toCharArray();
            for (int j = 0; j < w; j++) {
                grid[i][j] = s[j] == truechar;
            }
        }
        return grid;
    }
}
