import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    String S = sc.next();
    String T = sc.next();

    // 最大公約数を求める
    int n = N;
    int m = M;
    int tmp;
    while ((tmp = n % m) != 0) {
      n = m;
      m = tmp;
    }
    int gcd = m;
    n = N / gcd;
    m = M / gcd;

    long ans = n * m * gcd;
    for (int i = 0; i < gcd; i++) {
      if (S.charAt(n * i) != T.charAt(m * i)) {
        ans = -1;
        break;
      }
    }

    System.out.println(ans);
  }
}
