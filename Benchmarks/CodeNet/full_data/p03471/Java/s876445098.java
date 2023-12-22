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
            long y = in.nextLong();

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    if (10000 * i + 5000 * j + 1000 * (n - i - j) == y) {
                        out.print(i + " " + j + " " + (n - i - j));
                        return;
                    }
                }
            }

            out.print("-1 -1 -1");

        }

    }
}

