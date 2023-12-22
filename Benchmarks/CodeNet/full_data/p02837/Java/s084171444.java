import java.awt.Point;
import java.util.*;
import java.io.*;
import java.util.function.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1000000007;
    static long inf = 0xfffffffffffffffL;

    void solve() {
        int n = scanner.nextInt();
        List<Point>[] list = new List[n];
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            list[i] = new ArrayList();
            for (int j = 0; j < a; j++) {
                int x = scanner.nextInt() - 1;
                int y = scanner.nextInt();
                list[i].add(new Point(x, y));
            }
        }
        int max = 0;
        l: for (int i = 0; i < 1 << n; i++) {//1=本当
            for (int j = 0; j < n; j++) {
                if (((i >> j) & 1) == 1) {
                    for (Point p : list[j]) {
                        if (((i >> p.x) & 1) != p.y) {
                            continue l;
                        }
                    }
                }
            }
            max = Math.max(max, Integer.bitCount(i));
        }
        System.out.println(max);
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
