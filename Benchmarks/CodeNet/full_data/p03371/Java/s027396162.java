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
        ABC095_C solver = new ABC095_C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC095_C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int minAB = Math.min(x, y);
            int cost = 0;
            if (a + b < 2 * c) {
                cost += a * x;
                cost += b * y;
            } else {
                cost += minAB * 2 * c;
                x -= minAB;
                y -= minAB;
                if (0 < x) {
                    if (a < c * 2) {
                        cost += a * x;
                    } else {
                        cost += c * 2 * x;
                    }
                }
                if (0 < y) {
                    if (b < c * 2) {
                        cost += b * y;
                    } else {
                        cost += c * 2 * y;
                    }
                }
            }

            out.print(cost);
        }

    }
}

