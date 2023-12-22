import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.IntBinaryOperator;


public class Main {
    public static void main(String[] args) {
        FastScanner fsc = new FastScanner();
        int max = 2000;
        char[] a = fsc.next().toCharArray();
        char[] b = fsc.next().toCharArray();
        char[] c = fsc.next().toCharArray();
        int la = a.length;
        int lb = b.length;
        int lc = c.length;
        boolean[] ab = new boolean[100000];
        boolean[] ac = new boolean[100000];
        boolean[] bc = new boolean[100000];
        int bias = 50000;
        Arrays.fill(ab, true);
        Arrays.fill(ac, true);
        Arrays.fill(bc, true);
        for (int ai = 0; ai < la; ai++) {
            for (int bj = 0; bj < lb; bj++) {
                if (!ok(a[ai], b[bj])) {
                    ab[ai - bj + bias] = false;
                }
            }
        }
        for (int ai = 0; ai < la; ai++) {
            for (int cj = 0; cj < lc; cj++) {
                if (!ok(a[ai], c[cj])) {
                    ac[ai - cj + bias] = false;
                }
            }
        }
        for (int bi = 0; bi < lb; bi++) {
            for (int cj = 0; cj < lc; cj++) {
                if (!ok(b[bi], c[cj])) {
                    bc[bi - cj + bias] = false;
                }
            }
        }
        int ans = 3 * max;
        for (int bs = -2 * max; bs <= 2 * max; bs++) {
            for (int cs = -2 * max; cs <= 2 * max; cs++) {
                if (ab[bs + bias] && ac[cs + bias] && bc[cs - bs + bias]) {
                    int left = IntUtil.min(0, bs, cs);
                    int right = IntUtil.max(la, bs + lb, cs + lc);
                    ans = Math.min(ans, right - left);
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean ok(char x, char y) {
        return x == y || x == '?' || y == '?';
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


class IntUtil {

    private IntUtil(){}
    
    public static int min(int... a) {
        int ret = Const.IINF;
        for (int c : a) ret = Math.min(ret, c);
        return ret;
    }

    public static int max(int... a) {
        int ret = -Const.IINF;
        for (int c : a) ret = Math.max(ret, c);
        return ret;
    }

    /**
     * Caluculate the ceil of a/b. Returns the smallest integer greater than or
     * equal to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the smallest integer greater than or equal to a/b
     */
    public static int cld(int a, int b) {
        if (a > 0 && b > 0) return (a + b - 1) / b;
        else if (a < 0 && b < 0) return (a + b + 1) / b;
        else return a / b;
    }

    /**
     * Caluculate the floor of a/b. Returns the largest integer less than or equal
     * to a/b while 'a/b' rounds fractional parts to ZERO.
     * 
     * @param a
     * @param b
     * @return the largest integer less than or equal to a/b
     */
    public static int fld(int a, int b) {
        if (a <= 0 && b > 0) return (a - b + 1) / b;
        else if (a > 0 && b <= 0) return (a - b - 1) / b;
        else return a / b;
    }

    public static int fold(IntBinaryOperator func, int e, int... a) {
        int ret = e;
        for (int c : a) ret = func.applyAsInt(ret, c);
        return ret;
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
