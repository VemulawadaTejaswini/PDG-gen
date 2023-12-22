import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[][] A;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = new int[N][];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextIntArray(N-1, -1);
        }

        System.out.println(solve());
    }

    static int solve() {
        ArrayDeque<Game> q = new ArrayDeque<>();
        int[] indice = new int[N];
        int ans = 0;

        Set<Integer> used = new HashSet<>();
        for (int a = 0; a < N; a++) {
            if( used.contains(a) ) continue;
            int b = A[a][0];
            if( used.contains(b) ) continue;

            if( A[b][0] == a ) {
                q.add( new Game(a, b, 1) );
                used.add(a);
                used.add(b);
            }
        }

        if( q.isEmpty() ) return -1;

//        for (Game game : q) {
//            debug("init", game.a, game.b);
//        }

        while(!q.isEmpty()) {
            Game game = q.poll();
            // debug("play", game.a, game.b);
            ans = Math.max(ans, game.day);
            indice[game.a]++;
            indice[game.b]++;

            if( indice[game.a] < N-1 ) {
                int c = A[game.a][indice[game.a]];
                if( A[c][indice[c]] == game.a ) {
                    q.add( new Game(game.a, c, game.day+1) );
                }
            }

            if( indice[game.b] < N-1 ) {
                int d = A[game.b][indice[game.b]];
                if( A[d][indice[d]] == game.b ) {
                    q.add( new Game(game.b, d, game.day+1) );
                }
            }
        }

        for (int i = 0; i < N; i++) {
            if( indice[i] != N-1 ) return -1;
        }

        return ans;
    }

    static class Game {
        int a, b;
        int day;

        public Game(int a, int b, int day) {
            this.a = a;
            this.b = b;
            this.day = day;
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
