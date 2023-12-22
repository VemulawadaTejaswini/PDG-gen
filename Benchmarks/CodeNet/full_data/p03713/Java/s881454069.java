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
        ChocolateBar solver = new ChocolateBar();
        solver.solve(1, in, out);
        out.close();
    }

    static class ChocolateBar {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long h = in.nextLong();
            long w = in.nextLong();
            if (h % 3 == 0 || w % 3 == 0) {
                out.println(0);
                return;
            }
            long max;
            if (h < w) {
                max = h * (w / 2);
                w = w - (w / 2);
            } else {
                max = w * (h / 2);
                h = h - (h / 2);
            }
            long min;
            if (h < w) {
                min = (w / 2) * h;
            } else {
                min = (h / 2) * w;
            }
            out.println(max - min);
        }

    }
}

