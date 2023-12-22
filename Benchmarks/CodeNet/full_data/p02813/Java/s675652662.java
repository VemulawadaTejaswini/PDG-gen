
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

    int p[] = new int[8];
    int q[] = new int[8];
    s = r.readLine();
    sl = s.split(" ");

    for(int i = 0; i < n; i++)
    {
      p[i] = Integer.parseInt(sl[i]) - 1;
    }

    s = r.readLine();
    sl = s.split(" ");

    for(int i = 0; i < n; i++)
    {
      q[i] = Integer.parseInt(sl[i]) - 1;
    }

    int pp = 0;
    int qq = 0;
    boolean fp[] = new boolean[8];
    boolean fq[] = new boolean[8];
    int z = 1;
    for(int i = 1; i < n; i++)
    {
      z *= i;
    }

    //System.out.println(z);

    for(int i = 0; i < n - 1; i++)
    {
      for(int j = 0; j < p[i]; j++)
      {

        if(!fp[j])
        {
          //System.out.println("a " + z);
          pp += z;
        }
      }
      fp[p[i]] = true;

      for(int j = 0; j < q[i]; j++)
      {
        if(!fq[j])
        {
          qq += z;
        }
      }
      fq[q[i]] = true;

      z /= n - i - 1;
    }

    //System.out.println(Math.abs(pp));

    //System.out.println(Math.abs(qq));

    System.out.println(Math.abs(pp - qq));
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