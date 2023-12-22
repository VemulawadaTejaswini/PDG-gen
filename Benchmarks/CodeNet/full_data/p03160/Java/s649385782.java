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
        AFrog1 solver = new AFrog1();
        solver.solve(1, in, out);
        out.close();
    }

    static class AFrog1 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int ds = in.nextInt();
            int[] H = new int[ds];
            for (int i = 0; i < ds; i++) H[i] = in.nextInt();
            out.println(dp(new int[ds], H, 0));
        }

        public static int dp(int[] dp, int[] H, int i) {
            if (i >= H.length) return Integer.MAX_VALUE;
            if (i == H.length - 1) return 0;
            if (dp[i] != 0) return dp[i];
            dp[i] = Math.min(dp(dp, H, i + 1) + ((i + 1 < dp.length) ? Math.abs(H[i] - H[i + 1]) : 0), dp(dp, H, i + 2)
                    + ((i + 2 < dp.length) ? Math.abs(H[i] - H[i + 2]) : 0));
            return dp[i];
        }

    }
}

