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
        DLamp solver = new DLamp();
        solver.solve(1, in, out);
        out.close();
    }

    static class DLamp {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] arr = new char[h][w];
            for (int i = 0; i < h; i++) {
                arr[i] = in.next().toCharArray();
            }

            int[][] maxPerRow = new int[h][w];
            for (int i = 0; i < h; i++) {
                int from = 0;
                int to = -1;
                for (int j = 0; j < w; j++) {
                    if (arr[i][j] == '#') {
                        for (int k = from; k <= to && k < w; k++) {
                            maxPerRow[i][k] = to - from + 1;
                        }
                        from = j + 1;
                        to = j;
                    } else {
                        to++;
                    }
                }
                for (int k = from; k <= to && k < w; k++) {
                    maxPerRow[i][k] = to - from + 1;
                }
            }

            int[][] maxPerCol = new int[h][w];
            for (int j = 0; j < w; j++) {
                int from = 0;
                int to = -1;
                for (int i = 0; i < h; i++) {
                    if (arr[i][j] == '#') {
                        for (int k = from; k <= to && k < h; k++) {
                            maxPerCol[k][j] = to - from + 1;
                        }
                        from = i + 1;
                        to = i;
                    } else {
                        to++;
                    }
                }
                for (int k = from; k <= to && k < h; k++) {
                    maxPerCol[k][j] = to - from + 1;
                }
            }

            int res = 0;
            for (int i = 0; i < h; i++)
                for (int j = 0; j < w; j++)
                    res = Math.max(res, maxPerRow[i][j] + maxPerCol[i][j] - 1);
            out.println(res);

        }

    }
}

