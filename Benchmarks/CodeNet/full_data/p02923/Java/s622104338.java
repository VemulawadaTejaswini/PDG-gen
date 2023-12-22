import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int max = 0;
    int cnt = 0;
    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      list.add(sc.nextInt());
    }
    for (int i = 0; i < N - 1; i++) {
      if (list.get(i) >= list.get(i + 1)) {
        cnt++;
      } else {
        max = Math.max(max, cnt);
        cnt = 0;
      }
    }
    if (cnt > max) {
      max = cnt;
    }
    System.out.println(max);
  }
}
