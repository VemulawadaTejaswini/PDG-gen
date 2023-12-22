
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s = r.readLine();
    int n = Integer.parseInt(s);
    s = r.readLine();
    long a[] = new long[200001];
    String[] sl = s.split("[\\s]+");
    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }

    for(int i = 0; i < n; i++)
    {
      a[i] -= i + 1;
    }

    long m = 0;
    for(int i = 0; i < n; i++)
    {
      m += a[i];
    }
    m /= n;

    long min = Long.MAX_VALUE;
    long t = 0;
    for(int i = 0; i < n; i++)
    {
      t += Math.abs(a[i] - m);
    }
    min = Math.min(min, t);
    t = 0;
    for(int i = 0; i < n; i++)
    {
      t += Math.abs(a[i] - m - 1);
    }
    min = Math.min(min, t);
    t = 0;
    for(int i = 0; i < n; i++)
    {
      t += Math.abs(a[i] - m + 1);
    }
    min = Math.min(min, t);

    System.out.println(min);
  }

}
