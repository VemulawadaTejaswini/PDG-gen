import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWall solver = new DWall();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWall {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int h = in.nextInt(), w = in.nextInt();
            int[][] c = new int[10][];
            for (int i = 0; i < 10; i++) {
                c[i] = IntStream.range(0, 10).map(x -> in.nextInt()).toArray();
            }

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    for (int k = 0; k < 10; k++) {
                        c[j][k] = Math.min(c[j][k], c[j][i] + c[i][k]);
                    }
                }
            }

            long ans = 0;
            for (int i = 0; i < h * w; i++) {
                int a = in.nextInt();
                if (a >= 0) {
                    ans += c[a][1];
                }
            }
            out.println(ans);
        }

    }
}

