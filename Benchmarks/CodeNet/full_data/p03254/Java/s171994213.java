import java.util.*;
import java.util.TreeMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    Collections.sort(list);
    for (int i = 0; i < N; i++) {
      if (x <= 0) {
        break;
      }
      if (x - list.get(i) >= 0) {
        x -= list.get(i);
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
