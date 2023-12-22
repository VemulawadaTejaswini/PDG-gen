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
            int N = in.nextInt();
            int activities[][] = new int[N][3];
            for (int i = 0; i < N; i++)
            {
                activities[i] = CPUtils.readIntArray(3, in);
            }
            out.print(solve(N, 0, '0', activities));
        }

        private int solve(int n, int day, char prev, int[][] activities)
        {
            if (day == n) return 0;

            int score = 0;
            if (prev != 'A')
            {
                score = solve(n, day + 1, 'A', activities) + activities[day][0];
            }
            if (prev != 'B')
            {
                score = Math.max(score, solve(n, day + 1, 'B', activities) + activities[day][1]);
            }
            if (prev != 'C')
            {
                score = Math.max(score, solve(n, day + 1, 'C', activities) + activities[day][2]);
            }
            return score;
        }

    }

    static class CPUtils
    {
        public static int[] readIntArray(int size, Scanner in)
        {
            int[] array = new int[size];
            for (int i = 0; i < size; i++)
            {
                array[i] = in.nextInt();
            }
            return array;
        }

    }
}

