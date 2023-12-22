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
    int k = Integer.parseInt(sl[1]);

    RemRing rr = new RemRing(1000000007);
    long[] fact = new long[2001];
    long[] ifact = new long[2001];

    fact[0] = 1;
    ifact[0] = rr.inv(1);
    for(int i = 1; i <= 2000; i++)
    {
      fact[i] = rr.prod(fact[i - 1], i);
      ifact[i] = rr.inv(fact[i]);
    }

    for(int i = 1; i <= k; i++)
    {
      if(k < i || n - k < i - 1)
      {
        System.out.println(0);
      }
      else
      {
        long t = rr.prod(fact[k - 1], fact[n - k + 1]);
        t = rr.prod(t, ifact[k - i]);
        t = rr.prod(t, ifact[i - 1]);
        t = rr.prod(t, ifact[n - k + 1 - i]);
        t = rr.prod(t, ifact[i]);
        System.out.println(t);
      }
    }

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
    while(b > 0)
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
    if(u < 0) u += this.module;
    return u;
  }
}