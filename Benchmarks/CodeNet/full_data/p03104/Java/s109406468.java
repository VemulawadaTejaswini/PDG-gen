import java.util.Scanner;

public class Main {

  public static void main(final String[] args) {
    final Scanner scanner = new Scanner(System.in);
    final long A = Long.parseLong(scanner.next());
    final long B = Long.parseLong(scanner.next());

    final long a = getXorSum(A - 1);
    final long b = getXorSum(B);
    System.out.println(a^b);
  }

  private static long getXorSum(final long n) {
    final long i = (n + 1) / 2; // 1の数
    final boolean f = n % 2 == 0; // 2の倍数かどうか
    if (i % 2 == 0) {
      return f ? n : 0;
    } else {
      return f ? n ^ 1 : 1;
    }
  }
}
