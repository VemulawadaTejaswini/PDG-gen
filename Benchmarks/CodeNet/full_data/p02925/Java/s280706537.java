import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        int[][] mat = new int[n][n-1];
        for (int i = 0; i < n; i++)
        {
            ntok();
            for (int e = 0; e < n-1; e++)
            {
                mat[i][e] = ipar()-1;
            }
        }
        int left = n * (n-1);
        HashSet<Integer> play = new HashSet<>();
        int[] curr = new int[n];
        int days = 0;
        int prev = 1000000000;
        while (left > 0)
        {
            if (left == prev)
            {
                break;
            }
            prev = left;
            play.clear();
            for (int i = 0; i < n; i++)
            {
                if (curr[i] == n-1)
                {
                    continue;
                }
                int opp = mat[i][curr[i]];
                if (curr[opp] == n-1)
                {
                    continue;
                }
                if (mat[opp][curr[opp]] == i)
                {
                    play.add(i);
                }
            }
            for (int p : play)
            {
                curr[p]++;
                left--;
            }
            // out.println(play);
            days++;
        }
        if (left == prev)
        {
            out.println(-1);
        }
        else
        {
            out.println(days);
        }

        out.flush();
        in.close();
    }

    public void ntok() throws IOException
    {
        tok = new StringTokenizer(in.readLine());
    }

    public int ipar()
    {
        return Integer.parseInt(tok.nextToken());
    }

    public long lpar()
    {
        return Long.parseLong(tok.nextToken());
    }

    public double dpar()
    {
        return Double.parseDouble(tok.nextToken());
    }

    public String spar()
    {
        return tok.nextToken();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
