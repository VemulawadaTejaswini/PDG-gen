import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    solve(a, b);
  }

  private static void solve(int a, int b) {
    int count = 0;
    for (int i = 1; i < a || (i <= a && i <= b); i++) {
      count++;
    }
    System.out.println(count);
  }

}
