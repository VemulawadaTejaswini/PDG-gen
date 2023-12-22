import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = Integer.parseInt(sc.next());

    long ans = 1;
    for (int i = 0; i < n; i++) {
      ans = lcm(Long.parseLong(sc.next()), ans);
    }

    System.out.println(ans);
    sc.close();
  }

  public static long lcm(long a, long b) {
    return a / gcd(a, b) * b;
  }

  public static long gcd(long a, long b) {
    if (a < b)
      return gcd(b, a);
    if (b == 0)
      return a;
    return gcd(b, a % b);
  }
}