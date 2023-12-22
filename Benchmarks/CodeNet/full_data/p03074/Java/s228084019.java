import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N, K;
    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        S = sc.next();

        System.out.println(solve());
    }

    static int solve() {
        if( N == 1 ) return 1;

        List<Integer> C = new ArrayList<>();
        if( S.charAt(0) == '0' ) C.add(0); // 番兵
        int idx = 0;
        while(idx < N ) {
            if( S.charAt(idx) == '0' ) {
                int next = skip(idx, '0');
                C.add(idx-next);
                idx = next;

            } else {
                int next = skip(idx, '1');
                C.add(next-idx);
                idx = next;
            }
        }
        if( S.charAt(N-1) == '0' ) C.add(0); // 番兵

        int sum = 0;
        idx = 0;
        while(idx < Math.min(C.size(), K*2+1) ) {
            if( C.get(idx) < 0 ) {
                sum += Math.abs(C.get(idx++));
            } else {
                sum += C.get(idx++);
            }
        }
        int ans = sum;

        while(idx < C.size()) {
            sum -= Math.abs(C.get(idx-(K*2 + 1)));
            sum -= Math.abs(C.get(idx - (K*2)));
            sum += Math.abs(C.get(idx++));
            sum += Math.abs(C.get(idx++));
            ans = Math.max(ans, sum);

        }
        return ans;
    }

    static int skip(int idx, char c) {
        while( idx < N && S.charAt(idx) == c ) {
            idx++;
        }
        return idx;
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
