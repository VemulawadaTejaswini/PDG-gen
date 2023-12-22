import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    int maxGcd = 1;
    for (int i = 0; i < N; i++) {
      int l = gcdSum(A, 0, i-1);
      int r = gcdSum(A, i+1, N-1);
      int val = gcd(l, r);
      if (val > maxGcd) {
        maxGcd = val;
      }
    }

    System.out.println(maxGcd);
  }
  
  private static int gcdSum(int[] A, int start, int end) {
    int gcdVal = 0;
    for (int i = start; i <= end; i++) {
      gcdVal = gcd(gcdVal, A[i]);
    }
    return gcdVal;
  }
  
  private static int gcd(int i, int j) {
    int a, b;
    if (i > j) {
      a = i;
      b = j;
    } else {
      a = j;
      b = i;
    }

    // a > b
    if (b == 0) {
      return a;
    }

    return gcd(b, a % b);
  }
}