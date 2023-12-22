import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long A = scanner.nextLong();
    long B = scanner.nextLong();

    long res = 0;
    for (int i = 0; i < 40; i++) if ((count(B, i) - count(A - 1, i)) % 2 == 1) res += 1L << i;
    System.out.println(res);
  }

  private static long count(long a, int i) {
    a++;
    long n = 1L << i;
    long m = 1L << (i + 1);
    return (a / m) * n + Math.max((a % m) - n, 0);
  }
}
