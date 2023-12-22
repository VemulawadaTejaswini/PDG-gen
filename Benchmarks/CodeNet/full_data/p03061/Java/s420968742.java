
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

    long a[] = new long[100004];
    long b[] = new long[100004];
    long c[] = new long[100004];
    s = r.readLine();
    sl = s.split(" ");

    for (int i = 0; i < n; i++)
    {
      a[i] = Long.parseLong(sl[i]);
    }

    b[0] = a[0];
    c[n - 1] = a[n - 1];
    for (int i = 1; i < n; i++)
    {
      b[i] = gcd(b[i - 1], a[i]);
    }
    for(int i = n - 2; i >= 0; i--)
    {
      c[i] = gcd(c[i + 1], a[i]);
    }

    long m = Math.max(b[n - 2], c[1]);
    for(int i = 1; i <= n - 2; i++)
    {
      m = Math.max(m, gcd(b[i - 1], c[i + 1]));
    }
    System.out.println(m);
  }

  public static long gcd(long m, long n)
  {
    if (m < n)
      return gcd(n, m);
    if (n == 0)
      return m;
    return gcd(n, m % n);
  }

}