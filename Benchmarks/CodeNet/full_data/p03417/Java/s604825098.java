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
            int n = in.nextInt();
            int m = in.nextInt();

            if ((n == 2 || m == 2) || (n == 1 && m == 1)) {
                out.println(0);
            } else if (n == 1 && m >= 2) {
                int ans = (m - 2);
                out.println(ans);
            } else if (n >= 2 && m == 1) {
                int ans = (n - 2);
                out.println(ans);
            } else {
                int ans = (n - 2) * (m - 2);
                out.println(ans);
            }
        }

    }
}

