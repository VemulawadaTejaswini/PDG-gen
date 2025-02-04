import java.util.*;

public class Main {
  public static class K {
    int i;
    int p;
    int y;

    public K(int i, int p, int y) {
      this.i = i;
      this.p = p;
      this.y = y;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] P = new int[M];
    int[] Y = new int[M];
    for (int i = 0; i < M; i++) {
      P[i] = sc.nextInt();
      Y[i] = sc.nextInt();
    }
    ArrayList<K> list = new ArrayList<>();
    for (int i = 0; i < M; i++) {
      list.add(new K(i, P[i], Y[i]));
    }
    list.sort((a, b) -> a.y - b.y);
    list.sort((a, b) -> a.p - b.p);
    int before_p = 0;
    int order = 1;
    for (int i = 0; i < M; i++) {
      int now_p = list.get(i).p;
      if (before_p != now_p) {
        before_p = now_p;
        order = 1;
      } else {
        order++;
      }
      list.get(i).y = order;
    }
    list.sort((a, b) -> a.i - b.i);
    for (int i = 0; i < M; i++) {
      System.out.println(String.format("%06d", list.get(i).p) + String.format("%06d", list.get(i).y));
    }
  }
}
