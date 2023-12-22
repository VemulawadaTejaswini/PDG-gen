import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        char NOTHING = '.';
        char OBSTACLE = '#';

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int H = in.nextInt();
            int W = in.nextInt();
            String[] grid = new String[H];
            for (int i = 0; i < H; i++) {
                grid[i] = in.next();
            }

            int box = 0;
            int boxMax = 0;
            for (int height = 0; height < H; height++) {
                for (int width = 0; width < W; width++) {
                    if (grid[height].charAt(width) == NOTHING) {
                        box = calcBox(grid, height, width, H, W);
                        if (box > boxMax) {
                            boxMax = box;
                        }
                    }
                }
            }
            out.print(boxMax);
        }

        private int calcBox(String[] grid, int height, int width, int heightMax, int widthMax) {
            int result = 1;
            // left
            for (int i = Math.max(width - 1, 0); i >= 0; i--) {
                char block = grid[height].charAt(i);
                if (block == NOTHING) {
                    result++;
                } else if (block == OBSTACLE) {
                    break;
                }
            }
            // right
            for (int i = Math.min(width + 1, widthMax - 1); i < widthMax; i++) {
                char block = grid[height].charAt(i);
                if (block == NOTHING) {
                    result++;
                } else if (block == OBSTACLE) {
                    break;
                }
            }
            // up
            for (int i = Math.max(height - 1, 0); i >= 0; i--) {
                char block = grid[i].charAt(width);
                if (block == NOTHING) {
                    result++;
                } else if (block == OBSTACLE) {
                    break;
                }
            }
            // down
            for (int i = Math.min(height + 1, heightMax - 1); i < heightMax; i++) {
                char block = grid[i].charAt(width);
                if (block == NOTHING) {
                    result++;
                } else if (block == OBSTACLE) {
                    break;
                }
            }
            return result;
        }

    }
}

