import java.awt.Point;
import java.util.function.*;
import java.util.*;
import java.io.*;

class Main {
    static Scanner scanner = new Scanner();
    static int mod = 1234567;
    static int inf = 0x7ffffff;

    public static void main(String[]$) throws Exception {
        String s = scanner.next();
        int n = s.length();
        Map<Integer, Integer> a = new HashMap<>();
        Map<Integer, Integer> b = new HashMap<>();
        Deque<Point> deque = new ArrayDeque<>();
        for (int i = 0; i <= n; i++) {
            if ((i == 0 || s.charAt(i - 1) == '>') && (i == n || s.charAt(i) == '<')) {
                deque.addLast(new Point(0, i));
            }
        }
        int last = -1;
        while (!deque.isEmpty()) {
            Point p = deque.poll();
            if (last < p.x) {
                a.putAll(b);
                b.clear();
            }
            int i = p.y;
            int m = Math.max(a.getOrDefault(i - 1, -1), a.getOrDefault(i + 1, -1)) + 1;
            if (a.getOrDefault(i, -1) < m) {
                b.put(i, m);
                if (0 < i && s.charAt(i - 1) == '>') {
                    deque.add(new Point(m + 1, i - 1));
                }
                if (i < n && s.charAt(i) == '<') {
                    deque.add(new Point(m + 1, i + 1));
                }
            }
            last = m;
        }
        a.putAll(b);
        System.out.println(a.values().stream().mapToInt(Integer::intValue).sum());
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
        }

        static void exit() {
            java.lang.System.exit(0);
        }
    }

    static class Scanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(java.lang.System.in), 0x10000);
        StringTokenizer tokenizer;

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
}
