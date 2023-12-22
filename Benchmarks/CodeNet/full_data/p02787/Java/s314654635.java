import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Task solver = new Task();
        solver.solve(1, in, out);
        out.close();
    }

    static class Task
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int H = in.nextInt();
            int N = in.nextInt();
            int gain[] = new int[N];
            int cost[] = new int[N];
            for (int i = 0; i < N; i++)
            {
                gain[i] = in.nextInt();
                cost[i] = in.nextInt();
            }

            int dp[] = new int[H + 1];
            for (int i = 1; i <= H; i++)
            {
                dp[i] = Integer.MAX_VALUE;
            }
            dp[0] = 0;
            for (int i = 0; i <= H; i++)
            {
                for (int j = 0; j < N; j++)
                {
                    if (i >= gain[j])
                    {
                        dp[i] = Math.min(dp[i], dp[i - gain[j]] + cost[j]);
                    } else
                    {
                        dp[i] = Math.min(dp[i], dp[0] + cost[j]);
                    }
                }
            }
            out.print(dp[H]);
        }

    }
}

