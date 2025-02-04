import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.TreeMap;
import java.lang.StringBuilder;

class Pair
{
  public Long x;
  public Long y;
  public Pair(){x = 0L; y = 0L;}
  public Pair(Long x, Long y)
  {
    this.x = x;
    this.y = y;
  }
}

public class Main
{
  private static final long mod = 1000000007;
  // public static long gcd(long a, long b)
  // {
  //   if(b == 0) return a;
  //   return gcd(b, a % b);
  // }
  public static Pair extended_gcd(long a, long b)
  {
    if (b == 0) {
        return new Pair(1L, 0L);
    }
    Pair p = extended_gcd(b, a % b);
    long x = p.y;
    long y = p.x - (a / b) * p.y;
    return new Pair(x, y);
  }
  public static long power(long b, long p)
  {
    if(p == 0) return 1L;
    long ret = power(b, p / 2);
    ret = (ret * ret) % mod;
    if(p % 2 == 1) ret = (ret * b) % mod;
    return ret;
  }
  public static long modInverse(long a, long mod)
  {
    return (extended_gcd(a, mod).x % mod + mod) % mod;
  }
  public static void main(String[] args) throws FileNotFoundException
  {
      Scanner scanner = new Scanner(System.in);//new File("input.txt"));
      int n = scanner.nextInt();
      long[] a = new long[n];
      for(int i = 0 ; i < n ; i++)
        a[i] = scanner.nextInt();
      TreeMap<Integer, Integer> map = new TreeMap<>();
      for(int i = 0 ; i < n ; i++)
      {
        int temp = (int)a[i];
        for(int j = 2 ; j * j <= temp ; j++)
        {
          int cnt = 0;
          while(temp % j == 0)
          {
            temp /= j;
            ++cnt;
          }
          if(map.containsKey(j))
            map.put(j, Math.max(cnt, map.get(j)));
          else
            map.put(j, cnt);
        }
        if(temp != 1)
        {
          if(map.containsKey(temp))
            map.put(temp, Math.max(1, map.get(temp)));
          else
            map.put(temp, 1);
        }
      }
      long lcm = 1;
      for(Map.Entry<Integer, Integer> e : map.entrySet())
      {
        // System.out.println(e.getKey() + " " + e.getValue());
        lcm = (lcm * power(e.getKey(), e.getValue())) % mod;
      }
      long sum = 0;
      for(int i = 0 ; i < n ; i++)
      {
          sum = (sum + (lcm * modInverse(a[i], mod)) % mod) % mod;
      }
      System.out.println(sum);
  }
}
