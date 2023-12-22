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
        ABC144_a solver = new ABC144_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC144_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();
            if ((A > 9) || (A < 1)) {
                out.println("-1");

                return;

            }
            if ((B > 9) || (B < 1)) {
                out.println("-1");

                return;

            }
            out.println(A * B);

        }

    }
}

