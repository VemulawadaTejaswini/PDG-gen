import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskB solver = new TaskB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskB {
        int LOWER_LIMIT = -1000_000_000;
        int UPPER_LIMIT = 1000_000_000;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int K = in.nextInt();
            int X = in.nextInt();
            int start = 0;
            int end = 0;
            if (X - LOWER_LIMIT + 1 < K) {
                start = LOWER_LIMIT;
                end = X + K - 1;
            } else if (UPPER_LIMIT - X + 1 < K) {
                start = UPPER_LIMIT - X + 1;
                end = UPPER_LIMIT;
            } else {
                start = X - (K - 1);
                end = X + (K - 1);
            }

            for (int i = start; i <= end; i++) {
                out.println(i);
            }
        }

    }
}

