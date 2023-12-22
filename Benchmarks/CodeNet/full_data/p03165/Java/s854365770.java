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
        TaskF solver = new TaskF();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskF
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            String s = in.next(), t = in.next();
            int[][] matrix = new int[s.length() + 1][t.length() + 1];

            for (int i = 1; i <= s.length(); i++)
            { // row
                for (int j = 1; j <= t.length(); j++)
                { // column
                    if (s.charAt(i - 1) == t.charAt(j - 1))
                    {
                        matrix[i][j] = matrix[i - 1][j - 1] + 1;
                    } else
                    {
                        matrix[i][j] = Math.max(matrix[i - 1][j], matrix[i][j - 1]);
                    }
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            int posX = s.length();
            int posY = t.length();

            while (posX > 0 && posY > 0)
            {
                if (matrix[posX - 1][posY - 1] == matrix[posX][posY] - 1)
                { // matched element
                    stringBuilder.append(s.length() < t.length() ? s.charAt(posX - 1) : s.charAt(posY - 1));
                    posX--;
                    posY--;
                } else if (matrix[posX - 1][posY] > matrix[posX][posY - 1])
                {
                    posX--;
                } else if (matrix[posX - 1][posY] < matrix[posX][posY - 1])
                {
                    posY--;
                } else
                {
                    if (s.length() < t.length())
                    {
                        posX--;
                    } else
                    {
                        posY--;
                    }
                }
            }
            out.print(stringBuilder.reverse().toString());
        }

    }
}

