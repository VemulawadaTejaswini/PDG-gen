package atcoder;

public class Main {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    solve(N);
  }

  private static void solve(int N) {
    int ret = 0;
    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0)
        continue;
      int count = 0;
      for (int j = 1; j <= N; j++) {
        if (i % j == 0)
          count++;
      }
      if (count == 8)
        ret++;
    }
    System.out.println(ret);

  }
}
