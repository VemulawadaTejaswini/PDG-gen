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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s1 = in.next();
            String s2 = in.next();

            String[][] dp = new String[s1.length() + 1][s2.length() + 1];

            for (int i = 0; i <= s1.length(); i++) {
                for (int j = 0; j <= s2.length(); j++) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = "";
                    } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                        dp[i][j] = dp[i - 1][j - 1] + s1.charAt(i - 1);
                    } else {
                        if (dp[i - 1][j].length() > dp[i][j - 1].length()) {
                            dp[i][j] = dp[i - 1][j];
                        } else {
                            dp[i][j] = dp[i][j - 1];
                        }
                    }
                }
            }

            out.println(dp[s1.length()][s2.length()]);
        }

    }
}

