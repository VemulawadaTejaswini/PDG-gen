import java.util.Scanner;

public class Main {
  private static void solve(int n, String s) {
    int left = 1;
    int right = n;
    int max = 0;
    while (left <= right) {
      int len = left + (right - left) / 2;
      boolean found = false;
      for (int i = 0; i + len <= n; i++) {
        String substr = s.substring(i, i + len);
        int lastindex = s.indexOf(substr, i + len);
        if (lastindex >= 0) {
          found = true;
          max = len;
          break;
        }
      }
      if (found) left = len + 1;
      else right = len - 1;
    }
    System.out.println(max);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    String s = sc.nextLine();
    sc.close();
    solve(n, s);
  }
}
