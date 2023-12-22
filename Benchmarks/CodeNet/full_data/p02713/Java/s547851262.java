import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long ans = 0;

    for (int a = 1; a <= N; a++) {
      for (int b = 1; b <= N; b++) {
        for (int c = 1; c <= N; c++) {
          gcd(a, b);
          gcd(gcd(a, b), c);
          ans = ans + gcd(gcd(a, b), c);
        }
      }
    }
    System.out.println(ans);
  }

  private static int gcd(int i, int j) {
    if(i < j) return gcd(j, i);
    if(j == 0) return i;
    return gcd(j, i % j);
  }
}