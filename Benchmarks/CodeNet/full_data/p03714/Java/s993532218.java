import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int[] a = new int[3 * N];
    long[] s = new long[N + 1];
    long[] t = new long[N + 1];
    for (int i = 0; i < 3 * N; i++) a[i] = scanner.nextInt();

    PriorityQueue<Integer> left = new PriorityQueue<>();
    for (int i = 0; i < N; i++) {
      left.add(a[i]);
      s[0] += a[i];
    }
    for (int i = 0; i < N; i++) {
      s[i + 1] = s[i];
      if (a[N + i] > left.peek()) {
        int r = left.poll();
        left.add(a[N + i]);
        s[i + 1] += a[N + i] - r;
      }
    }

    PriorityQueue<Integer> right = new PriorityQueue<>((o1, o2) -> o2 - o1);
    for (int i = 2 * N; i < 3 * N; i++) {
      right.add(a[i]);
      t[N] += a[i];
    }
    for (int i = N - 1; i >= 0; i--) {
      t[i] = t[i + 1];
      if (a[N + i] < right.peek()) {
        int r = right.poll();
        right.add(a[N + i]);
        t[i] += a[N + i] - r;
      }
    }

    long max = Long.MIN_VALUE;
    for (int i = 0; i <= N; i++) max = Math.max(max, s[i] - t[i]);
    System.out.println(max);
  }
}
