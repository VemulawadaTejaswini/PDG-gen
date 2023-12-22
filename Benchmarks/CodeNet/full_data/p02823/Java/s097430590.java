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
            long n = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();

            long A = Math.min(a, b);
            long B = Math.max(a, b);

            if ((B - A) % 2L == 0)
            {
                out.print((B - A) / 2L);
                return;
            }

            if (n - B < A - 1)
            {
                out.print(n - A);
            } else
            { // A closer to 1
                out.print(B - 1);
            }
        }

    }
}

