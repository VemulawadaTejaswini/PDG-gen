import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Eric
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskEE solver = new TaskEE();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskEE {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long n = in.nextLong();
            long res = solveMe(n);
            out.println(res);
            //loop();
        }

        private long solveMe(long n) {
            if (n % 2 == 1)
                return 0;
            long res = 0;
            long current = 1;
            for (int i = 0; i <= 19; i++) {
                n = n / 10;
                if (n == 0)
                    break;
                res += current * n;
                current++;
            }
            return res;
        }

    }
}

