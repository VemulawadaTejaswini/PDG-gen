import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;
import java.util.function.IntPredicate;

public class Main {

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);

        Query q = new Query(sc);
        solve(q);
    }

    static void solve(Query q) {
        // A. 数=小, 辞=小 (yes)
        // B. 数=大, 辞=小 (no)
        // c. 数=小, 辞=大 (no)
        // D. 数=大, 辞=大 (yes)

        // 最強格(10ベキ)かどうか調べる
        // A. 1, 10, 100...
        // B. []
        // C. 他全部
        // D. []
        boolean resp = q.ask(1_000_000_000);
        if( resp ) {
            // 10ベキ調べるモード
            solve10(q);
            return;
        }

        // 桁を確定する
        // 10^kで問い合わせたとすると
        // A. [] (10ベキは除外されている)
        // B. [] (N>10^k + 10ベキを除外しているので10^kは辞書順最強)
        // C. [1, 10^k]
        // D. [10^k, 999] ( 10^(k+1)以上はそれ以前に除外済み)
        // ということでtrueが来たら桁が確定する
        for (int k = 8; k >= 0; k--) {
            resp = q.ask((int)Math.pow(10, k));
            if( resp ) {
                solveK(k, q);
                return;
            }
        }
        // 来ない予定
        throw new RuntimeException("wtf");
    }

    static void solveK(int k, Query q) {
        // k桁のどれか
        int from = (int)Math.pow(10, k);
        int to = from * 10;
        int n = maximize(from, to, x -> {
            // 10倍することでいい感じになる
            // A. [10^k, x]
            // B. [] (10倍してる)
            // C. [x+1, 10^(k+1))
            // D. [] (10倍してる)
            return q.ask(x * 10);
        });
    }

    static void solve10(Query q) {
        // どの10ベキか調べる
        for (int k = 0; k < 9; k++) {
            int one = (int)Math.pow(10, k);
            int two = 2 * one;
            boolean resp = q.ask(two);
            if( resp ) {
                q.send( one );
                return;
            }
        }
        q.send(1_000_000_000);
    }

    static class Query {
        FastScanner sc;

        Query(FastScanner sc) {
            this.sc = sc;
        }

        boolean ask(int n) {
            System.out.println("? " + n);
            System.out.flush();
            String s = sc.next();
            return s.equals("Y");
        }

        void send(int n) {
            System.out.println("! " + n);
            System.out.flush();
        }
    }

    static int maximize(int lo, int hi, IntPredicate p) {
        while(lo < hi) {
            int x = ((hi - lo) >>> 1) + lo;
            if( p.test(x) ) {
                lo = x + 1;
            } else {
                hi = x;
            }
        }
        return lo - 1;
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
