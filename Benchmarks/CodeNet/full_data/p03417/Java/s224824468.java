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
        Flip solver = new Flip();
        solver.solve(1, in, out);
        out.close();
    }

    static class Flip {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();

            int max = Math.max(n, m);
            int min = Math.min(n, m);

            if (min == 0) {
                out.println(0);
                return;
            }

            if (min == 1) {
                out.println(max == 1 ? 1 : max - 2);
                return;
            }
            if (min == 2) {
                out.println(0);
                return;
            }
            out.println((max - 2) * (min - 2));
        }

    }
}

