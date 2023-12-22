import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();

      System.out.println(solve(a,b));
    } finally {
      scanner.close();
    }
  }

  private static int solve(int a, int b) {
    if (a > b) return a - 1;
    return a;
  }
}
