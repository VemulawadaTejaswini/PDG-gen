
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
    long a[] = new long[100001];

    s = r.readLine();
    sl = s.split(" ");
     for(int i = 0; i < n; i++)
     {
       a[i] = Long.parseLong(sl[i]);
     }

    RemRing rr = new RemRing(1000000007L);

    long c[] = new long[3];
    long v = 1;

    for(int i = 0; i < n; i++)
    {
      boolean b = true;
      long l = 0;
      for(int j = 0; j < 3; j++)
      {
        if(c[j] == a[i])
        {
          l++;
          if(b)
          {
            b = false;
            c[j]++;
          }
        }
      }
      v = rr.prod(v, l);
      // System.out.println(v);
    }

    System.out.println(v);

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