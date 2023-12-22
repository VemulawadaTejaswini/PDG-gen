import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        long a;
        long b;
        long[] health;

        boolean enough(long T) {
            long result = 0;
            for (int i = 0; i < health.length; ++i) {
                if (health[i] > b * T)
                    result += Math.ceil(((double) health[i] - (b * T)) / ((double) a - b));
            }
            return (result <= T);
        }

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            a = in.nextInt();
            b = in.nextInt();
            health = new long[n];
            long hmax = Long.MIN_VALUE;
            for (int i = 0; i < n; ++i) {
                health[i] = in.nextInt();
                hmax = Math.max(hmax, health[i]);
            }

            long lo = 0;
            long hi = (long) Math.ceil((double) hmax / b);
            long mid;

            while (lo + 1 < hi) {
                mid = lo + (hi - lo) / 2;
                if (enough(mid)) {
                    hi = mid;
                } else {
                    lo = mid;
                }
            }
            if (lo == hi) {
                out.println(lo + 1);
            } else {
                out.println(hi);
            }
        }

    }
}

