import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    sc.close();

    int mod = 1000000007;
    int ans = d(X, Y, mod);
    System.out.println(ans);
  }

  private static int d(int x, int y, int mod) {
    if (y * 2 < x || x * 2 < y) return 0;
    if (x == 0 && y == 0) return 1;
    return (d(x - 1, y - 2, mod) + d(x - 2, y - 1, mod)) % mod;
  }
}