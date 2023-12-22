import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.function.BiFunction;

public class Main {

    static BiFunction<Integer, Integer, Integer> ADD = (x, y) -> (x + y);

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = in.nextInt();
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        long N = in.nextLong();
        out.println(N * (N - 1) / 2);
    }

    static void permute(int[] data) {
        int ans = 0;
        int[] c = new int[data.length];
        Arrays.fill(c, 0);
        int v = sumMod(data);
        if (v > ans) {
            ans = v;
            out.println(Arrays.toString(data) + " " + ans);
        }
        for (int i = 0; i < data.length; ) {
            if (c[i] < i) {
                if (i % 2 == 0) {
                    int t = data[0];
                    data[0] = data[i];
                    data[i] = t;
                } else {
                    int t = data[c[i]];
                    data[c[i]] = data[i];
                    data[i] = t;
                }
                v = sumMod(data);
                if (v > ans) {
                    ans = v;
                    out.println(Arrays.toString(data) + " " + ans);
                }
                c[i]++;
                i = 1;
            } else {
                c[i] = 0;
                i++;
            }
        }
        out.println(ans);
    }

    static int sumMod(int[] data) {
        int temp = 0;
        for (int i = 1; i <= data.length; i++) {
            temp += (i % data[i - 1]);
        }
        return temp;
    }

    static void debug(Object... args) {
        for (Object a : args) {
            out.println(a);
        }
    }

    static void y() {
        out.println("YES");
    }

    static void n() {
        out.println("NO");
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public int[] readAllInts(int n) {
            int[] p = new int[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public int[] readAllInts(int n, int s) {
            int[] p = new int[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n) {
            long[] p = new long[n];
            for (int i = 0; i < n; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public long[] readAllLongs(int n, int s) {
            long[] p = new long[n + s];
            for (int i = s; i < n + s; i++) {
                p[i] = in.nextInt();
            }
            return p;
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }
    }

    static void exit(int a) {
        out.close();
        err.close();
        System.exit(a);
    }

    static InputStream inputStream = System.in;
    static OutputStream outputStream = System.out;
    static OutputStream errStream = System.err;
    static InputReader in = new InputReader(inputStream);
    static PrintWriter out = new PrintWriter(outputStream);
    static PrintWriter err = new PrintWriter(errStream);
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

}
