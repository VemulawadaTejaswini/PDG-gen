import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

class Main {
  private static void solve(int n, int[] a) {
    int[] ax = new int[n + 1];
    for (int i = 1; i <= n; i++) {
      ax[i] = a[i - 1];
    }
    int[] b = new int[n + 1];
    List<Integer> balls = new ArrayList<>();
    for (int i = n; i > 0; i--) {
      int j = 2;
      int c = 0;
      while (i * j <= n) {
        c += b[i * j];
        j++;
      }
      if (c % 2 == ax[i]) {
        b[i] = 0;
      } else {
        b[i] = 1;
        balls.add(i);
      }
    }
    System.out.println(balls.size());
    if (balls.size() == 0) {
      return;
    }
    StringBuilder sb = new StringBuilder();
    for (int i = balls.size() - 1; i >= 0; i--) {
      sb.append(balls.get(i));
      if (i != 0) {
        sb.append(" ");
      }
    }
    System.out.println(sb.toString());
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] a = Stream.of(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
    sc.close();
    solve(n, a);
  }
}