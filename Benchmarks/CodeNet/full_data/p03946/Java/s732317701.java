import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int T = scanner.nextInt();
    int[] a = new int[N];
    for (int i = 0; i < N; i++) a[i] = scanner.nextInt();

    int[] max = new int[N];
    max[N - 1] = a[N - 1];
    for (int i = N - 2; i >= 0; i--) max[i] = Math.max(a[i], max[i + 1]);

    int maxDiff = 0;
    for (int i = 0; i < N; i++) maxDiff = Math.max(maxDiff, max[i] - a[i]);

    int cnt = 0;
    for (int i = 0; i < N; i++) if (max[i] - a[i] == maxDiff) cnt++;
    System.out.println(cnt);
  }
}
