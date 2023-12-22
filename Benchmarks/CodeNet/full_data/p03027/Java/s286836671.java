import java.util.*;

public class Main {
  public static long MOD = (long)Math.pow(10, 6) + 3;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long[] kai = new long[(int)MOD];
    long[] inkai = new long[(int)MOD];
    long[] in = new long[(int)MOD];
    kai[0] = 1;
    kai[1] = 1;
    inkai[0] = 1;
    inkai[1] = 1;
    in[1] = 1;
    for(long i = 2; i < MOD; i++) {
      kai[(int)i] = (i * kai[(int)i - 1]) % MOD;
      inkai[(int)i] = func(kai[(int)i], MOD - 2);
      in[(int)i] = func(i, MOD - 2);
    }
    /**
    int q = sc.nextInt();
    for(int i = 0; i < q; i++) {
      long x = sc.nextLong();
      long d = sc.nextLong();
      long n = sc.nextLong();
      long ans = 0;
      if(d == 0) {
        if(x == 0) {
          ans = 0;
        } else {
          ans = func(x, n % (MOD - 1));
        }
      } else {
        x = (x * in[(int)d]) % MOD;
        if(x == 0) {
          ans = 0;
        } else {
          if((int)(x + n - 1) >= MOD) {
            ans = 0;
          } else {
            long t = func(d, n % (MOD - 1));
            ans = (((kai[(int)(x + n - 1)] * inkai[(int)(x - 1)]) % MOD) * t) % MOD;
          }
        }
      }
      */
    }
    System.out.println(0);
  }

  public static long func(long a, long x) {
    if(x == 0) return 1;
    if(x >= 1) {
      if(x % 2 == 0) {
        long t = func(a, x / 2);
        return (t * t) % MOD;
      } else {
        long t = func(a, x - 1);
        return (a * t) % MOD;
      }
    }
    return 0;
  } 
}