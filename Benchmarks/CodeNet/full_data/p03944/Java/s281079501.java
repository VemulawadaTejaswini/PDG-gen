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
            int w = Integer.parseInt(in.next());
            int h = Integer.parseInt(in.next());
            int n = Integer.parseInt(in.next());
            int points[][] = new int[n][3];
            for (int i = 0; i < n; i++) {
                points[i][0] = Integer.parseInt(in.next());
                points[i][1] = Integer.parseInt(in.next());
                points[i][2] = Integer.parseInt(in.next());
            }

            int board[][] = new int[w][h];  // 0 : white 1 : black
            long ans = 0;

            for (int i = 0; i < n; i++) {
                if (points[i][2] == 1) {
                    for (int j = 0; j < points[i][0]; j++) {
                        for (int k = 0; k < h; k++) {
                            board[j][k] = 1;
                        }
                    }
                } else if (points[i][2] == 2) {
                    for (int j = points[i][0]; j < w; j++) {
                        for (int k = 0; k < h; k++) {
                            board[j][k] = 1;
                        }
                    }
                } else if (points[i][2] == 3) {
                    for (int j = 0; j < w; j++) {
                        for (int k = 0; k < points[i][1]; k++) {
                            board[j][k] = 1;
                        }
                    }
                } else if (points[i][2] == 4) {
                    for (int j = 0; j < w; j++) {
                        for (int k = points[i][1]; k < h; k++) {
                            board[j][k] = 1;
                        }
                    }
                }
            }

            for (int i = 0; i < w; i++) {
                for (int j = 0; j < h; j++) {
                    if (board[i][j] == 0) ans++;
                }
            }

            out.println(ans);
        }

    }
}

