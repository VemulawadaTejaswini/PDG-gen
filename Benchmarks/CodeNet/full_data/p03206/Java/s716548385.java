import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author hakamada
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC115_a solver = new ABC115_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC115_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int D =
                    in.nextInt();
            if (D == 25) {
                out.println("Christmas");

            } else if (D == 24) {
                out.println("Christmas Eve");

            } else if (D == 23) {
                out.println("Christmas Eve Eve");

            } else if (D == 22) {
                out.println("Christmas Eve Eve Eve");

            }
        }

    }
}

