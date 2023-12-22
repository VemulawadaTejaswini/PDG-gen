import java.util.*;
import java.util.stream.*;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.solve());
  }

  int n;
  int a[];

  public Main() {
    Scanner sc = new Scanner(System.in);
    try {
      n = sc.nextInt();
      a = IntStream.range(0, n - 1).map(i -> sc.nextInt()).toArray();
    } finally {
      sc.close();
    }
  }

  int solve() {
    int ans = 0;
    for (int i = 0; i < n; i++) ans += calc(i);
    return ans;
  }

  private int calc(int i) {
    if (i == 0) return a[0];
    if (i == n - 1) return a[n - 2];
    return a[i - 1] < a[i] ? a[i - 1] : a[i];
  }
}
