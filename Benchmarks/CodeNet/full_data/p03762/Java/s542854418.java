import java.util.Scanner;
import java.util.Arrays;

public class Main{
  static final long MOD = 1_000_000_007;
  static int n, m;
  static long[] x, y;

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    n = sc.nextInt();
    m = sc.nextInt();
    x = new long[n];
    for(int i = 0; i < n; i++){
      x[i] = sc.nextInt();
    }
    y = new long[m];
    for(int i = 0; i < m; i++){
      y[i] = sc.nextInt();
    }

    long sumX = 0;
    for(int i = 0; i + 1 < n; i++){
      long count = (i + 1) * (n - i - 1);
      sumX = ((count * (x[i + 1] - x[i]) % MOD) + sumX) % MOD;
    }
    long sumY = 0;
    for(int i = 0; i + 1 < m; i++){
      long count = (i + 1) * (m - i - 1);
      sumY = ((count * (y[i + 1] - y[i]) % MOD) + sumY) % MOD;
    }

    long ans = (sumX * sumY) % MOD;

    System.out.println(ans);
  }
}
