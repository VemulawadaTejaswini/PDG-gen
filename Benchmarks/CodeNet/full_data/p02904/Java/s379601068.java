import java.util.Scanner;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] p = new int[N];
    int[] cummDelta = new int[N];
    for (int i = 0; i < N; i++) p[i] = scanner.nextInt();
    for (int i = 1; i < N; i++) cummDelta[i] = cummDelta[i - 1] + (p[i] > p[i - 1] ? 1 : 0);

    int count = N - K + 1;

    TreeSet<Integer> set = new TreeSet<>();
    for (int i = 0; i < K; i++) set.add(p[i]);

    boolean atLeastOneSorted = false;
    if (cummDelta[K - 1] == K - 1) {
      atLeastOneSorted = true;
      count--;
    }
    for (int i = 0; i < N - K; i++) {
      set.remove(p[i]);

      boolean sorted = cummDelta[i + K] - cummDelta[i + 1] == K - 1;
      if ((p[i] <= set.first() && p[i + K] >= set.last()) || sorted) count--;
      if (sorted) atLeastOneSorted = true;

      set.add(p[i + K]);
    }
    if (atLeastOneSorted) count++;
    System.out.println(count);
  }
}
