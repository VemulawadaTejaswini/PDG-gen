import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        MyScanner in = new MyScanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        int N;
        int M;
        long[] x;
        long[] y;
        long[] z;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            N = in.Int();
            M = in.Int();
            x = new long[N];
            y = new long[N];
            z = new long[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.Long();
                y[i] = in.Long();
                z[i] = in.Long();
            }
            long max = 0;
            for (int i = 0; i < N; i++) {
                long score = calc(1, i, x[i], y[i], z[i]);
                max = Math.max(max, score);
            }
            out.println(max);
        }

        private long calc(int n, int i, long xs, long ys, long zs) {
            if (i >= N) {
                return 0;
            }
            if (n == M) {
                return Math.abs(xs) + Math.abs(ys) + Math.abs(zs);
            }

            long ret = 0;
            for (int j = i + 1; j < N; j++) {
                long temp = calc(n + 1, j, xs + x[j], ys + y[j], zs + z[j]);
                ret = Math.max(ret, temp);
            }


            return ret;
        }

    }

    static class MyScanner {
        private BufferedReader in;
        private StringTokenizer st;

        public MyScanner(InputStream stream) {
            in = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    String rl = in.readLine();
                    if (rl == null) {
                        return null;
                    }
                    st = new StringTokenizer(rl);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

        public long Long() {
            return Long.parseLong(next());
        }

    }
}

