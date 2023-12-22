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
        Minimization solver = new Minimization();
        solver.solve(1, in, out);
        out.close();
    }

    static class Minimization {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();

            if (n <= k) {
                out.println(1);
                return;
            }

            long result = n / (k - 1);
            if (n % (k - 1) > 0) {
                result++;
            }
            out.println(result);

        }

    }
}

