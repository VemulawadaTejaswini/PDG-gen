import java.io.*;
import java.util.*;

public class Main {

    static int H, W, K;
    static int[][] C;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        K = sc.nextInt();

        C = new int[H][W];
        for (int i = 0; i < H; i++) {
            String s = sc.next();
            for (int j = 0; j < W; j++) {
                C[i][j] = s.charAt(j) == '0' ? 0 : 1;
            }
        }

        System.out.println(solve());
    }

    static int solve() {
        if( H == 1 ) return solve1();

        accumlate(H, W, C);
        int ans = H * W; // 最悪でも全分割したら達成可能
        for (int s = 0; s < 1 << (H-1); s++) {
            int r = calc(s);
            if( r != -1 ) {
                ans = Math.min(ans, r);
            }
        }
        return ans;
    }

    static int calc(int s) {
        int d = Integer.bitCount(s);
        Range[] hs = toRange(s);
        int w1 = 0;
        for (int w2 = 0; w2 < W; w2++) {

            if( isOk(w1, w2, hs) ) continue;

            w1 = w2;
            if( isOk(w1, w2, hs) ) {
                d++;
            } else {
                return -1;
            }
        }
        return d;
    }

    static boolean isOk(int w1, int w2, Range[] hs) {
        for (Range h : hs) {
            int count = get(h.r1, w1, h.r2, w2, C);
            if( count > K ) return false;
        }
        return true;
    }

    static Range[] toRange(int s) {
        List<Range> ranges = new ArrayList<>();
        Range r = new Range();
        r.r1 = 0;
        for (int b = 0; b < H-1; b++) {
            if( (s & (1 << b)) != 0 ) {
                r.r2 = b;
                ranges.add(r);
                r = new Range();
                r.r1 = b+1;
            }
        }
        r.r2 = H-1;
        ranges.add(r);
        return ranges.toArray(new Range[0]);
    }

    static class Range {
        int r1, r2;

        public String toString() {
            return "[" + r1 + "," + r2 + "]";
        }
    }

    static int solve1() {
        int k = 0;
        int d = 0;
        for (int w = 0; w < W; w++) {
            if( C[0][w] == 1 ) {
                k++;
            }
            if( k == K ) {
                k = 0;
                d++;
            }
        }
        return d;
    }

    static void accumlate(int h, int w, int[][] c) {
        for (int i = 0; i < h; i++) {
            for (int j = 1; j < w; j++) {
                c[i][j] += c[i][j-1];
            }
        }
        for (int j = 0; j < w; j++) {
            for (int i = 1; i < h; i++) {
                c[i][j] += c[i-1][j];
            }
        }
    }

    // [h1, h2], [w1, w2]
    static int get(int h1, int w1, int h2, int w2, int[][] c) {
        // d c
        // b a
        int abcd = c[h2][w2];

        int cd;
        if( h1 > 0 ) {
            cd = c[h1-1][w2];
        } else {
            cd = 0;
        }

        int bd;
        if( w1 > 0 ) {
            bd = c[h2][w1-1];
        } else {
            bd = 0;
        }

        int d;
        if( w1 > 0 && h1 > 0 ) {
            d = c[h1-1][w1-1];
        } else {
            d = 0;
        }

        return abcd - cd - bd + d;
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
