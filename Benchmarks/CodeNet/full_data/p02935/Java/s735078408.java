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
        PriorityQueue<Double> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++)
        {
            pq.add((double)Integer.parseInt(tok.nextToken()));
        }
        while (pq.size() > 1)
        {
            double a = pq.remove();
            double b = pq.remove();
            pq.add((a+b) / 2);
        }
        out.println(pq.remove());

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
