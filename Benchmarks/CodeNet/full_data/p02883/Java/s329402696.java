import java.util.*;
import java.util.function.*;
import java.io.*;

class Main {
    static Scanner scanner = new Scanner();
    static long mod = 1000000007;
    static int inf = 0x7ffffff;

    public static void main(String[]$) throws Exception {
        int n = scanner.nextInt();
        long k = scanner.nextLong();
        int[] a = new int[n];
        int[] f = new int[n];
        long s1 = -k;
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            s1 += a[i];
        }
        long sum = s1;
        for (int i = 0; i < n; i++) {
            f[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        Arrays.sort(f);
        if (sum <= 0) {
            System.out.println(0);
            return;
        }
        long l = binarySearch(sum, i -> {
            long s = 0;
            for (int j = 0; j < n; j++) {
                s += a[n - j - 1] - i / f[j];
            }
            return s <= k;
        });
        System.out.println(l);
    }

    static long binarySearch(long max, LongPredicate predicate) {
        long ng = 0, ok = max;
        while (ok - ng > 1) {
            long mid = (ok + ng) / 2;
            if (predicate.test(mid)) {
                ok = mid;
            } else {
                ng = mid;
            }
        }
        return ok;
    }

    static class System {
        static PrintWriter out = new PrintWriter(java.lang.System.out);

        static {
            Runtime.getRuntime().addShutdownHook(new Thread(System.out::flush));
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
