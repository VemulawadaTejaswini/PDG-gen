import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[N];
    int[] b = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();
    for (int i = 0; i < N; i++) b[i] = scanner.nextInt();
    if (possible(N, a, b)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  private static boolean possible(int N, int[] a, int[] b) {
    long asum = 0;
    long bsum = 0;
    for (int i = 0; i < N; i++) asum += a[i];
    for (int i = 0; i < N; i++) bsum += b[i];
    if (asum > bsum) return false;
    long ca = bsum - asum;
    long cb = bsum - asum;
    for (int i = 0; i < N; i++) {
      if (a[i] < b[i]) {
        int d = b[i] - a[i];
        ca -= d / 2 + d % 2;
        cb -= d % 2;
      } else {
        cb -= a[i] - b[i];
      }
    }
    return ca >= 0 && cb >= 0 && ca * 2 == cb;
  }
}
