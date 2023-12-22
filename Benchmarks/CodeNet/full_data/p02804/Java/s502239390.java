import java.util.*;
import java.util.function.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    long[] A = new long[N];
    for (int i = 0; i < N; i++) A[i] = sc.nextLong();
    sc.close();


    long[] cmb = new long[N];
    for (int i = 0; i < N + 1 - K; i++) {
      cmb[i] = combination(N - i - 1, K - 1);
    }

    Arrays.sort(A);
    long mod = 1000000007L;
    long sumMin = 0;
    long sumMax = 0;
    for (int i = 0; i < N + 1 - K; i++) {
      sumMin += A[i] * cmb[i];
      sumMin %= mod;
      sumMax += A[N - i - 1] * cmb[i];
      sumMax %= mod;
    }

    long ans = sumMax - sumMin;
    if (ans < 0) ans += mod;
    System.out.println(ans);
  }

  private static int combination(int n, int k) {
    int closer = Math.min(n - k, k);
    int result = 1;
    for (int i = 1; i <= closer; i++)
      result = result * (n - closer + i) / i;
    return result;
  }
}