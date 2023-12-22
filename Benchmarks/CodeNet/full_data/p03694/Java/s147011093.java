import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author G. Guarnieri
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
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            if (n == 1) {
                out.println(in.nextInt());
                return;
            }

            for (int i = 0; i < n; i++) {
                int current = in.nextInt();
                if (current < min) {
                    min = current;
                }
                else if (current > max) {
                    max = current;
                }
            }
            out.println(max - min);
        }

    }
}

