import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    NumPos[] p = new NumPos[N];
    for (int i = 0; i < N; i++) p[i] = new NumPos(scanner.nextInt(), i);
    Arrays.sort(p, (t1, t2) -> t2.num - t1.num);

    List<Integer> pos = new ArrayList<>(Arrays.asList(-1, -1, N, N));
    long res = 0;
    for (int i = 0; i < N; i++) {
      int n = p[i].num;
      int m = p[i].pos;
      int x = -Collections.binarySearch(pos, m) - 1;
      int r1 = pos.get(x);
      int r2 = pos.get(x + 1);
      int l1 = pos.get(x - 1);
      int l2 = pos.get(x - 2);
      res += (long) (r2 - r1) * (m - l1) * n;
      res += (long) (l1 - l2) * (r1 - m) * n;
      pos.add(x, m);
    }
    System.out.println(res);
  }

  private static class NumPos {
    private final int num;
    private final int pos;

    private NumPos(int num, int pos) {
      this.num = num;
      this.pos = pos;
    }
  }
}
