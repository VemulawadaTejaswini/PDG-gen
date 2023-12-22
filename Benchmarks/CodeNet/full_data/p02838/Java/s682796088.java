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
        TaskD_147 solver = new TaskD_147();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD_147 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long mod = 1_000_000_007;
            long a[] = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = in.nextLong();

            long res = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    res += a[i] ^ a[j];
                    res %= mod;
                }
            }
            out.println(res);
        }

    }
}

