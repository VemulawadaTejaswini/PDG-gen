import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int n = scanner.nextInt();
      String a = scanner.next();
      String b = scanner.next();
      String c = scanner.next();

      int ans = 0;
      for (int i = 0; i < n; i++) {
        ans += solve(a.charAt(i), b.charAt(i), c.charAt(i));
      }
      System.out.print(ans);
    } finally {
      scanner.close();
    }
  }

  private static int solve(int a, int b, int c) {
    int ans = 2;
    if (a == b) ans--;
    if (a == c) ans--;
    if (b == c) ans--;
    if (ans < 0) ans = 0;
    return ans;
  }
}
