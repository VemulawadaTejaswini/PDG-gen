import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

public class Main {
  static long mod = 1000000007;
  static long[] fact;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int K = scan.nextInt();
    long[] A = new long[N];
    for(int i=0; i<N; i++) {
      A[i] = scan.nextLong();
    }
    scan.close();

    fact = new long[N+1];
    fact[0] = 1;
    for(int i=1; i<=N; i++) {
      fact[i] = (long)i * fact[i-1] % mod;
    }

    Arrays.sort(A);

    long[] nCkArray = new long[N+1];
    long maxSum = 0;
    for(int i=K-1; i<N; i++) {
      if(nCkArray[i] == 0) {
        nCkArray[i] = nCk(i, K-1);
      }

      maxSum += A[i] * nCkArray[i];
      maxSum %= mod;
    }

    long minSum = 0;
    for(int i=0; i<N-K+1; i++) {
      if(nCkArray[N-i-1] == 0) {
        nCkArray[N-i-1] = nCk(N-i-1, K-1);
      }

      minSum += A[i] * nCkArray[N-i-1];
      minSum %= mod;
    }

    long ans = maxSum - minSum;
    ans %= mod;
    while(ans < 0) {
      ans += mod;
    }
    System.out.println(ans);
  }

  public static long power(long x, long n) {
    long result = 1;
    while(n > 0) {
      if(n%2 == 1) {
        result *= x;
        result %= mod;
      }
      x = x*x;
      x %= mod;

      n >>= 1;
    }

    return result;
  }

  public static long nCk(long n, long k) {
    return fact[(int)n] * power(fact[(int)k] * fact[(int)(n-k)] % mod, mod-2) % mod;
  }
}