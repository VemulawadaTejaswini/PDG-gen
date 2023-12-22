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
        Lamp solver = new Lamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class Lamp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();

            int[][] g = new int[h][w];
            for (int i = 0; i < h; i++) {
                char[] chars = in.next().toCharArray();
                for (int j = 0; j < w; j++) {
                    if (chars[j] == '#') {
                        g[i][j] = Integer.MAX_VALUE;
                    } else {
                        g[i][j] = 1;
                    }
                }
            }

            int[][] left = new int[h][w];
            for (int i = 0; i < h; i++) {
                int step = 0;
                for (int j = 0; j < w; j++) {
                    if (g[i][j] > 1) {
                        step = 0;
                    } else {
                        step++;
                    }
                    left[i][j] = step;
                }
            }
            int[][] right = new int[h][w];
            for (int i = 0; i < h; i++) {
                int step = 0;
                for (int j = w - 1; 0 <= j; j--) {
                    if (g[i][j] > 1) {
                        step = 0;
                    } else {
                        step++;
                    }
                    right[i][j] = step;
                }
            }

            int[][] up = new int[h][w];
            for (int i = 0; i < w; i++) {
                int step = 0;
                for (int j = 0; j < h; j++) {
                    if (g[j][i] > 1) {
                        step = 0;
                    } else {
                        step++;
                    }
                    up[j][i] = step;
                }
            }
            int[][] down = new int[h][w];
            for (int i = 0; i < w; i++) {
                int step = 0;
                for (int j = h - 1; 0 <= j; j--) {
                    if (g[j][i] > 1) {
                        step = 0;
                    } else {
                        step++;
                    }
                    down[j][i] = step;
                }
            }

            long result = 0;
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    int score = left[i][j] + right[i][j] + up[i][j] + down[i][j] - 3;
                    result = Math.max(result, score);
                }
            }

            out.println(result);

        }

    }
}

