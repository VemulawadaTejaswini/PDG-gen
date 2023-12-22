import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    int K = scanner.nextInt();
    int[] h = new int[N];
    for (int i = 0; i < N; i++) h[i] = scanner.nextInt();

    long left = -1;
    long right = 150_000_000_000L;
    while (right - left > 1) {
      long mid = (left + right) / 2;
      int k = 0;
      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < N; i++) {
        if (h[i] <= mid) list.add(h[i]);
        else k++;
      }
      while (!list.isEmpty()) {
        long a = list.get(0);
        int max = list.get(0);
        int maxpos = 0;
        for (int i = 1; i < list.size(); i++) {
          int d = Math.max(list.get(i) - list.get(i - 1), 0);
          if (d > max) {
            max = d;
            maxpos = i;
          }
          a += d;
        }
        if (a <= mid) break;
        k++;
        list.remove(maxpos);
      }

      if (k <= K) right = mid;
      else left = mid;
    }
    System.out.println(right);
  }
}
