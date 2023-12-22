import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int ab[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                ab[i][0] = Integer.parseInt(in.next());
                ab[i][1] = Integer.parseInt(in.next());
            }
            int cd[][] = new int[m][2];
            for (int i = 0; i < m; i++) {
                cd[i][0] = Integer.parseInt(in.next());
                cd[i][1] = Integer.parseInt(in.next());
            }
            int dist[][] = new int[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    dist[i][j] = Math.abs(ab[i][0] - cd[j][0]) + Math.abs(ab[i][1] - cd[j][1]);
                }
            }

            // 出力
            int ans = 0;
            int mindist = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                ans = 0;
                for (int j = 0; j < m; j++) {
                    if (mindist > dist[i][j]) {
                        mindist = dist[i][j];
                        ans = j + 1;
                    }
                }
                out.println(ans);
                mindist = Integer.MAX_VALUE;
            }

        }

    }
}

