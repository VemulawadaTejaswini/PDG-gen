import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int l = sc.nextInt();
    int n = sc.nextInt();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < n; i++) {
      list.add(sc.nextInt());
    }
    int ans = 0;
    int _n = n;
    int[] zahyo = { 0, l };
    for (int i = 0; i < _n; i++) {
      if (list.get(0) - zahyo[0] > zahyo[1] - list.get(n - 1)) {
        ans += list.get(0) - zahyo[0];
        zahyo[0] += list.get(0) - zahyo[0];
        zahyo[1] = zahyo[0] + l;
        list.remove(0);
        n -= 1;
      } else {
        ans += zahyo[1] - list.get(n - 1);
        zahyo[0] -= zahyo[1] - list.get(n - 1);
        zahyo[1] = zahyo[0] + l;
        list.remove(n - 1);
        n -= 1;
      }
    }
    System.out.println(ans);
  }
}
