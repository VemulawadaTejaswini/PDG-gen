import java.util.*;

public class Main {
  
  private static int MOD = 1_000_000_007;
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    
    long ans = 1;
    for (long i = 2; i*i <= M; i++) {
      if (M % i == 0) {
        int cnt = 0;
        while (M % i == 0) {
          cnt++;
          M /= i;
        }
        ans *= combmod(cnt + N - 1, N - 1);
        ans %= MOD;
      }
    }
    
    if (M != 1) {
      ans *= combmod(N, 1);
      ans %= MOD;
    }
    
    System.out.println(ans);
  }
  
  private static long combmod(int n, int r) {
    if (r > n - r) {
      return combmod(n, n - r);
    }
    
    long combMul = 1;
    long combDiv = 1;
    for (int i = 0; i < r; i++) {
      combMul *= n - i;
      combMul %= MOD;
      combDiv *= i + 1;
      combDiv %= MOD;
    }
    return combMul * powmod(combDiv, MOD - 2) % MOD;
  }
  
  private static long powmod(long a, int n) {
    if (n == 0) {
      return 1;
    }
    
    if (n % 2 == 0) {
      int halfN = n / 2;
      long half = powmod(a, halfN);
      return half * half % MOD;
    } else {
      return a * powmod(a, n-1) % MOD;
    }
  }
}
