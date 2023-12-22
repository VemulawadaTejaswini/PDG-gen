import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long k = sc.nextLong();
    long MOD = (long)Math.pow(10, 9) + 7;
    long ans = 0;
    for(long i = k; i <= (n + 1); i++) {
      long t1 = (i * (i - 1)) / 2;
      t1 = (t1 % MOD);
      long t2 = (i * (2 * n - i + 1)) / 2;
      t2 = (t2 % MOD);
      ans = (ans + t2 + MOD - t1 + 1) % MOD;
    }
    System.out.println(ans);
  }
}