import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
  static Integer a[];
  static Integer b[];

  public static void main(String[] args) throws IOException
  {

    class Comp implements Comparator<Integer>
    {
      @Override
      public int compare(Integer o1, Integer o2)
      {
        if(a[o1] < a[o2])
          return -1;
        else if(a[o1] > a[o2])
          return 1;
        return 0;
      }
    }

    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");

    int n = Integer.parseInt(sl[0]);
    int k = Integer.parseInt(sl[1]);

    a = new Integer[n];
    b = new Integer[n];
    s = r.readLine();
    sl = s.split(" ");
    for(int i = 0; i < n; i++)
    {
      a[i] = Integer.parseInt(sl[i]);
      b[i] = i;
    }
    Arrays.sort(b, new Comp());
    int sum = 0;
    StringBuilder sb = new StringBuilder();
    int z = (n - 1) * (k + 2) - 1;
    for(int i = 0; i < n; i++)
    {
      int t = (z + i) / n;
      if(a[b[i]] < t)
      {
        System.out.println(-1);
        System.exit(0);
      }
      else
      {
        while(t < a[b[i]])
        {
          a[b[i]]--;
          sum++;
          sb.append(b[i] + 1);
          sb.append(" ");
        }
      }
    }

    int v = n - 1;
    {
      while(a[b[v]] > 0)
      {
        a[b[v]]--;
        sum++;
        sb.append(b[v] + 1);
        sb.append(" ");
        v = (v + n - 1) % n;
      }
    }

    System.out.println(sum);
    System.out.println(sb);
  }

}