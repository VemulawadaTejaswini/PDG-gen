import java.util.*;
import java.util.Collections;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> list = new ArrayList<Integer>();
    int ans = -1;
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    int now = 0;
    for (int i = 0; i < N; i++) {
      if (list.get(now) == 2) {
        ans = i + 1;
      }
      now = list.get(now) - 1;
    }
    System.out.println(ans);
  }
}
