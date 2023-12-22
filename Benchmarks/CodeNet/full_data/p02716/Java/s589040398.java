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
    sl = s.split(" ");
    long a[] = new long[200000];
    long v[] = new long[200000];

    for(int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }

    v[0] = 0;
    v[1] = Math.max(a[0], a[1]);
    for(int i = 2; i < n; i++)
    {
      v[i] = Math.max(v[i - 1], v[i - 2] + a[i]);
    }


    System.out.println(v[n - 1]);
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