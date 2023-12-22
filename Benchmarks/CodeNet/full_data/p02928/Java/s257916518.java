import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer tok;

    long MOD = 1000000007;

    public void go() throws IOException
    {
        ntok();
        int n = ipar();
        long k = ipar();
        int[] arr = new int[n];
        ntok();
        for (int i = 0; i < n; i++)
        {
            arr[i] = ipar();
        }
        long total = 0;
        for (int i = 0; i < n; i++)
        {
            for (int e = i+1; e < n; e++)
            {
                if (arr[i] > arr[e])
                {
                    total += k * (k+1) / 2;
                    total %= MOD;
                }
                else if (arr[i] < arr[e])
                {
                    total += (k-1) * k / 2;
                    total %= MOD;
                }
            }
        }
        out.println(total);

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
