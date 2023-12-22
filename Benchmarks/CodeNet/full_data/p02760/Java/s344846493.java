import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author ky112233
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBingo solver = new BBingo();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBingo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int[][] grid = new int[3][3];
            for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) grid[i][j] = in.nextInt();
            int n = in.nextInt();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) b[i] = in.nextInt();
            boolean[][] grid2 = new boolean[3][3];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if (grid[j][k] == b[i]) {
                            grid2[j][k] = true;
                        }
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                boolean flag = true;
                for (int j = 0; j < 3; j++) {
                    if (grid2[i][j] == false) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    out.println("Yes");
                    return;
                }
                flag = true;
                for (int j = 0; j < 3; j++) {
                    if (grid2[j][i] == false) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    out.println("Yes");
                    return;
                }
            }
            if (grid2[0][0] == true && grid2[1][1] == true && grid2[2][2] == true) {
                out.println("Yes");
                return;
            }
            if (grid2[0][2] == true && grid2[1][1] == true && grid2[2][0] == true) {
                out.println("Yes");
                return;
            }
            out.println("No");
        }

    }
}

