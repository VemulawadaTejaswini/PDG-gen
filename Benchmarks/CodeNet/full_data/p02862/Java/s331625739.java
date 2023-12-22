import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = Integer.parseInt(sc.next());
    int y = Integer.parseInt(sc.next());
    long ans = 0;
    int tmpx = x;
    int tmpy = y;
    if((x % 3 == 0 && y % 3 == 0) || (x % 3 == 1 && y % 3 == 2) || (x % 3 == 2 && y % 3 == 1)) {
      int count = 0;
      while(!(tmpx == 0 && tmpy == 0)) {
        if(tmpx >= tmpy) {
          count++;
          tmpx -= 2;
          tmpy -= 1;
        } else {
          tmpx -= 1;
          tmpy -= 2;
        }
      }
      ans = combinationAndMod((long)(x + y) / 3, (long)count);
    }
    System.out.println(ans);
  }

 static long combinationAndMod(long n, long r) {
   long mod = 1000000007;
        r = Math.min(r, n - r);
        long x = 1, y = 1;
        for (long i = 1; i <= r; i++) {
            x = x * (n - r + i) % mod;
            y = y * i % mod;
        }
        return x * powAndMod(y, mod - 2) % mod;
    }
 
    static long powAndMod(long a, long b) {
      long mod = 1000000007;
        return b == 0 ? 1 : b % 2 == 1 ? a * powAndMod(a, b - 1) % mod : powAndMod(a * a % mod, b / 2);
    }
}