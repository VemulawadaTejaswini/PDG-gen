import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.math.*;

public class Main {

  static int gcd(int a, int b) {
    if (a == 0)
      return b;
    else
      return gcd(b % a, a);
  }

  static boolean next_permutation(int[] p) {
    for (int a = p.length - 2; a >= 0; --a)
      if (p[a] < p[a + 1])
        for (int b = p.length - 1;; --b)
          if (p[b] > p[a]) {
            int t = p[a];
            p[a] = p[b];
            p[b] = t;
            for (++a, b = p.length - 1; a < b; ++a, --b) {
              t = p[a];
              p[a] = p[b];
              p[b] = t;
            }
            return true;
          }
    return false;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    int[] b = new int[n];
    int[] c = new int[n];
    for (int i = 0; i < n; i++)
      a[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
      b[i] = sc.nextInt();
    for (int i = 0; i < n; i++)
      c[i] = i + 1;
    int x = 0, y = 0, cnt = 0;
    do {
      cnt++;
      if (Arrays.equals(a, c))
        x = cnt;
      if (Arrays.equals(b, c))
        y = cnt;
      // for (int i = 0; i < n; i++) {
      // System.out.print(c[i]);
      // System.out.print(' ');
      // }
      // System.out.print('\n');
    } while (next_permutation(c));
    // System.out.println(y);
    // System.out.println(x);
    System.out.println(Math.abs(y - x));
  }
}
