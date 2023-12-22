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
    int[] maxIndex = new int[N];
    maxIndex[N - 1] = N - 1;
    for (int i = N - 2; i >= 0; i--) {
      if (a[i] >= max[i + 1]) {
        max[i] = a[i];
        maxIndex[i] = i;
      } else {
        max[i] = max[i + 1];
        maxIndex[i] = maxIndex[i + 1];
      }
    }

    int cnt = 0;
    int maxDiff = 0;
    int j = 0;
    for (int i = 0; i < N && j < N; i++) {
      j = Math.max(i, j);
      int diff = max[j] - a[i];
      if (diff > maxDiff) {
        cnt = 1;
        maxDiff = diff;
        j = maxIndex[j] + 1;
      } else if (diff == maxDiff) {
        cnt++;
        j = maxIndex[j] + 1;
      }
    }
    System.out.println(cnt);
  }
}
