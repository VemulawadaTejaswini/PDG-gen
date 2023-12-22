import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int H, W;
    static int[][] A;
    static int[][] B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();

        A = new int[H][];
        for (int i = 0; i < H; i++) {
            A[i] = sc.nextIntArray(W);
        }
        B = new int[H][];
        for (int i = 0; i < H; i++) {
            B[i] = sc.nextIntArray(W);
        }

        System.out.println(solve());
    }

    static int solve() {
        MEMO = new BitSet[H][W];

        BitSet result = dfs(H-1, W-1);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < SIZE; i++) {
            if( result.get(i) ) {
                ans = Math.min(ans, Math.abs(ZERO-i));
            }
        }
        return ans;
    }

    static int SIZE = 26000;
    static int ZERO = 13000;

    static BitSet[][] MEMO;

    static BitSet dfs(int h, int w) {
        if( MEMO[h][w] != null ) return MEMO[h][w];

        int abs = Math.abs(A[h][w] - B[h][w]);
        if( h == 0 && w == 0 ) {
            BitSet bs = new BitSet(SIZE);
            bs.set(ZERO + abs, true);
            bs.set(ZERO - abs, true);
            MEMO[h][w] = bs;
            return bs;
        }

        BitSet bs = new BitSet(SIZE);
        if( h > 0 ) {
            BitSet result = dfs(h-1, w);
            BitSet copy1 = result.copy();
            BitSet copy2 = result.copy();
            copy1.shift(abs);
            bs.or(copy1);
            copy2.shiftR(abs);
            bs.or(copy2);
        }
        if( w > 0 ) {
            BitSet result = dfs(h, w-1);
            BitSet copy1 = result.copy();
            BitSet copy2 = result.copy();
            copy1.shift(abs);
            bs.or(copy1);
            copy2.shiftR(abs);
            bs.or(copy2);
        }

        MEMO[h][w] = bs;
        return bs;
    }

    static class BitSet {

        long[] bits;

        BitSet(int size) {
            bits = new long[((size + 63) / 64)];
        }

        private BitSet(long[] bits) {
            this.bits = bits;
        }

        void set(int index, boolean bit) {
            int q = index / 64;
            int r = index % 64;
            if (bit) {
                bits[q] |= 1L << r;
            } else {
                bits[q] &= ~(1L << r);
            }
        }

        boolean get(int index) {
            int q = index / 64;
            int r = index % 64;
            return (bits[q] & (1L << r)) != 0L;
        }

        void shift(int n) {
            int q = n / 64;
            int r = n % 64;
            for (int i = bits.length - 1; i >= 0; i--) {
                int src = i - q;
                if (src >= 0) {
                    bits[i] = bits[src] << r;
                    if (r > 0 && src > 0) {
                        bits[i] |= bits[src - 1] >>> (64 - r);
                    }
                } else {
                    bits[i] = 0L;
                }
            }
        }

        void shiftR(int n) {
            int q = n / 64;
            int r = n % 64;
            for (int i = 0; i < bits.length; i++) {
                int src = i + q;
                if (src < bits.length) {
                    bits[i] = bits[src] >>> r;
                    if (r > 0 && src + 1 < bits.length) {
                        bits[i] |= bits[src + 1] << (64 - r);
                    }
                } else {
                    bits[i] = 0L;
                }
            }
        }

        void shiftOr(int n) {
            int q = n / 64;
            int r = n % 64;
            for (int i = bits.length - 1; i > q; i--) {
                int src = i - q;
                bits[i] |= bits[src] << r;
                if (r > 0) {
                    bits[i] |= (bits[src - 1] >>> (64 - r));
                }
            }
            bits[q] |= bits[0] << r;
        }

        void or(BitSet b) {
            for (int i = 0; i < bits.length; i++) {
                bits[i] |= b.bits[i];
            }
        }

        void and(BitSet b) {
            for (int i = 0; i < bits.length; i++) {
                bits[i] &= b.bits[i];
            }
        }

        BitSet copy() {
            return new BitSet(Arrays.copyOf(bits, bits.length));
        }
    }

    @SuppressWarnings("unused")
    static class FastScanner {
        private BufferedReader reader;
        private StringTokenizer tokenizer;

        FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken("\n");
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextLong();
            return a;
        }
    }

    static void writeLines(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int a : as) pw.println(a);
        pw.flush();
    }

    static void writeLines(long[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (long a : as) pw.println(a);
        pw.flush();
    }

    static void writeSingleLine(int[] as) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < as.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(as[i]);
        }
        pw.println();
        pw.flush();
    }

    static int max(int... as) {
        int max = Integer.MIN_VALUE;
        for (int a : as) max = Math.max(a, max);
        return max;
    }

    static int min(int... as) {
        int min = Integer.MAX_VALUE;
        for (int a : as) min = Math.min(a, min);
        return min;
    }

    static void debug(Object... args) {
        StringJoiner j = new StringJoiner(" ");
        for (Object arg : args) {
            if (arg == null) j.add("null");
            else if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }

    static void printSingleLine(int[] array) {
        PrintWriter pw = new PrintWriter(System.out);
        for (int i = 0; i < array.length; i++) {
            if (i != 0) pw.print(" ");
            pw.print(array[i]);
        }
        pw.println();
        pw.flush();
    }

    static int lowerBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] < value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }

    static int upperBound(int[] array, int value) {
        int lo = 0, hi = array.length, mid;
        while (lo < hi) {
            mid = (hi + lo) / 2;
            if (array[mid] <= value) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}
