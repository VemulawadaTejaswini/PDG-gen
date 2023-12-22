import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        ABC086CTraveling solver = new ABC086CTraveling();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC086CTraveling {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int t = 0, x = 0, y = 0;
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                int nt = in.nextInt(), nx = in.nextInt(), ny = in.nextInt();
                if (!canMove(nx - x, ny - y, nt - t)) {
                    out.println("No");
                    return;
                }
            }
            out.println("Yes");
        }

        public static boolean canMove(int x, int y, int t) {
            int d = t - Math.abs(x) - Math.abs(y);
            return d >= 0 && d % 2 == 0;
        }

    }
}

