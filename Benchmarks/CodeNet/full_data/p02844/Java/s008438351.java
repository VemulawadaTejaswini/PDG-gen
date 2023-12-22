import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
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
            int N = in.nextInt();
            String str = in.next();
            char[] S = str.toCharArray();
            HashSet<Character> hs1 = new HashSet<Character>();
            HashSet<Character> hs2 = new HashSet<Character>();
            HashSet<Character> hs3 = new HashSet<Character>();

            int ans = 0;
            for (int i = 0; i < N; i++)
            {
                if (hs1.add(S[i]))
                {
                    hs2.clear();
                    for (int j = i + 1; j < N; j++)
                    {
                        if (hs2.add(S[j]))
                        {
                            hs3.clear();
                            for (int k = j + 1; k < N; k++)
                            {
                                hs3.add(S[k]);
                            }
                            ans += hs3.size();
                        }
                    }
                }
            }
            out.println(ans);
        }

    }
}

