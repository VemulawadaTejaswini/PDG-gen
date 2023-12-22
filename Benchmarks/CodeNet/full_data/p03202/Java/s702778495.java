import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        List<Range> r = new ArrayList<>();
        int ans = 1;
        int cur = 1;
        r.add( new Range(1, A[0], 1));

        for (int i = 1; i < N; i++) {
            if( A[i] > A[i-1] ) {
                Range last = r.get(r.size()-1);
                if( last.n == 1 ) {
                    // aa -> aaa
                    last.to = A[i];
                } else {
                    // ab -> aba
                    r.add( new Range(last.to+1, A[i], 1) );
                }

            } else if( A[i] == A[i-1] ) {
                NextResult result = next(r, cur);
                r = result.r;
                cur = result.n;
                ans = Math.max(result.n, ans);
                // aaa -> aab
                // aab -> abb

            } else {
                NextResult result = next(cut(r, A[i]), cur);
                r = result.r;
                cur = result.n;
                ans = Math.max(result.n, ans);
                // aaa -> ab
                // aba -> bb
            }
        }

        return ans;
    }

    static List<Range> cut(List<Range> r, int a) {
        // にぶたん使わないとかも
        int idx = r.size()-1;
        while(idx > 0) {
            Range ran = r.get(idx);
            if( ran.from <= a && a <= ran.to ) {
                break;
            } else {
                idx --;
            }
        }
        r.get(idx).to = a;
        return r.subList(0, idx+1);
    }

    static NextResult next(List<Range> r, int curMax) {
        // ([1, 3], a)(([4, 5]), b)([6, 7], a)
        // => ([1, 3], a)(([4, 5]), b)([6, 6], a)([7, 7], b)
        for (int i = r.size()-1; i >= 0 ; i--) {
            // abaa -> abab
            Range ran = r.get(i);
            if( ran.n < curMax ) {
                if( ran.from != ran.to ) {
                    // a -> b
                    ran.n = ran.n+1;
                    return new NextResult(r, curMax);

                } else {
                    ran.to = ran.to-1;
                    r.add(i, new Range(ran.to, ran.to, ran.n+1));
                    return new NextResult(r, curMax);
                }
            }
        }

        // aaa
        Range last = r.get(r.size()-1);
        if( last.from == last.to ) {
            // a -> b
            last.n = last.n+1;
            return new NextResult(r, last.n);

        } else {
            // aa -> ab
            last.to = last.to-1;
            r.add( new Range(last.to, last.to, last.n+1) );
            return new NextResult(r, last.n+1);
        }
    }

    static class NextResult {
        List<Range> r;
        int n;

        public NextResult(List<Range> r, int n) {
            this.r = r;
            this.n = n;
        }
    }

    // [from, to]
    static class Range {
        int from;
        int to;
        int n; // n番目の文字

        public Range(int from, int to, int n) {
            this.from = from;
            this.to = to;
            this.n = n;
        }

        public String toString() {
            return "Range([" + from + "," + to + "]," + n + ")";
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
