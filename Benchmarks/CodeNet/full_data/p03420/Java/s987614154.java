import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DRemainderReminder solver = new DRemainderReminder();
        solver.solve(1, in, out);
        out.close();
    }

    static class DRemainderReminder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long res = 0;
            for (int i = k + 1; i <= n; i++) {
                res += (n + 1) / i * (i - k) + Math.max((n + 1) % i - k, 0);
                if (k == 0) {
                    res--;
                }
            }

            out.println(res);
        }

    }
}

