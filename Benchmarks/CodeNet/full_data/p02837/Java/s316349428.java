import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
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
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int N = in.nextInt();

            int[][] com = new int[N + 1][N + 1];
            for (int i = 1; i <= N; i++) {
                Arrays.fill(com[i], -1);
                int A = in.nextInt();
                for (int j = 0; j < A; j++) {
                    int x = in.nextInt();
                    int y = in.nextInt();
                    com[i][x] = y;
                }
            }

            int[] rev = new int[]{1, 0};
            int max = 0;
            int[] ans = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                Arrays.fill(ans, -1);
                ans[0] = 0;
                ans[i] = 1;
                for (int j = 1; j <= N; j++) {
                    if (com[i][j] >= 0) {
                        ans[j] = com[i][j];
                    }
                }
                boolean f = false;
                for (int j = 1; j <= N; j++) {
                    if (j == i) {
                        continue;
                    }
                    for (int k = 1; k <= N; k++) {
                        if (j == k) {
                            continue;
                        }
                        if (com[j][k] >= 0) {
                            if (ans[k] == -1) {
                                if (ans[j] == 0) {
                                    ans[k] = rev[com[j][k]];
                                } else {
                                    ans[k] = com[j][k];
                                }
                            } else {
                                if (ans[j] == 0 && rev[com[j][k]] != ans[k] ||
                                        ans[j] == 1 && com[j][k] != ans[k]) {
                                    f = true;
                                    break;
                                }
                                if (ans[j] == -1) {
                                    if (rev[com[j][k]] == ans[k]) {
                                        ans[j] = 0;
                                    } else if (com[j][k] == ans[k]) {
                                        ans[j] = 1;
                                    }
                                }
                            }
                        }
                    }
                    if (f) {
                        break;
                    }
                }
                if (f) {
                    continue;
                }
                for (int j = 0; j <= N; j++) {
                    if (ans[j] == -1) {
                        ans[j] = 1;
                    }
                }
                max = Math.max(max, Arrays.stream(ans).sum());
            }
            out.println(max);
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

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

