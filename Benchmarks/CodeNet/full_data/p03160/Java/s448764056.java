import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author varunvats32
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] arr = new int[n + 1];

            // dp[i] -> The minimum cost to reach here.
            int[] dp = new int[n + 1];

            for (int i = 1; i <= n; i++) {
                arr[i] = in.nextInt();
            }

            dp[1] = 0;
            dp[2] = Math.abs(arr[2] - arr[1]);
            for (int i = 3; i <= n; i++) {
                dp[i] = Math.min(dp[i - 1] + Math.abs(arr[i] - arr[i - 1]), dp[i - 2] + Math.abs(arr[i] - arr[i - 2]));
            }

            out.println(dp[n]);
        }

    }
}

