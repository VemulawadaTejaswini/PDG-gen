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
            int n = in.nextInt();
            int[][] dp = new int[10][10];
            for (int i = 0; i < 10; i++)
                for (int j = 0; j < 10; j++) dp[i][j] = 0;

            for (int i = 1; i <= n; i++)
            {
                int ld = i % 10;
                int lg = (int) Math.log10(i);
                int fd = i / (int) Math.pow(10, lg);
                dp[fd][ld] += 1;

            }
            long ans = 0;
            for (int i = 1; i < 10; i++)
            {
                for (int j = 1; j < 10; j++)
                {
                    ans += (dp[i][j] * dp[j][i]);
                }
            }
            out.print(ans);
        }

    }
}

