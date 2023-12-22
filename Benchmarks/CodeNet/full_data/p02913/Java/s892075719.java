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
        EWhoSaysAPun solver = new EWhoSaysAPun();
        solver.solve(1, in, out);
        out.close();
    }

    static class EWhoSaysAPun {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            int n = in.nextInt();
            String s = in.next();
            int[][] dp = new int[n + 1][n + 1];

            int max = 0;

            for (int i = n - 1; i >= 0; i--) {
                for (int j = n - 1; j >= 0; j--) {
                    dp[i][j] = s.charAt(i) == s.charAt(j) ? dp[i + 1][j + 1] + 1 : 0;
                    max = Math.max(max, Math.min(dp[i][j], Math.abs(i - j)));
                }
            }

            out.println(max);

        }

    }
}

