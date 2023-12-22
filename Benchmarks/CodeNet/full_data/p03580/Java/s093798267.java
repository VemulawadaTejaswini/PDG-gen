import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.Function;

public class Main {

    static int N;
    static String S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        S = sc.next();

        System.out.println(solve());
    }

    static int solve() {
        int ans = 0;
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int one = 0;
        State s = State.EMPTY;
        for (int i = 0; i < N; i++) {
            switch (s) {
                case ONE:
                    if( S.charAt(i) == '1' ) {
                        one++;

                    } else {
                        s = State.ZERO;
                    }
                    break;

                case ZERO:
                    if( S.charAt(i) == '1' ) {
                        q.add(one);
                        s = State.ONE;
                        one = 1;
                    } else {
                        q.add(one);
                        ans += runDp(q);
                        one = 0;
                        s = State.EMPTY;
                    }
                    break;

                case EMPTY:
                    if( S.charAt(i) == '1' ) {
                        s = State.ONE;
                        one = 1;

                    } else {
                        // sonomama
                    }
                    break;

                default:
                    throw new IllegalStateException("wtf");
            }
        }

        if( s == State.ONE || s == State.ZERO ) {
            q.add(one);
            ans += runDp(q);
        }

        return ans;
    }

    enum State {
        ONE,
        ZERO,
        EMPTY
    }

    static int runDp(ArrayDeque<Integer> q) {
        if( q.size() == 1 ) {
            q.clear();
            return 0;
        }

        // debug(q);

        int[][] curr = new int[4][2];
        int[][] prev = new int[4][2];
        int first = q.poll();
        curr[0][0] = first;
        curr[1][0] = first;
        curr[2][0] = first;
        curr[3][0] = first;

        while(!q.isEmpty()) {
            int[][] temp = prev;
            prev = curr;
            curr = temp;
            for (int i = 0; i < 4; i++) {
                curr[i][0] = 0;
                curr[i][1] = 0;
            }

            int b = q.poll();
            for (int i = 0; i < 3; i++) {
                int a = prev[i][0];

                // debug("a", a, "b", b);

                // +0, b残す
                curr[0][0] = b;
                curr[0][1] = Math.max(prev[i][1], curr[0][1]);
                if( a == 0 ) continue; // aが残ってないと以下は無理

                // +a, b-1残す
                curr[1][0] = b-1;
                curr[1][1] = Math.max(prev[i][1] + a, curr[1][1]);

                // +(b-1), 1残す
                curr[2][0] = 1;
                curr[2][1] = Math.max(prev[i][1] + (b-1), curr[2][1]);

                // +b, 0残す
                curr[3][0] = 0;
                curr[3][1] = Math.max(prev[i][1] + b, curr[3][1]);
            }
        }

        int ret = max(curr[0][1], curr[1][1], curr[2][1], curr[3][1]);
        // debug(ret);
        return ret;
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
