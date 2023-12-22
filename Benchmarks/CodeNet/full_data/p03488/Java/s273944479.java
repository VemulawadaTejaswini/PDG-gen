import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    char[] s = scanner.next().toCharArray();
    int x = scanner.nextInt();
    int y = scanner.nextInt();

    List<Integer>[] a = new List[2];
    for (int i = 0; i < 2; i++) a[i] = new ArrayList<>();

    int i = 0;
    while (i < s.length && s[i++] == 'F') x--;

    int j = 1;
    for (; i < s.length; i++) {
      int c = i;
      while (i < s.length && s[i] == 'F') i++;
      if (i > c) a[j].add(i - c);
      j = 1 - j;
    }

    if (solve(a[0], Math.abs(x)) && solve(a[1], Math.abs(y))) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean solve(List<Integer> a, int x) {
    final int MAX = 8001;
    boolean[][] dp = new boolean[a.size() + 1][MAX];
    dp[0][0] = true;
    for (int i = 1; i <= a.size(); i++) {
      for (int j = 0; j < MAX; j++) {
        dp[i][j] = false;
        int v = a.get(i - 1);
        if (j - v >= 0) dp[i][j] |= dp[i - 1][j - v];
        if (j + v < MAX) dp[i][j] |= dp[i - 1][j + v];
      }
    }
    return dp[a.size()][x];
  }
}
