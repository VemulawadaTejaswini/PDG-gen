import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
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
        TaskA solver = new TaskA();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskA
    {
        public void solve(int testNumber, Scanner in, PrintWriter out)
        {
            int n = in.nextInt();
            int matches[][] = new int[n + 1][n];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n - 1; j++)
                {
                    matches[i][j] = in.nextInt();
                }
            }
            List<Set<Match>> matchesPerDay = new ArrayList<>();
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n - 1; j++)
                {
                    boolean needExtraDay = true;
                    boolean alreadyPlayed = false;
                    int gamesPlayed = 0;
                    for (Set<Match> matchesSet : matchesPerDay)
                    {
                        if (matchesSet.contains(new Match(i, matches[i][j])))
                        {
                            gamesPlayed++;
                            alreadyPlayed = true;
                            break;
                        }
                        if ((!alreadyPlays(i, matchesSet) && !alreadyPlays(matches[i][j], matchesSet)) &&
                                    gamesPlayed + 1 == j)
                        {
                            gamesPlayed++;
                            needExtraDay = false;
                            matchesSet.add(new Match(i, matches[i][j]));
                            matchesSet.add(new Match(matches[i][j], i));
                        } else if (alreadyPlays(i, matchesSet))
                        {
                            gamesPlayed++;
                        }
                    }

                    if (needExtraDay && !alreadyPlayed)
                    {
                        Set<Match> set = new HashSet<>();
                        set.add(new Match(i, matches[i][j]));
                        set.add(new Match(matches[i][j], i));
                        matchesPerDay.add(set);
                    }
                }
            }

            int matchesHappened[][] = new int[n + 1][n];

            //verify order
            for (int i = 1; i <= n; i++)
            {
                List<Integer> list = new ArrayList<>();
                for (Set<Match> m : matchesPerDay)
                {
                    for (Match ma : m)
                    {
                        if (ma.player1 == i)
                        {
                            list.add(ma.player2);
                        }
                    }
                }
                int count = 1;
                for (int el : list)
                {
                    matchesHappened[i][count] = el;
                    count++;
                }
            }
            boolean equal = true;
            ext:
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n - 1; j++)
                {
                    if (matchesHappened[i][j] != matches[i][j])
                    {
                        equal = false;
                        break ext;
                    }
                }
            }
            if (equal)
                out.print(matchesPerDay.size());
            else
                out.print(-1);
        }

        private boolean alreadyPlays(int i, Set<Match> matchesSet)
        {
            for (Match m : matchesSet)
            {
                if (m.player1 == i || m.player2 == i)
                {
                    return true;
                }
            }
            return false;
        }

        class Match
        {
            int player1;
            int player2;

            Match(int player1, int player2)
            {
                this.player1 = player1;
                this.player2 = player2;
            }

            public boolean equals(Object obj)
            {
                return (this.player1 == ((Match) obj).player1 && this.player2 == ((Match) obj).player2) ||
                               (this.player1 == ((Match) obj).player2 && this.player2 == ((Match) obj).player1);
            }

            public int hashCode()
            {
                int prime = 31;
                int result = 1;
                result = prime * result + player1;
                result = prime * result + player2;
                return result;
            }

        }

    }
}

