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
        ABC_107_B solver = new ABC_107_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC_107_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int h = in.nextInt();
            int w = in.nextInt();

            char[][] map = new char[h][w];
            for (int i = 0; i < h; i++) {
                String row = in.next();
                map[i] = row.toCharArray();
            }

            for (int i = 0; i < h; i++) {
                boolean isDeletable = true;
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == '#') {
                        isDeletable = false;
                    }
                }

                if (isDeletable) {
                    for (int j = 0; j < w; j++) {
                        map[i][j] = ' ';
                    }
                }
            }

            for (int j = 0; j < w; j++) {
                boolean isDeletable = true;
                for (int i = 0; i < h; i++) {
                    if (map[i][j] == '#') {
                        isDeletable = false;
                    }
                }

                if (isDeletable) {
                    for (int i = 0; i < h; i++) {
                        map[i][j] = ' ';
                    }
                }
            }

            for (int i = 0; i < h; i++) {
                boolean blankLine = true;
                for (int j = 0; j < w; j++) {
                    if (map[i][j] != ' ') {
                        out.print(map[i][j]);
                        blankLine = false;
                    }
                }
                if (!blankLine) {
                    out.println();
                }
            }
        }

    }
}

