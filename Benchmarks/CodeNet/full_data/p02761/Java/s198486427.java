import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws Exception {
        long startTime = System.nanoTime();
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        long endTime = System.nanoTime();
        err.println("Execution Time : +" + (endTime - startTime) / 1000000 + " ms");
        exit(0);
    }

    static void solve() {
        int n = in.nextInt();
        int m = in.nextInt();
        int[] cond = new int[10];
        Arrays.fill(cond, -1);
        for (int i = 0; i < m; i++) {
            int pos = in.nextInt() - 1;
            int val = in.nextInt();
            if (cond[pos] == -1) {
                cond[pos] = val;
            } else if (cond[pos] != val) {
                out.println(-1);
                return;
            }
        }
        if (m > n) {
            for (int i = n; i < m; i++) {
                if(cond[i]!=-1){
                    out.println(-1);
                    return;
                }
            }
        }
        if (cond[0] == 0 && n > 1) {
            out.println(-1);
            return;
        }
        if (n == 1 && cond[0] == 0) {
            out.println(0);
            return;
        }
        for (int i = (int) Math.pow(10, n - 1); i < (int) Math.pow(10, n); i++) {
            int end = n - 1;
            int temp = i;
            boolean found = true;
            while (temp > 0) {
                int d = temp % 10;
                temp /= 10;
                if (end >= 0 && cond[end] == -1) {
                    end--;
                    continue;
                }
                if (end >= 0 && cond[end] == d) {
                    end--;
                    continue;
                }
                found = false;
            }
            if (found) {
                out.println(i);
                return;
            }
        }
        out.println(-1);
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
