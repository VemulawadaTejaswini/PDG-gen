

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    solve(N);
  }

  private static void solve(int N) {
    int ret = 0;
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0)
        continue;
      int count = 0;
      for (int j = 1; j <= i; j++) {
        if (i % j == 0)
          count++;
      }
      if (count == 8)
        ret++;
    }
    System.out.println(ret);
  }
}
