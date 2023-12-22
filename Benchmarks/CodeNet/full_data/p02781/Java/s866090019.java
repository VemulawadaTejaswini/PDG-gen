import java.util.*;
import java.math.*;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int k = sc.nextInt();
    int n = s.length();
    int[][] f = new int[n][k];
    f[0][0] = 9;
    for(int i = 0; i < k; ++i) {
      for(int j = i; j < n; ++j) {
        int a = 1;
        int b = 1;
        for(int m = 0; m < k; ++m) {
          a *= i - m;
          b *= m + 1;
        }
        f[i][j] = a / b * 9 * (i + 1);
      }
    }
    int res = a[n - 1] - '0';
    char[] a = s.toCharArray();
    for(int i = n - 2; i > -1; ++i) {
      if(a[i] - '0' == 0) continue;
      res += (a[i] - '1') * f[n - i][k] + (a[i] - '1');
    }
    System.out.println(res);
  }
}