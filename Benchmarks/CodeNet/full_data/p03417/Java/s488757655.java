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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long m = in.nextLong();

            if (n == 1 || m == 1) {
                if (n == 1 && m == 1) {
                    out.print(1);
                    return;
                }
                if (n == 1) {
                    out.print(m - 2);
                    return;
                }
                if (m == 1) {
                    out.print(n - 2);
                    return;
                }
            }
            out.print((n - 2) * (m - 2));
        }

    }
}

