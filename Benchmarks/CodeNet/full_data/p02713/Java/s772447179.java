import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long res = 0;
    for (int i = 1; i <= k; i++) {
      for (int j = i; j <= k; j++) {
        for (int l = j; l <= k; l++) {
          if (i < j && j < l) {
            res += gcd(i, gcd(j, l)) * 6;
          } else if (i < j && j == l) {
            res += gcd(i, gcd(j, l)) * 3;
          } else if (i == j && j < l) {
            res += gcd(i, gcd(j, l)) * 3;
          } else {
            res += gcd(i, gcd(j, l));
          }
        }
      }
    }
    System.out.println(res);
    sc.close();
  }

  static int gcd(int a, int b) { // 最大公約数を返す
    if (a < b) return gcd (b, a);
    if (b == 0) return a;
    return gcd (b, a % b);
  }
}