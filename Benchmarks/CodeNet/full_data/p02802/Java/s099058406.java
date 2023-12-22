import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

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
            int N = in.nextInt(); //problems
            int M = in.nextInt(); //subs
            Map<Integer, List<Integer>> subsMap = new HashMap<>();
            while (M-- > 0)
            {
                int problem = in.nextInt();
                String answer = in.next();

                List<Integer> answers = subsMap.getOrDefault(problem, new ArrayList<>());
                answers.add(answer.equals("WA") ? 0 : 1);
                subsMap.put(problem, answers);
            }
            int p = 0;
            int correct = 0;
            for (int problem : subsMap.keySet())
            {
                List<Integer> answers = subsMap.get(problem);
                int i = 0;
                boolean wasSolved = false;
                int localP = 0;
                while (i < answers.size())
                {
                    if (answers.get(i) == 0)
                    {
                        localP++;
                    } else
                    {
                        wasSolved = true;
                        break;
                    }
                    i++;
                }
                if (wasSolved)
                {
                    correct++;
                    p += localP;
                }
            }
            out.print(correct + " " + p);
        }

    }
}

