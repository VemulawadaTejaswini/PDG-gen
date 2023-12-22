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
        TaskAC68C solver = new TaskAC68C();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskAC68C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();

            long n = 0L;

            if (2 * x % 11 == 0) {
                n = 2 * x / 11;
            } else {
                n = 2 * x / 11 + 1;
            }

            if (n % 2 == 0) {
                out.println(n);
                return;
            }

            long n1 = 0L;

            if ((x - 5) % 11 == 0) {
                n1 = 2 * (x - 5) / 11;
            } else {
                n1 = 2 * (x - 5) / 11 + 1;
            }

            if (n1 % 2 != 0) {
                out.println(n1);
                return;
            }

            out.println(Math.min(n + 1, n1 + 1));
        }

    }
}

