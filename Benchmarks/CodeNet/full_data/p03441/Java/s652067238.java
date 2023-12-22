import java.util.ArrayList;
import java.util.Scanner;
import java.util.SplittableRandom;

public class Main {
  static long startTime = System.currentTimeMillis();
  static Scanner sc = new Scanner(System.in);
  static ArrayList<ArrayList<Integer>> nei = new ArrayList<>();
  static int[] visited;
  static int vc;

  public static void main(String[] args) {
    int N = sc.nextInt();
    visited = new int[N];
    for (int i = 0; i < N; i++) {
      nei.add(new ArrayList<>());
    }
    for (int i = 0; i < N - 1; i++) {
      int A = Integer.parseInt(sc.next());
      int B = Integer.parseInt(sc.next());
      nei.get(A).add(B);
      nei.get(B).add(A);
    }
    ArrayList<Integer> cand = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (nei.get(i).size() == 1) cand.add(i);
    }
    int ans = N;
    SplittableRandom rnd = new SplittableRandom();
    while (System.currentTimeMillis() - startTime < 1800) {
      int start = cand.get(rnd.nextInt(cand.size()));
      ans = Math.min(ans, count(start));
    }
    System.out.println(ans);
  }

  static int count(int s) {
    ++vc;
    int ret = 1;
    ArrayList<Integer> cur = new ArrayList<>();
    cur.add(s);
    visited[s] = vc;
    while (!cur.isEmpty()) {
      ret = Math.max(ret, cur.size());
      ArrayList<Integer> next = new ArrayList<>();
      for (int c : cur) {
        for (int n : nei.get(c)) {
          if (visited[n] == vc) continue;
          next.add(n);
          visited[n] = vc;
        }
      }
      cur = next;
    }
    return ret;
  }

}
