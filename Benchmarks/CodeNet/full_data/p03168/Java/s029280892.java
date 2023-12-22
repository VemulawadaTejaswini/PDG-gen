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
            double[] p = CPUtils.readDoubleArray(N, in); //head probability

            double[] dp = new double[N + 2];
            // dp[i] = probability of having i heads
            dp[0] = 1;
            for (int coin = 0; coin < N; coin++)
            { // coins
                for (int i = N + 1; i >= 0; i--)
                {
                    if (i - 1 >= 0)
                    {
                        dp[i] = dp[i - 1] * p[coin] + dp[i] * (1 - p[coin]);
                    } else
                    {
                        dp[i] = +dp[i] * (1 - p[coin]);
                    }
                }
            }
            double sum = 0;
            for (int heads = 0; heads <= N; heads++)
            {
                int tails = N - heads;
                if (heads > tails)
                {
                    sum += dp[heads];
                }
            }
            out.print(sum);
        }

    }

    static class CPUtils
    {
        public static double[] readDoubleArray(int size, Scanner in)
        {
            double[] array = new double[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextDouble();
            }
            return array;
        }

    }
}

