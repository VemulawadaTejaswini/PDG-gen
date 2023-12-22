import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();

    int[] a = new int[N];
    for (int i = 0; i < N; i++) {
      a[i] = scanner.nextInt();
    }

    Arrays.sort(a);

    List<Integer> edges = new ArrayList<>();
    int c = 1;
    int prev = 0;
    for (int i = 0; i < N; i++) {
      if (a[i] == prev) {
        c++;
      } else {
        c = 1;
      }
      if (c > 1) {
        edges.add(a[i]);
        c = 0;
      }
      prev = a[i];
    }

    Collections.sort(edges);
    Collections.reverse(edges);

    if (edges.size() > 1) {
      System.out.println((long) edges.get(0) * edges.get(1));
    } else {
      System.out.println(0);
    }
  }
}
