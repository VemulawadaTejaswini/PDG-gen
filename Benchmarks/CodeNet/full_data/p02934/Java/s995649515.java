import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        int n = Integer.parseInt(tok.nextToken());
        tok = new StringTokenizer(in.readLine());
        double sum = 0;
        for (int i = 0; i < n; i++)
        {
            double d = Integer.parseInt(tok.nextToken());
            d = 1/d;
            sum += d;
        }
        out.println(1 / sum);

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
