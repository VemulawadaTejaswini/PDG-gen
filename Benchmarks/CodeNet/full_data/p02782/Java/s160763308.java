import java.util.Scanner;

public class Main {
  private static final int mod = 1000_000_000 + 7;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r1 = sc.nextInt();
    int c1 = sc.nextInt();
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    long ans = 0;
    for (int r = r1; r <= r2; r++) {
      for (int c = c1; c <= c2; c++) {
        ans += pascal(r, c);
        ans %= mod;
      }
    }
    System.out.println(ans);
  }

  static long pascal(int i, int j) {
    if (i < j) {
      int tmp = j;
      j = i;
      i = tmp;
    }
    if (j == 0) {
      return 1;
    }
    else if (j == i) {
      return 1;
    }
    else {
      return (pascal(i - 1, j - 1) % mod) + (pascal(i - 1, j) % mod);
    }
  }
}
