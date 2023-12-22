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
        long bigInteger = 1_000_000_007;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int m = in.nextInt();
            int[] brokenStairs = new int[m];
            for (int i = 0; i < m; i++) {
                brokenStairs[i] = in.nextInt();
            }
            int[] notBrokenStairs = new int[m + 1];
            notBrokenStairs[0] = brokenStairs[0];
            for (int i = 1; i < m; i++) {
                int stairs = brokenStairs[i] - brokenStairs[i - 1] - 1;
                if (stairs == 0) {
                    out.println(0);
                    return;
                } else {
                    notBrokenStairs[i] = stairs;
                }
            }
            notBrokenStairs[m] = n - brokenStairs[m - 1];
            long result = 1;
            for (int i = 0; i < m + 1; i++) {
                result *= cases(notBrokenStairs[i]) % bigInteger;
            }
            out.println(result % bigInteger);
        }

        private int cases(int steps) {
            if (steps == 1 || steps == 2) {
                return 1;
            } else {
                return cases(steps - 1) + cases(steps - 2);
            }
        }

    }
}

