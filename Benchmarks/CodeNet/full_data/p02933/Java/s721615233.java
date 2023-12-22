import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        int a = Integer.parseInt(tok.nextToken());
        tok = new StringTokenizer(in.readLine());
        String s = tok.nextToken();
        if (a < 3200)
        {
            out.println("red");
        }
        else
        {
            out.println(s);
        }

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
