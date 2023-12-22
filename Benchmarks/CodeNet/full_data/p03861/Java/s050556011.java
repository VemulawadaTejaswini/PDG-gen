import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long x = sc.nextLong();

    System.out.println(solve(a, b, x));
  }

  static long solve(long a, long b, long x) {
    long r = a / x;
    long q = (a % x == 0 ? 1 : 0);

    return (b - r * x) / x + q;
  }
}
