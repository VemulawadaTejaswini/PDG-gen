import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);

    s = r.readLine();
    // int t = Integer.parseInt(sl[1]);
    //
    // for(int i = 0; i < n; i++)
    // {
    // s = r.readLine();
    // sl = s.split(" ");
    // time[i] = Integer.parseInt(sl[0]);
    // deli[i] = Integer.parseInt(sl[1]);
    // }
    //
    // int dp[][] = new int[3001][3001];
    //
    // for(int i = 1; i <= t; i++)
    // {
    // dp[i][0] = deli[0];
    // }
    //
    // for(int j = 0; j <= n; j++)
    // {
    // for(int i = time[j]; i <= t; i++)
    // {
    // dp[i][j] = Math.max(dp[i - time[j]][j - 1] + deli[j], dp[i - 1][j]);
    // }
    // }

    int d[] = new int[n];
    for (int i = 0; i < n; i++)
    {
      d[i] = s.charAt(i) - '0';
    }

    boolean b[] = new boolean[10];
    boolean b2[] = new boolean[100];
    boolean f[] = new boolean[1000];

    b[d[0]] = true;
    for (int i = 1; i < n; i++)
    {
      for (int j = 0; j < 100; j++)
      {
        f[j * 10 + d[i]] |= b2[j];
      }

      for (int j = 0; j < 10; j++)
      {
        b2[j * 10 + d[i]] |= b[j];
      }
      b[d[i]] = true;
    }

    int c = 0;
    for (int j = 0; j < 1000; j++)
    {
      if (f[j])
        c++;
    }

//    for (int j = 0; j < 100; j++)
//    {
//      System.out.println(Integer.valueOf(j).toString() + ": " +  b2[j]);
//    }

    System.out.println(c);
  }

}

class RemRing
{
  long module;

  public RemRing(long module)
  {
    this.module = module;
  }

  public long sum(long a, long b)
  {
    return (a + b + module) % module;
  }

  public long sub(long a, long b)
  {
    return (a - b + module) % module;
  }

  public long prod(long a, long b)
  {
    return (a * b) % module;
  }

  public long div(long a, long b)
  {
    return (a * inv(b)) % module;
  }

  public long inv(long a)
  {
    long b = this.module;
    long u = 1;
    long v = 0;
    while (b > 0)
    {
      long t = a / b;
      a -= t * b;
      u -= t * v;
      long z = a;
      a = b;
      b = z;
      z = u;
      u = v;
      v = z;
    }
    u %= this.module;
    if (u < 0)
      u += this.module;
    return u;
  }
}