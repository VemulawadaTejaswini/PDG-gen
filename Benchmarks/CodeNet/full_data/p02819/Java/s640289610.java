import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long X = sc.nextLong();
    sc.close();

    for (long i = X; i < 100007; i++) {
      if (isPrimeNumber(i)) {
        System.out.println(i);
        return;
      }
    }
  }

  private static boolean isPrimeNumber(long num) {
    if (1 >= num) return false;
    if (2 == num) return true;
    long n = (long) Math.sqrt(num);
    for (long i = 2; i <= n; ++i) {
      if (0 == (num % i)) return false;
    }
    return true;
  }
}