import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        int k = Integer.parseInt(tok.nextToken());
        int x = Integer.parseInt(tok.nextToken());
        for (int i = x-k+1; i <= x+k-1; i++)
        {
            out.print(i);
            if (i != x+k-1)
                out.print(" ");
        }

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
