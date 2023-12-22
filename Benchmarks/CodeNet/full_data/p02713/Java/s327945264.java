import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int answer = 0;
    for (int a = 1; a <= k; a++) {
      for (int b = a; b <= k; b++) {
        for (int c = b; c <= k; c++) {
          int gcd = gcd(a, gcd(b, c));
          if (a == b && b == c) {
            answer += gcd;
          } else if (a == b || a == c || b == c) {
            answer += 3 * gcd;
          } else {
            answer += 6 * gcd;
          }
        }
      }
    }
    System.out.println(answer);
  }

  static int gcd(int a, int b) {
    if (b == 0) {
      return a;
    }
    return gcd(b, a % b);
  }
}
