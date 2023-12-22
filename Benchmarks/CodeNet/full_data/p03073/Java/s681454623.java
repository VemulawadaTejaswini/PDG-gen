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
        CColoringColorfully solver = new CColoringColorfully();
        solver.solve(1, in, out);
        out.close();
    }

    static class CColoringColorfully {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int nbChanges = solve0(s);
            out.println(nbChanges);
        }

        private int solve0(String s) {
            int[][] dp = new int[s.length()][2];
            dp[0][0] = s.charAt(0) == '0' ? 0 : 1;
            dp[0][1] = s.charAt(0) == '1' ? 0 : 1;
            for (int i = 1; i < s.length(); i++) {
                dp[i][0] = dp[i - 1][1] + (s.charAt(i) == '0' ? 0 : 1);
                dp[i][1] = dp[i - 1][0] + (s.charAt(i) == '1' ? 0 : 1);
            }
            int N = s.length();
            return Math.min(dp[N - 1][0], dp[N - 1][1]);
        }

    }
}

