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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int W = in.nextInt();
            int H = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();

            if ((x == W && y == 0) ||
                    (x == 0 && y == 0) ||
                    (x == W && y == H) ||
                    (x == 0 && y == H)
            ) {
                double answer = H * W / 2;
                out.println(String.format("%.6f", answer) + " 0");
                return;
            }

            if (x == 0) {
                double answer = Math.min(y, H - y) * W;
                out.println(String.format("%.6f", answer) + " 0");
            } else if (y == 0) {
                double answer = Math.min(x, W - x) * H;
                out.println(String.format("%.6f", answer) + " 0");

            }

            double widthMin = Math.min(x, W - x);
            double heightMin = Math.min(y, H - y);
            if (widthMin > heightMin) {
                out.print(String.format("%.6f", heightMin * W) + " ");
            } else {
                out.print(String.format("%.6f", widthMin * H) + " ");
            }

            if (widthMin * H == heightMin * W) {
                out.println(1);
            } else {
                out.println(0);
            }
        }

    }
}

