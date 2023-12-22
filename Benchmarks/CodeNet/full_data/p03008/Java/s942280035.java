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
        D solver = new D();
        solver.solve(1, in, out);
        out.close();
    }

    static class D {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int[] A, B;
            A = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};
            B = new int[]{in.nextInt(), in.nextInt(), in.nextInt()};

            int AB = solv(N, A, B, 0, 0, 0);
            int BA = solv(AB, B, A, 0, 0, 0);
            out.println(BA);
        }

        private int solv(int n, int[] x, int[] y, int g, int s, int b) {
            if (n - (x[0] * g + x[1] * s + x[2] * b) < 0) {
                return 0;
            }

            int temp = n + (y[0] - x[0]) * g + (y[1] - x[1]) * s + (y[2] - x[2]) * b;
            if (y[0] > x[0]) {
                temp = Math.max(temp, solv(n, x, y, g + 1, s, b));
            }
            if (y[1] > x[1]) {
                temp = Math.max(temp, solv(n, x, y, g, s + 1, b));
            }
            if (y[2] > x[2]) {
                temp = Math.max(temp, solv(n, x, y, g, s, b + 1));
            }
            return temp;
        }

    }
}

