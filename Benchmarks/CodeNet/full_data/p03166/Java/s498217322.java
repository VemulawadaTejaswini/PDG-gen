import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        GLongestPath solver = new GLongestPath();
        solver.solve(1, in, out);
        out.close();
    }

    static class GLongestPath {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            ArrayList<Integer>[] vert = new ArrayList[n + 1];
            for (int i = 0; i < vert.length; i++) {
                vert[i] = new ArrayList<Integer>();
            }

            for (int i = 0; i < m; i++) {
                int x = in.nextInt();
                int y = in.nextInt();
                vert[x].add(y);
            }

            long[] dp = new long[n + 1];

            long max = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 1; j <= n; j++) {
                    for (Integer neigh : vert[j]) {
                        dp[neigh] = Math.max(dp[neigh], 1 + dp[j]);
                        max = Math.max(dp[neigh], max);
                    }
                }
            }

            out.println(max);
        }

    }
}

