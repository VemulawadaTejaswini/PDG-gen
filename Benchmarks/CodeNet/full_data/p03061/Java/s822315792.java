import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int[] a = new int[n];
    
    for (int i = 0; i < n; i++) {
      a[i] = s.nextInt();
    }
    
    System.out.println(solve(n, a));
  }
  
  private static int solve(int n, int[] a) {
    if (n == 2) {
      return Math.max(a[0], a[1]);
    }
    
    int[] gcd1 = new int[n];
    int[] gcd2 = new int[n];
    
    gcd1[0] = a[0];
    for (int i = 1; i < n; i++) {
      gcd1[i] = gcd(gcd1[i-1], a[i]);
    }
    
    gcd2[n-1] = a[n-1];
    for (int i = n-2; i >= 0; i--) {
      gcd2[i] = gcd(gcd2[i+1], a[i]);
    }
    
    int maxV = Math.max(gcd1[n-2], gcd2[1]);
    for (int i = 1; i <= n-2; i++) {
      maxV = Math.max(maxV, gcd(gcd1[i-1], gcd2[i+1]));
    }
    return maxV;
  }
  
  private static int gcd(int a, int b) {
    if (a % b == 0) {
      return b;
    } else {
      return gcd(b, a%b);
    }
  }
}
