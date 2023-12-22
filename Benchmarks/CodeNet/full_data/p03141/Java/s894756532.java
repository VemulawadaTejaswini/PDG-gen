import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main
{
  static long imp[];
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    String[] sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    long a[] = new long[n];
    long b[] = new long[n];
    Integer ord[] = new Integer[n];
    imp = new long[n];
    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      a[i] = Long.parseLong(sl[0]);
      b[i] = Long.parseLong(sl[1]);
      imp[i] = a[i] + b[i];
      ord[i] = i;
    }

    class Comp implements Comparator<Integer>
    {
      @Override
      public int compare(Integer o1, Integer o2)
      {
        if(imp[o1] > imp[o2])
          return -1;
        else if(imp[o1] < imp[o2])
          return 1;
        return 0;
      }
    }

    Arrays.sort(ord, new Comp());

    long sum = 0;
    for(int i = 0; i < n; i++)
    {
      int proc = ord[i];
      if((i & 1) == 0)
      {
        sum += a[proc];
      }
      else
      {
        sum -= b[proc];
      }
    }

    System.out.println(sum);

  }

}