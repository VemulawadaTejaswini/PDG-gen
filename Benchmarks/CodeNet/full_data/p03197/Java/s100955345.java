import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();

    boolean oddIncluded = false;

    for (int i = 0; i < N; i++) {
      if (in.nextInt() % 2 == 1) {
        oddIncluded = true;
      }
    }

    System.out.println(oddIncluded ? "first" : "second");

  }

  public static int gcd(int a, int b) {
        if (b == 0) return a;
    return gcd(b, a % b);

  }

  public static long gcd(long a, long b) {
    if (b == 0) return a;
    return gcd(b, a % b);
  }
}