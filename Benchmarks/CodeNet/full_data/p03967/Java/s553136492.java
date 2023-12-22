import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class Main {

    int[] T;
    //    int[][] memo;
    Map<Long, Integer> memo;

    public static final int INF = -1145141919;

    private void solve(FastScanner sc) {
        char[] s = sc.next().toCharArray();
        int n = s.length;
        T = new int[n];
        memo = new HashMap<>();
        for (int i = 0; i < n; i++) {
            T[i] = s[i] == 'g' ? 1 : 0;
        }
        System.out.println(Math.max(rec(n, 0), rec(n, 1)));
    }

    private int rec(int turn, int par) {
        if (par == -1 || turn < par) return INF;
        if (turn == 0) return 0;
        long key = iToL(turn, par);
        if (memo.containsKey(key)) return memo.get(key);
        int t = T[turn - 1];
        int value = Math.max(rec(turn - 1, par + 1) + t, rec(turn - 1, par - 1) + t - 1);
        memo.put(key, value);
        return value;
    }

    /*
     * template
     */

    public static long iToL(int fst, int snd) {
        return ((long) (fst) << 32) | (long) snd & 0xffffffffL;
    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        new Main().solve(sc);
    }

    static class FastScanner {
        private final InputStream in = System.in;
        private final byte[] buffer = new byte[1024];
        private int ptr = 0;
        private int bufLen = 0;

        private boolean hasNextByte() {
            if (ptr < bufLen) {
                return true;
            } else {
                ptr = 0;
                try {
                    bufLen = in.read(buffer);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (bufLen <= 0) {
                    return false;
                }
            }
            return true;
        }

        private int readByte() {
            if (hasNextByte()) return buffer[ptr++];
            else return -1;
        }

        private static boolean isPrintableChar(int c) {
            return 33 <= c && c <= 126;
        }

        boolean hasNext() {
            while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
            return hasNextByte();
        }

        String next() {
            if (!hasNext()) throw new NoSuchElementException();
            StringBuilder sb = new StringBuilder();
            int b = readByte();
            while (isPrintableChar(b)) {
                sb.appendCodePoint(b);
                b = readByte();
            }
            return sb.toString();
        }

        long nextLong() {
            if (!hasNext()) throw new NoSuchElementException();
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

        int nextInt() {
            long nl = nextLong();
            if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
            return (int) nl;
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }
    }
}