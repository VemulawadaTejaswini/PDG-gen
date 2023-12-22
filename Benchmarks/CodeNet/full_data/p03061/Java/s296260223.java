import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    
    int[] L = new int[N];
    int[] R = new int[N];
    
    L[0] = 0;
    for (int i = 1; i < N; i++) {
      L[i] = gcd(L[i-1], A[i-1]);
    }
    R[N-1] = 0;
    for (int i = N-2; i >= 0; i--) {
      R[i] = gcd(R[i+1], A[i+1]);
    }

    int maxGcd = 1;
    for (int i = 0; i < N; i++) {
      int val = gcd(L[i], R[i]);
      if (val > maxGcd) {
        maxGcd = val;
      }
    }

    System.out.println(maxGcd);
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