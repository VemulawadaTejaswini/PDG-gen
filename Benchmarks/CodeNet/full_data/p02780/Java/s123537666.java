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
            int K = in.nextInt();
            int A[] = CPUtils.readIntArray(N, in);

            int maxSum = 0;
            int start = 0;
            int end = K - 1;
            for (int i = 0; i < K; i++)
            {
                maxSum += A[i];
            }
            int currSum = maxSum;
            for (int i = K; i < N; i++)
            {
                currSum -= A[i - K];
                currSum += A[i];
                if (currSum > maxSum)
                {
                    maxSum = currSum;
                    start = i - K + 1;
                    end = i;
                }
            }
            double answer = 0;
            for (int i = start; i <= end; i++)
            {
                answer += ((A[i] * (A[i] + 1F) / 2F) / A[i]);
            }
            out.print(answer);
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

