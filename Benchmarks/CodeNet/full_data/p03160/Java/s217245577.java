import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;

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
            int H[] = CPUtils.readIntArray(N, in);
            Map<Integer, Integer> memo = new HashMap<>();
            out.print(solve(N, 0, 0, H, memo));
        }

        static int solve(int N, int position, int localCost, int cost[], Map<Integer, Integer> memo)
        {
            if (position + 1 == N) return localCost;

            if (memo.containsKey(N - position - 1))
            {
                return localCost + memo.get(N - position - 1);
            }
            int r;
            if (position + 2 < N)
            {
                r = Math.min(solve(N, position + 1, localCost + Math.abs(cost[position] - cost[position + 1]), cost, memo),
                             solve(N, position + 2, localCost + Math.abs(cost[position] - cost[position + 2]), cost, memo));

            } else
            {
                r = solve(N, position + 1, localCost + Math.abs(cost[position] - cost[position + 1]), cost, memo);
            }
            memo.put(N - position - 1, r - localCost);
            return r;
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

