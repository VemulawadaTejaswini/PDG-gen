import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int X = sc.nextInt();
    int[] x = new int[n];
    int[] y = new int[n];
    for(int i = 0; i < n; i++) {
      x[i] = sc.nextInt();
      y[i] = Math.abs(x[i] - X);
    }
    int d = 0;
    if(n == 1) {
      d = y[0];
    } else {
      d = gcd(y[0], y[1]);
      for(int i = 2; i < n; i++) {
        d = gcd(d, y[i]);
      }
    }
    System.out.println(d);
  }

  public static int gcd(int a, int b) {
    if(b == 0) return a;
    return gcd(b, a % b);
  }
}