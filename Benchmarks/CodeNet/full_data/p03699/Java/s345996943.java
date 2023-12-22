import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.stream.IntStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        CBugged solver = new CBugged();
        solver.solve(1, in, out);
        out.close();
    }

    static class CBugged {
        private static int ans = 0;
        private static final boolean[][] dp = new boolean[10001][101];
        private static int[] s;

        public void solve(int testNumber, Scanner in, PrintWriter out) {
            s = IntStream.range(0, in.nextInt()).map(i -> in.nextInt()).toArray();
            calc(0, 0);
            out.println(ans);
        }

        private static void calc(int sum, int index) {
            if (dp[sum][index]) {
                return;
            }
            dp[sum][index] = true;
            if (index == s.length) {
                if (sum % 10 > 0) {
                    ans = Math.max(ans, sum);
                }
                return;
            }
            calc(sum, index + 1);
            calc(sum + s[index], index + 1);
        }

    }
}

