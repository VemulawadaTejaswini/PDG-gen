import java.util.*;

public class Main {
  private static long calculateNumA(long n, long k, long b) {
//    System.out.println((b - k) * (n / b));
//    System.out.println(n + 1 - (((n / b)) * b + k));
    return (b - k) * (n / b) + Math.max(n + 1 - (((n / b)) * b + k), 0);
  }

  private static long solve(long n, long k) {
    if (k == 0) {
      return n * n;
    }

    long sum = 0;
    for (long b = k+1; b <= n; b++) {
      long numA = calculateNumA(n, k, b);
//      System.out.printf("%d %d\n", b, numA);  
      sum += numA;
    }
    return sum;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int k = s.nextInt();
    System.out.println(solve(n, k));
  }
}
