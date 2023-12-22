import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

    static int N;
    static String S;
    static Query[] Q;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        N = sc.nextInt();
        S = sc.next();
        int q = sc.nextInt();
        Q = new Query[q];
        for (int i = 0; i < q; i++) {
            int type = sc.nextInt();
            if( type == 1 ) {
                Q[i] = new Change(sc.nextInt(), sc.next().charAt(0));
            } else {
                Q[i] = new Question(sc.nextInt(), sc.nextInt());
            }
        }

        solve(pw);
        pw.flush();
    }

    interface Query {
    }

    static class Change implements Query {
        int idx;
        char c;

        public Change(int idx, char c) {
            this.idx = idx;
            this.c = c;
        }
    }

    static class Question implements Query {
        int l, r;

        public Question(int l, int r) {
            this.l = l;
            this.r = r;
        }
    }

    static void solve(PrintWriter pw) {
        // とりあえずセグ木を思いつくが500でセグ木は負けっぽいので他の方法を考えると文字毎に木作ればいけるなとなる
        // セグ木のほうが多分楽だな...
        TreeSet<Integer>[] sets = new TreeSet[26];
        for (int i = 0; i < 26; i++) {
            sets[i] = new TreeSet<>();
        }

        for (int i = 0; i < N; i++) {
            int c = S.charAt(i) - 'a';
            sets[c].add(i);
        }

        char[] T = S.toCharArray();

        for (Query each : Q) {
            if( each instanceof Change ) {
                Change ch = (Change) each;
                int c = T[ch.idx-1] - 'a';
                sets[c].remove(ch.idx);
                sets[ch.c - 'a'].add(ch.idx);
                T[ch.idx-1] = ch.c;

            } else {
                Question q = (Question) each;

                int cnt = 0;
                for (int i = 0; i < 26; i++) {
                    Integer from = sets[i].ceiling(q.l-1);
                    if( from != null && from <= q.r-1 ) cnt++;
                }
                pw.println(cnt);
            }
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
