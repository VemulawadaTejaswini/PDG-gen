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
        int[] arr = new int[n];
        ntok();
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        int prev = arr[0];
        int count = 1;
        int best = 1;
        for (int i = 1; i < n; i++)
        {
            if (arr[i] > prev)
            {
                count = 1;
            }
            else
            {
                count++;
            }
            best = Math.max(count, best);
            prev = arr[i];
        }
        out.println(best-1);

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
