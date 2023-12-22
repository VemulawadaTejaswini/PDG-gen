import java.io.*;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int[] X;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        X = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int solve() {
        int[] cnt = new int[100000+1];
        // modが0とM/2については特殊処理
        int zero = 0;
        int half = 0;
        for (int x : X) {
            if( x % M == 0 ) {
                zero++;
            } else if( M%2 == 0 && x%M == M/2 ) {
                half++;
            } else {
                cnt[x]++;
            }
        }

        int ans = 0;
        ans += zero/2;
        ans += half/2;

        ArrayDeque<Cards>[] mod = new ArrayDeque[M];
        for (int i = 0; i < M; i++) {
            mod[i] = new ArrayDeque<>();
        }

        ArrayDeque<Cards> qSolo = new ArrayDeque<>();

        for (int i = 1; i <= 100000; i++) {
            if( cnt[i] == 0 ) continue;

            int r = i % M;
            int s = (M-r)%M;
            if( cnt[i] % 2 == 0 ) {
                mod[r].addLast( new Cards(i, cnt[i]) );
            } else {
                Cards solo = new Cards(i, 1);
                mod[r].addFirst( solo );
                qSolo.add( solo );
                int ev = cnt[i] - 1;
                if( ev > 0 ) {
                    mod[r].addLast( new Cards(i, ev) );
                }
            }
        }

        while(!qSolo.isEmpty()) {
            Cards solo = qSolo.poll();
            if( solo.used ) continue;

            int r = solo.i % M;
            if( mod[M-r].isEmpty() ) continue;

            Cards pair = mod[M-r].poll();
            if( pair.size == 1 ) {
                ans++;
                solo.used = true;
                pair.used = true;

            } else {
                ans++;
                solo.used = true;

                // pair.sizeは 2以上のevenのはず
                int last = pair.size - 1;

                if( last == 1 ) {
                    mod[M-r].addFirst( new Cards(pair.i, 1) );

                } else {
                    mod[M-r].addFirst( new Cards(pair.i, 1) );
                    if( last-1 > 0 ) {
                        mod[M-r].addLast( new Cards(pair.i, last-1) );
                    }
                }
            }
        }

        // 残ったペアのカードを処理
        for (ArrayDeque<Cards> q : mod) {
            for (Cards cards : q) {
                if( !cards.used ) {
                    ans += cards.size/2;
                }
            }
        }

        return ans;
    }

    static class Cards {
        int i;
        int size;
        boolean used;

        public Cards(int i, int size) {
            this.i = i;
            this.size = size;
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
