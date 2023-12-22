import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int A = scanner.nextInt();
    int[] H = new int[N];
    for (int i = 0; i < N; i++) {
      H[i] = scanner.nextInt();
    }
    int ans = -1;
    double closest = 1_000_000;
    for (int i = 0; i < N; i++) {
      if (ans < 0 || Math.abs(T - H[i] * 0.006 - A) < closest) {
        ans = i + 1;
        closest = Math.abs(T - H[i] * 0.006 - A);
      }
    }
    System.out.println(ans);
  }
}
