import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BBounding solver = new BBounding();
        solver.solve(1, in, out);
        out.close();
    }

    static class BBounding {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int x = in.nextInt();
            int d = 0;
            int best = 1;
            for (int i = 0; i < n; i++) {
                d += in.nextInt();
                if (d > x) {
                    best = i + 1;
                    break;
                }
                if (i == n - 1)
                    best = n + 1;
            }
            out.println(best);
        }

    }
}

