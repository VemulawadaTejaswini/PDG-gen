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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long W = in.nextLong();
            long H = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();

            double answer = H * W / (double) 2;
            if (x * 2 == W && y * 2 == H) {
                out.println(answer + " 1");
            } else {
                out.println(answer + " 0");
            }
        }

    }
}

