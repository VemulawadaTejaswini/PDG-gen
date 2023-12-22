import java.io.*;
import java.util.*;

public class Main {

    static int N, P;
    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        P = sc.nextInt();
        S = sc.next();

        System.out.println(solve());
    }

    static int MOD;
    static int DIV_10;

    static long solve() {
        if( P == 2 || P == 5 ) {
            return solve25();
        }
        MOD = P;
        DIV_10 = div(1, 10);
        return count(0, N);
    }

    static long solve25() {
        long ans = 0;
        for (int i = 0; i < N; i++) {
            int d = S.charAt(i);
            if( d % P == 0 ) {
                ans += i+1;
            }
        }
        return ans;
    }

    // [l, r)
    static long count(int l, int r) {
        int len = r - l;
        if( len == 0 ) return 0;
        if( len == 1 ) return (S.charAt(l)-'0') % P == 0 ? 1 : 0;

        int m = (l+r)/2;

        long ret = 0;
        Counter cnt = new Counter();
        // 123456
        // 前半
        //   123, 23 3 を列挙
        // 後半
        //   4にたいして 前半を10倍したものとを比較
        //   45にたいして 前半を100倍
        //   456にたいして 前半を1000倍
        int prev = 0;
        int k = 1;
        for (int i = m-1; i >= l; i--) {
            int d = S.charAt(i) - '0';
            int curr = add(prev, mul(k, d));
            cnt.inc(curr);

            k = mul(k, 10);
            prev = curr;
        }

        prev = 0;
        int revK = DIV_10;
        for (int i = m; i < r; i++) {
            int d = S.charAt(i) - '0';
            int curr = add(mul(prev, 10), d);

            // 前半 * 10^k + 後半 = 0
            // => 前半 = -後半 / 10^k
            ret += cnt.get(mul(sub(0, curr), revK));

            prev = curr;
            revK = mul(revK, DIV_10);
        }

        ret += count(l, m);
        ret += count(m, r);
        return ret;
    }

    static int pow(int base, long exp) {
        if( exp == 0 ) return 1;

        int ans = 1;
        base %= MOD;
        while( exp > 0 ) {
            if( (exp & 1) == 1 ) {
                ans = mul(ans, base);
            }

            base = mul(base, base);
            exp = exp >> 1;
        }
        return ans;
    }

    static int sub(int a, int b) {
        int c = a - b;
        if( c < 0 ) c += MOD;
        return c;
    }

    static int div(int a, int b) {
        return mul(a, pow(b, MOD-2));
    }

    static int add(int a, int b) {
        int c = a + b;
        if( c >= MOD ) c %= MOD;
        return c;
    }

    static int mul(int a, int b) {
        long c = (long)a * b;
        if( c >= MOD ) c %= MOD;
        return (int)c;
    }

    static class Counter {

        Map<Integer, Integer> cnt = new HashMap<>();

        int inc(int key) {
            return cnt.merge(key, 1, Integer::sum);
        }

        int add(int key, int d) {
            return cnt.merge(key, d, Integer::sum);
        }

        int get(int key) {
            Integer value = cnt.get(key);
            return value != null ? value : 0;
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
