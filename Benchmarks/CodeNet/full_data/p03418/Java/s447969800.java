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
        RemainderReminder solver = new RemainderReminder();
        solver.solve(1, in, out);
        out.close();
    }

    static class RemainderReminder {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int k = in.nextInt();
            long result = 0;
            if (k == 0) {
                out.println(n * n);
                return;
            }
            for (int a = k; a <= n; a++) {
                result += n - a;
                for (int b = k; b < a; b++) {
                    if (a % b >= k) {
                        result++;
                    }
                }
            }
            out.println(result);
        }

    }
}

