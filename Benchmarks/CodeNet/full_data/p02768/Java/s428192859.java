import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt(), a = in.nextInt(), b = in.nextInt();
    int mod = 1_000_000_007;
    long total = pow(2L, n) - 1;
    long cab = (choose(n, a) + choose(n, b)) % mod;
    long ans = (total - cab + mod) % mod;
    System.out.println(ans);
  }
  
  long choose(int n, int a)
  {
    if(n - a < a) return choose(n, n - a);
    long nf = 1, af = 1;
    int mod = 1_000_000_007;
    for(int i = 1; i <= a; i++)
    {
      nf *= n - i + 1;
      nf %= mod;
      nf *= pow(i, mod - 2);
      nf %= mod;
    }
    return nf;
  }
  
  long pow(long a, int b)
  {
    long re = 1;
    int mod = 1_000_000_007;
    while(b > 0)
    {
      if(b % 2 != 0)
      {
        re *= a;
        re %= mod;
      }
      a *= a;
      a %= mod;
      b /= 2;
    }
    return re;
  }
}
  