
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int sum = 0;

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        for (int k = 1; k <= n; k++) {
          sum += gcd(i, j, k);
        }
      }
    }
    System.out.println(sum);
  }

  private static int gcd(int a, int b, int c) {
    return gcd(gcd(a, b), c);
  }

  private static int gcd(int a, int b) {
    int tmp;
    while ((tmp = a % b) != 0) {
      a = b;
      b = tmp;
    }
    return b;
  }
}
