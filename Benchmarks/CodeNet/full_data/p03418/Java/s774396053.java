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
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long ans = 0;
            for (int i = k + 1; i <= n; i++) {
                ans += (n / i) * (i - k);
                if (n % i != 0) {
                    if (k == 0) {
                        ans += n % i;
                    } else if (0 < k && k <= n % i) {
                        ans += (n % i) - k + 1;
                    }
                }
            }

            out.print(ans);
        }

    }
}

