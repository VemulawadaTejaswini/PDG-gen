import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.Collection;
import java.io.IOException;
import java.util.Queue;
import java.io.BufferedReader;
import java.util.ArrayDeque;
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
            int n = in.Int();
            int m = in.Int();
            int q = in.Int();
            int[][] cal = new int[m / 7][7];
            for (int i = 0; i < q; i++) {
                int a = in.Int();
                for (int j = 0; j < m / 7; j++) {
                    for (int k = 0; k < 7; k++) {
                        if ((7 * j + k) % m == a) {
                            cal[j][k] = 1;
                        }
                    }
                }
            }
            int cnt = 0;
            for (int i = 0; i < m / 7; i++) {
                for (int j = 0; j < 7; j++) {
                    if (cal[i][j] == 0) {
                        cnt++;
                        Queue<int[]> que = new ArrayDeque<>();
                        que.add(new int[]{i, j});
                        while (!que.isEmpty()) {
                            int[] p = que.poll();
                            int y = p[0];
                            int x = p[1];
                            if (cal[y][x] != 0) continue;
                            cal[y][x] = -1;
                            if (0 <= y - 1) que.add(new int[]{y - 1, x});
                            if (y + 1 < m / 7) que.add(new int[]{y + 1, x});
                            if (0 <= x - 1) que.add(new int[]{y, x - 1});
                            if (x + 1 < 7) que.add(new int[]{y, x + 1});
                        }
                    }
                }
            }
            int ln = n * 7 / m;
            int lm = m / 7;
            int u = 0;
            for (int j = 0; j < 7; j++) {
                if (cal[0][j] == -1 && cal[lm - 1][j] == -1) {
                    u++;
                    Queue<int[]> que = new ArrayDeque<>();
                    que.add(new int[]{0, j});
                    que.add(new int[]{lm - 1, j});
                    while (!que.isEmpty()) {
                        int[] p = que.poll();
                        int y = p[0];
                        int x = p[1];
                        if (cal[y][x] != -1) continue;
                        cal[y][x] = 0;
                        if (0 <= y - 1) que.add(new int[]{y - 1, x});
                        if (y + 1 < m / 7) que.add(new int[]{y + 1, x});
                        if (0 <= x - 1) que.add(new int[]{y, x - 1});
                        if (x + 1 < 7) que.add(new int[]{y, x + 1});
                    }
                }
            }
            cnt = cnt * ln - (ln > 1 ? u : 0) - (ln > 2 ? (ln - 2) * u : 0);
            out.println(cnt);
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

    }
}

