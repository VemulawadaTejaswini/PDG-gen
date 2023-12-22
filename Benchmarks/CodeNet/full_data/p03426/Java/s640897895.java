import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author AEoui
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int M = in.nextInt();
            int D = in.nextInt();

            Pair[] grid = new Pair[N * M + 1];
            for (int i = 1; i <= N; ++i) {
                for (int j = 1; j <= M; ++j) {
                    grid[in.nextInt()] = new Pair(i, j);
                }
            }

            int q = in.nextInt();
            while (q-- > 0) {
                int L = in.nextInt();
                int R = in.nextInt();

                int ans = 0;
                while (L < R) {
                    ans += grid[L].dist(grid[L + D]);
                    L += D;
                }

                out.println(ans);
            }
        }

        private class Pair {
            int f;
            int s;

            public Pair(int f, int s) {
                this.f = f;
                this.s = s;
            }

            public int dist(Pair pair) {
                return Math.abs(f - pair.f) + Math.abs(s - pair.s);
            }

        }

    }
}

