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
            int x = in.nextInt();

            if (x < 100)
            {
                out.print(0);
                return;
            }

            int nums[][] = new int[1000][2];
            int j = 0;
            int increment = 5;
            for (int i = 100; i <= 100000; i += 100, increment += 5)
            {
                nums[j][0] = i;
                nums[j][1] = i + increment;
                j++;
            }
            for (int i = 0; i < 1000; i++)
            {
                if (x >= nums[i][0] && x <= nums[i][1])
                {
                    out.print(1);
                    return;
                }
            }
            out.print(0);
        }

    }
}

