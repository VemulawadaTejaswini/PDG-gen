import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

    static int[][][] data;
    static Set<Integer> honest = new HashSet<>();
    static Set<Integer> dis_honest = new HashSet<>();

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
        int [] AS  = new int[20];
        data = new int[20][20][20];
        for (int i = 0; i < 20; i++) {
            for (int i1 = 0; i1 < 20; i1++) {
                Arrays.fill(data[i][i1], -1);
            }
        }

        for (int i = 0; i < n; i++) {
            int A = in.nextInt();
            AS[i]=A;
            for (int j = 0; j < A; j++) {
                int x = in.nextInt();
                int y = in.nextInt();
                data[i][j][x] = y;
            }
        }

        int ans = 0;
        for (int i = 0; i < (1 << n); i++) {
            honest.clear();
            dis_honest.clear();
            for (int j = 0; j < AS[i]; j++) {
                if (((1 << j) & i) > 0) {
                    compute(j);
                    honest.add(j + 1);
                } else {
                    computeNeg(j);
                    dis_honest.add(j + 1);
                }
            }
            int orig = honest.size();
            //            out.println(honest);
            //            out.println(dis_honest);
            honest.retainAll(dis_honest);
            if (honest.isEmpty()) {
                ans = Math.max(ans, orig);
            }
        }
        out.println(ans);
    }

    public static void compute(int j) {
        for (int i1 = 0; i1 < 20; i1++) {
            for (int i2 = 0; i2 < 20; i2++) {
                if (data[j][i1][i2] == 1) {
                    honest.add(i2);
                } else if (data[j][i1][i2] == 0) {
                    dis_honest.add(i2);
                }
            }
        }
    }

    public static void computeNeg(int j) {
        for (int i1 = 0; i1 < 20; i1++) {
            for (int i2 = 0; i2 < 20; i2++) {
                if (data[j][i1][i2] == 0) {
                    honest.add(i2);
                } else if (data[j][i1][i2] == 1) {
                    dis_honest.add(i2);
                }
            }
        }
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
