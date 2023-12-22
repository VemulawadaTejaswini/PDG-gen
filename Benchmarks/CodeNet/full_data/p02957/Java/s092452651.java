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
        ABC135_a solver = new ABC135_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC135_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int A = in.nextInt();
            int B = in.nextInt();

            int Max = Math.max(A, B);

            for (int i = 0; i < Max; i++) {
                if (Math.abs(A - i) == Math.abs(B - i)) {
                    out.println(i);
                    return;
                }

            }
            out.println("IMPOSSIBLE");
        }

    }
}

