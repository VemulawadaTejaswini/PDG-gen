

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    long sum = 0;
    int mod = 1000000007;
    long[] finv = new long[n+1];
    long[] inv = new long[n+1];
    long fac = combinationInit(finv, inv, n);

    for (int i = 1; i <= n; i++) {
      if(i != a && i != b) {
        sum = (sum + combination(n, i, fac, finv)) % mod;
      }
    }
    System.out.println(sum);
  }

  private static int combinationInit(long[] finv, long[] inv, long n) {
    int mod = 1000000007;

    int fac = 1;
    finv[0] = 1;
    finv[1] = 1;
    inv[1] = 1;
    for (int i = 2; i < n + 1; i++) {
      fac = fac * i % mod;
      inv[i] = mod - inv[mod % i] * (mod / i) % mod;
      finv[i] = finv[i - 1] * inv[i] % mod;
    }
    return fac;
  }

  private static long combination(int n, int k, long fac, long[] finv) {
    int mod = 1000000007;

    return fac * finv[k] * finv[n - k]  % mod;
  }


}
