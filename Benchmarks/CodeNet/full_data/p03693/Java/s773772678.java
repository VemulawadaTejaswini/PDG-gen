import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Lucas Eduardo Schlogl
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        RGBCards solver = new RGBCards();
        solver.solve(1, in, out);
        out.close();
    }

    static class RGBCards {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int r = in.nextInt();
            int g = in.nextInt();
            int b = in.nextInt();

            int n = r * 100 + g * 10 + b;

            if (n % 4 == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }

    }
}

