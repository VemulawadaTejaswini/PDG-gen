import java.io.*;
import java.util.*;

public class Main
{
    PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void go() throws IOException
    {
        StringTokenizer tok = new StringTokenizer(in.readLine());
        String s = tok.nextToken();
        tok = new StringTokenizer(in.readLine());
        String t = tok.nextToken();
        int n = s.length();
        int m = t.length();
        int[][] next = new int[n][26];
        Arrays.fill(next[n-1], -1);
        next[n-1][s.charAt(n-1)-'a'] = n-1;
        // out.println(Arrays.toString(next[n-1]));
        for (int i = n-2; i >= 0; i--)
        {
            next[i] = Arrays.copyOf(next[i+1], 26);
            next[i][s.charAt(i)-'a'] = i;
            // out.println(Arrays.toString(next[i]));
        }
        int currIndex = 0;
        int len = 0;
        boolean works = true;
        for (int i = 0; i < m; i++)
        {
            int nextIndex = next[currIndex][t.charAt(i)-'a'];
            if (currIndex != 0 && nextIndex == -1)
            {
                nextIndex = next[0][t.charAt(i)-'a'];
            }
            // out.println(currIndex + " " + nextIndex);
            if (nextIndex == -1)
            {
                works = false;
                break;
            }
            len += (nextIndex+n - currIndex + 1) % n;
            currIndex = (nextIndex+1)%n;
        }
        if (works)
        {
            out.println(len);
        }
        else
        {
            out.println(-1);
        }

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
