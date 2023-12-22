import java.util.*;

public class Main {
  public static void main(String[] srgs) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int m = Integer.parseInt(sc.next());
    long ans = 1;
    final long mod = 1_000_000_007;
    if(n - m <= -2 || 2 <= n - m) {
      ans = 0;
    } else if(n - m == 1 || n - m == -1) {
      ans = modFact(n, mod) * modFact(m, mod) % mod;
    } else {
      ans = 2 * (modFact(n, mod) * modFact(m, mod) % mod) % mod;
    }
    System.out.println(ans);
  }

  public static long modFact(int a, long p) {
    long factorial = 1;
    for(int i = 2; i <= a; i++) {
      factorial = factorial * i % p;
    }
    return factorial;
  }
}
