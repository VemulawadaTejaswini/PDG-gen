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
            int N = in.nextInt(); // > 0, odd, up to 3000

            double[] dp = new double[(N / 2) + 1];
            // dp[i] = probability of having i tails
            dp[0] = 1;
            for (int coin = 0; coin < N; coin++)
            { // coins
                double p_tails = 1 - in.nextDouble();
                for (int i = (N / 2); i >= 0; i--)
                {
                    if (i - 1 >= 0)
                    {
                        dp[i] = dp[i - 1] * p_tails + dp[i] * (1 - p_tails);
                    } else
                    {
                        dp[i] = +dp[i] * (1 - p_tails);
                    }
                }
            }
            double sum = 0;
            for (int tails = 0; tails <= N / 2; tails++)
            {
                sum += dp[tails];
            }
            out.print(sum);
        }

    }
}

