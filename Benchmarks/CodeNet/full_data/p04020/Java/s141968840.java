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
        TaskGB solver = new TaskGB();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskGB {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            long ans = 0l;

            int rem = 0;
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    rem = 0;
                    continue;
                }
                ans += (a[i] + rem) / 2;
                rem = (a[i] + rem) % 2;
            }
            out.println(ans);
        }

    }
}
