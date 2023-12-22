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
    long t1 = Long.parseLong(sl[0]);
    long t2 = Long.parseLong(sl[1]);

    s = r.readLine();
    sl = s.split(" ");
    long a1 = Long.parseLong(sl[0]);
    long a2 = Long.parseLong(sl[1]);

    s = r.readLine();
    sl = s.split(" ");
    long b1 = Long.parseLong(sl[0]);
    long b2 = Long.parseLong(sl[1]);

    a1 -= b1;
    a2 -= b2;

    if(a1 < 0)
    {
      a1 = - a1;
      a2 = - a2;
    }

    long v = a1 * t1 + a2 * t2;

    if(v == 0)
    {
      System.out.println("infinity");
      System.exit(0);
    }

    if(v > 0)
    {
      System.out.println("0");
      System.exit(0);
    }

    long a = a1 * t1;
    long b = a2 * t2;
//    System.out.println(a);
//    System.out.println(b);
//    System.out.println(v);
//    System.out.println(a / (- v));
//    System.out.println((- b + v + (- v - 1)) / (- v));

    System.out.println(a / (- v) + (- b + v + (- v - 1)) / (- v));

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
