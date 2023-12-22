import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
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
            StringBuilder sb = new StringBuilder();
            int n = in.nextInt();
            int[][] zahyou = new int[n][2];
            double res = 0;
            double[][] kyori = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 2; j++) {
                    zahyou[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    kyori[i][j] = Math.sqrt(Math.pow((zahyou[i][0] - zahyou[j][0]), 2) + Math.pow((zahyou[i][1] - zahyou[j][1]), 2));
                    res += kyori[i][j] * 2 / n;
                }
            }

            out.println(res);
        }

    }
}

