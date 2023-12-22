import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    solve(a, b);
  }

  static void solve(int a, int b) {
    if (a < 1 || a > 12) {
      System.out.println(0);
      return;
    }
    if (b < 1 || b > 31) {
      System.out.println(0);
      return;
    }
    if (a == 2 && b > 28) {
      System.out.println(0);
      return;
    }
    if (a < 8 && a % 2 == 0 && b > 30) {
      System.out.println(0);
      return;
    }
    if (a > 7 && a % 2 != 0 && b > 30) {
      System.out.println(0);
      return;
    }
    int count = 1;
    for (int i = 2; i <= a; i++) {
      if (i <= b) count++;
    }
    System.out.println(count);
  }

}