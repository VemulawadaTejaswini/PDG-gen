import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    final int MOD = 1000000007;
    long[] num = new long[n];
    long temp = 0;
    long sum = 0;
    int[] count = new int[19];
    for(int i = 0; i < n; i++) {
      num[i] = Long.parseLong(sc.next());
      for(int j = 0; j < 19; j++) {
        count[j] += (1 & (num[i] >> j));
      }
    }
    for(int i = 0; i < 19; i++) {
      long tt = count[i] * (n - count[i]) % MOD;
      sum = sum + (tt * (long)Math.pow(2, i) % MOD) % MOD;
    }
    System.out.println(sum);
  }
}
