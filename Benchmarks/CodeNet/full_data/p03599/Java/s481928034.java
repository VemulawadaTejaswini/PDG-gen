import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        int A;
        int B;
        int C;
        int D;
        int E;
        int F;

        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            A = in.Int() * 100;
            B = in.Int() * 100;
            C = in.Int();
            D = in.Int();
            E = in.Int();
            F = in.Int();
            int[] dp = new int[F + 1];
            Arrays.fill(dp, -1);
            dp[0] = 0;
            for (int i = 0; i <= F; i++) {
                if (dp[i] >= 0) {
                    for (int w : Arrays.asList(A, B)) {
                        for (int j = i + w; j <= F; j += w) {
                            if (dp[j] == -1) {
                                dp[j] = sugar(j);
                            } else {
                                dp[j] = Math.max(dp[j], sugar(j));
                            }
                        }
                    }
                }
            }
            int[] ans = new int[2];
            double p = 0;
            for (int i = 0; i <= F; i++) {
                if (dp[i] >= 0 && i + dp[i] <= F) {
                    double tmp = 100.0 * dp[i] / (i + dp[i]);
                    if (p - tmp < 0) {
                        ans[0] = i + dp[i];
                        ans[1] = dp[i];
                    }
                }
            }
            out.println(ans[0] + " " + ans[1]);
        }

        private int sugar(int w) {
            int e = E * (w / 100);
            boolean[] dp = new boolean[e + 1];
            Arrays.fill(dp, false);
            dp[0] = true;
            for (int i = 0; i < e; i++) {
                if (dp[i]) {
                    for (int s : Arrays.asList(C, D)) {
                        for (int j = i + s; j <= e; j += s) {
                            dp[j] = true;
                        }
                    }
                }
            }
            for (int i = e; i >= 0; i--) {
                if (dp[i]) {
                    return i;
                }
            }
            return 0;
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
                    return null;
                }
            }
            return st.nextToken();
        }

        public int Int() {
            return Integer.parseInt(next());
        }

    }
}

