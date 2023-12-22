import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    solve(a, b);
  }

  static void solve(int a, int b) {
    int count = 1;
    for (int i = 2; i <= a; i++) {
      if (i <= b && i < 13) count++;
    }
    System.out.println(count);
  }

}