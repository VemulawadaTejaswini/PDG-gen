import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.function.Function;
import java.util.StringTokenizer;
import java.io.BufferedReader;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.Int();
            int[] A = in.Int(N);
            int[] B = in.Int(N);
            int[] C = in.Int(N);
            Arrays.sort(A);
            Arrays.sort(B);
            Arrays.sort(C);

            int[] bc = new int[N + 1];
            for (int i = 0; i < N; i++) {
                int f = B[i];
                int n = nibu(N, mid -> f >= C[mid]);
                bc[i + 1] = N - n + bc[i];
            }
            long ans = 0;
            for (int i = 0; i < N; i++) {
                int f = A[i];
                int n = nibu(N, mid -> f >= B[mid]);
                ans += bc[N] - bc[n];
            }
            out.println(ans);
        }

        private int nibu(int n, Function<Integer, Boolean> check) {
            int ng = -1, ok = n;
            while (Math.abs(ok - ng) > 1) {
                int mid = (ng + ok) / 2;
                boolean f = check.apply(mid);
                if (f) {
                    ng = mid;
                } else {
                    ok = mid;
                }
            }
            return ok;
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

        public int[] Int(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Int();
            }
            return a;
        }

    }
}

