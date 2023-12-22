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
            long k = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();

            if (a < b) {
                if (2 < b - a) {
                    if (a - 1 < k) {
                        long set = (k - (a - 1)) / 2;
                        if (((k - (a - 1)) % 2 == 0)) {
                            out.print((b - a) * set + a);
                        } else {
                            out.print((b - a) * set + a + 1);
                        }
                    } else {
                        out.print(k + 1);
                    }
                } else {
                    out.print(k + 1);
                }
            } else {
                out.print(k + 1);
            }
        }

    }
}

