import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DWaterBottle solver = new DWaterBottle();
        solver.solve(1, in, out);
        out.close();
    }

    static class DWaterBottle {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double a = (double) in.nextInt();
            double b = (double) in.nextInt();
            double x = (double) in.nextInt();
            double res;
            if (x >= a * a * b / 2) {
                res = Math.toDegrees(Math.atan((a * a * b - x) * 2 / a / a / a));
            } else {
                res = Math.toDegrees(Math.atan((a * b * b) / 2 / x));
            }
            out.println(res);
        }

    }
}

