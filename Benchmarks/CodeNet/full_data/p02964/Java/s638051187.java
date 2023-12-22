import java.io.*;
import java.util.*;
import java.util.function.Function;

public class Main {

    static int N;
    static long K;
    static int[] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextLong();
        A = sc.nextIntArray(N);

        ArrayDeque<Integer> ans = solve();
        System.out.println( mkString(ans, " ") );
    }

    static <A> String mkString(Collection<A> as, String sep) {
        StringJoiner j = new StringJoiner(sep);
        for (A a : as) {
            j.add(String.valueOf(a));
        }
        return j.toString();
    }

    static ArrayDeque<Integer> solve() {
        // G[i] = j
        // iからstartした場合に次はjからstartする
        int[] G = new int[N];
        int[] dist = new int[N];
        int[] prev = new int[200001];
        Arrays.fill(prev, -1);
        Arrays.fill(G, -1);

        for (int i = 0; i < N*2; i++) {
            int a = A[i%N];
            if( prev[a] != -1 && G[prev[a]] == -1) {
                G[prev[a]] = (i+1)%N;
                dist[prev[a]] = (i+1) - prev[a];
            }
            prev[a] = i%N;
        }

        // どこで一周するか、一周する際にどれだけコストがかかるか
        // 余りのあるloopだったら困るので対応しているがそういう例ってあるのか？
        long totalLen = 0;
        long loopLen = 0;
        boolean[] done = new boolean[N];
        int curr = 0;
        done[0] = true;
        int loopStart;
        while(true) {
            int next = G[curr];
            totalLen += dist[curr];
            if( done[next] ) {
                loopStart = next;
                break;
            }
            curr = next;
        }
        curr = loopStart;
        while(true) {
            int next = G[curr];
            loopLen += dist[curr];
            if( next == loopStart ) break;
            curr = next;
        }
        long amariLen = totalLen - loopLen;

        long r = N*K;
        int idx = 0;
        if( r > amariLen ) {
            r -= amariLen;
            idx = loopStart;
        } else {
            return simulate(idx, G, (int)r);
        }

        r %= loopLen;

        while(true) {
            if( r > dist[idx] ) {
                r -= dist[idx];
                idx = G[idx];
            } else {
                return simulate(idx, G, (int)r);
            }
        }
    }

    static ArrayDeque<Integer> simulate(int start, int[] G, int r) {
        // debug(start, r);
        ArrayDeque<Integer> q = new ArrayDeque<>();
        Set<Integer> set = new HashSet<>();
        int i = start;
        while(r --> 0) {
            int a = A[i++];
            if( set.contains(a) ) {
                while(true) {
                    int last = q.pollLast();
                    set.remove(last);
                    if( a == last ) break;
                }
            } else {
                set.add(a);
                q.addLast(a);
            }
        }
        return q;
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
