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
        GetAC solver = new GetAC();
        solver.solve(1, in, out);
        out.close();
    }

    static class GetAC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int q = in.nextInt();
            char[] s = in.next().toCharArray();
            int[] dp = new int[n];

            for (int i = 0; i < n - 1; i++) {
                if (s[i] == 'A' && s[i + 1] == 'C') {
                    dp[i + 1] = dp[i] + 1;
                } else {
                    dp[i + 1] = dp[i];
                }
            }

            for (int i = 0; i < q; i++) {
                int l = in.nextInt() - 1;
                int r = in.nextInt() - 1;
                out.println(dp[r] - dp[l]);
            }

        }

    }
}

