import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author vdewansa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        OMatching solver = new OMatching();
        solver.solve(1, in, out);
        out.close();
    }

    static class OMatching {
        final int MOD = 1_000_000_000 + 7;

        int add(int a, int b) {
            int res = a + b;
            if (res > MOD) res -= MOD;
            return res;
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            boolean[][] a = new boolean[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    a[i][j] = (in.nextInt() != 0);
                }
            }
            int[] ways = new int[1 << N];
            ways[0] = 1;
            for (int s = 1; s < (1 << N); s++) {
                int i = Integer.bitCount(s) - 1;
                for (int j = 0; j < N; j++) {
                    if (((s >> j) & 1) != 0 && a[i][j]) {
                        int sPrev = s ^ (1 << j);
                        ways[s] = add(ways[s], ways[sPrev]);
                    }
                }
            }
            out.println(ways[(1 << N) - 1]);
        }

    }
}

