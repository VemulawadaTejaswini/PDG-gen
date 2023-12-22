import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main
{
  static ArrayList<ArrayList<Integer>> g = new ArrayList<>();
  static ArrayList<Boolean> f = new ArrayList<>();
  public static void main(String[] args) throws IOException
  {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in), 1);
    String s;
    String sl[];

    s = r.readLine();
    sl = s.split(" ");
    int n = Integer.parseInt(sl[0]);
    int u = Integer.parseInt(sl[1]) - 1;
    int v = Integer.parseInt(sl[2]) - 1;

    for(int i = 0; i < n; i++)
    {
      g.add(new ArrayList<>());
      f.add(false);
    }

    for(int i = 0; i < n - 1; i++)
    {
      s = r.readLine();
      sl = s.split(" ");
      int a = Integer.parseInt(sl[0]) - 1;
      int b = Integer.parseInt(sl[1]) - 1;
      g.get(a).add(b);
      g.get(b).add(a);
    }
    int duv = duv(u, v);
    f.set(v, true);
    int fk = fk(u, duv);
//    System.out.println(duv);
//    System.out.println(f);
//    System.out.println(fk(u, duv));
//    System.out.println(f);
    System.out.println((duv + fk) / 2);
  }

  public static int duv(int u, int v)
  {
    f.set(v, true);
    if(u == v)
    {
      return 0;
    }
    int a = 10000000;
    int aa = -1;
    for(Integer e : g.get(v))
    {
      if(!f.get(e))
      {
        int k = 1 + duv(u, e);
        if(k < a)
        {
          if(aa != -1) f.set(aa, false);
          f.set(e, true);
          a = k;
          aa = e;

        }
      }
    }

    for(Integer e : g.get(v))
    {
      if(f.get(e) && e != aa && aa != -1)
      {
          jk(e, v);
      }
    }

    return a;
  }

  public static void jk(int u, int an)
  {
    f.set(u, false);
    for(Integer e : g.get(u))
    {
      if(f.get(e) && e != an)
      {
        jk(e, u);
      }
    }
  }

  public static int fk(int u, int p)
  {
    if(p <= 0)
    {
      return -1;
    }
    f.set(u, true);
    int a = 0;
    for(Integer e : g.get(u))
    {
      if(!f.get(e))
      {
        a = Math.max(a, 1 + fk(e, p));
      }
      else
      {
        a = Math.max(a, 1 + fk(e, p - 2));
      }
    }
    return a;
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
