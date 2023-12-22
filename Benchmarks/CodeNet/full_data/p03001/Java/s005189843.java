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

