import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long[][] ab = new long[n][n];
    for (int i = 0; i < n; i++) {
      ab[i][0] = sc.nextInt();
      ab[i][1] = sc.nextInt();
    }
    Arrays.sort(ab, (x,y) -> Long.compare(x[0], y[0]));
    long ans = 0;
    for (int i = 0; i < n; i++) {
      long a = ab[i][0];
      long b = ab[i][1];
      if (m >= b) {
        ans += a * b;
        m -= b;
      } else {
        ans += a * m;
        break;  
      }
    }
    System.out.println(ans);
  }
}