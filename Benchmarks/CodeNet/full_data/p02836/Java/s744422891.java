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
            String str = in.next();
            if (str.length() == 1)
            {
                out.print(0);
                return;
            }
            out.print(count(str));
        }

        private int count(String str)
        {
            int i, j;
            if (str.length() % 2 == 0)
            {
                j = str.length() / 2;
                i = j - 1;
            } else
            {
                i = (str.length() / 2) - 1;
                j = (str.length() / 2) + 1;
            }
            int count = 0;
            for (; i >= 0 & j < str.length(); i--, j++)
            {
                if (str.charAt(i) != str.charAt(j)) count++;
            }
            return count;
        }

    }
}

