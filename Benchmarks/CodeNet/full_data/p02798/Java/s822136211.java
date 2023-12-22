import java.io.*;
import java.util.Arrays;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class Main {

    static int N;
    static int[] A, B;

    public static void main(String[] args) {
        FastScanner sc = new FastScanner(System.in);
        N = sc.nextInt();
        A = sc.nextIntArray(N);
        B = sc.nextIntArray(N);

        System.out.println(solve());
    }

    static int INF = 1_000_000_000;

    static int solve() {
        Node[] nodes = new Node[N];
        for (int i = 0; i < N; i++) {
            nodes[i] = new Node();
        }
        int ans = INF;
        for (int s = 0; s < 1<<N; s++) {
            if( Integer.bitCount(s) % 2 == 1 ) continue; // ありえない

            for (int b = 0; b < N; b++) {
                Node node = nodes[b];
                node.i = b;
                if( (s & (1 << b)) == 0 ) {
                    // そのまま
                    node.v = A[b];
                    node.odd = b%2==1;
                    node.flip = false;

                } else {
                    // flip
                    node.v = B[b];
                    node.odd = b%2==0;
                    node.flip = true;
                }
            }

            ans = Math.min(ans, countMove(nodes));
        }
        return ans == INF ? -1 : ans;
    }

    static int countMove(Node[] nodes) {
        // Nがちいさいので多少無駄でも大丈夫だろう、多分
        int ret = 0;
        for (int i = 0; i < N; i++) {
            // iに移動するものを探す
            int idx = -1;
            int nextv = minValue(nodes, i);
            for (int j = i; j < N; j++) {
                Node node = nodes[j];
                if( node.odd != (i%2==1) ) continue;
                if( node.v != nextv ) continue;

                if( idx == -1 ) {
                    idx = j;

                } else {
                    if( node.v < nodes[idx].v ) {
                        idx = j;
                    }
                }
            }
            if( idx == -1 ) return INF; // iに移動できるものはなかった

            move(nodes, i, idx);
            ret += idx-i;
        }
        return ret;
    }

    static int minValue(Node[] nodes, int i) {
        int min = nodes[i].v;
        for (int j = i+1; j < N; j++) {
            min = Math.min(min, nodes[j].v);
        }
        return min;
    }

    // iにjを横滑りする感じで移動させる
    static void move(Node[] nodes, int i, int j) {
        for (int k = j; k > i; k--) {
            Node t = nodes[k];
            nodes[k] = nodes[k-1];
            nodes[k-1] = t;
        }
    }

    static class Node {
        int i, v;
        boolean odd; // oddの場所に移動することを期待する
        boolean flip;

        public String toString() {
            return "(" + v + " " + (odd ? "odd" : "eve") + (flip ? " flip" : "") + ")";
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
