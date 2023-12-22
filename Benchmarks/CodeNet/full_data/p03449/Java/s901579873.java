import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Arrays;
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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[][] map = new int[2][n];
            int max = 0;
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < n; j++) {
                    map[i][j] = in.nextInt();
                }
            }

            int prev = Arrays.stream(map[1]).sum();
            prev += map[0][0];
            max = prev;
            for (int i = 1; i < n; i++) {
                int tmp = prev;
                tmp += map[0][i] - map[1][i - 1];
                max = Math.max(max, tmp);
                prev = tmp;
            }

            out.print(max);

        }

    }
}

