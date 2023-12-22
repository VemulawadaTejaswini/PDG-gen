import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[][] a = new int[N][N - 1];
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N - 1; j++) {
        a[i][j] = scanner.nextInt() - 1;
      }
    }

    int[] idx = new int[N];
    int count = 0;
    Set<Integer> p = new HashSet<>();
    while (true) {
      p.clear();
      for (int i = 0; i < N; i++) {
        if (idx[i] == N - 1) continue;
        int j = a[i][idx[i]];
        if (idx[j] < N && a[j][idx[j]] == i) p.add(i);
      }
      if (p.isEmpty()) {
        break;
      }
      count++;
      for (int i : p) {
        idx[i]++;
      }
    }
    for (int i = 0; i < N; i++) {
      if (idx[i] < N - 1) {
        System.out.println(-1);
        return;
      }
    }
    System.out.println(count);
  }
}