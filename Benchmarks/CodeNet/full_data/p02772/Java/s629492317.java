import java.util.*;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int cnt = 0;
    List<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      if (a % 2 == 0) {
        list.add(a);
      }
    }
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) % 3 == 0 || list.get(i) % 5 == 0) {
        cnt++;
      }
    }
    if (cnt == list.size()) {
      System.out.println("APPROVED");
    } else {
      System.out.println(cnt);
    }
  }
}
