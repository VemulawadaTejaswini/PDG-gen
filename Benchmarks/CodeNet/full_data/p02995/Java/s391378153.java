import java.io.*;
import java.math.BigInteger;
import java.util.*;
import java.util.function.Function;

public class Main {

    static long A, B;
    static int C, D;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        A = sc.nextLong();
        B = sc.nextLong();
        C = sc.nextInt();
        D = sc.nextInt();

        System.out.println(solve());
    }

    static long jikken(long N) {
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            if( i % C != 0 && i % D != 0 ) {
                set.add(i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        list.sort(Comparator.naturalOrder());
        debug(list);
        return set.size();
    }

    static long solve() {
        return calc(B) - calc(A-1);
    }

    static long gcd(long a, long b) {
        while (b > 0) {
            long c = a;
            a = b;
            b = c % b;
        }
        return a;
    }

    static long calc(long n) {
        long c = n / C;
        long d = n / D;

        long g = gcd(C, D);
        long lcs = (long)C * D / g;
        long cd = n / lcs;

        return n - (c + d - cd);
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
            for (int i = 0; i < n; i++)
                a[i] = nextInt();
            return a;
        }

        int[] nextIntArray(int n, int delta) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = nextInt() + delta;
            return a;
        }

        long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        }
    }

    static <A> void writeLines(A[] as, Function<A, String> f) {
        PrintWriter pw = new PrintWriter(System.out);
        for (A a : as) {
            pw.println(f.apply(a));
        }
        pw.flush();
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
            if (arg instanceof int[]) j.add(Arrays.toString((int[]) arg));
            else if (arg instanceof long[]) j.add(Arrays.toString((long[]) arg));
            else if (arg instanceof double[]) j.add(Arrays.toString((double[]) arg));
            else if (arg instanceof Object[]) j.add(Arrays.toString((Object[]) arg));
            else j.add(arg.toString());
        }
        System.err.println(j.toString());
    }
}
