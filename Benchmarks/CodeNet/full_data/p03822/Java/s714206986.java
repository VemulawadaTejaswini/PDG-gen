import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N;

  public static void main(String[] args) {
    N = sc.nextInt();
    ArrayList<ArrayList<Integer>> tree = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      tree.add(new ArrayList<>());
    }
    for (int i = 1; i < N; i++) {
      int A = Integer.parseInt(sc.next()) - 1;
      tree.get(A).add(i);
    }
    ArrayList<Integer> order = new ArrayList<>(N);
    order.add(0);
    for (int i = 0; i < N; i++) {
      for (Integer child : tree.get(i)) {
        order.add(child);
      }
    }
    int[] depth = new int[N];
    for (int i = N - 1; i >= 0; i--) {
      int idx = order.get(i);
      ArrayList<Integer> child = tree.get(idx);
      if (child.isEmpty()) {
        depth[idx] = 0;
        continue;
      }
      int[] d = new int[child.size()];
      for (int j = 0; j < child.size(); j++) {
        d[j] = depth[child.get(j)];
      }
      Arrays.sort(d);
      for (int j = 0; j < d.length; j++) {
        depth[idx] = Math.max(depth[idx], d.length - j + d[j]);
      }
    }
    System.out.println(depth[0]);
  }

}
