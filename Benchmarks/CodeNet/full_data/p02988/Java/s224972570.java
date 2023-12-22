import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> lists = new ArrayList<Integer>();
    for (int i = 0; i < N; i++) {
      lists.add(sc.nextInt());
    }
    int cnt = 0;
    for (int i = 1; i < N - 1; i++) {
      if ((lists.get(i) > lists.get(i - 1) && lists.get(i) < lists.get(i + 1))
          || (lists.get(i) < lists.get(i - 1) && lists.get(i) > lists.get(i + 1))) {
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
