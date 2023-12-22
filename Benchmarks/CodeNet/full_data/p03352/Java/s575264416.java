import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author bcools
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
            int x = in.nextInt();

            int maxValue = -1;

            for (int b = 1; b <= x; ++b) {
                for (int p = 2; p < 1000; ++p) {
                    int result = (int) Math.pow(b, p);
                    if (result > x) break;
                    maxValue = Math.max(result, maxValue);
                }
            }
            System.out.println(maxValue);
        }

    }
}

