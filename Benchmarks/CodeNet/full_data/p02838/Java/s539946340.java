import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    final int MOD = 1000000007;
    long[] num = new long[n];
    long temp = 0;
    long sum = 0;
    int[] count = new int[60];
    for(int i = 0; i < n; i++) {
      num[i] = Long.parseLong(sc.next());
      for(int j = 0; j < 60; j++) {
        count[j] += (1 & (num[i] >> j));
      }
    }
    for(int i = 0; i < 60; i++) {
      long tt = count[i] * (n - count[i]) % MOD;
      sum = (sum + (tt * ((1L << i) % MOD) % MOD)) % MOD;
    }
    System.out.println(sum);
  }
}
