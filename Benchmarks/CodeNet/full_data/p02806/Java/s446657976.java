import java.util.Scanner;
import java.util.ArrayList;

public class Main {

  static int gcd(int a, int b) {
    if (a == 0)
      return b;
    else
      return gcd(b % a, a);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = new String[n];
    int[] a = new int[n];
    int ans = 0, o = 0;
    for (int i = 0; i < n; i++) {
      s[i] = sc.next();
      a[i] = sc.nextInt();
    }
    String x = sc.next();
    for (int i = 0; i < n; i++) {
      if (o == 1)
        ans += a[i];
      if (s[i].equals(x))
        o = 1;
    }
    System.out.println(ans);
  }
}
