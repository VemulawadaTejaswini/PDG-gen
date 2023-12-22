import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main
{
    public static void main(String[] args)
    {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskE2 solver = new TaskE2();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskE2
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int N = in.nextInt();
            int W = in.nextInt();
            int weights[] = new int[N];
            int values[] = new int[N];
            read(weights, values, in);

            // dp[i] -> min weight for value i
            long dp[][] = new long[N + 1][100_001];
            Arrays.fill(dp[0], Integer.MAX_VALUE);
            dp[0][0] = 0;

            for (int i = 1; i <= N; i++)
            { //iterate over items
                for (int j = 0; j <= 100_000; j++)
                { // value
                    if (j >= values[i - 1])
                    {
                        dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - values[i - 1]] + weights[i - 1]);
                    } else
                    {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
            int max = 0;
            for (int i = 100_000; i >= 0; i--)
            {
                if (dp[N][i] <= W)
                {
                    max = Math.max(max, i);
                }
            }
            out.print(max);
        }

        private void read(int[] weights, int[] values, Scanner in)
        {
            for (int i = 0; i < weights.length; i++)
            {
                weights[i] = in.nextInt();
                values[i] = in.nextInt();
            }
        }

    }
}

