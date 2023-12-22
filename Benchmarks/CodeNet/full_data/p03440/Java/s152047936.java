import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  static Scanner sc = new Scanner(System.in);
  static int N, M;
  static long[] A;
  static ArrayList<ArrayList<Integer>> nei = new ArrayList<>();

  public static void main(String[] args) {
    N = sc.nextInt();
    M = sc.nextInt();
    if ((N - 1 - M) * 2 > N) {
      System.out.println("Impossible");
      return;
    }
    if (M == N -1) {
      System.out.println(0);
      return;
    }
    A = new long[N];
    for (int i = 0; i < N; i++) {
      A[i] = Long.parseLong(sc.next());
      nei.add(new ArrayList<>());
    }
    for (int i = 0; i < M; i++) {
      int X = Integer.parseInt(sc.next());
      int Y = Integer.parseInt(sc.next());
      nei.get(X).add(Y);
      nei.get(Y).add(X);
    }
    boolean[] visited = new boolean[N];
    long ans = 0;
    int used = 0;
    ArrayList<Long> all = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (visited[i]) continue;
      ArrayList<Integer> q = new ArrayList<>();
      ArrayList<Long> c = new ArrayList<>();
      q.add(i);
      c.add(A[i]);
      visited[i] = true;
      for (int j = 0; j < q.size(); j++) {
        for (int n : nei.get(q.get(j))) {
          if (visited[n]) continue;
          q.add(n);
          c.add(A[n]);
          visited[n] = true;
        }
      }
      Collections.sort(c);
      ans += c.get(0);
      ++used;
      for (int j = 1; j < c.size(); j++) {
        all.add(c.get(j));
      }
    }
    Collections.sort(all);
    for (int i = used; i < (N - 1 - M) * 2; i++) {
      ans += all.get(i - used);
    }
    System.out.println(ans);
  }

}
