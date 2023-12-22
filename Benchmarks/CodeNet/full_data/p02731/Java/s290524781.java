import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Akash
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CMaximumVolume solver = new CMaximumVolume();
        solver.solve(1, in, out);
        out.close();
    }

    static class CMaximumVolume {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            double l = in.nextInt();
            double result = 0.0;
            for (double a = 0.1; a < l; a += 0.1) {
                for (double b = 0.1; b < l; b += 0.1) {
                    double c = l - a - b;
                    result = Math.max(result, a * b * c);
                }
            }
            out.printf("%.12f", Math.ceil(result));
        }

    }
}

