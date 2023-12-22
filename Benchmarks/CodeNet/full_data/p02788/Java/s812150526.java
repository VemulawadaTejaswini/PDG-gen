import java.math.*;
import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long D = sc.nextLong();
    long A = sc.nextLong();
    long[][] XH = new long[N][2];
    for (int i = 0; i < N; i++) {
      XH[i][0] = sc.nextLong();
      XH[i][1] = sc.nextLong();
    }
    sc.close();

    Arrays.sort(XH, (a, b) -> Long.compare(a[0], b[0]));
    long d2 = D * 2;
    long ans = 0;
    for (int i = 0; i < N; i++) {
      long x = XH[i][0];
      long h = XH[i][1];
      if (h <= 0) continue;
      long c = (h + A - 1) / A;
      long ac = A * c;
      for (int j = i; j < N && XH[j][0] <= x + d2; j++) {
        XH[j][1] -= Math.min(XH[j][1], ac);
      }
      ans += c;
    }
    System.out.println(ans);
  }
}