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
        HashMap<String, Long> map = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            char[] arr = in.readLine().toCharArray();
            Arrays.sort(arr);
            String word = new String(arr);
            map.putIfAbsent(word, 0L);
            map.put(word, map.get(word)+1);
        }
        long sum = 0;
        for (String word : map.keySet())
        {
            long x = map.get(word);
            sum += x * (x-1) / 2;
        }
        out.println(sum);

        out.flush();
        in.close();
    }

    public static void main(String[] args) throws IOException
    {
        new Main().go();
    }
}
