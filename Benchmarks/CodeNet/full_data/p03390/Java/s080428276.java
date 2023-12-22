import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int q = scanner.nextInt();
    for (int i = 0; i < q; i++) {
      long a = scanner.nextLong();
      long b = scanner.nextLong();
      System.out.println(solve(a, b));
    }
  }

  private static long solve(long a, long b) {
    if (a > b) return solve(b, a);

    long i = 1;
    long j = (a * b - 1);
    long res = 0;
    while (i <= j) {
      if (i == a || j == b || i == j) res++;
      else res += 2;
      i++;
      j = (a * b - 1) / i;
    }

    return res;
  }
}