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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int n = in.nextInt() - 1;
            int[] b = new int[n];

            //Dishes
            for (int i = 0; i < n; i++)
            {
                b[i] = in.nextInt();
            }

            if (n == 0)
            {
                out.print(b[0] * 2);
                return;
            } else
            {
                int sum = b[0];
                //out.println(b[0]);
                int last = b[0];
                for (int i = 1; i < n; i++)
                {
                    //out.println(Math.min(last, b[i]));
                    sum += Math.min(last, b[i]);
                    last = b[i];
                }
                //out.print(b[n-1]);
                sum += b[n - 1];
                out.print(sum);
            }
        }

    }
}

