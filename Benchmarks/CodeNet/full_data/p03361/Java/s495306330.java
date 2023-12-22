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
        ABC096_C solver = new ABC096_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC096_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            char[][] map = new char[h][w];
            for (int i = 0; i < h; i++) {
                map[i] = in.next().toCharArray();
            }

            String ans = "Yes";
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == '.') {
                        continue;
                    }

                    boolean cantFlag = true;
                    if (0 < i) {
                        if (map[i - 1][j] == '#') {
                            cantFlag = false;
                        }
                    }

                    if (0 < j) {
                        if (map[i][j - 1] == '#') {
                            cantFlag = false;
                        }
                    }

                    if (i < h - 1) {
                        if (map[i + 1][j] == '#') {
                            cantFlag = false;
                        }
                    }

                    if (j < w - 1) {
                        if (map[i][j + 1] == '#') {
                            cantFlag = false;
                        }
                    }

                    if (cantFlag) {
                        ans = "No";
                        break;
                    }
                }
            }

            out.print(ans);

        }

    }
}

