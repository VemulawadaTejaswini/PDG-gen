import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  static long t[];
  static long l[];
  static long h[];

  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);

    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int m = Integer.parseInt(sl[1]);

    int a[] = new int[m];
    for(int i = 0; i < n; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int v = Integer.parseInt(sl[0]);
      for(int j = 1; j <= v; j++)
      {
        int t = Integer.parseInt(sl[j]) - 1;
        a[t]++;
      }
    }

    int sum = 0;
    for(int i = 0; i < m; i++)
    {
      //System.out.println(a[i]);
      if(a[i] == n)
      {
        sum++;
      }
    }
    System.out.println(sum);
  }

}