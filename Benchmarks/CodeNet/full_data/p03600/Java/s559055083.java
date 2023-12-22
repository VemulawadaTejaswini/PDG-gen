import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRestoringRoadNetwork solver = new DRestoringRoadNetwork();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRestoringRoadNetwork {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[][] d = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    d[i][j] = in.nextLong();
                }
            }

            long res = 0;
            // 各辺が必要かどうかの判断
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    boolean valid = true;
                    boolean need = true;
                    for (int k = 0; k < n; k++) {
                        if (k == i || k == j) continue;
                        if (d[i][k] + d[k][j] < d[i][j]) {
                            valid = false;
                            break;
                        }
                        if (d[i][k] + d[k][j] == d[i][j]) {
                            need = false;
                        }
                    }
                    if (!valid) {
                        out.println(-1);
                        return;
                    }
                    if (need) res += d[i][j];
                }
            }
            out.println(res);

        }

    }
}

