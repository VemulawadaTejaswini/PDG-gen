import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Rahul Raj
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Minesweeper solver = new Minesweeper();
        solver.solve(1, in, out);
        out.close();
    }

    static class Minesweeper {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            String[][] arr = new String[h][w];
            for (int i = 0; i < h; i++) {
                String str = in.next();
                for (int j = 0; j < w; j++) {
                    arr[i][j] = String.valueOf(str.charAt(j));
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (arr[i][j].equals(".")) {
                        check(i, j, h, w, arr);
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    out.print(arr[i][j]);
                }
                out.println();
            }

        }

        static void check(int x, int y, int h, int w, String[][] arr) {
            int count = 0;

            if (x - 1 >= 0 && y - 1 >= 0) {
                count += checkNum(x - 1, y - 1, arr);
            }
            if (x + 1 <= h - 1 && y + 1 <= w - 1) {
                count += checkNum(x + 1, y + 1, arr);
            }
            if (y - 1 >= 0 && x <= h - 1 && x >= 0) {
                count += checkNum(x, y - 1, arr);
            }
            if (x + 1 <= h - 1 && y - 1 >= 0) {
                count += checkNum(x + 1, y - 1, arr);
            }
            if (x - 1 >= 0 && y <= w - 1 && y >= 0) {
                count += checkNum(x - 1, y, arr);
            }
            if (x + 1 <= h - 1 && y <= w - 1 && y >= 0) {
                count += checkNum(x + 1, y, arr);
            }
            if (x - 1 >= 0 && y + 1 <= w - 1) {
                count += checkNum(x - 1, y + 1, arr);
            }
            if (x <= h - 1 && x >= 0 && y + 1 <= w - 1) {
                count += checkNum(x, y + 1, arr);
            }

            arr[x][y] = String.valueOf(count);

        }

        static int checkNum(int x, int y, String[][] arr) {
            if (arr[x][y].equals("#")) {
                return 1;
            } else
                return 0;

        }

    }
}

