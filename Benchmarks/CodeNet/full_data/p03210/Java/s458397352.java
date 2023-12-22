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
        ABC114_1 solver = new ABC114_1();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC114_1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            if (N == 7) {
                out.println("YES");

            } else if (N == 5) {
                out.println("YES");

            } else if (N == 3) {
                out.println("YES");

            } else {
                out.println("NO");
            }

        }

    }
}

