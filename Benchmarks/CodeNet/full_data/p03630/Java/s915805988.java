import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

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
        F solver = new F();
        solver.solve(1, in, out);
        out.close();
    }

    static class F {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt();
            int w = in.nextInt();
            boolean[][] b = new boolean[h][w];
            for (int i = 0; i < h; i++) {
                String s = in.next();
                for (int j = 0; j < w; j++) {
                    b[i][j] = s.charAt(j) == '#';
                }
            }
            boolean[][] z = new boolean[h + 1][w + 1];
            for (int i = 0; i < h - 1; i++) {
                for (int j = 0; j < w - 1; j++) {
                    z[i + 1][j + 1] = b[i][j] ^ b[i + 1][j] ^ b[i][j + 1] ^ b[i + 1][j + 1];
                }
            }

            int[][] up = new int[h + 1][w + 1];
            for (int i = 1; i < h; i++) {
                for (int j = 1; j < w; j++) {
                    if (!z[i][j]) {
                        up[i][j] = up[i - 1][j] + 1;
                    }
                }
            }

            int ans = 0;
            for (int i = 1; i <= h; i++) {
                ArrayList<Pair> s = new ArrayList<>();
                s.add(new Pair(0, -1));
                for (int j = 1; j <= w; j++) {
                    while (s.get(s.size() - 1).y >= up[i][j]) {
                        int v = (j - s.get(s.size() - 2).x) * (s.get(s.size() - 1).y + 1);
                        if (v > ans) {
                            ans = v;
                        }
                        s.remove(s.size() - 1);
                    }
                    s.add(new Pair(j, up[i][j]));
                }
            }

            out.println(ans);
        }

        class Pair {
            int x;
            int y;

            public Pair(int x, int y) {
                this.x = x;
                this.y = y;
            }

        }

    }
}

