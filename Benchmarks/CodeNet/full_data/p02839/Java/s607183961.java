import java.awt.Point;
import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int h = scanner.nextInt();
        int w = scanner.nextInt();
        int[][] a = new int[h][w];
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                a[i][j] = Math.abs(a[i][j] - scanner.nextInt());
            }
        }
        Map<Point, Set<Integer>> dp = new HashMap<>();
        dp.put(new Point(0, 0), new HashSet<>(Arrays.asList(a[0][0], -a[0][0])));
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                Set<Integer> set = new HashSet<>();
                dp.put(new Point(i, j), set);
                Set<Integer> left = dp.get(new Point(i, j - 1));
                if (left != null) {
                    for (Integer integer : left) {
                        set.add(integer + a[i][j]);
                        set.add(Math.abs(integer - a[i][j]));
                    }
                }
                Set<Integer> down = dp.get(new Point(i - 1, j));
                if (down != null) {
                    for (Integer integer : down) {
                        set.add(integer + a[i][j]);
                        set.add(Math.abs(integer - a[i][j]));
                    }
                }
            }
        }
        long min = inf;
        for (Integer i : dp.get(new Point(h - 1, w - 1))) {
            min = Math.min(min, i);
        }
        System.out.println(min);
    }

    public static void main(String[]$) {
        try {
            new Main().solve();
            System.out.flush();
        } catch (Throwable t) {
            System.out.flush();
            t.printStackTrace();
        }
    }
}

class System {
    static PrintWriter out = new PrintWriter(java.lang.System.out);

    static void exit() {
        java.lang.System.exit(0);
    }
}

class Scanner {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[][] nextCharArray(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
}
