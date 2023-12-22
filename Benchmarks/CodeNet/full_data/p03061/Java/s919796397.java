import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }

    int maxGcd = 0;
    for (int i = 0; i < n; i++) {
      int gcdValue = 0;
      for (int j = 0; j < n; j++) {
        if (j == i) {
          // skip
          continue;
        }
        //System.out.println("j="+ j + ", " + gcdValue);
        gcdValue = gcd(a[j], gcdValue);
      }
      //System.out.println("i="+ i + ", " + gcdValue);
      maxGcd = Math.max(maxGcd, gcdValue);
    }
    
    System.out.println(maxGcd);
  }
  
  private static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}