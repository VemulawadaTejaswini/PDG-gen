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
    int r = 0;
    if (a == 0) {
      r += 1;
    }
    if (b == 0) {
      return 1;
    }
    if (x > b) {
      return r;
    } else if (x == b) {
      return r + 1;
    } else if (a < x && x < b) {
      return r + b / x;
    } else if (x == a) {
      return r + b / a + 1;
    } else {
      if (a % x != 0) {
        return r + b / x - a / x;
      } else {
        return r + b / x - (a / x - 1);
      }
    }
  }
}
