import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    // まずx, y を単体で用意する
    long costs = x * a + y * b;
    long ans = costs;
    for (int i = 1; i <= Math.min(x, y); i++) {
      costs = costs - a - b + (c * 2);
      ans = Math.min(ans, costs);
    }
    for (int j = 1; j <= Math.abs(x - y); j++) {
      if (x > y) {
        costs = costs + (c * 2) - a;
      } else {
        costs = costs + (c * 2) - b;
      }
      ans = Math.min(ans, costs);
    }
    System.out.println(ans);
  }
}
