import java.util.ArrayList;
import java.util.Collections;
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
    ArrayList<Integer> other = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      if (nei.get(i).size() == 1) {
        cand.add(i);
      } else {
        other.add(i);
      }
    }
    int ans = N;
    SplittableRandom rnd = new SplittableRandom();
    Collections.shuffle(cand);
    Collections.shuffle(other);
    for (int i = 0; i < cand.size(); i++) {
      if (System.currentTimeMillis() - startTime > 1800) break;
      int start = cand.get(i);
      ans = Math.min(ans, count(start));
    }
    for (int i = 0; i < other.size(); i++) {
      if (System.currentTimeMillis() - startTime > 1800) break;
      int start = other.get(i);
      ans = Math.min(ans, count(start));
    }
    System.out.println(ans);
  }

  static int count(int s) {
    ++vc;
    int ret = 1;
    ArrayList<Integer> cur = new ArrayList<>();
    ArrayList<Integer> next = new ArrayList<>();
    cur.add(s);
    visited[s] = vc;
    while (!cur.isEmpty()) {
      ret = Math.max(ret, cur.size());
      for (int c : cur) {
        for (int n : nei.get(c)) {
          if (visited[n] == vc) continue;
          next.add(n);
          visited[n] = vc;
        }
      }
      ArrayList<Integer> tmp = cur;
      cur = next;
      next = tmp;
      next.clear();
    }
    return ret;
  }

}
