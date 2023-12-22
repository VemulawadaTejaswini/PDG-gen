import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        CStrangeBank solver = new CStrangeBank();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStrangeBank {
        public void solve(int testNumber, Scanner in, PrintWriter out) {

            final int INF = (int) 1e9;
            int n = in.nextInt();
            int[] dp = new int[n + 1];
            ArrayUtil.fill(dp, INF);
            dp[0] = 0;

            // 1: しらじらしい更新
            for (int i = 0; i < n; i++) {
                dp[i + 1] = Math.min(dp[i] + 1, dp[i + 1]);
            }

            // 6:
            int six = 6;
            while (six <= n) {
                for (int i = six; i <= n; i++) {
                    try {
                        dp[i] = Math.min(dp[i], dp[i - six] + 1);
                    } catch (ArrayIndexOutOfBoundsException ignored) {
                    }
                }
                six *= 6;
            }


            // 9:
            int nine = 9;
            while (nine <= n) {
                for (int i = nine; i <= n; i++) {
                    try {
                        dp[i] = Math.min(dp[i], dp[i - nine] + 1);
                    } catch (ArrayIndexOutOfBoundsException ignored) {
                    }
                }
                nine *= 9;
            }

            out.println(dp[n]);


        }

    }

    static class ArrayUtil {
        public static void fill(int[] array, int val) {
            Arrays.fill(array, val);
        }

    }
}

