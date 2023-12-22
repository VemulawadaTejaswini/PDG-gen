import java.util.Scanner;

public class Main {
  private static Scanner sc;

  public static void main(String[] args) {
    sc = new Scanner(System.in);
    new Main().solve();
  }

  private void solve() {
    int N = sc.nextInt();
    int[] a = new int[N + 2];
    for (int i = 0; i < N; i++) {
      a[i + 1] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i <= N; i++) {
      sum += Math.abs(a[i] - a[i + 1]);
    }

    for (int i = 0; i < N; i++) {
      System.out.println(sum - Math.abs(a[i] - a[i + 1]) - Math.abs(a[i + 2] - a[i + 1]) + Math.abs(a[i] - a[i + 2]));
    }
  }
}
