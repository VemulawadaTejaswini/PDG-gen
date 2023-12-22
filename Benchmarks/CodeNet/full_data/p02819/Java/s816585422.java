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
            boolean[] composite = new boolean[1_000_000 + 1];
            int X = in.nextInt();

            for (int p = 2; p * p < 1_000_000 + 1; p++)
            {
                if (!composite[p])
                {
                    for (int i = p * 2; i < 1_000_000 + 1; i += p)
                    {
                        composite[i] = true;
                    }
                }
            }
            for (int i = X; i <= 1_000_000; i++)
            {
                if (!composite[i])
                {
                    out.print(i);
                    return;
                }
            }
        }

    }
}

