import java.io.*;
import java.util.*;

public class Main {

    static int N, K;
    static Sushi[] S;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        S = new Sushi[N];
        for (int i = 0; i < N; i++) {
            S[i] = new Sushi(sc.nextInt(), sc.nextInt());
        }

        System.out.println(solve());
    }

    static long solve() {
        // x種類食べたときの満足ポイントの最大値をmanzoku(x)とすると
        // 1. 美味しい寿司順に食べたとき、(xがいくつかは知らないけど)manzoku(x)を達成する
        // 2. manzoku(x) -> manzoku(x+1) は導ける
        PriorityQueue<Sushi> q = new PriorityQueue<>(Comparator.<Sushi>comparingInt(s -> s.d).reversed());
        for (Sushi s : S) {
            q.add(s);
        }
        Set<Integer> types = new HashSet<>();
        PriorityQueue<Sushi> secondaries = new PriorityQueue<>(Comparator.comparingInt(s -> s.d));
        long dSum = 0;
        for (int i = 0; i < K; i++) {
            Sushi s = q.poll();
            if( types.contains(s.t) ) {
                secondaries.add(s);
            } else {
                types.add(s.t);
            }
            dSum += s.d;
        }
        long ans = dSum + (long)types.size() * types.size();
        for (int i = K; i < N; i++) {
            if( secondaries.isEmpty() ) break;

            Sushi s = q.poll();
            if( !types.contains(s.t) ) {
                types.add(s.t);
                Sushi ss = secondaries.poll();
                dSum -= ss.d;
                dSum += s.d;
                ans = Math.max(ans, dSum + (long)types.size() * types.size());
            }
        }
        return ans;
    }

    static class Sushi {
        int t, d;

        public Sushi(int t, int d) {
            this.t = t;
            this.d = d;
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
