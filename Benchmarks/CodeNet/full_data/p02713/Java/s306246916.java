import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    long ans = 0;
    for (int i = 1; i <= K; i++) {
      for (int j = 1; j <= K; j++) {
        for (int k = 1; k <= K; k++) {
          ans += gcd(i, j, k);
        }
      }
    }
    System.out.println(ans);
  }

  static int gcd(int i, int j, int k) {
    return gcd(gcd(i, j), k); // i < j
  }

  static int gcd(int i, int j) {
    if (i > j) {
      return gcd(j, i);
    }
    if (i == 0) return j;
    return gcd(j % i, i);
  }
}
