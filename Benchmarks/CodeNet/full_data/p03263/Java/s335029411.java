import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
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
        public void solve(int testNumber, MyScanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            int[][] a = new int[H][];
            for (int i = 0; i < H; i++) {
                a[i] = in.nextIntArray(W);
            }
            List<int[]> ans = new ArrayList<>();
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W - 1; j++) {
                    if (a[i][j] % 2 == 1) {
                        ans.add(new int[]{i, j, i, j + 1});
                        a[i][j]--;
                        a[i][j + 1]++;
                    }
                }
            }
            for (int i = 0; i < H - 1; i++) {
                if (a[i][W - 1] % 2 == 1) {
                    ans.add(new int[]{i, W - 1, i + 1, W - 1});
                    a[i][W - 1]--;
                    a[i + 1][W - 1]++;
                }
            }
            out.println(ans.size());
            for (int[] e : ans) {
                out.printf("%d %d %d %d\n", e[0] + 1, e[1] + 1, e[2] + 1, e[3] + 1);
            }
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

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = nextInt();
            }
            return a;
        }

    }
}

